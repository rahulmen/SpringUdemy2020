package SpringBeanAnnotationJan2022;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DigitalTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanInitialise.class);
        Mobile mobile = (Mobile) annotationConfigApplicationContext.getBean("mobile",Mobile.class);
        mobile.setPrice(20);
        System.out.println(mobile.getPrice());
        System.out.println(mobile.type()+","+mobile.customerRange()+","+mobile.isRemote());
        Mobile mobile1 = (Mobile) annotationConfigApplicationContext.getBean("mobile",Mobile.class);
        System.out.println(mobile1.getPrice());
        System.out.println(mobile.type()+","+mobile.customerRange()+","+mobile.isRemote());
        DigitalDevice television = annotationConfigApplicationContext.getBean("television",DigitalDevice.class);
        System.out.println(television.type()+","+television.customerRange()+","+television.isRemote());
        boolean isRefSame = mobile.equals(mobile1)?true:false;
        System.out.println("isMobile Reference Same :"+isRefSame);
        annotationConfigApplicationContext.close();


    }
}
