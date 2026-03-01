package com.example.be_shoes.dto.Request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordRequest {
    String newPasswrod;
    String token;
}
