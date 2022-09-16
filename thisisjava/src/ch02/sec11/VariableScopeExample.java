package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 =15;
		if(v1>10) {
			int v2 = v1 - 10;
		}//이 블럭에서 선언된 v2는 블럭을 벗어나면 소멸
		int v3 = v1 + v2 + 5;
	}
}
