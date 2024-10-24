package com.example.lastproject.domain.user.dto.response;

import lombok.Getter;

@Getter
public class UserResponse {

    private final String email;
    private final String profileImg = "com/example/lastproject/domain/user/assets/img/img.png";
    private final String msg;

    public UserResponse(String email, String nickname, String msg) {
        this.email = email;
        this.msg = nickname + msg;
    }
}