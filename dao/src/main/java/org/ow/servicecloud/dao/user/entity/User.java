package org.ow.servicecloud.dao.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.ow.servicecloud.dao.base.model.BaseAutoId;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class User extends BaseAutoId {

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