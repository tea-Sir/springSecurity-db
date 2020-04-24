package org.teasir.securitydb.securitydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teasir.securitydb.securitydb.bean.Menu;
import org.teasir.securitydb.securitydb.mapper.MenuMapper;


import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getMenus(){
        return menuMapper.getMenus();
    }
}
