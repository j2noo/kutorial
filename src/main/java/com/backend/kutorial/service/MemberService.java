package com.backend.kutorial.service;

import com.backend.kutorial.repository.MemberRepository;
import com.backend.kutorial.service.dto.request.SignUpRequestDTO;
import com.backend.kutorial.service.dto.request.SignInRequestDTO;
import com.backend.kutorial.service.dto.response.SignInResponseDTO;
import com.backend.kutorial.service.dto.response.SignUpResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO) {

    }

    public SignInResponseDTO signIn(SignInRequestDTO signInRequestDTO) {

    }
}
