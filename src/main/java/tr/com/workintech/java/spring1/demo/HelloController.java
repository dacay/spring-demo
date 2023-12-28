package tr.com.workintech.java.spring1.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {

        return "Merhaba Workintech Java ekibi!";
    }

    @GetMapping("/users/{id}")
    public String merhaba(@PathVariable("id") String id) {

        return "Merhaba " + id + "!";
    }

    @PostMapping("/users/add")
    public String addStudent(@RequestBody String studentName) {

        return "Merhaba, " + studentName;
    }
}

