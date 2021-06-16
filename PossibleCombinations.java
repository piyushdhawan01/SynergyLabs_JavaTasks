import java.util.Scanner;

public class PossibleCombinations {

    public static void combine(String str, int startIndex, int endIndex) {
        if(startIndex == endIndex)
            System.out.println(str);
        else {
            for(int i=startIndex; i<= endIndex; i++) {
                str = swap(str,startIndex,i);
                combine(str,startIndex+1,endIndex);
                str = swap(str,startIndex,i);
            }
        }
    }

    public static String swap(String tempstr, int i, int j) {
        char temp;
        char[] charArray = tempstr.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String : ");
        String str = sc.nextLine();
        int length = str.length();
        combine(str, 0, length-1);
    }
}
