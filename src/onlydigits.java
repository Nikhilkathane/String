public class onlydigits {
    public static void main(String[] args) {
        String s="1234a";
        boolean result =onlydigits(s);
        if(result)
            System.out.println("only digits");
         else
             System.out.println("not only digit");
    }
    private static boolean onlydigits(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9')
                return false;
        }
        return true;
    }
}
