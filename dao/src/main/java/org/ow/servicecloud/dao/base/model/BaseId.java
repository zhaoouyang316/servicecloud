package org.ow.servicecloud.dao.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
@ToString(callSuper = true)
public class BaseId extends BaseModel{

    /**
     * 主键
     */
    protected Long id;

}
