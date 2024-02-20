package com.backend.kutorial.service;

import com.backend.kutorial.domain.Member;
import com.backend.kutorial.repository.MemberRepository;
import com.backend.kutorial.service.dto.request.SignUpRequestDTO;
import com.backend.kutorial.service.dto.request.SignInRequestDTO;
import com.backend.kutorial.service.dto.response.SignInResponseDTO;
import com.backend.kutorial.service.dto.response.SignUpResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public SignUpResponseDTO signUp(SignUpRequestDTO req) {
        Optional<Member> optionalMember = memberRepository.findByLoginId(req.getLoginId());
        if (optionalMember.isPresent()) {
            throw new IllegalStateException("이미 존재하는 ID이므로 회원가입 할 수 없습니다");
        }

        Member member = Member.builder()
                .name(req.getName())
                .nickname(req.getNickname())
                .loginId(req.getLoginId())
                .password(req.getPassword())
                .build();

        memberRepository.save(member);

        return SignUpResponseDTO.builder()
                .id(member.getId())
                .build();
    }

    /**
     * 로그인 비즈니스 로직
     * @param req
     * @return
     */
    public SignInResponseDTO signIn(SignInRequestDTO req) {
        //orElseThrow로 옵셔널에서 바로 객체 추출 가능
        Member member = memberRepository.findByLoginId(req.getLoginId())
                .orElseThrow(() -> new RuntimeException("존재하지 않는 id입니다"));

        if (!member.getPassword().equals(req.getPassword())) {
            throw new IllegalStateException("비밀번호가 잘못되었습니다");
        }

        return SignInResponseDTO.builder()
                .name(member.getName())
                .nickname(member.getNickname())
                .build();
    }
}
