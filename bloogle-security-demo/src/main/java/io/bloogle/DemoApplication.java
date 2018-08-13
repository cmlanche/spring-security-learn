package io.bloogle;

import io.bloogle.demo.exceptions.MyExecption;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmlanche on 2018/8/11.
 */
@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/test")
    public String test() throws Exception {
        throw new MyExecption("1111");
    }

    @GetMapping("/test/filter")
    public String testFilter() {
        return "hello world";
    }
}
