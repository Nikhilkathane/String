public class onlydigits2 {
    public static void main(String[] args) {
        String s="12345";
        char[] c=s.toCharArray();
        int cnt=0;
        for (int i=0;i<c.length;i++)
        {
            if(c[i]>='0' && c[i]<='9')
            {
                cnt++;
            }
        }
        if(cnt==s.length())
        {
            System.out.println("only digit");
        }
        else
        {
            System.out.println("not only digit");
        }
    }
}
