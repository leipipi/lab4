package cn.edu.xmu.restfuldemo.bean;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Product {
    private ProductPo productPo;
    public Product(){this.productPo=new ProductPo();}
    public Product(ProductPo productPo){this.productPo=productPo;}

    public Integer getId() {
        return productPo.getId();
    }

    public void setId(Integer id) {
        productPo.setId(id);
    }

    public Integer getGoodsId() {
        return productPo.getGoodsId();
    }

    public void setGoodsId(Integer goodsId) {
        productPo.setGoodsId(goodsId);
    }

    public Integer getProductSn() {
        return productPo.getProductSn();
    }

    public void setProductSn(Integer productSn) {
        productPo.setProductSn(productSn);
    }

    public String getSkuSn() {
        return productPo.getSkuSn();
    }

    public void setSkuSn(String skuSn) {
        productPo.setSkuSn(skuSn);
    }

    public String getName() {
        return productPo.getName();
    }

    public void setName(String name) {
        productPo.setName(name);
    }

    public Integer getOriginalPrice() {
        return productPo.getOriginalPrice();
    }

    public void setOriginalPrice(Integer originalPrice) {
        productPo.setOriginalPrice(originalPrice);
    }

    public Integer getPrice() {
        return productPo.getPrice();
    }

    public void setPrice(Integer price) {
        productPo.setPrice(price);
    }

    public Integer getWeight() {
        return productPo.getWeight();
    }

    public void setWeight(Integer weight) {
        productPo.setWeight(weight);
    }

    public String getImageUrl() {
        return productPo.getImageUrl();
    }

    public void setImageUrl(String imageUrl) {
        productPo.setImageUrl(imageUrl);
    }

    public Integer getInventory() {
        return productPo.getInventory();
    }

    public void setInventory(Integer inventory) {
        productPo.setInventory(inventory);
    }

    public Integer getState() {
        return productPo.getState();
    }

    public void setState(Integer state) {
        productPo.setState(state);
    }

    public String getDetail() {
        return productPo.getDetail();
    }

    public void setDetail(String detail) {
        productPo.setDetail(detail);
    }

    public Date getGmtCreate() {
        return productPo.getGmtCreate();
    }

    public void setGmtCreate(Date gmtCreate) {
        productPo.setGmtCreate(gmtCreate);
    }

    public Date getGmtModified() {
        return productPo.getGmtModified();
    }

    public void setGmtModified(Date gmtModified) {
        productPo.setGmtModified(gmtModified);
    }

    public Integer getDisabled() {
        return productPo.getDisabled();
    }

    public void setDisabled(Integer disabled) {
        productPo.setDisabled(disabled);
    }

    public Goods getGoods() {
        return productPo.getGoods();
    }

    public void setGoods(Goods goods) {
        productPo.setGoods(goods);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productPo, product.productPo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productPo);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productPo=" + productPo +
                '}';
    }
}
