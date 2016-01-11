package com.example.project.web;

import com.example.project.domain.menu.Menu;
import com.example.project.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by huangbin on 2015/12/23 0023.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/portal")
public class PortalController extends BaseController {
    @Autowired
    MenuService menuService;

    @RequestMapping(value="/list/{id}")
    public String login(@PathVariable("id") int id, Model model) {
        String menuArray[] = new String[12];
        menuArray[0] = "index";
        menuArray[1] = "page-inbox";
        menuArray[2] = "index";
        menuArray[3] = "index";
        menuArray[4] = "table";
        menuArray[5] = "chart-other";
        menuArray[6] = "ui-panels";
        menuArray[7] = "widgets";
        menuArray[8] = "typography";
        menuArray[9] = "icons-weathericons";
        menuArray[10] = "gallery";
        menuArray[11] = "calendar";
        List<Menu> menuList = menuService.findAllMenus();
        model.addAttribute("menuList", menuList);
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        return menuArray[id];
    }

}
