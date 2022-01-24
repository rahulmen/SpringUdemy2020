package AnnotationPractice2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Television implements DigitalDevice{

    @Qualifier("smartRemote")
    @Autowired
    Remote remote;

    @Override
    public boolean isRemote() {
        return remote.voiceAssist();
    }

    @Override
    public String brand() {
        return remote.companyName();
    }

    @Override
    public String type() {
        return DeviceType.TELEVISION.name();
    }

    @Override
    public int price() {
        return 12000;
    }
}
