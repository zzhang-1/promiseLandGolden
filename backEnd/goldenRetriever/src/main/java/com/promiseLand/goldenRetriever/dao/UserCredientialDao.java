package com.promiseLand.goldenRetriever.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
@ImportResource("classpath:config/SqlMap.xml")
public class UserCredientialDao {
    @Value("#{mySql}")
    private Map<String, String> mySql;
    public String insertUser() {
        return findSqlByID("insertUser");
    }
    public String findSqlByID(String sqlID) {

        return  mySql.get(sqlID);
    }
}
