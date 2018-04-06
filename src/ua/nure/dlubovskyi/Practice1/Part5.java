package ua.nure.dlubovskyi.practice1;
class Part5{

  public static int count(String s){
    int result = 0;
    for(int i = 0; i < s.length(); i++){
      result += Integer.parseInt(s.charAt(i)+"");
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(count(args[0]));
  }
}
