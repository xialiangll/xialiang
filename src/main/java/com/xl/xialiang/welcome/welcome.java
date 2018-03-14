package com.xl.xialiang.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by xl on 2018/3/11
 */
@RestController
public class welcome {
    @GetMapping({ "/", "" })
    public ModelAndView welcome() {

        return new ModelAndView("index");
    }
}
