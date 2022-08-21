class Repeated {

    public static void main(String args[])
    {
        String s = "iinettronnnccccodEEEr";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if(count>1)
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
