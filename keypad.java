public class keypad
{
    static String key[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void combination(String num, int idx, String comb)
    {
        if(idx == num.length())
        {
            System.out.println(comb);
            return;
        }

        char currChar = num.charAt(idx);
        String mapping = key[currChar - '0'];
        for(int i=0;i<mapping.length();i++)
            combination(num, idx+1, comb+mapping.charAt(i));
    } 
    
    public static void main(String args[])
    {
        String num = "23";
        combination(num, 0, "");
    }
}
