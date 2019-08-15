package org.ow.servicecloud.dao.base.model;

import lombok.Data;
import lombok.ToString;
import org.ow.servicecloud.utils.SnowFlakeIdGenerator;

/**
 * 自动主键Bean
 */
@Data
@ToString(callSuper = true)
public class BaseAutoId extends BaseId {

    public BaseAutoId() {
        this.id = SnowFlakeIdGenerator.getDefaultNextId();
    }

}
