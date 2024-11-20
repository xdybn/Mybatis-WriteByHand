package com.coriander.mybatis.test.dao;

/**
 * @Author YaoBoning
 * @Date 2024/11/19 17:49
 * @Description 用户信息持久层
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

}
