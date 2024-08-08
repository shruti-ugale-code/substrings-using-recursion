public class ascii_Val {
    public static void main(String[] args) {
      str("","abcd");

    }
    public static void str(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        str(p,up.substring(1));
        str(p+ch,up.substring(1));


    }
}
