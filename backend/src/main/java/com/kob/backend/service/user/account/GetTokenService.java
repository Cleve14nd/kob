package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: LoginService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/7 2:25
 * @Version 1.0
 */
public interface GetTokenService {
    public Map<String,String> getToken(String username, String password);
}
