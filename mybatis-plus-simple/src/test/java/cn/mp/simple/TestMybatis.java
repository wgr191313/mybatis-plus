package cn.mp.simple;

import cn.mp.simple.mapper.UserMapper;
import cn.mp.simple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-28
 */
public class TestMybatis {

    @Test
    public void testFindAll()throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试查询
        List<User> users=mapper.findAll();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }
}
