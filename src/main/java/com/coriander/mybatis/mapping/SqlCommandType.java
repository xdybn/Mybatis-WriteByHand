package com.coriander.mybatis.mapping;

/**
 * @Author YaoBoning
 * @Date 2024/11/20 17:55
 * @Description SQL 指令类型
 */
public enum SqlCommandType {

    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 删除
     */
    DELETE,
    /**
     * 查找
     */
    SELECT;

}

