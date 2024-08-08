import java.util.ArrayList;

public class subseq_in_arraylist {
    public static void main(String[] args) {
        System.out.println(subarr("","abc"));
    }
    public static ArrayList<String > subarr(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left= subarr(p+ch,up.substring(1));
        ArrayList<String> right= subarr(p,up.substring(1));

        left.addAll(right);
        return left;

    }

}
