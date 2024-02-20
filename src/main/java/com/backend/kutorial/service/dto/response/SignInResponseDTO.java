package com.backend.kutorial.service.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignInResponseDTO {
    private String name;
    private String nickname;
}
