package cn.mp.simple.mapper;

import cn.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-28
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();

}
