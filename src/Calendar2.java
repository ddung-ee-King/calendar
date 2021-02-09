import java.util.Scanner;
public class Calendar2 {
	static final int[] array= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int Maxmonth(int a) {
		return array[a-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar2 c = new Calendar2();
		System.out.println("반복 횟수를 입력해주세요");
		int i = sc.nextInt();
		for(int b = 1; b <=i; b++) {
			System.out.println("월을 입력해주세요 : ");
			int a = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", a, c.Maxmonth(a));	
		}
	}	
}
        
        
//    public static void main(String[] args) {
//    	int[] array = new int[] {28, 30, 31};
//    	Scanner sc = new Scanner(System.in);
//        int a;
//        System.out.println("달 입력해주세요 : ");
//        a = sc.nextInt();
//        if(a == 1|| a == 3 ||a == 5 ||a == 7 ||a == 8 ||a == 10 ||a == 12) {
//        	System.out.println(a+"월은" +array[2]+ "일까지 있습니다.");
//        }
//        else if(a == 4|| a == 6 ||a == 9 ||a == 11) {
//        	System.out.println(a+"월은" +array[1]+ "일까지 있습니다.");
//        }
//        else if(a == 2) {
//        	System.out.println(a+"월은" +array[0]+ "일까지 있습니다.");
//        }
//        else if(a >12 || a<1 ){
//        	System.out.println("달이 없습니다.");
//        }
//	}
//}