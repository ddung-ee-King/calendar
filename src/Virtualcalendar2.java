import java.util.Scanner;
public class Virtualcalendar2 {
	static final int[] array= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static final int[] leap_array= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//윤년
	static final String PROMPT = "cal> ";
	
	public int Maxmonth(int a) {
		return array[a-1];
	}
	
	public int leap_Maxmonth(int a) {
		return leap_array[a-1];
	}
	
	public void Virtual(int y, int a) {
		System.out.printf("	<<%4d %3d>>\n", y, a);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" ----------------------");
		int Allday = Maxmonth(a);
		int leap_Allday = leap_Maxmonth(a);
		if(y%4==0 && y%100!=0 || y%400==0) {
			for(int j = 1; j<=leap_Allday; j++) {
				System.out.printf("%3d", j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else {
			for(int i = 1; i <= Allday; i++) {
				System.out.printf("%3d", i);
				if(i%7==0) {
					System.out.println();
				}
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
		int a, y;
		while(true) {
			System.out.println();
			System.out.println("년도와 월을 입력하세요");
			System.out.print(PROMPT);
			y = sc.nextInt();//연도
			a = sc.nextInt();//월
			if(a<1) {
				System.out.println("월이 없습니다.");
				break;
			}
			else if(a>12) {
				continue;
			}
			v.Virtual(y, a);
			
	}
	}
}
