package com.backend.kutorial.controller;

import com.backend.kutorial.domain.Naver;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/kutorial")
    public Naver kutorial() {
        System.out.println("@");
        Naver data = new Naver();
        // 여기서 MyDataObject는 데이터를 담는 POJO(Plain Old Java Object) 클래스입니다.
        // 이 클래스는 위에 제시된 JSON 데이터 구조와 일치해야 합니다.
        data.setUsername("ㅋ");
        data.setReceivedMail(999);
        data.setCafeNotification(999);
        data.setMessages(6);

        // 뉴스 목록
        Naver.NewsList newsList = new Naver.NewsList();
        newsList.addNews("조동현 감독이 생각하는 가스공사에 강한");
        newsList.addNews("법정구속 면한 이유는? 선고 뒤 조국 새로운");
        newsList.addNews("[단독] 청와대, 이상직만 인사 검증…'사전 내정'");
        newsList.addNews("Open API는 이런 API를 일반 사람들이 쓸 수 있게 공개해놓은 API입니다.");
        newsList.addNews("손흥민, 리그 100호골, 홀란드 충격");
        data.setNewsList(newsList);

        // 메뉴 목록
        Naver.MenuList menuList = new Naver.MenuList();
        menuList.addMenu("메일", "https://mail.naver.com/v2/folders/0/all");
        menuList.addMenu("카페", "https://cafe.naver.com/v2/folders/0/all");
        menuList.addMenu("블로그", "https://blog.naver.com/v2/folders/0/all");
        menuList.addMenu("쇼핑", "https://shopping.naver.com/v2/folders/0/all");
        menuList.addMenu("뉴스", "https://news.naver.com/v2/folders/0/all");
        menuList.addMenu("웹툰", "https://webtoon.naver.com/v2/folders/0/all");
        menuList.addMenu("증권", "https://jusik.naver.com/v2/folders/0/all");
        menuList.addMenu("부동산", "https://myhome.naver.com/v2/folders/0/all");
        data.setMenuList(menuList);

        return data;
    }
}
