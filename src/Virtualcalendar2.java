import java.util.Scanner;
public class Virtualcalendar2 {
	static final int[] array= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static final String PROMPT = "cal> ";
	
	public int Maxmonth(int a) {
		return array[a-1];
	}
	
	public void Virtual(int y, int a) {
		System.out.printf("	<<%4d %3d>>\n", y, a);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" ----------------------");
		int Allday = Maxmonth(a);
		for(int i = 1; i <= Allday; i++) {
			System.out.printf("%3d", i);
			if(i%7==0) {
				System.out.println();
			}
		}	
//		System.out.println("1  2  3  4  5  6  7"); 
//		System.out.println("8  9  10 11 12 13 14"); 
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//		System.out.println("29 30 31");
	}
	
	public void hap() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Virtualcalendar2 v = new Virtualcalendar2();
		int a = 1;
		while(true) {
			System.out.println();
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);
			a = sc.nextInt();
			if(a<1) {
				System.out.println("월이 없습니다.");
				break;
			}
			else if(a>12) {
				continue;
			}
			v.Virtual(2021, a);
			
	}
	}
}
