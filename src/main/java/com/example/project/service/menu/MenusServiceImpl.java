package com.example.project.service.menu;

import com.example.project.domain.menu.Menu;
import com.example.project.utils.EnumMenuType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 2015/12/23 0023.
 */
@Service
public class MenusServiceImpl implements MenuService {
    @Override
    public void create() {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Menu> findAllMenus() {
        //创造菜单

        String menuNameArray[] = new String[12];
        menuNameArray[0] = "map";
        menuNameArray[1] = "page-inbox";
        menuNameArray[2] = "track";
        menuNameArray[3] = "index";
        menuNameArray[4] = "table";
        menuNameArray[5] = "chart-other";
        menuNameArray[6] = "ui-panels";
        menuNameArray[7] = "widgets";
        menuNameArray[8] = "typography";
        menuNameArray[9] = "icons-weathericons";
        menuNameArray[10] = "gallery";
        menuNameArray[11] = "calendar";


        String menuArray[] = {"地图定位", "地图轨迹", "地图定位", "表单", "表格", "统计", "UI元素", "组件", "字体", "图标", "相册", "日历"};
        String iconArray[] = {"fa fa-laptop", "fa fa-envelope","fa fa-copy", "fa fa-list-alt", "fa fa-desktop", "fa fa-table", "fa fa-random", "fa fa-tasks", "a fa-life-bouy", "fa fa-font", "fa fa-bolt", "fa fa-picture-o", "fa fa-calendar"};
        List<Menu> menusList = new ArrayList<Menu>();
        Menu menu = null;
        for (int i = 1; i < menuArray.length; i++) {
            menu = new Menu(i, menuArray[i], menuArray[i], iconArray[i],"/portal/list/"+i, EnumMenuType.MODULE, null, i);
            menusList.add(menu);
        }
        return menusList;
    }


    @Override
    public List<Menu> findMenusByRole(String roleName) {
        List<Menu> menusList = this.findAllMenus();
        return menusList;
    }
}
