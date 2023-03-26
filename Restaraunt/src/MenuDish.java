import java.lang.reflect.Array;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class MenuDish {
    private int menu_dish_id;
    private String menu_dish_name;
    private int menu_dish_price;
    private boolean menu_dish_active;
    private ArrayList<Integer> products;
    private ArrayList<Integer> count_products;
    private ArrayList<Integer> operations;

    public int getMenu_dish_id() {
        return menu_dish_id;
    }

    public String getMenu_dish_name() {
        return menu_dish_name;
    }

    public boolean getMenu_dish_active() {
        return menu_dish_active;
    }

    public int getMenu_dish_price() {
        return menu_dish_price;
    }

    public ArrayList<Integer> getOperations() {
        return operations;
    }

    public ArrayList<Integer> getProducts() {
        return products;
    }

    public ArrayList<Integer> getCount_products() {
        return count_products;
    }
}
