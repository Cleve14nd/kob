package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.kob.backend.pojo.User;
/**
 * ClassName: UserMapper
 * Package: com.kob.backend.mapper
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/6 23:53
 * @Version 1.0
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
