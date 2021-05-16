package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NO_4 {

	public static void main(String[] args) throws IOException {
		/*1552번
		 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다
		 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine()); //몇번의 덧셈을 진행할 것인지 데이터를 입력받음
        //라인으로 입력받은 데이터를 int형으로 n변수에 담음
		
		StringTokenizer st;  //StringTokenizer 사용 선언
		
		for(int i=0;i<N;i++) {     // n=5 / 5번 줄에 걸쳐서 데이터를 입력받음
			st =new StringTokenizer(br.readLine()," ");   
            //입력받은 데이터를 StringTokenizer을 통해서 " " (스페이스바)로 구분하여 st에 넣음
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            //st안에 들어있는 데이터를 nextToken()을 통해서 하나씩 출력함
		}
		br.close();
		bw.flush();
		br.close();

	}
}





