package ivanovvasil.u5d2w1;

import ivanovvasil.u5d2w1.entities.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5D2W1Application {

  public static void main(String[] args) {

    SpringApplication.run(U5D2W1Application.class, args);
    configurationClass();
  }

  public static void configurationClass() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext((U5D2W1Application.class));
    Order order2 = (Order) ctx.getBean("getOrder2");
    
    System.out.println(order2);
  }
}
