public class StringPractice{
  public static void main (String[] args){
    int num=123;
    int num2= num/10;
    int num3=num2/10;
    int num4=num-num3*100;
    int num5=num4/10;
    int num6=num4-num5*10;
    System.out.println(num*1000+(num6*100+num5*10+num3));
  }
}
