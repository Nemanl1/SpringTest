package nemanli.spring.test.bean;

import org.springframework.beans.factory.annotation.Value;

public class Car {
    /*@Value("#{test}")*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
