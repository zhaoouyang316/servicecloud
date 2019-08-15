package org.ow.servicecloud.service.dept;

import org.ow.servicecloud.dao.dept.entity.TDept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
public interface ITDeptService extends IService<TDept> {


    boolean addDept(TDept tDept);

    TDept findById(Long id);

    List<TDept> findAll();

}
