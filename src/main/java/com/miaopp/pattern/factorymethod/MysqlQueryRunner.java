package com.miaopp.pattern.factorymethod;

import java.sql.*;

/**
 * Created by miaoping on 16/11/1.
 */
public class MysqlQueryRunner extends QueryRunner {

    String driver = "com.mysql.jdbc.Driver";

    String url = "jdbc:mysql://localhost:3306/test";

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
