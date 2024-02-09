package com.backend.kutorial.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Naver {
    private String username;
    private int receivedMail;
    private int cafeNotification;
    private int messages;
    private NewsList newsList;
    private MenuList menuList;

    @Getter
    @Setter
    public static class NewsList {
        private List<String> titles = new ArrayList<>();

        public void addNews(String title) {
            titles.add(title);
        }
    }

    @Getter
    @Setter
    public static class MenuList {
        private List<Menu> menus = new ArrayList<>();

        public void addMenu(String name, String link) {
            menus.add(new Menu(name, link));
        }
    }

    @Getter
    @Setter
    public static class Menu {
        private String name;
        private String link;

        public Menu(String name, String link) {
            this.name = name;
            this.link = link;
        }
    }
}
