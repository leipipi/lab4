package cn.edu.xmu.restfuldemo.controller;


import cn.edu.xmu.restfuldemo.bean.ProductRetVo;
import cn.edu.xmu.restfuldemo.bean.VoObject;
import cn.edu.xmu.restfuldemo.service.ProductsService;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import cn.edu.xmu.restfuldemo.util.ResponseUtil;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Api(value = "产品API",tags = "产品API")
@RestController
@RequestMapping(value = "/products", produces = "application/json;charset=UTF-8")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @GetMapping("/{id}")
    public Object getProductsById_noredis(@PathVariable("id") Integer id){
        ReturnObject<VoObject> returnObject=productsService.findById(id);
        ResponseCode code = returnObject.getCode();
        switch (code){
            //表示操作的资源id不存在,设置http状态码为NOT_FOUND 即404
            case RESOURCE_ID_NOTEXIST:
                httpServletResponse.setStatus(HttpStatus.NOT_FOUND.value());
                return ResponseUtil.fail(returnObject.getCode(), returnObject.getErrmsg());
            //成功找到
            case OK:
                ProductRetVo productsRetVo = (ProductRetVo) returnObject.getData().createVo();
                return ResponseUtil.ok(productsRetVo);
            default:
                return ResponseUtil.fail(code);
        }
    }

}
