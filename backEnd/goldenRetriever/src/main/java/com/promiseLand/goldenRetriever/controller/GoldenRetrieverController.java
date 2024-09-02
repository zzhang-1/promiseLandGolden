package com.promiseLand.goldenRetriever.controller;

import com.promiseLand.goldenRetriever.dao.UserCredientialDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promiseLand.goldenRetriever.dao.UserCredientialDao;

@RestController
public class GoldenRetrieverController {

    @GetMapping("/goldenretriever")
    public String golden(){
        UserCredientialDao userCredientialdao = new UserCredientialDao();
        return userCredientialdao.insertUser();
    }

}
