package com.coriander.mybatis;

import com.coriander.mybatis.binding.MapperRegistry;
import com.coriander.mybatis.io.Resources;
import com.coriander.mybatis.session.SqlSession;
import com.coriander.mybatis.session.SqlSessionFactory;
import com.coriander.mybatis.session.SqlSessionFactoryBuilder;
import com.coriander.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.coriander.mybatis.test.dao.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author YaoBoning
 * @Date 2024/11/19 16:59
 * @Description
 */
@Slf4j
public class ApiTest {


    @Test
    public void test_SqlSessionFactory() throws IOException {
        // 1. 从SqlSessionFactory中获取SqlSession
        Reader reader = Resources.getResourceAsReader("mybatis-config-datasource.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        String res = userDao.queryUserInfoById("10001");
        log.info("测试结果：{}", res);
    }

}
