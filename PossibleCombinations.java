import java.util.Scanner;

public class PossibleCombinations {

    static int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] romanNumerals = {"M","CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String convertNumberToRoman(int number) {
        int i = getIndex(number);
        if(number == values[i]) {
            return romanNumerals[i];
        }

        return romanNumerals[i] + convertNumberToRoman(number-values[i]);
    }

    public static int getIndex(int number) {
        for (int i=0; i < values.length; i++) {
            while (number >= values[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the integer number : ");
        int number = sc.nextInt();
        String finalRomanNumber = convertNumberToRoman(number);
        System.out.println("Converted Roman Numeral is : "+finalRomanNumber);
        sc.close();
    }
}
