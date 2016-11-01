package com.miaopp.pattern.factorymethod;

import java.sql.*;

/**
 * Created by miaoping on 16/11/1.
 */
public class OracleQueryRunner extends QueryRunner {

    private String driver = "oracle.jdbc.driver.OracleDriver";

    String url = "jdbc:oracle:thin:@127.0.0.1:1521:test";

    String user = "root";

    String password = "asdfasdf";

    protected Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    protected String createSql() {
        return "select * from user";
    }

    protected ResultSet run(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }
}
