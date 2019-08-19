package org.ow.servicecloud.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/14
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();

    }

}
