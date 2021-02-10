import java.util.Scanner;
public class Virtualcalendar {
	static final int[] array= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int Maxmonth(int a) {
		return array[a-1];
	}
	
	public void Virtual() {
		System.out.println("일 월  화  수  목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7"); 
		System.out.println("8  9  10 11 12 13 14"); 
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
	}
	public void Virtual2() {
		System.out.println("일 월  화  수  목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7"); 
		System.out.println("8  9  10 11 12 13 14"); 
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");
	}
	public void Virtual3() {
		System.out.println("일 월  화  수  목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7"); 
		System.out.println("8  9  10 11 12 13 14"); 
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		Virtualcalendar v = new Virtualcalendar();
		int i = 1, a;
		while(true) {
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);
			i = sc.nextInt();
			if(i<0) {
				System.out.println("월이 없습니다.");
				break;
			}
			else if(i>12) {
				continue;
			}
			switch(i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					v.Virtual();
					break;
				case 4: case 6: case 9: case 11:
					v.Virtual2();
					break;
				case 2:
					v.Virtual3();
					break;
			}
			
	}
	}
}
