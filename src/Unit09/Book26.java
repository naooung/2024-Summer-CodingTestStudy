package Unit09;

public class Book26 {

	public static void main(String[] args) {
		
		int n = 8;
		int a = 4;
		int b = 7;
		
		System.out.println(solution(n, a, b));
	}
	
	public static int solution(int n, int a, int b) {
		
		int answer = 0;
		
		while (a != b) {
			
			a = (a + 1) / 2;
			b = (b + 1) / 2;
			
			answer++;
		}
		
		return answer;
	}
}
