package org.teasir.securitydb.securitydb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.teasir.securitydb.securitydb.bean.Menu;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenus();
}
