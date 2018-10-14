package com.shangtouhua.entity;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018\10\6 0006.
 */
public class Goods {

    private String id;
    private String title;
    private String ginfo;
    private BigDecimal gcount;
    private String tid;
    private BigDecimal allprice;
    private BigDecimal price;
    private BigDecimal gimage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public BigDecimal getGcount() {
        return gcount;
    }

    public void setGcount(BigDecimal gcount) {
        this.gcount = gcount;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public BigDecimal getAllprice() {
        return allprice;
    }

    public void setAllprice(BigDecimal allprice) {
        this.allprice = allprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGimage() {
        return gimage;
    }

    public void setGimage(BigDecimal gimage) {
        this.gimage = gimage;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", ginfo='" + ginfo + '\'' +
                ", gcount=" + gcount +
                ", tid='" + tid + '\'' +
                ", allprice=" + allprice +
                ", price=" + price +
                ", gimage=" + gimage +
                '}';
    }
}
