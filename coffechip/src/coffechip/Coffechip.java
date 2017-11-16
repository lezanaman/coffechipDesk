package coffechip;

import com.coffecheap.vista.MenuAdmin;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Coffechip {

    public static void main(String[] args) {
        MenuAdmin menu = new MenuAdmin();
        menu.setExtendedState(MAXIMIZED_BOTH);
        menu.setLocationRelativeTo(menu);
        menu.setVisible(true);

    }
}
