package org.ow.servicecloud.api.user.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@Data
@Builder
public class RegisterVo {

    public String phone;
    public String token;
    public String id;

}
