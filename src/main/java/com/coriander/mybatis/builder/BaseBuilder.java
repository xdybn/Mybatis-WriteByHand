package com.coriander.mybatis.builder;

import com.coriander.mybatis.session.Configuration;
/**
 * @Author YaoBoning
 * @Date 2024/11/20 17:53
 * @Description 构建器的基类，建造者模式
 */
public abstract class BaseBuilder {

    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

}

