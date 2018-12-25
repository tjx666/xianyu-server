package com.example.xianyuserver.v1.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
@Component
public class User {
    public String id;
    public String name;
    public Boolean sex;
    public Date birthday;
    public String liveAddress;
    public String receiveAddress;
    public String industry;
    public String college;
    public String favourites;
}
