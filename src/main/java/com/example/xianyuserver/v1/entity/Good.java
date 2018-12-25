package com.example.xianyuserver.v1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @Author: YuTengjing
 * @Date: 2018/12/25 23:00
 * @Version 1.0
 */

/**
 * 产品实体类
 */
@Getter
@Setter
@NoArgsConstructor
@Component
public class Good {
    public String id;
    public String title;
    public String description;
    public Double price;
    public String category;
    public Integer transaction;
    public Boolean isSyncPool;
    public Boolean isPublish;
    public String userId;
}
