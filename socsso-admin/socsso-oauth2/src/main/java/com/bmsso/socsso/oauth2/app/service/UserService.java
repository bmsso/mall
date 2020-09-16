package com.bmsso.socsso.oauth2.app.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Descrition: 账号密码验证
 * @Author:bmsso
 * @Data: 2020/8/17
 */
@Service
public class UserService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("账号密码验证");
        return null;
    }
}
