package com.ghnb.controller;

import com.ghnb.pojo.City;
import com.ghnb.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    @Qualifier("CityServiceImpl")
    private CityService cityService;

    @RequestMapping("/allCity")
    public String list(Model model){
        List<City> list=cityService.queryAllCity();
        model.addAttribute("list",list);
        return "allCity";
    }

}
