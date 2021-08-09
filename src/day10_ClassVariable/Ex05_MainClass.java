package day10_ClassVariable;

public class Ex05_MainClass {

	public static void main(String[] args) {

		Ex05_Variable.cnt = 888; //해당하는 객체가 만들어지지 않았음. 변수가 없음.
		System.out.println(Ex05_Variable.cnt);
//		Ex05_Variable ex = new Ex05_Variable(); //static이 없으면 이때 생성
//		ex.cnt = 888;
		
		Ex05_Variable.func();
		
	}

}
