package com.miaopp.pattern.factorymethod;

import java.sql.ResultSet;

/**
 * Created by miaoping on 16/11/1.
 */
public class DataBaseClient {

    private static QueryRunner queryRunner;

    public static void main(String[] args) throws Exception {
        queryRunner = new OracleQueryRunner();
        ResultSet resultSet = queryRunner.run();
    }

}
