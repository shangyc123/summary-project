package com.shangyc.controller;

import com.shangyc.filter.JwtFilter;
import com.shangyc.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
@Controller
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/login")
    public ResponseEntity<Map<String, String>> login(String username, String password) {
        log.info("username:{},password:{}",username,password);
        Map<String, String> map = new HashMap<>();
        if (!"tom".equals(username) || !"123".equals(password)) {
            map.put("msg", "用户名密码错误");
            return ResponseEntity.ok(map);
        }
        JwtUtil jwtUtil = new JwtUtil();
        Map<String, Object> chaim = new HashMap<>();
        chaim.put("username", username);
        String jwtToken = jwtUtil.encode(username, 5 * 60 * 1000, chaim);
        map.put("msg", "登录成功");
        map.put("token", jwtToken);
        return ResponseEntity.ok(map);
    }
    @RequestMapping("/testdemo")
    public ResponseEntity<String> testdemo() {
        return ResponseEntity.ok("我爱蛋炒饭");
    }

}

