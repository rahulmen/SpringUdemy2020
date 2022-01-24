package SpringBeanAnnotationJan2022;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Mobile implements DigitalDevice{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Mobile() {
        System.out.println("Mobile bean created");
    }

    @Override
    public String isRemote() {
        return "true";
    }

    @Override
    public String customerRange() {
        return "medium class";
    }

    @Override
    public String type() {
        return DeviceType.PHONE.name();
    }
}
