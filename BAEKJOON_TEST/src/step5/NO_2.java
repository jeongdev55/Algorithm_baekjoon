package step5;

import java.io.*;
import java.util.Arrays;


public class NO_2 {

	public static void main(String[] args) throws IOException {
		/*2562�� �ִ밪
		 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61�� �־�����, 
		 * �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		int arr[]=new int[9];
		int max=0;  //max�� ���� ����
		int number = 0; //max�� ��ġ�� ������ ����
		int count=0;
		

		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		for(int x:arr) {
			count++;
			if(x>max) {
				max=x;
				number=count;
			}
		}
		
		br.close();
		System.out.println(max);
		System.out.println(number);

	}

}
