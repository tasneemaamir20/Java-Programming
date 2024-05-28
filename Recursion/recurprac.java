public class recurprac {
    public static String reverse(String str)
    {
        if(str==null || str.length()==0)
        {
            return str;
        }
        else{
            int i=str.length()-1;
            char last=str.charAt(i);
            return last +reverse(str.substring(0, i));
        }
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
