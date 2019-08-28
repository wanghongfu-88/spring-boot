package com.walliam.common.util;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Http 请求工具类
 * @author：young
 * @time:2019/08/28 16:27
 **/
@Slf4j
public class HttpUtils {

    private static final int MAX_TIME_OUT = 10 * 1000;

    public static String post(String urlString, Map<String, Object> paramMap) {
        return request((String u, Map<String, Object> p,String s)->HttpUtil.post(u,p,MAX_TIME_OUT),urlString,paramMap,null);
    }

    public static String post(String urlString, String body) {
        return request((String u, Map<String, Object> p,String s)->HttpUtil.post(u,s,MAX_TIME_OUT),urlString,null,body);
    }

    public static String get(String urlString) {
        return request((String u, Map<String, Object> p,String s)->HttpUtil.get(u,MAX_TIME_OUT),urlString,null,null);
    }

    public static String get(String urlString, Map<String, Object> paramMap) {
        return request((String u, Map<String, Object> p,String s)->HttpUtil.post(u,p,MAX_TIME_OUT),urlString,paramMap,null);
    }


    public static String request(VocHttpDeal vocHttpDeal,String urlString, Map<String, Object> paramMap,String body){
        log.info("HttpUtils request url={}",urlString);
        long startTime = System.currentTimeMillis();
        String result = vocHttpDeal.deal(urlString, paramMap,body);
        log.info("HttpUtils request url={},执行耗时=={}毫秒",urlString,(System.currentTimeMillis() - startTime));
        return result;
    }


    /**
     *  添加HEADER的POST请求处理
     * @param urlString
     * @param json
     * @param headerMap
     * @return
     */
    public static String postHeader(String urlString, JSON json, Map<String, List<String>> headerMap){
        long startTime = System.currentTimeMillis();
        log.info("HttpUtils  postHeader request startTime={},url={},paramMap={}",startTime,urlString,json);
        String result =   HttpRequest.post(urlString)
                .header(headerMap)
                .body(json)
                .timeout(MAX_TIME_OUT)
                .execute().body();
        log.info("HttpUtils postHeader request startTime={},url={},执行耗时=={}毫秒,result={}" ,startTime,urlString,(System.currentTimeMillis() - startTime),result);
        return result;
    }

    @FunctionalInterface
    public interface VocHttpDeal{
        /**
         * 具体请求方法
         * @param urlString
         * @param paramMap
         * @param body
         * @return
         */
        String deal(String urlString, Map<String, Object> paramMap, String body);

    }
}
