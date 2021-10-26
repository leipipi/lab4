package cn.edu.xmu.restfuldemo.bean;
import io.swagger.models.auth.In;

import java.util.Date;
import lombok.*;

public class Goods implements VoObject {
    @Override
    public Object createVo(){
        return new GoodsRetVo(this);
    }

    public Goods(){this.goodsPo=new GoodsPo();}
    public Goods(GoodsPo goodsPo){this.goodsPo=goodsPo;}
    private GoodsPo goodsPo;

    public Integer getId(){return goodsPo.getId();}
    public void setId(Integer id){goodsPo.setId(id);}

    public Integer getGoodsSkuId(){return goodsPo.getGoodsSkuId();}
    public void setGoodsSkuId(Integer id){goodsPo.setGoodsSkuId(id);}

    public String getSkuSn(){return goodsPo.getSkuSn();}
    public void setSkuSn(String SkuSn){goodsPo.setSkuSn(SkuSn);}

    public String getName(){return goodsPo.getName();}
    public void setName(String Name){goodsPo.setName(Name);}

    public Integer getOriginalPrice(){return goodsPo.getOriginalPrice();}
    public void setOriginalPrice(Integer originalPrice){goodsPo.setOriginalPrice(originalPrice);}

    public String getConfiguration(){return goodsPo.getConfiguration();}
    public void setConfiguration(String configuration){goodsPo.setConfiguration(configuration);}

    public Integer getWeight(){return goodsPo.getWeight();}
    public void setWeight(Integer weight){goodsPo.setWeight(weight);}

    public String getImageUrl(){return goodsPo.getImageUrl();}
    public void setImageUrl(String imageUrl){goodsPo.setImageUrl(imageUrl);}

    public Integer getInventory(){return goodsPo.getInventory();}
    public void setInventory(Integer inventory){goodsPo.setInventory(inventory);}

    public String getDetail(){return goodsPo.getDetail();}
    public void setDetail(String detail){goodsPo.setDetail(detail);}

    public Integer getDisabled(){return goodsPo.getDisabled();}
    public void setDisabled(Integer disavled){goodsPo.setDisabled(disavled);}

    public Date getGmtCreate(){return goodsPo.getGmtCreate();}
    public void setGmtCreate(Date date){goodsPo.setGmtCreate(date);}

    public Date getGmtModified(){return goodsPo.getGmtModified();}
    public void setGmtModified(Date date){goodsPo.setGmtModified(date);}

    public Integer getState(){return goodsPo.getState();}
    public void setState(Integer state){goodsPo.setState(state);}
}