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
    public void setSkuSn(String Sku_sn){goodsPo.setSkuSn(Sku_sn);}

    public Integer getBrandId(){return goodsPo.getBrandId();}
    public void setBrandId(Integer id){goodsPo.setBrandId(id);}

    public Integer getCategoryId(){return goodsPo.getCategoryId();}
    public void setCategoryId(Integer id){goodsPo.setCategoryId(id);}

    public Integer getFreightId(){return goodsPo.getFreightId();}
    public void setFreightId(Integer id){goodsPo.setFreightId(id);}

    public Integer getShopId(){return goodsPo.getShopId();}
    public void setShopId(Integer id){goodsPo.setShopId(id);}

    public String getGoodsSn() {return goodsPo.getGoodsSn(); }
    public void setGoodsSn(String goodsSn) { goodsPo.setGoodsSn(goodsSn); }

    public String getName(){return goodsPo.getName();}
    public void setName(String Name){goodsPo.setName(Name);}

    public Integer getOriginalPrice(){return goodsPo.getOriginalPrice();}
    public void setOriginalPrice(Integer original_price){goodsPo.setOriginalPrice(original_price);}

    public String getConfiguration(){return goodsPo.getConfiguration();}
    public void setConfiguration(String configuration){goodsPo.setConfiguration(configuration);}

    public Integer getWeight(){return goodsPo.getWeight();}
    public void setWeight(Integer weight){goodsPo.setWeight(weight);}

    public String getImageUrl(){return goodsPo.getImageUrl();}
    public void setImageUrl(String image_url){goodsPo.setImageUrl(image_url);}

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