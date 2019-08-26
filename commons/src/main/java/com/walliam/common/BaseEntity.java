package com.walliam.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BaseEntity implements Serializable {
    private Date createTime = new Date();
    private Date updateTime = new Date();
    public abstract void setId(Long id);
}
