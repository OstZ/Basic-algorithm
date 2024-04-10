package JAVA.LearnString;

public class LearnString {
    public static String reverse(String str, int start, int end){
        if(start < 0) return null;
        end = end > (str.length() - 1)?str.length() - 1 : end;
        StringBuilder sb0 = new StringBuilder();
        sb0.append(str, 0, start);
        for(int j = end; j >= start; --j) sb0.append(str.charAt(j));
        if(end < str.length() - 1) sb0.append(str, end + 1, str.length());
        return sb0.toString();
    }

}
