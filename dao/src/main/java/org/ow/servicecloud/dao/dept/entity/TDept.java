package org.ow.servicecloud.dao.dept.entity;

import lombok.Data;
import org.ow.servicecloud.dao.base.BaseModel;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
@Data
public class TDept extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 部门名称
	 */
	private String dname;

	/**
	 * 数据库来源
	 */
	private String dbSource;


}
