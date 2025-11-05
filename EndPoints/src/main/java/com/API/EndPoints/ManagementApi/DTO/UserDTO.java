package com.API.EndPoints.ManagementApi.DTO;

public class UserDTO {
    private String userid;
    private String name;
    private Long age;

    private String type="individual";

    private Integer adminpasscode;

    private Integer createadminpass;



    public UserDTO() {
    }

    public UserDTO(String userid, String name, Long age) {
        this.userid = userid;
        this.name = name;
        this.age = age;

    }


    public UserDTO(String userid, String name, Long age, String type, Integer adminpasscode, Integer createadminpass) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.type = type;
        this.adminpasscode = adminpasscode;
        this.createadminpass = createadminpass;
    }

    public Integer getAdminpasscode() {
        return adminpasscode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAdminpasscode(Integer adminpasscode) {
        this.adminpasscode = adminpasscode;
    }

    public Integer getCreateadminpass() {
        return createadminpass;
    }

    public void setCreateadminpass(Integer createadminpass) {
        this.createadminpass = createadminpass;
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
                ", type='" + type + '\'' +
                ", adminpasscode=" + adminpasscode +
                ", createadminpass=" + createadminpass +
                '}';
    }
}
