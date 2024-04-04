package JAVA.HouseRent.view;

import JAVA.HouseRent.domain.House;
import JAVA.HouseRent.service.HouseService;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    public void mainMenu(HouseService hs){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("==============房屋出租系统==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("请输入想要的操作：");
            key = scanner.next().charAt(0);
            switch(key){
                case '1':
                    System.out.println("新增");
                    addHouse(hs);
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("房屋列表：");
                    prtHouses(hs);
                    break;
                case '6':
                    loop = false;
                    break;
                default:
                    break;
            }
        }while(loop);
    }
    public void prtHouses(HouseService hs){
        House[] houseList = hs.listHouses();
        System.out.println("==============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态\t\t（已出租/未出租）");
        for(int i = 0; i < hs.getSize();++i) System.out.println(houseList[i]);
    }
    public void addHouse(HouseService hs){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入房屋信息：");
        System.out.println("房主名：");
        String name = sc.nextLine();
        System.out.println("电话：");
        String phoneNum = sc.nextLine();
        System.out.println("地址：");
        String address = sc.nextLine();
        System.out.println("月租：");
        int rent = Integer.parseInt(sc.nextLine());
        System.out.println("房屋状态：");
        boolean state = sc.nextBoolean();
        hs.add(new House(hs.getHouseId(), name, phoneNum, address, rent, state));
    }
}
