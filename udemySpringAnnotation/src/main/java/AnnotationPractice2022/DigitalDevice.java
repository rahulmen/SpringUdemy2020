package AnnotationPractice2022;

import org.springframework.stereotype.Component;

@Component
public interface DigitalDevice {

    boolean isRemote();
    String brand();
    String type();
    int price();

}
