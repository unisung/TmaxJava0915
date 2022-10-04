package ch12.verify.exam05;

import java.util.HashSet;

public class Student {
  private String studentNum;

public Student(String studentNum) {
	this.studentNum = studentNum;
}

public String getStudentNum() {
	return studentNum;
}
  
//hashCode재정의
@Override
public int hashCode() {
	System.out.println(studentNum.hashCode());
	return studentNum.hashCode();
}

@Override
public boolean equals(Object obj) {
	return this.studentNum.equals(((Student)obj).studentNum);
}

public static void main(String[] args) {
	HashSet<Student> hashSet = new HashSet<>();
	
	hashSet.add(new Student("1"));
	hashSet.add(new Student("1"));
	hashSet.add(new Student("3"));
	
	System.out.println("저장된 Student의 수: "+hashSet.size());
   
}

}


