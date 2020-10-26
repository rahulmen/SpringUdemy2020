package SpringScopeAnnotationWithoutXml2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Varvade implements Coach{

    @Override
    public String getGame() {
        return "Football";
    }
}
