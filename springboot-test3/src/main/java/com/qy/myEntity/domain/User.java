package com.qy.myEntity.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author QY3022
 * @date 2020/1/14
 */
@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户表这么的一个东西")
public class User {

    @ApiModelProperty("用户ID")
    @Id
    private Long id;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("年龄")
    private Long age;
}
