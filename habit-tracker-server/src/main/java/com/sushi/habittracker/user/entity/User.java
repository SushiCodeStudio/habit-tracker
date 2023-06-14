package com.sushi.habittracker.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    // 編號
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private String id;

    // 使用者信箱
    @Column(name = "email")
    private String email;

    // 註冊方式
    @Column(name = "register_type")
    private String registerType;

    // 建立時間
    @Column(name = "create_time")
    private String createTime;

    // 修改時間
    @Column(name = "update_time")
    private String updateTime;
    
}