import java.util.Arrays;

public class Hello {
    public static void main(String args[])
    {
        char[] a={'x','y','z','x','y','z'};
        Arrays.sort(a);
        String result="";
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1){
                result+=a[i];
            }
            else{
            result+=a[i]+" ";
            }
        }
        System.out.println(result);
    }
}