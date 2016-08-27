package com.example.controller;

import com.example.entity.Msg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(Model model) {
        Msg msg = new Msg("这里是标题", "主要内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}
