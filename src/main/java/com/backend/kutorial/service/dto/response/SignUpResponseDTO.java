package com.backend.kutorial.service.dto.response;

import lombok.Builder;
import lombok.Getter;

/**
 * 회원가입 이후 반환할 정보
 */
@Getter
@Builder
public class SignUpResponseDTO {
    private String id;
}
