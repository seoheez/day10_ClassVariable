package day10_ClassVariable;

public class Ex04_Variable {
//	private int cnt = 10; //에러가 발생함. 외부의 접근 허용X
	public int cnt = 10;
	
	public void func01() {
		cnt++; System.out.println("01 cnt : " +  cnt);
	}
	
	public void func02() {
		cnt++; System.out.println("02 cnt : " +  cnt);
	}

}
