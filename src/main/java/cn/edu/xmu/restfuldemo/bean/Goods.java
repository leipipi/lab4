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

    public Integer getGoods_sku_id(){return goodsPo.getGoods_sku_id();}
    public void setGoods_sku_id(Integer id){goodsPo.setGoods_sku_id(id);}

    public String getSku_sn(){return goodsPo.getSku_sn();}
    public void setSku_sn(String Sku_sn){goodsPo.setSku_sn(Sku_sn);}

    public String getName(){return goodsPo.getName();}
    public void setName(String Name){goodsPo.setName(Name);}

    public Integer getBrand_id(){return goodsPo.getBrand_id();}
    public void setBrand_id(Integer id){goodsPo.setBrand_id(id);}

    public Integer getCategory_id(){return goodsPo.getCategory_id();}
    public void setCategory_id(Integer id){goodsPo.setCategory_id(id);}

    public Integer getFreight_id(){return goodsPo.getFreight_id();}
    public void setFreight_id(Integer id){goodsPo.setFreight_id(id);}

    public Integer getShop_id(){return goodsPo.getShop_id();}
    public void setShop_id(Integer id){goodsPo.setShop_id(id);}


    public Integer getOriginal_price(){return goodsPo.getOriginal_price();}
    public void setOriginal_price(Integer original_price){goodsPo.setOriginal_price(original_price);}

    public String getConfiguration(){return goodsPo.getConfiguration();}
    public void setConfiguration(String configuration){goodsPo.setConfiguration(configuration);}

    public Integer getWeight(){return goodsPo.getWeight();}
    public void setWeight(Integer weight){goodsPo.setWeight(weight);}

    public String getImage_url(){return goodsPo.getImage_url();}
    public void setImage_url(String image_url){goodsPo.setImage_url(image_url);}

    public Integer getInventory(){return goodsPo.getInventory();}
    public void setInventory(Integer inventory){goodsPo.setInventory(inventory);}

    public String getDetail(){return goodsPo.getDetail();}
    public void setDetail(String detail){goodsPo.setDetail(detail);}

    public Integer getDisavled(){return goodsPo.getDisavled();}
    public void setDisavled(Integer disavled){goodsPo.setDisavled(disavled);}

    public Date getGmt_create(){return goodsPo.getGmt_create();}
    public void setGmt_create(Date date){goodsPo.setGmt_create(date);}

    public Date getGmt_modified(){return goodsPo.getGmt_modified();}
    public void setGmt_modified(Date date){goodsPo.setGmt_modified(date);}

    public Integer getState(){return goodsPo.getState();}
    public void setState(Integer state){goodsPo.setState(state);}
}