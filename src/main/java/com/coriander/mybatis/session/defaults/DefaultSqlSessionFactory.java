package com.coriander.mybatis.session.defaults;

import com.coriander.mybatis.binding.MapperRegistry;
import com.coriander.mybatis.session.SqlSession;
import com.coriander.mybatis.session.SqlSessionFactory;

/**
 * @Author YaoBoning
 * @Date 2024/11/20 11:14
 * @Description 默认的 DefaultSqlSessionFactory
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }

}

