package com.example.be_shoes.dto.Request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelAccountGoogle {
    String username;
    String name;
    String email;
    String password;
}
