package com.coriander.mybatis.session;

/**
 * @Author YaoBoning
 * @Date 2024/11/20 11:11
 * @Description 工厂模式接口，构建SqlSession的工厂
 */
public interface SqlSessionFactory {
    /**
     * 打开一个 session
     * @return SqlSession
     */
    SqlSession openSession();
}
