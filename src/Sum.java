import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {
	public static void main(String[] args) throws Exception {	
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        String s = br.readLine();
	        StringTokenizer st = new StringTokenizer(s);
	        int a = Integer.parseInt(st.nextToken()); //첫번째 호출
	        int b = Integer.parseInt(st.nextToken()); //두번째 호출
	        String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
	        System.out.println(a + b +"\n");
	        br.close();
	}
}

//public class Sum {
//	public static void main(String[] args){	
//	        Scanner sc = new Scanner(System.in);
//	        int a, b, sum;
//	        System.out.println("두 수 입력: ");
//	        a = sc.nextInt();
//	        b = sc.nextInt();
//	        sum = a + b;
//	        System.out.println("두 수의 합 :"+sum);
//	}
//}