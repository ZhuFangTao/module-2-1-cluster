package com.lagou.springcluster.pojo;

import javax.persistence.*;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 9:23 上午
 * \
 */
@Entity
@Table(name = "tb_resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    public long getId() {
        return id;
    }

    public Resume setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Resume setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Resume setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Resume setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}