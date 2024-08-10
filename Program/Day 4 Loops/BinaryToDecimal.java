import java.util.Scanner;

// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a binary number: ");
//         String binNum = sc.nextLine();
        
//         int decimal = 0, i = 0, n = binNum.length()-1;
//         while (n >= 0) {
//             decimal += Math.pow(2, i++) * Character.getNumericValue(binNum.charAt(n--));
//         }
//         System.out.println("The decimal equivalent of " + binNum + " is : " + decimal);
//     }
// }

// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Input binary number: ");
//         String binary = scan.nextLine();

//         // Convert binary to integer using built-in function
//         int decimal = Integer.parseInt(binary, 2);

//         System.out.printf("The decimal equivalent of %s is %d.\n", binary, decimal);
//     }
// }

// public class BinaryToDecimal {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a binary number: ");
//         String binary = sc.nextLine().trim();

//         if (!isBinary(binary)) {
//             System.out.println("Invalid input! Please enter a valid binary number.");
//             return;
//         }

//         long decimal = convertBinaryToDecimal(binary);
//         System.out.printf("The decimal equivalent of %.32s is %d.", binary, decimal);
//     }

//     private static boolean isBinary(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c != '0' && c != '1') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     private static long convertBinaryToDecimal(String binaryStr) {
//         long result = 0;
//         for (int i = 0; i < binaryStr.length(); i++) {
//             char ch = binaryStr.charAt(i);
//             int digitValue = Character.getNumericValue(ch);
//             result = (result << 1) + digitValue;
//         }
//         return result;
//     }
// }

// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println( "Please enter a binary number: " );
//         String binNum = sc.nextLine().trim();

//         try{
//             long decNum = binaryToDecimal(binNum);
//             System.out.println("The decimal equivalent of " + binNum + " is " + decNum);
//         } catch(IllegalArgumentException e){
//             System.out.println("Invalid input! Please enter a valid binary number.");   
//         } finally {
//             sc.close();
//         }
//     }

//     /**
//      * Converts the given binary string to its decimal form.
//      * The function assumes that the provided string is a valid binary representation.
//      * If it is not, an IllegalArgumentException will be thrown.
//      */
//     public static long binaryToDecimal(String binary) throws IllegalArgumentException {
//         if (!isValidBinary(binary)) throw new IllegalArgumentException();

//         long decimal = 0;
//         for (int i = 0; i < binary.length(); i++) {
//             decimal = decimal*2 + Character.getNumericValue(binary.charAt(i));
//         }
//         return decimal;
//     }

//     private static boolean isValidBinary(String str) {
//         for (char c : str.toCharArray()) {
//             if (Character.getNumericValue(c) != 0 && Character.getNumericValue(c) != 1) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }    

// public class BinaryToDecimal {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Binary number : ");
//         String binary = sc.nextLine();

//         if (!isBinary(binary)) {
//             System.out.println("Please Enter your valed input");
//         }
//         int decimal = binaryToDecimal(binary);
//         System.out.println("Binary number : "+binary+" to  Decimal Number : "+decimal);
//     }

//     public static boolean isBinary(String binary) {
//         for (int i = 0; i <= binary.length() - 1; i++) {
//             char bin = binary.charAt(i);
//             if (bin != '0' && bin != '1') {
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static int  binaryToDecimal(String binary) {
//         int dec = 0;
//         int pow = 0;
//         while (binary.length() > 0) {
//             char digit = binary.charAt(binary.length()-1);
//             int d = Character.getNumericValue(digit);
//             dec += d * Math.pow(2, pow);
//             pow++;
//             binary = binary.substring(0, binary.length()-1);
//         }
//         return dec;
//     }
// }

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        int binary = sc.nextInt();
        if (!isBinary(binary)) {
            System.out.println("Please! Enter your valid binary number;");
        } else {
            System.out.println("hii");
        }
    }

    public static boolean isBinary(int binary) {
        while(binary>=0) {
            int sc = binary % 10;
            if (sc != 0 && sc != 1) {
                return false;
            }
            binary/=10;
        }
        return true;
    }
}