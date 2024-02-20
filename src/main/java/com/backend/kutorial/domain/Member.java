package com.backend.kutorial.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
public class Member {


    @Id
    @GeneratedValue
    private Long id;
    private String loginId;
    private String name;
    private String nickname;
    private String password;
    private Integer age;

//    @Builder
//    public Member(Long id, String loginId, String nickname, String password, Integer age) {
//        this.id = id;
//        this.loginId = loginId;
//        this.nickname = nickname;
//        this.password = password;
//        this.age = age;
//    }

    protected Member() {

    }
}
