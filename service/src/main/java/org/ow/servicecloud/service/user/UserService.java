package org.ow.servicecloud.service.user;


import org.ow.servicecloud.dao.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        userMapper.insert(phone,password);
    }

}
