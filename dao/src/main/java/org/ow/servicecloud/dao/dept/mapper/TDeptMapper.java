package org.ow.servicecloud.dao.dept.mapper;

import org.ow.servicecloud.dao.dept.entity.TDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
public interface TDeptMapper extends BaseMapper<TDept> {

    public boolean addDept(TDept tDept);

    public TDept findById(Long id);

    public List<TDept> findAll();

}