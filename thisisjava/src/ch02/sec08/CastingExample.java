package ch02.sec08;

public class CastingExample {
   public static void main(String[] args) {
   int var1 = 10;
   byte var2 = (byte)var1;//10은 데이타 손실 없음
   System.out.println(var2);
   
   long var3 = 300;
   int var4 = (int)var3;//300은 데이타 손실 없음
   System.out.println(var4);
   
   int var5 = 65;
   char var6 = (char)var5; //char타입의 데이타형으로 표현
   System.out.println(var6);
   
   double var7 = 3.14;
   int var8 =(int)var7;//실수 -> 정수로 소수점 부분이 잘려나감.
   System.out.println(var8);
   
   
   
   
   
   
 }
}
