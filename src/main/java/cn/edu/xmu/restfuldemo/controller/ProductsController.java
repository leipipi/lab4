package cn.edu.xmu.restfuldemo.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "产品API",tags = "产品API")
@RestController
@RequestMapping(value = "/products", produces = "application/json;charset=UTF-8")
public class ProductsController {

}
