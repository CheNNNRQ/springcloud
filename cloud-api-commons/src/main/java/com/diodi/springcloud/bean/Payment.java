package com.diodi.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author diodi
 * @create 2021-06-26-16:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {//序列化
    private Long id;
    private String serial;
}
