package me.zhyd.springboot.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springboot
 * Created by zjjlive
 * @Author: zjjlive
 * @Date: 2018/10/10 13:43
 */
@Controller
@SpringBootApplication
public class WebsocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
