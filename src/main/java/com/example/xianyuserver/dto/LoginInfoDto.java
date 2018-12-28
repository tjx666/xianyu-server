package com.example.xianyuserver.dto;/*
 *
 * @Author: YuTengjing
 * @Date: 2018/12/28 19:32
 * @Version 1.0
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginInfoDto {
    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 20, message = "账号长度应该在5~20位")
    private String id;

    @NotBlank
    @NotEmpty
    private String password;
}
