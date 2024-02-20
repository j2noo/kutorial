package com.backend.kutorial.service.dto.request;

import lombok.Builder;
import lombok.Getter;

/**
 * 회원가입에 필요한 정보
 */
@Getter
@Builder
public class SignUpRequestDTO {
    private String name;
    private String nickname;
    private String loginId;
    private String password;

}
