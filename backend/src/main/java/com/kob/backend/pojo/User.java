package com.kob.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.kob.backend.pojo
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/6 23:49
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
