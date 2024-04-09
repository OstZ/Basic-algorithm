package JAVA.Enum;

public enum Season {
    SPRING("spring", "warm"), SUMMER("summer", "hot"), AUTUMN("autumn", "cool");
    private String season;
    private String desc;
    Season(String s1, String s2){
        season = s1;
        desc = s2;
    }
    public String getSeason(){
        return this.season;
    }
    public String getDesc(){
        return this.desc;
    }

}
