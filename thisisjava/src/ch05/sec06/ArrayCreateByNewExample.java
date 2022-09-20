package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		byte[] bArray = new byte[3];
		for(int i=0;i<bArray.length;i++)
			System.out.print(bArray[i]);
		System.out.println("\n-------------------");
		
		short[] sArray = new short[3];
		for(int i=0;i<sArray.length;i++)
			System.out.print(sArray[i]);
		System.out.println("\n-------------------");
		
		char[] cArray = new char[3];
		for(int i=0;i<cArray.length;i++)
			System.out.print(cArray[i]);
		System.out.println("\n-------------------");
		
		int[] iArray = new int[3];
		for(int i=0;i<iArray.length;i++)
			System.out.print(iArray[i]);
		System.out.println("\n-------------------");
		
		float[] fArray = new float[3];
		for(int i=0;i<fArray.length;i++)
			System.out.print(fArray[i]);
		System.out.println("\n-------------------");
		
		//[0.0][0.0][0.0]
		double[] dArray = new double[3];
		for(int i=0;i<dArray.length;i++)
			System.out.print(dArray[i]);
		System.out.println("\n-------------------");
		
		//[false][false][false]
		boolean[] boolArray = new boolean[3];
		for(int i=0;i<boolArray.length;i++)
			System.out.print(boolArray[i]);
		System.out.println("\n-------------------");
		
		//[null][null][null]
		String[] strArray = new String[3];
		for(int i=0;i<strArray.length;i++)
			System.out.print(strArray[i]);
		System.out.println("\n-------------------");
		
		

	}
}
