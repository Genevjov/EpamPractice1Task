package ua.nure.dlubovskyi.practice1;

class Part7{
     public static void main(String[] args) {
         System.out.println("A ==> " + str2int("A") + " ==> " + int2str(1));
         System.out.println("B ==> " + str2int("B") + " ==> " + int2str(2));
         System.out.println("Z ==> " + str2int("Z") + " ==> " + int2str(26));
         System.out.println("AA ==> " + str2int("AA") + " ==> " + int2str(27));
         System.out.println("AZ ==> " + str2int("AZ") + " ==> " + int2str(52));
         System.out.println("BA ==> " + str2int("BA") + " ==> " + int2str(53));
         System.out.println("ZZ ==> " + str2int("ZZ") + " ==> " + int2str(702));
         System.out.println("AAA ==> " + str2int("AAA") + " ==> " + int2str(703));
     }

     public static int str2int(String number){
         char[] numbers = new StringBuilder(number).reverse().toString().toCharArray();
         int digit = 0;

         for(int i = 0; i < numbers.length; i++)
             digit += Math.pow(26, i) * (numbers[i] - 64);

         return digit;
     }

     public static String int2str(int number){
         StringBuffer sb = new StringBuffer();
         int temp = number;

         while(temp != 0){
             temp /= 26;
             if(number % 26 == 0){
                 sb.append((char)(64 + 26));
                 temp--;
             } else{
                 sb.append((char)(64 + number % 26));
             }
             number = temp;
         }

         return sb.reverse().toString();
     }

     public static String rightColumn(String number){
         return int2str(1 + str2int(number));
     }
 }
