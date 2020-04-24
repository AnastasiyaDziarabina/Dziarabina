import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_Data {

    private String CustomerName;
    private String MapView;
    private String CardNumber;
    private String CVV;
    private String Validity;

    List<String> Clients = new ArrayList<String>();
    List<String> data = new ArrayList<String>();
    int c = 0;
    static Scanner scanner = new Scanner(System.in);

    public void setCustomerName() {
        System.out.println("Введите имя клиента:");
        if (scanner.hasNext()) {
            String temp = scanner.nextLine();
            int b = temp.length();
            if (b > 1) {
                this.CustomerName = temp;
                System.out.println("*************************");
            } else {
                setCustomerName();
            }
        }
    }

    public void setMapView() {
        System.out.println("Выберете вид карты:\n 1-Debit card \n 2-" +
                "Credit card \n 3-Prepaid card");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
            switch (operation) {
                case '1':
                    this.MapView = "Debit";
                    break;
                case '2':
                    this.MapView = "Credit";
                    break;
                case '3':
                    this.MapView = "Prepaid";
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    setMapView();
            }
            System.out.println("*************************");
        }
    }

    public void setCardNumber() {
        System.out.println("Введите номер карты:");
        if (scanner.hasNext()) {
            String temp = scanner.nextLine();
            int len = temp.length();
            if (len == 16) {
                this.CardNumber = temp;
                System.out.println("*************************");
            } else {
                System.out.println("Неверный номер карты \n *************************");
                setCardNumber();
            }
        }
    }

    public void setСVV() {
        System.out.println("Введите CVV:");
        String temp = scanner.nextLine();
        if (temp.length() == 3) {
            this.CVV = temp;
        } else {
            System.out.println("Неверный CVV \n *************************");
            setСVV();
        }
    }

    public void getValidity() {

        System.out.println("Введите срок действия карты:");
        if (scanner.hasNext()) {
            this.Validity = scanner.nextLine();
            int len = Validity.length();
            if (len == 5) {
                System.out.println("*************************");
            } else {
                getValidity();
            }
        }
    }

    public List<String> getCart() {

        Clients.add(0, CustomerName);
        Clients.add(1, MapView);
        Clients.add(2, CardNumber);
        Clients.add(3, CVV);
        Clients.add(4, Validity);

        return Clients;
    }

}