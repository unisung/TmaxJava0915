package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJSONExample {
	public static void main(String[] args) throws Exception {
      BufferedReader br 
        = new BufferedReader(new FileReader("c:/tmp/member.json",
				              Charset.forName("UTF-8")));
      String json = br.readLine();//한 줄씩 읽기
      br.close();
      
      System.out.println(json);
      
      //new JSONObject(문자열);
      JSONObject root = new JSONObject(json);
      //속성정보 읽기
      System.out.println("id: "+root.getString("id"));
      System.out.println("name: "+root.getString("name"));
      System.out.println("age: "+root.getInt("age"));
      System.out.println("stuent: "+root.getBoolean("student"));
      
      JSONObject tel = root.getJSONObject("tel");
      System.out.println("home: "+tel.getString("home"));
      System.out.println("mobile: "+tel.getString("mobile"));
      
      //배열 얻기
      JSONArray skill = root.getJSONArray("skill");
      System.out.print("skill: ");
      for(int i=0;i<skill.length();i++)
    	  System.out.print(skill.get(i)+", ");

	}
}
