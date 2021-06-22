package step7;

import java.util.Scanner;

public class NO_8 {

	public static void main(String[] args)  {
		/*5622번 단어의 개수
		 *전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 
		 *시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 
		 *다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
		 *숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며,
		 * 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
		 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때,
		 * 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
		 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
		 */
		Scanner in=new Scanner(System.in);
		
		int data;     
		int sum=0;  //시간
		String str=in.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			data=str.charAt(i)-65; //문자를 숫자로 변환
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

