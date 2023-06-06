//实现config.SecurityConfig类，用来实现用户密码的加密存储
//实现后可以将数据库密码采用加密存储，用加密后的密码与输入匹配，匹配成功则进入
package com.kob.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * ClassName: SecurityConfig
 * Package: com.kob.backend.config
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/7 1:26
 * @Version 1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
