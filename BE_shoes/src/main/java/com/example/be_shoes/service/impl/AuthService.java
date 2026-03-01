package com.example.be_shoes.service.impl;

import com.example.be_shoes.dto.Request.ChangePasswordRequest;
import com.example.be_shoes.dto.Request.LogoutRequest;
import com.example.be_shoes.dto.Request.SignInRequest;
import com.example.be_shoes.dto.Request.SignupRequest;
import com.example.be_shoes.dto.Response.ApiResponse;
import com.example.be_shoes.dto.Response.SignInResponse;
import com.example.be_shoes.dto.Response.TaiKhoanResponse;
import com.example.be_shoes.entity.ViaCode;
import com.example.be_shoes.service.IAuthService;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {
    @Override
    public ResponseEntity<ApiResponse<SignInResponse>> login(SignInRequest signinRequest, HttpServletRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponse<SignInResponse>> loginAdmin(SignInRequest signinRequest, HttpServletRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponse<?>> logout(LogoutRequest logoutRequest) {
        return null;
    }

    @Override
    public ApiResponse<TaiKhoanResponse> registerAccount(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public int sendCodeToEmail(String to, String subject, String content) {
        return 0;
    }

    @Override
    public ViaCode insertCode(int code, String email) {
        return null;
    }

    @Override
    public String handleSendCodeToMail(String email) {
        return "";
    }

    @Override
    public ApiResponse<?> getProfile() {
        return null;
    }

    @Override
    public ApiResponse<?> getProfileAdmin() {
        return null;
    }

    @Override
    public String sendTokenForgotPassword(String email) throws MessagingException {
        return "";
    }

    @Override
    public TaiKhoanResponse resetPassword(ChangePasswordRequest changePasswrodRequest) {
        return null;
    }
}
