package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: RegisterService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/7 2:27
 * @Version 1.0
 */
public interface RegisterService {
    public Map<String,String> register(String username, String password,String confirmedPassword);
}
