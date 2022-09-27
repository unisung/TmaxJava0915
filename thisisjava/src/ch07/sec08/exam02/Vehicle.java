package ch07.sec08.exam02;

public class Vehicle {
public void run() {
	System.out.println("차량이 달립니다.");
 }
}

class Bus extends Vehicle{
	public void run() {
		System.out.println("Bus가 달립니다.");
	 }	
}
class Taxi extends Vehicle{
	public void run() {
		System.out.println("Taxi가 달립니다.");
	 }
}
