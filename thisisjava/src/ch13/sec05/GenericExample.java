package ch13.sec05;

public class GenericExample {
 public static void main(String[] args) {
Course.registerCourse1(new Applicant<Person>(new Person()));
Course.registerCourse1(new Applicant<Worker>(new Worker()));	
Course.registerCourse1(new Applicant<Student>(new Student()));
Course.registerCourse1(new Applicant<HigthStudent>(new HigthStudent()));
Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));	

//Course.registerCourse2(new Applicant<Person>(new Person()));
//Course.registerCourse2(new Applicant<Worker>(new Worker()));	
Course.registerCourse2(new Applicant<Student>(new Student()));
Course.registerCourse2(new Applicant<HigthStudent>(new HigthStudent()));
Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));	


Course.registerCourse3(new Applicant<Person>(new Person()));
Course.registerCourse3(new Applicant<Worker>(new Worker()));	
//Course.registerCourse3(new Applicant<Student>(new Student()));
//Course.registerCourse3(new Applicant<HigthStudent>(new HigthStudent()));
//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));	


	}
}
