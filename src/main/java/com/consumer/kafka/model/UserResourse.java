package com.consumer.kafka.model;

public class UserResourse {
    private String userName;
    private String userDept;
    private String userSal;

    public UserResourse(String userName, String userDept, String userSal) {
        this.userName = userName;
        this.userDept = userDept;
        this.userSal = userSal;
    }

    public UserResourse() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getUserSal() {
        return userSal;
    }

    public void setUserSal(String userSal) {
        this.userSal = userSal;
    }

    @Override
    public String toString() {
        return "UserResourse{" +
                "userName='" + userName + '\'' +
                ", userDept='" + userDept + '\'' +
                ", userSal='" + userSal + '\'' +
                '}';
    }
}
