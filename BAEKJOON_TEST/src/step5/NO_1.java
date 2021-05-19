package step5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NO_1 {

	public static void main(String[] args) throws IOException {
		/*10818번 최소,최대
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		
		
		// 비교할 데이터 입력
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(arr);  //소트 정렬 작은 >> 큰 
		System.out.println(arr[0]+" "+arr[n-1]);

	}

}
