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

    public Integer getGoodsSkuId(){return goodsPo.getGoods_sku_id();}
    public void setGoodsSkuId(Integer id){goodsPo.setGoods_sku_id(id);}

    public String getSkuSn(){return goodsPo.getSku_sn();}
    public void setSkuSn(String Sku_sn){goodsPo.setSku_sn(Sku_sn);}

    public Integer getBrandId(){return goodsPo.getBrand_id();}
    public void setBrandId(Integer id){goodsPo.setBrand_id(id);}

    public Integer getCategoryId(){return goodsPo.getCategory_id();}
    public void setCategoryId(Integer id){goodsPo.setCategory_id(id);}

    public Integer getFreightId(){return goodsPo.getFreight_id();}
    public void setFreightId(Integer id){goodsPo.setFreight_id(id);}

    public Integer getShopId(){return goodsPo.getShop_id();}
    public void setShopId(Integer id){goodsPo.setShop_id(id);}

    public String getGoodsSn() {return goodsPo.getGoods_sn(); }
    public void setGoodsSn(String goodsSn) { goodsPo.setGoods_sn(goodsSn); }

    public String getName(){return goodsPo.getName();}
    public void setName(String Name){goodsPo.setName(Name);}

    public Integer getOriginalPrice(){return goodsPo.getOriginal_price();}
    public void setOriginalPrice(Integer original_price){goodsPo.setOriginal_price(original_price);}

    public String getConfiguration(){return goodsPo.getConfiguration();}
    public void setConfiguration(String configuration){goodsPo.setConfiguration(configuration);}

    public Integer getWeight(){return goodsPo.getWeight();}
    public void setWeight(Integer weight){goodsPo.setWeight(weight);}

    public String getImageUrl(){return goodsPo.getImage_url();}
    public void setImageUrl(String image_url){goodsPo.setImage_url(image_url);}

    public Integer getInventory(){return goodsPo.getInventory();}
    public void setInventory(Integer inventory){goodsPo.setInventory(inventory);}

    public String getDetail(){return goodsPo.getDetail();}
    public void setDetail(String detail){goodsPo.setDetail(detail);}

    public Integer getDisabled(){return goodsPo.getDisabled();}
    public void setDisabled(Integer disavled){goodsPo.setDisabled(disavled);}

    public Date getGmtCreate(){return goodsPo.getGmt_create();}
    public void setGmtCreate(Date date){goodsPo.setGmt_create(date);}

    public Date getGmtModified(){return goodsPo.getGmt_modified();}
    public void setGmtModified(Date date){goodsPo.setGmt_modified(date);}

    public Integer getState(){return goodsPo.getState();}
    public void setState(Integer state){goodsPo.setState(state);}
}