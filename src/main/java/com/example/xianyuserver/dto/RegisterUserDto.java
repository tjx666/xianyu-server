package com.example.xianyuserver.dto;/*
 *
 * @Author: YuTengjing
 * @Date: 2018/12/28 14:48
 * @Version 1.0
 */


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RegisterUserDto {
    @NotEmpty
    @NotBlank
    private String id;

    @NotEmpty
    @NotBlank
    private String name;

    @NotEmpty
    @NotBlank
    private String password;
}
