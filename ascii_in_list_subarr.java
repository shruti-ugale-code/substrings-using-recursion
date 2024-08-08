import java.util.ArrayList;

public class ascii_in_list_subarr {
    public static void main(String[] args) {
        System.out.println(subarr("","abc"));
    }
    public static ArrayList<String > subarr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left= subarr(p+ch,up.substring(1));
        ArrayList<String> right= subarr(p,up.substring(1));
        ArrayList<String> ascii= subarr(p+(ch+0),up.substring(1));


        left.addAll(right);
        left.addAll(ascii);
        return left;

    }
}
