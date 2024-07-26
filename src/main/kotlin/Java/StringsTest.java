package Java;

public class StringsTest {

    public static void main(String args[]) {


        System.out.println(" romannumber  "+intToRoman(1198));

    }

    public static String intToRoman(int num) {
        // Array of integer values corresponding to Roman numerals
        int[] values     =  {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // Array of Roman numeral symbols
        String[] roman   =  {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        int i=0;
         while (num!=0)
         {
             if(num>=values[i])
             {
                 res.append(roman[i]);
                 num=num-values[i];
             }else {
                 i++;
             }
         }
         return res.toString();
    }

}
