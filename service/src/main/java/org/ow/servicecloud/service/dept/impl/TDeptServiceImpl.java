package org.ow.servicecloud.service.dept.impl;

import org.ow.servicecloud.dao.dept.entity.TDept;
import org.ow.servicecloud.dao.dept.mapper.TDeptMapper;
import org.ow.servicecloud.service.dept.ITDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
@Service
public class TDeptServiceImpl extends ServiceImpl<TDeptMapper, TDept> implements ITDeptService {

    @Autowired
    public TDeptMapper tDeptMapper;

    @Override
    public boolean addDept(TDept tDept){
        return tDeptMapper.addDept(tDept);
    }

    @Override
    public TDept findById(Long id){
        return tDeptMapper.findById(id);
    }

    @Override
    public List<TDept> findAll(){
        return tDeptMapper.findAll();
    }
}
