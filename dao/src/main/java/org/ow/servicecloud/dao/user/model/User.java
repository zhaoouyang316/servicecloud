package org.ow.servicecloud.dao.user.model;

import lombok.Data;
import org.ow.servicecloud.dao.base.BaseModel;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
public class User extends BaseModel {

    private static final long serialVersionUID = -3067937224759623280L;

    /**
     * 用户手机号
     */
    public String phone;

    /**
     * 盐
     */
    public String salt;
    /**
     * 用户密码
     */
    public String password;
    /**
     * 用户年龄
     */
    public Integer age;

}