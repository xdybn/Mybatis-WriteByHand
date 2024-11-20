package com.coriander.mybatis.session.defaults;

import com.coriander.mybatis.binding.MapperRegistry;
import com.coriander.mybatis.mapping.MappedStatement;
import com.coriander.mybatis.session.Configuration;
import com.coriander.mybatis.session.SqlSession;

/**
 * @Author YaoBoning
 * @Date 2024/11/20 11:14
 * @Description 默认SqlSession实现类
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了！" + "\n方法：" + statement + "\n入参：" + parameter + "\n待执行SQL：" + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

}



