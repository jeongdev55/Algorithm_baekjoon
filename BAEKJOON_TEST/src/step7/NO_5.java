package step7;

import java.util.Scanner;

public class NO_5 {

	public static void main(String[] args)  {
		/*1157�� �ܾ����
		 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
		 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		 *  ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
		 */
		Scanner in=new Scanner(System.in);
		String str=in.next(); //�Է� ���� ��  �빮�ڷ� ����
		
		int []arr=new int [26]; //�������� ������ 26
		
		for(int i=0;i<str.length();i++) {
			if(65<=str.charAt(i) && str.charAt(i)<=90) {
				arr[str.charAt(i)-65]++;
			}
			else{
				arr[str.charAt(i)-97]++;
			}
			
		}
		
		int max=-1;
		char ch='?';
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+65);  //�빮�� ����� ���� +65
				
			}else if(arr[i]==max) {
				ch='?';  //max�� ���� ���� ������ ������ ��� ?�� ���
			}
		}
		
		System.out.println(ch);
		

	}

}
