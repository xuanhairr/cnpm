package com.example.be_shoes.dto.Request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignupRequest {
    String username;
    String name;
    String email;
    String code;
    String password;
}
