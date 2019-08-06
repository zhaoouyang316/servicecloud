package org.ow.servicecloud.dao.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
public class BaseModel implements Serializable{

    private static final long serialVersionUID = -9123499971838023855L;

    public String remark;
    public Integer status;
    public Date createTime;
    public Date updateTime;
    public String createper;
    public String updateper;

}
