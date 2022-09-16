package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자연산
		int result1 = 10 + 2 +8;
		System.out.println(result1);
	 
		//결합연산concatenation
		String result2 = 10 + 2 + "8";//연산의 방향 => 10+2=>12, 12+"8" => "12"+"8" => "128"
		System.out.println(result2);
		String result3 = 10 + "2" + 8;//10+"2" => "10"+"2" => "102"+8 =>"102"+"8" => "1028"
		System.out.println(result3);
		String result4 = "10" + 2 + 8;//"10" +2 => "10"+"2" ="102" +8 => "102" + "8" ="1028"
		System.out.println(result4); 
		String result5 = "10" + (2 + 8);//=>, 우선순위(), "10"+(2+8)=>"10"+10 => "10"+"10"=>"1010"
		System.out.println(result5);
		
		 

	}
}
