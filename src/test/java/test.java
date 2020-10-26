import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class test {



  public static Collection customiseCollection(Predicate predicate, Collection collection)
      throws Exception {
    try {
      Collection collection1 = (Collection) Class.forName(collection.getClass().getName())
          .newInstance();
      for (Object o : collection) {
        if (predicate.test(o)) {
          collection1.add(o);
        }
      }
      return collection1;
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException nsee) {
      throw new Exception(nsee.getMessage());
    }

  }


  public static void main(String[] args) throws Exception {

    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("bebvde",null,"ebdheb",""));

    Predicate<String> predicate = s->null!=s && !s.isEmpty();

    System.out.println(customiseCollection(predicate.negate(),arrayList));

  }

}
