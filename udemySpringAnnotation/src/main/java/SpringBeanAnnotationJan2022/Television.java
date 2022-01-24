package SpringBeanAnnotationJan2022;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Television implements DigitalDevice{

    public Television() {
        System.out.println("Television bean created");
    }

    @Override
    public String isRemote() {
        return "true";
    }

    @Override
    public String customerRange() {
        return "high class";
    }

    @Override
    public String type() {
        return DeviceType.TELEVISION.name();
    }
}
