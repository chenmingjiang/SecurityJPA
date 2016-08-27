package com.example.repository;

import com.example.entity.SysUser;
import org.springframework.data.repository.Repository;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
public interface SysUserRepostiory extends Repository<SysUser, Long> {
    SysUser findByUsername(String username);
}
