package JAVA.HouseRent.util;

import JAVA.HouseRent.domain.House;

public class HouseUtil {
    public static void reSize(House[] houses, int toSize){
        House[] newHouses = new House[toSize];
        System.arraycopy(houses, 0, newHouses, 0, houses.length);
        houses = newHouses;
    }
}
