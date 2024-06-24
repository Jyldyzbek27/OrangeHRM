package com.winter24.pages;

import lombok.Getter;

@Getter
public enum Enums {
    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MYINFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory"),
    MAINTENANCE("Maintenance"),
    CLAIM("Claim"),
    BUZZ("Buzz");

    final String sideMenu;

    Enums(String sideMenu) {
        this.sideMenu = sideMenu;
    }
}
