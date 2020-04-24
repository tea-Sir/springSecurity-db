package org.teasir.securitydb.securitydb;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.teasir.securitydb.securitydb.service.MenuService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SecurityDbApplicationTests {
    @Autowired
    MenuService menuService;

    @Test
    void contextLoads() {
        System.out.println(menuService.getMenus());
    }

}
