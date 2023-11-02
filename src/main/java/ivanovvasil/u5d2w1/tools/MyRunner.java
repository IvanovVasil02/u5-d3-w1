package ivanovvasil.u5d2w1.tools;

import ivanovvasil.u5d2w1.U5D2W1Application;
import ivanovvasil.u5d2w1.entities.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext((U5D2W1Application.class));
    Menu menu = (Menu) ctx.getBean("menu_component");
    System.out.println(menu.toString().replaceAll("[,\\[\\]]", ""));
  }
}
