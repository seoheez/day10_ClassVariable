package day10_ClassVariable;

public class Ex05_Variable {

	public static int cnt = 777; //static은 오류가 나지 않고 888이 잘 출력된다.
	
	public static void func() {  //객체를 만들기 전에 미리 만들겠다는 것.
		System.out.println("func" + cnt); 
	}
	
}
