package name.katlog.springboottest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fw on 2019/8/17
 */
@RestController
@RequestMapping("/person")
public class MyContoller {

    @Data
    @AllArgsConstructor
    static class Person{
        private String name;
        private int age;
    }

    @GetMapping(path = "find")
    public Person find(@RequestParam int age, @RequestParam String name){
        return new Person(name, age);
    }


}
