package com.backend.kutorial.service.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignInRequestDTO {
    private String loginId;
    private String password;
}
