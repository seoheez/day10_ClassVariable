package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	// 인스턴스 변수로 선언
	// 입력, 출력 기능으로 나누기.
	public int age;
	public String name;
	public void display() {
		Scanner input = new Scanner(System.in);

		System.out.println("이름 입력: ");
		name = input.next();
		System.out.println("나이 입력: ");
		age = input.nextInt();
		print();


	}
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

}
