package org.ow.servicecloud.dao.user.entity;

import lombok.Data;
import org.ow.servicecloud.dao.base.model.BaseAutoId;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
public class UserToken extends BaseAutoId implements Serializable {

    private static final long serialVersionUID = -304402767783372565L;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 用户Token
     */
    private String token;

    /**
     * 用户电话号
     */
    private String phone;

    /**
     * Token过期时间
     */
    private Date expiredTime;

    /**
     * 登录来源
     */
    private String osType;

}
