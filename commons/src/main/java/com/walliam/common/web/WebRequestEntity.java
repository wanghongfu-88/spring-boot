package com.walliam.common.web;


import lombok.Data;
import java.util.HashMap;
/**
 * 请求体分装
 * @param <T>
 */
@Data
public class WebRequestEntity<T> {
    //对象实体
    private T entity;
    /*
     *扩展 Map
     *  经纬度
     *  设备号、设备类型、设备名称
     *
     */
    private HashMap<String,Object> extMap;


}
