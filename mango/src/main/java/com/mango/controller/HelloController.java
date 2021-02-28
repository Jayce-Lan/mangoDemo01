package com.mango.controller;

import com.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/testfindall")
    public Object findAllTest() {
        return sysUserService.findAll();
    }
}
