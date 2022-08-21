import java.util.Arrays;
public class sort {
    public static void main(String[] args) {
        String str ="Hello world";
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
