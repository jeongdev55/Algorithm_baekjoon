package step7;

import java.util.Scanner;

public class NO_8 {

	public static void main(String[] args)  {
		/*5622�� �ܾ��� ����
		 *��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� 
		 *�ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, 
		 *���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
		 *���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���,
		 * �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
		 * ������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��,
		 * �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
		 * �ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ����Ѵ�.
		 */
		Scanner in=new Scanner(System.in);
		
		int data;     
		int sum=0;  //�ð�
		String str=in.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			data=str.charAt(i)-65; //���ڸ� ���ڷ� ��ȯ
			if(data<3) sum += 3;        //ABC
			else if(data<6)  sum += 4;  //DEF
			else if(data<9)  sum += 5;  //GHI
			else if(data<12) sum += 6;  //JKL
			else if(data<15) sum += 7;  //MNO
			else if(data<19) sum += 8;  //PQRS
			else if(data<22) sum += 9;  //TUV
			else if(data<26) sum +=10;  //WXYZ

		}
		System.out.println(sum);
		

	}

}

