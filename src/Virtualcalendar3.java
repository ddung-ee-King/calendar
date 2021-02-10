import java.util.Scanner;
public class Virtualcalendar3 {
	static final int[] array= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static final int[] leap_array= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//윤년
	static final String PROMPT = "cal> ";
	
	public boolean Leapyear(int y) {
		if(y%4==0 && y%100!=0 || y%400==0) {
			return true;
		}
		return false;
	}
	
	public int Maxmonth(int y, int m) {
		if(Leapyear(y)) {
			return leap_array[m-1];
		}else {
			return array[m-1];
		}
	}
	
	public void Virtual(int y, int m) {
		System.out.printf("      <<%d %2d>>\n", y, m);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" ----------------------");
		int Allday = Maxmonth(y, m);
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
		Virtualcalendar3 v = new Virtualcalendar3();
		int y, m;
		while(true) {
			System.out.println();
			System.out.println("년도와 월을 입력하세요");
			System.out.print(PROMPT);
			y = sc.nextInt();//연도
			m = sc.nextInt();//월
			if(m<1) {
				System.out.println("월이 없습니다.");
				break;
			}
			else if(m>12) {
				continue;
			}
			v.Virtual(y, m);
			
	}
	}
}
