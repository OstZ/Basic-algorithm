package JAVA.HouseRent.view;

import JAVA.HouseRent.domain.House;
import JAVA.HouseRent.service.HouseService;

public class ViewTest {
    public static void main(String[] args) {
        HouseView vh1 = new HouseView();
        HouseService hs = new HouseService(20);
        hs.add(new House(1, "jack", "114514", "new rimuli", 2000, false));
        vh1.mainMenu(hs);
    }
}
