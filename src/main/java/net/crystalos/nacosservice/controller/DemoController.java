package net.crystalos.nacosservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: 用例
 * Create on 2020/8/4 14:16
 *
 * @author Miss.Crystal
 * @version 1.0
 * Copyright (c) 2020 ♀Crystal♀ ,Inc. All Rights Reserved.
 */
@RestController
public class DemoController {

    /**
     * Description: 获取当前时间
     * Date: 2020/8/4 14:17
     *
     * @author Miss.Crystal
     * @return java.lang.String
     * @version 1.0
     */
    @RequestMapping(value = "/nowtimes", method = RequestMethod.GET)
    public String times() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(now);
    }

    /**
     * Description: 根据名称返回问候语
     * Date: 2020/8/4 14:17
     *
     * @author Miss.Crystal
     * @param name
     * @return java.lang.String
     * @version 1.0
     */
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}
