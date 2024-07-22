package com.example.studysample.dto;

public class UserForm {
    private String name;
    private int age;

    // 追加確認用
    private String cardNumber;
    private String password;

    public UserForm(String name, int age, String cardNumber, String password) {
        this.name = name;
        this.age = age;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // アクセサメソッド（穴埋めしてもらおう）
    
}