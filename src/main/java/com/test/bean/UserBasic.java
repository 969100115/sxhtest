package com.test.bean;

import com.test.base.model.BaseModel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@RequiredArgsConstructor(staticName = "newInstance")
@Table(name = "user_basic")
public class UserBasic extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`phone`")
    private String phone;


    @Column(name = "`user_name`")
    private String userName;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`authority`")
    private String authority;




}
