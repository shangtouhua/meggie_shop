package com.shangtouhua.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
public class Types implements Serializable {

    private Integer id;
    private String tname;
    private Integer gcount;
    private Integer pid = -1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", gcount=" + gcount +
                ", pid=" + pid +
                '}';
    }
}
