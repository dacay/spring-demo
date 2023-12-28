package tr.com.workintech.java.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    private Calculator calculator;

//    public MathController(Calculator calculator) {
//        this.calculator = calculator;
//    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable("x") String xStr, @PathVariable("y") String yStr) {

        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        return Integer.toString(calculator.multiply(x, y));
    }
}
