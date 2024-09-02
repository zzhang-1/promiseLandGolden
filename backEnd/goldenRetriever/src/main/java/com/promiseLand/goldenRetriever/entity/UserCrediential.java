package com.promiseLand.goldenRetriever.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCrediential {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;


}
