import java.util.ArrayList;
import java.util.List;

public class Task3_Main {
    private static Task3_Data Data = new Task3_Data();

    public static void main(String[] args) {
        Data.setCustomerName();
        Data.setCardNumber();
        Data.setСVV();
        Data.getValidity();
        Data.setMapView();
        Cart(get());
    }

    public static ArrayList<String> get() {
        return (ArrayList<String>) Data.getCart();

    }

    public static void Cart(List Data) {

        System.out.println("Имя- " + Data.get(0) + "\tВид карты- " + Data.get(1)
                + "\tНомер карты- " + Data.get(2) + "\tCVV- " + Data.get(3)
                + "\tСрок действия- " + Data.get(4));
    }
}