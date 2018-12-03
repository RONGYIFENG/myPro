package com.rong.app.boot.everyday.controller;
import com.rong.app.boot.everyday.entity.EveryDayEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rong.app.boot.everyday.service.IEveryDayService;

import java.util.List;
/**
 * Create by rong on ${Date}
 */
@Controller
public class Helloword {
    @Autowired
    private IEveryDayService everyDayService;
    @RequestMapping("/index")
    public String index(Model mv) throws Exception {
        EveryDayEntity entity=new EveryDayEntity();
        List<EveryDayEntity> page = everyDayService.getPage(entity);
        mv.addAttribute("list",page);
        return "/free";
    }
}
