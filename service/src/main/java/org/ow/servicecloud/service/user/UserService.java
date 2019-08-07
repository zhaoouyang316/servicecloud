package org.ow.servicecloud.service.user;


import org.ow.servicecloud.dao.user.entity.User;
import org.ow.servicecloud.dao.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public void registerUser(String phone,String password){
        User user=new User();
        user.setPhone(phone);
        user.setPassword(password);
        user.setSalt("123456");
        user.setAge(18);
        user.setRemark("");
        user.setStatus(1);
        user.setCreateper("");
        user.setUpdateper("");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userMapper.insert(user);
    }

}
