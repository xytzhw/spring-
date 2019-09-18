package com.ejkj.icbc.discount.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Area")
@Api(tags = "区划管理")
public class TestJdbc {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate primaryJdbcTemplate;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate secondaryJdbcTemplate;


    @RequestMapping("/add")
    public String  addItems() {
//        String sql = "insert into items (id,title,name,detail) value (?,?,?,?)";
//        Object args[] = {orderInfo.getAddressDetail(), orderInfo.getArea(), orderInfo.getCity()};
//        int temp = primaryJdbcTemplate.update(sql, args);
        primaryJdbcTemplate.execute("select * from TD_USER t");
//        if (temp > 0) {
//            return "文章新增成功";
//        }
        return "新增出现错误";
    }

}
