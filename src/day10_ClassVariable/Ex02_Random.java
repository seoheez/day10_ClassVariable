package day10_ClassVariable;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
//			System.out.println(Math.random());
			int ran = (int)(Math.random() *3) + 10;
			System.out.println(ran); //10~12까지
		}
	}

}
