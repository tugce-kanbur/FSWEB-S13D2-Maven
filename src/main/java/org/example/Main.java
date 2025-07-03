package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
        public static boolean isPalindrome(int number) {
            int original = Math.abs(number);
            String str = String.valueOf(original);
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }

        public static boolean isPerfectNumber(int number) {
            if (number < 1) {
                return false;
            }
            int toplam = 0;
            for (int i = 1; i < number; i++) {
                if(number % i == 0) {
                    toplam += i;
                }
            }

            return number == toplam;
        }

        public static String numberToWords(int number) {
        if(number < 0) {
            return "Invalid Value";
        }
        StringBuilder result = new StringBuilder();
        String str = String.valueOf(number);

        for(int i=0; i < str.length(); i++) {
            char digit = str.charAt(i);
            switch (digit) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
            }
        }
        return result.toString();
        }

}
