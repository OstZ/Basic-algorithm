package JAVA.HouseRent.service;

import JAVA.HouseRent.domain.House;
import JAVA.HouseRent.util.HouseUtil;

public class HouseService {
    private int houseNum;
    private House[] houseList;
    private int houseId = 1;
    public HouseService(){
        houseNum = 0;
    }
    public HouseService(int size){
        houseList = new House[size];
    }

    //add
    public void add(House h){
        if(houseNum >= houseList.length)
            HouseUtil.reSize(houseList, houseNum * 2);
        houseId++;
        houseList[houseNum++] = h;
    }
    //list all houses
    public House[] listHouses(){
        return houseList;
    }
    public int getSize(){
        return houseNum;
    }
    public int getHouseId() { return houseId; }
}
