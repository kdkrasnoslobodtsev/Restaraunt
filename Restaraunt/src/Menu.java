import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Menu {
    ArrayList<MenuDish> menu_dishes;
}
