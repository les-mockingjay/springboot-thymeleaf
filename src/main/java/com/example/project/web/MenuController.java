package com.example.project.web;

import com.example.project.domain.menu.Menu;
import com.example.project.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/menu")
public class MenuController extends BaseController {
    @Autowired
    MenuService menuService;



    @RequestMapping(value = "/findAllMenus", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> findAllMenus() {
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        List<Menu> menuList = menuService.findAllMenus();
        return menuList;
    }


    @RequestMapping(value = "/findMenusByRole", method = RequestMethod.GET)
    @ResponseBody
    public List<Menu> findMenusByRole(@RequestParam String roleName) {
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        List<Menu> menuList = menuService.findMenusByRole(roleName);
        return menuList;
    }
}
