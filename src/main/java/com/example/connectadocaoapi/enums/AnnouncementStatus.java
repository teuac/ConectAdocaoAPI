package com.example.connectadocaoapi.enums;

public enum AnnouncementStatus {

    INACTIVE(1),
    PENDIND_PUBLICATION(2),
    PUBLISHED(3),
    ADOPTED_ANIMAL(4);

    private int code;

    private AnnouncementStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static AnnouncementStatus valueOF(int code) {
        for(AnnouncementStatus value : AnnouncementStatus.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Announcement Status code");
    }

}
