public class ReverseSentence {
    public static void main (String[] args) {
        String str = "Think Twice";
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for(int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" ");
        }
        System.out.println(reverse.toString().toLowerCase());
    }
}
