package sec02.exam08;

public class CompareOpeartorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		
		
		//0.1 == 0.1의 경우 실수의 저장방식인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문.
	}

}
