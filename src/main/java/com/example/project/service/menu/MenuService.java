package com.example.project.service.menu;

import com.example.project.domain.menu.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/23 0023.
 * 菜单接口
 */
@Service
public interface MenuService {

    /**
     * 创建对象
     */
    void create();


    /**
     * 删除对象
     */
    void delete(long id);

    /**
     * 创建对象
     */
    List<Menu> findAllMenus();

    /**
     * 根据角色名查询菜单资源集合
     */
    List<Menu> findMenusByRole(String roleName);

}
