package com.example.security;

import com.example.entity.SysUser;
import com.example.repository.SysUserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
public class CustomUserService implements UserDetailsService {
    @Autowired
    SysUserRepostiory sysUserRepostiory;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepostiory.findByUsername(s);
        if (sysUser == null) {
            new UsernameNotFoundException("没找到用户");
        }
        return sysUser;
    }
}
