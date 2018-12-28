package com.example.xianyuserver.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * @Author: YuTengjing
 * @Date: 2018/12/25 23:00
 * @Version 1.0
 */

/**
 * 用户实体类
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class User {
    private String id;
    private String name;
    private Boolean sex;
    private Date birthday;
    private String liveAddress;
    private String receiveAddress;
    private String industry;
    private String college;
    private String favourites;
    private String collectionGoodIds;
    private String boughtGoodIds;
    private String selfGoodIds;
    private String password;
}
