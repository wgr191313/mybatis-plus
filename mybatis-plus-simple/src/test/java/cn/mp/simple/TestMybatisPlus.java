package cn.mp.simple;

import cn.mp.simple.mapper.UserMapper;
import cn.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-28
 */
public class TestMybatisPlus {

    @Test
    public void testFindAll()throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //测试查询
        //List<User> users=mapper.findAll();
        List<User> users=userMapper.selectList(null);
        for (User user:users
             ) {
            System.out.println(user);
        }
    }
}
