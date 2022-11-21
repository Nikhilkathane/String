import java.util.Arrays;

public class StringTochar {
    public static void main(String[] args) {
        String s1="Nikhil";
        char[] c=s1.toCharArray();
        System.out.println("java method :"+ Arrays.toString(c));

        char[] c1=myToCharArray(s1);
        System.out.println("String method :"+ Arrays.toString(c1));
    }
    private static char[]myToCharArray(String s1)
    {
        char[] c1=new char[s1.length()];

        for(int i=0;i< s1.length();i++)
        {
            c1[i]=s1.charAt(i);
        }
        return c1;
    }
}
