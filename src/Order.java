import java.util.List;
import java.util.Scanner;

public class Order {

  private final String id;
  private final String content;
  private final String client;
  private final String phone;
  private int price;

  public Order(String id, String content, String client, String phone, int price) {
    this.id = id;
    this.content = content;
    this.client = client;
    this.phone = phone;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "=== Заказ ===\n" +
        "ID:             " + id + "\n" +
        "Содержимое:     " + content + "\n" +
        "Клиент:         " + client + "\n" +
        "Номер телефона: " + phone + "\n" +
        "Стоимость:      " + price;
  }

  public static Order readOrder() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ID заказа: ");
    String id = scanner.nextLine();
    System.out.print("Введите текст заказа: ");
    String content = scanner.nextLine();
    System.out.print("Введите имя заказчика: ");
    String client = scanner.nextLine();
    System.out.print("Введите номер телефона: ");
    String phone = scanner.nextLine();
    System.out.print("Введите стоимость: ");
    int price = scanner.nextInt();
    scanner.nextLine();
    return new Order(id, content, client, phone, price);
  }
}
