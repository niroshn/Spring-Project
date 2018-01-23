package com.sysco.ordermanager.securityconfig;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class CustomUserDetailsService implements UserDetailsService{

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
