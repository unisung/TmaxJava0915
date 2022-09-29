package ch12.sec05;

import java.io.FileInputStream;
import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) throws Exception{
		String data ="자바";
		
		byte[] arr1 = data.getBytes();
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		 arr1 = data.getBytes("UTF-8");
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		String newStr = new String(arr1);
		System.out.println(newStr);
		
		 arr1 = data.getBytes("EUC-KR");
		 System.out.println(arr1.length);
		 System.out.println(Arrays.toString(arr1));
		 newStr = new String(arr1);
		 System.out.println(newStr);  

	}
}