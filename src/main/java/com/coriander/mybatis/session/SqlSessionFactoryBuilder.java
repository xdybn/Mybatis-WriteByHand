package com.coriander.mybatis.session;

import com.coriander.mybatis.builder.xml.XMLConfigBuilder;
import com.coriander.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.Reader;

/**
 * @Author YaoBoning
 * @Date 2024/11/20 17:55
 * @Description
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}
