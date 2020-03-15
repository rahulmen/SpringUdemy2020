package DataBaseExample01Mar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataBaseTest {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext
        ("applicationContext.xml");

    DataBase dataBase = classPathXmlApplicationContext.getBean("dataBean",DataBase.class);

    dataBase.execute();

  }

}
