package step5;

import java.util.Scanner;

public class NO_4 {

	public static void main(String[] args) {
		/*1546�� ������
		 * �Էµ� ������ ���� ū���� M
		 * M���� ������������  ����/M*100���� ���� �� ��� ���ϱ�
		 * ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
		 */
		Scanner in = new Scanner(System.in);
		
		int data=in.nextInt();
		double []arr=new double[data];
		
		double max=0;
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextDouble();
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]/max*100;
			sum+=arr[i];
		}
		System.out.println(sum/data);
	}
}


