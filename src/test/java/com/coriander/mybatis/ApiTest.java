package com.coriander.mybatis;

import com.coriander.mybatis.binding.MapperRegistry;
import com.coriander.mybatis.session.SqlSession;
import com.coriander.mybatis.session.SqlSessionFactory;
import com.coriander.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.coriander.mybatis.test.dao.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Author YaoBoning
 * @Date 2024/11/19 16:59
 * @Description
 */
@Slf4j
public class ApiTest {
    @Test
    public void test_MapperProxyFactory() {
        // 1. 注册 Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.coriander.mybatis.test.dao");

        // 2. 从 SqlSession 工厂获取 Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 4. 测试验证
        String res = userDao.queryUserName("10001");
        log.info("测试结果：{}", res);
    }


}
