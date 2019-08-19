package org.ow.servicecloud.provider.dept.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.ow.servicecloud.dao.dept.entity.TDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *   Resful接口
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
@RestController
public class TDeptController {

    private static final String REST_URL_PREFIX="http://localhost:8081";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(TDept tDept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",tDept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public TDept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,TDept.class);
    }



}
