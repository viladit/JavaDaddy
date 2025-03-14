package step2_Base.basicPart2;

import java.util.Scanner;

public class RestoreString_238 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
            ============================================
            Program to restore String from Compression Rule
            ============================================
            Example:
            Input the text:
            XY#6Z1#4023
            XYZZZZZZ1000023
            ============================================
        """);
        String result = "";
        try {
            char[] arrayOfChars = input.nextLine().toCharArray();
            boolean flag = false;
            int nOfSymbols = 0;
            for (Character ch : arrayOfChars) {
                if (flag && Character.isDigit(ch) && nOfSymbols == 0) {
                    nOfSymbols = Integer.parseInt(String.valueOf(ch));
                } else if(flag && nOfSymbols != 0){
                    result = result + ch.toString().repeat(nOfSymbols);
                    flag = false;
                    nOfSymbols = 0;
                } else if (flag) {
                    result += "#";
                    flag = false;
                } else if (ch.toString().equals("#")) {
                    flag = true;
                } else {
                    result += ch;
                }
            }
            System.out.println(result);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
