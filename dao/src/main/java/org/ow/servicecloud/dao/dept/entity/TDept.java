package org.ow.servicecloud.dao.dept.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.ow.servicecloud.dao.base.model.BaseAutoId;
import org.ow.servicecloud.dao.base.model.BaseId;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author owen
 * @since 2019-08-07
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class TDept extends BaseAutoId implements Serializable {

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
