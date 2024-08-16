package com.babbo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.babbo.dto.BabboUserDTO;

@Mapper
public interface BabboMapper {
    void userRegister(BabboUserDTO user);
}
