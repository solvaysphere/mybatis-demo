package com.hpuswl.mybatis.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Blog implements Serializable {
    private Long id;
    private String title;
}
