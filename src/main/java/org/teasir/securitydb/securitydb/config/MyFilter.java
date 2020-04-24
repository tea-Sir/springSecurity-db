package org.teasir.securitydb.securitydb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.teasir.securitydb.securitydb.bean.Menu;
import org.teasir.securitydb.securitydb.bean.Role;
import org.teasir.securitydb.securitydb.service.MenuService;

import java.util.Collection;
import java.util.List;

@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    //路径匹配符
    AntPathMatcher antPathMatcher=new AntPathMatcher();
    //根据请求的地址分析出需要的角色

    @Autowired
    MenuService menuService;
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String reqUrl=((FilterInvocation)o).getRequestUrl();
        List<Menu> menus=menuService.getMenus();
        for(Menu menu:menus){
            if(antPathMatcher.match(menu.getPattern(),reqUrl)){
                List<Role> roles=menu.getRoles();
                String [] roleStr=new String[roles.size()];
                for(int i=0;i<roles.size();i++){
                    roleStr[i]=roles.get(i).getName();
                }
                return SecurityConfig.createList(roleStr);
            }

        }

        return SecurityConfig.createList("ROLE_login");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
