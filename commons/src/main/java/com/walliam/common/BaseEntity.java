package com.walliam.common;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseEntity {
    private Date createTime = new Date();
    private Date updateTime = new Date();
    public abstract void setId(Long id);
}
