package com.example.demo.Controller;

import com.example.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(User.class)
public class HelloController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private  int age;

    @Autowired
    User user;

    @RequestMapping("/hello")
    public String index(){
        return "Git is coming";
    }
    @RequestMapping("/ymltest")
    public String tests(){return name+age ;}
    @RequestMapping("/user")
    public String usertest(){return user.getAge()+"####"+user.getName();}

}
