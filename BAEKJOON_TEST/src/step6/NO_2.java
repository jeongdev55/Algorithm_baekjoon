package step6;

public class NO_2 {

	public static void main(String[] args) {

		boolean arr[]=new boolean[10001];
		
		for(int i=1;i<10000;++i) {
			int result=d(i);
			if(result<=10000) {  //1000�̸��� ��쿡
				arr[result]=true;    //�ش� ��ġ�� ���� �־���
			}
			
		}
		
		for(int i=1;i<arr.length;++i) {
			if(!arr[i]) {
				System.out.println(i);
		}
	}
}

	 public static int d(int a) {
		int result=a;
		while(a>0){
			result+=a%10;  
			a/=10;              
		}		
		return result;  
	}

}