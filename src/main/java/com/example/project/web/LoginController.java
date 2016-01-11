package com.example.project.web;

import com.example.project.domain.user.User;
import com.example.project.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangbin on 2015/12/23 0023.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class LoginController extends BaseController {
    @Autowired
    UserService userService;
    @RequestMapping("/main")
    public String login(@RequestParam("userName")String userName, @RequestParam("password")String password,Model model) {
        User user = new User(userName,password,"1");
        model.addAttribute("user", user);
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        return "redirect:/portal/list/1";
    }

    @RequestMapping("/logout")
    public String logout() {
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        log.info("注销session---------------------------------");
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        log.info(this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1].getMethodName());
        return "index";
    }
}
