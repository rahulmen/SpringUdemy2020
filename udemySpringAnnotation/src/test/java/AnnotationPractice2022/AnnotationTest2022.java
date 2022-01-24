package AnnotationPractice2022;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest2022 {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanInitialiser.class);
        DigitalDevice digitalDevice = annotationConfigApplicationContext.getBean("mobile",DigitalDevice.class);
        System.out.println(digitalDevice.brand());
        System.out.println(digitalDevice.price());
        System.out.println(digitalDevice.isRemote());
        System.out.println(digitalDevice.type());
        annotationConfigApplicationContext.close();
    }
}
