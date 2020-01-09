package com.vision.security.config;

import com.vision.security.entity.TbPermission;
import com.vision.security.entity.TbUser;
import com.vision.security.mapper.TbUserMapper;
import com.vision.security.service.ITbPermissionService;
import com.vision.security.service.ITbUserService;
import com.vision.security.service.impl.TbUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NingXioaoming
 * @createTime 2020/1/7 17:33
 * @description
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private ITbUserService tbUserService;
    @Autowired
    private ITbPermissionService tbPermissionService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final TbUser tbUser = tbUserService.getByUsername(username);
        if (tbUser == null){

        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (tbUser!=null){
            final List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
