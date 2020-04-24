package org.teasir.securitydb.securitydb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.teasir.securitydb.securitydb.bean.Role;
import org.teasir.securitydb.securitydb.bean.User;

import java.util.List;
@Mapper
public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getRolesById(int id);
}
