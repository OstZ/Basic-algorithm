package JAVA.HouseRent.domain;

public class House {
    private int id;
    private String owner;
    private String phoneNum;
    private String address;
    private int rent;
    private String state;

    public House(int id, String owner, String phoneNum, String address, int rent, boolean state) {
        this.id = id;
        this.owner = owner;
        this.phoneNum = phoneNum;
        this.address = address;
        this.rent = rent;
        if(state) this.state = "已出租";
        else this.state = "未出租";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setState(boolean state) {
        if(state) this.state = "已出租";
        else this.state = "未出租";
    }

    public int getId() {
        return id;
    }
    public String getOwner() {
        return owner;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public int getRent() {
        return rent;
    }

    public String getState() {
        return state;
    }

    public String toString(){
        return id
                + "\t\t" + owner
                + "\t\t" + phoneNum
                + "\t\t" + address
                + "\t\t" + rent
                + "\t\t" + state;
    }
}
