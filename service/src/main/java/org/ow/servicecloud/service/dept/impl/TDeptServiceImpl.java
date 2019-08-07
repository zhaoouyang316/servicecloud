package org.ow.servicecloud.service.dept.impl;

import org.ow.servicecloud.dao.dept.entity.TDept;
import org.ow.servicecloud.dao.dept.mapper.TDeptMapper;
import org.ow.servicecloud.service.dept.ITDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
	
}
