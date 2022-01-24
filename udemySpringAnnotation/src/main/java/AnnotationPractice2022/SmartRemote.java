package AnnotationPractice2022;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SmartRemote implements Remote{

    List<String> names = new ArrayList<>(Arrays.asList("Sony","Samsung","Apple","Vu","OnePlus","MI"));

    @Override
    public boolean voiceAssist() {
        return true;
    }

    @Override
    public String isUniversal() {
        return "yes";
    }

    @Override
    public String companyName() {
        return names.get(new Random().nextInt(names.size()));
    }
}
