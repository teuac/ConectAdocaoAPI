package com.example.connectadocaoapi.enums;



public enum UserType {

    NOG(1),
    ADOPTER(2);


    private int code;

    private UserType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserType valueOF(int code) {
        for(UserType value : UserType.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Order Status code");
    }

}
