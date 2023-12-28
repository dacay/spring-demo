package tr.com.workintech.java.spring2;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int x, int y) {

        return x+y;
    }

    public int multiply(int x, int y) {

        return x*y;
    }
}
