package com.mango.service.impl;

import com.mango.dao.SysUserDao;
import com.mango.entity.SysUser;
import com.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }
}
