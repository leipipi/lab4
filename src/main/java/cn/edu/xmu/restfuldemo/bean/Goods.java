package cn.edu.xmu.restfuldemo.bean;
import io.swagger.models.auth.In;

import java.util.Date;
import lombok.*;

public class Goods implements VoObject {
    @Override
    public Object createVo(){

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

}