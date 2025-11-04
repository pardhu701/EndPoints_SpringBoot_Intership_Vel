package com.API.EndPoints.ManagementApi.DTO;

public class UserDTO {
    private String userid;
    private String name;
    private Long age;



    public UserDTO() {
    }

    public UserDTO(String userid, String name, Long age) {
        this.userid = userid;
        this.name = name;
        this.age = age;

    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
