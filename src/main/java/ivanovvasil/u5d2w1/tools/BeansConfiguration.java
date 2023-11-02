package ivanovvasil.u5d2w1.tools;

import ivanovvasil.u5d2w1.entities.*;
import ivanovvasil.u5d2w1.enums.OrderStatus;
import ivanovvasil.u5d2w1.enums.TableStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {
  @Bean
  Topping tomato() {
    return new Topping("tomato", 92, 0.69);
  }

  @Bean
  Topping cheese() {
    return new Topping("cheese", 92, 0.69);
  }

  @Bean
  Topping ham() {
    return new Topping("ham", 35, 0.99);
  }

  @Bean
  Topping onion() {
    return new Topping("onion", 22, 0.69);
  }

  @Bean
  Topping pineapple() {
    return new Topping("pineapple", 24, 0.79);
  }

  @Bean
  Topping salami() {
    return new Topping("salami", 86, 0.99);
  }

  @Bean
  @Primary
  Pizza margheritaPizza() {
    List<Topping> toppings = Arrays.asList(tomato(), cheese());
    return new Pizza("Pizza Margherita", 1104, 4.99, toppings);
  }

  @Bean
  Pizza hawaiianPizza() {
    List<Topping> toppings = Arrays.asList(tomato(), cheese(), ham(), pineapple());
    return new Pizza("Hawaiian Pizza", 1024, 6.49, toppings);
  }

  @Bean
  Pizza salamiPizza() {
    List<Topping> toppings = Arrays.asList(tomato(), cheese(), salami());
    return new Pizza("Salami Pizza", 1160, 5.99, toppings);
  }

  @Bean
  Drink lemonade() {
    return new Drink("Lemonade", 128, 1.29, 0.33);
  }

  @Bean
  Drink water() {
    return new Drink("Water", 0, 1.29, 0.5);
  }

  @Bean
  Drink wine() {
    return new Drink("Wine", 607, 7.49, 0.75, 13);
  }

  @Bean
  Table getTable1() {
    return new Table(1, 5, TableStatus.LIBERO);
  }

  @Bean
  Table getTable2() {
    return new Table(2, 7, TableStatus.OCCUPATO);
  }

  @Bean
  Table getTable3() {
    return new Table(3, 4, TableStatus.OCCUPATO);
  }


  @Bean
  Order getOrder1() {
    return new Order(getTable2(), Arrays.asList(hawaiianPizza(), margheritaPizza(), lemonade(), wine()), OrderStatus.SERVED, 5);
  }

  @Bean
  Order getOrder2() {
    return new Order(getTable1(), Arrays.asList(salamiPizza(), margheritaPizza(), lemonade(), lemonade()), OrderStatus.IN_PROGRESS, 5);
  }


}
