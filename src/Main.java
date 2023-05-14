import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Order order1 = new Order("1", "Клубника",
        "Владимир", "0162854487236", 20);
    Order order2 = new Order("2", "Клубника",
        "Владимир", "0162854487236", 32);
    Order order3 = new Order("3", "Клубника",
        "Владимир", "0162854487236", 30);
    Order order4 = new Order("4", "Клубника",
        "Владимир", "0162854487236", 25);
    List<Order> orders = new ArrayList<>();
    orders.add(order1);
    orders.add(order2);
    orders.add(order3);
    orders.add(order4);
    System.out.println(Order.getTotalSum(orders));
  }
}
