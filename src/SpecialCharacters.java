public class SpecialCharacters {
    public static void main(String[] args) {
        String str = "#ineutron#*#iamsleepy$#@";
        int special = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z'|| ch >= 'a' && ch <= 'z'||ch >= '0' && ch <= '9'))
                special++;
        }
        System.out.println("Special characters : " + special);
    }
}
