package org.ow.servicecloud.api.dept.controller;

import org.ow.servicecloud.dao.dept.entity.TDept;
import org.ow.servicecloud.service.dept.ITDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/14
 */
@RestController
public class DeptController {

    @Autowired
    private ITDeptService service;

    @RequestMapping(value="/dept/add",method = RequestMethod.POST)
    public boolean add(TDept tDept){
        return service.addDept(tDept);
    }

    @RequestMapping(value = "/dept/update",method = RequestMethod.POST)
    public boolean update(TDept tDept){
        return service.updateById(tDept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public TDept get(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<TDept> list(){
        return service.list();
    }
}
