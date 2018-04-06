package ua.nure.dlubovskyi.practice1;

class Part6{


public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] simpleArray = new int[N];
        int nextNumber = 2;
        int counter = 0;
        boolean isSimple;
        while (counter < N) {
            int i = 0;
            isSimple = true;
            while (isSimple && i < counter) {
                if (nextNumber % simpleArray[i] == 0) {
                    isSimple = false;
                }
                i++;
            }
            if (isSimple) {
                simpleArray[counter] = nextNumber;
                counter++;
                nextNumber++;
            } else {
                nextNumber++;
            }
        }

  for(int i = 0; i < simpleArray.length; i++){
    System.out.print(simpleArray[i] + " ");
  }
  System.out.println();
  }
}
