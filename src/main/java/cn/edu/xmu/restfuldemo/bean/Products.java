package cn.edu.xmu.restfuldemo.bean;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Products implements VoObject {
    @Override
    public Object createVo(){

        return new ProductsRetVo(this);
    }
    private ProductsPo productsPo;
    public Products(){this.productsPo =new ProductsPo();}
    public Products(ProductsPo productsPo){this.productsPo = productsPo;}

    public Integer getId() {
        return productsPo.getId();
    }

    public void setId(Integer id) {
        productsPo.setId(id);
    }

    public Integer getGoodsId() {
        return productsPo.getGoodsId();
    }

    public void setGoodsId(Integer goodsId) {
        productsPo.setGoodsId(goodsId);
    }

    public Integer getProductSn() {
        return productsPo.getProductSn();
    }

    public void setProductSn(Integer productSn) {
        productsPo.setProductSn(productSn);
    }

    public String getSkuSn() {
        return productsPo.getSku_sn();
    }

    public void setSkuSn(String skuSn) {
        productsPo.setSku_sn(skuSn);
    }

    public String getName() {
        return productsPo.getName();
    }

    public void setName(String name) {
        productsPo.setName(name);
    }

    public Integer getOriginalPrice() {
        return productsPo.getOriginal_price();
    }

    public void setOriginalPrice(Integer originalPrice) {
        productsPo.setOriginal_price(originalPrice);
    }

    public Integer getPrice() {
        return productsPo.getPrice();
    }

    public void setPrice(Integer price) {
        productsPo.setPrice(price);
    }

    public Integer getWeight() {
        return productsPo.getWeight();
    }

    public void setWeight(Integer weight) {
        productsPo.setWeight(weight);
    }

    public String getImageUrl() {
        return productsPo.getImage_url();
    }

    public void setImageUrl(String imageUrl) {
        productsPo.setImage_url(imageUrl);
    }

    public Integer getInventory() {
        return productsPo.getInventory();
    }

    public void setInventory(Integer inventory) {
        productsPo.setInventory(inventory);
    }

    public Integer getState() {
        return productsPo.getState();
    }

    public void setState(Integer state) {
        productsPo.setState(state);
    }

    public String getDetail() {
        return productsPo.getDetail();
    }

    public void setDetail(String detail) {
        productsPo.setDetail(detail);
    }

    public Date getGmtCreate() {
        return productsPo.getGmt_create();
    }

    public void setGmtCreate(Date gmtCreate) {
        productsPo.setGmt_create(gmtCreate);
    }

    public Date getGmtModified() {
        return productsPo.getGmt_modified();
    }

    public void setGmtModified(Date gmtModified) {
        productsPo.setGmt_create(gmtModified);
    }

    public Boolean getDisable() {
        return productsPo.getDisable();
    }

    public void setDisable(Boolean disabled) {
        productsPo.setDisable(disabled);
    }

    public Boolean getShareable(){return productsPo.getShareable();}
    public void setShareable(Boolean shareable){productsPo.setShareable(shareable);}

    List<Goods> goods_list;

    public List<Goods> getGoods_list() {
        return goods_list;
    }

    public void setGoods_list(List<Goods> goods_list) {
        this.goods_list=goods_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productsPo, products.productsPo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsPo);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productPo=" + productsPo +
                '}';
    }
}
