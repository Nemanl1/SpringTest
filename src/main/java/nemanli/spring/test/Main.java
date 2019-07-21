package nemanli.spring.test;

import nemanli.spring.test.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        Car car = applicationContext.getBean("Car", Car.class);
        System.out.println(car.getName());
    }
}
