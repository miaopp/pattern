package com.miaopp.pattern.factorymethod;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by miaoping on 16/11/1.
 */
public abstract class QueryRunner {

    public ResultSet run() throws Exception {
        Connection connection = createConnection();
        String sql = createSql();
        return run(connection, sql);
    }

    protected abstract Connection createConnection() throws ClassNotFoundException, SQLException;

    protected abstract String createSql();

    protected abstract ResultSet run(Connection connection, String sql) throws SQLException;

}
