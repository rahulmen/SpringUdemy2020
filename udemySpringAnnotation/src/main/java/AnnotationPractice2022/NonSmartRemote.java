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
public class NonSmartRemote implements Remote{

    List<String> names = new ArrayList<>(Arrays.asList("Tesla","Hundai","Gavin"));

    @Override
    public boolean voiceAssist() {
        return false;
    }

    @Override
    public String isUniversal() {
        return "no";
    }

    @Override
    public String companyName() {
        return names.get(new Random().nextInt(names.size()));
    }
}
