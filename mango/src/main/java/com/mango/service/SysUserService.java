package com.mango.service;

import com.mango.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserService {
    List<SysUser> findAll();
}
