package step5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NO_1 {

	public static void main(String[] args) throws IOException {
		/*10818�� �ּ�,�ִ�
		 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
		 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		
		
		// ���� ������ �Է�
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(arr);  //��Ʈ ���� ���� >> ū 
		System.out.println(arr[0]+" "+arr[n-1]);

	}

}
