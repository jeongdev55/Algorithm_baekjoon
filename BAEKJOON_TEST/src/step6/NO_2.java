package step6;

public class NO_2 {

	public static void main(String[] args) {
		/* 4673번 셀프넘버
		 * 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 
		 * 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
		 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * <문제 이해>
		 * 전체에서 생성자를 제거하면
		 * 셀프넘버가 남게된다
		 */
		boolean arr[]=new boolean[10001];
		
		for(int i=1;i<10000;++i) {
			int result=d(i);
			if(result<=10000) {  	//1000미만인 경우에
				arr[result]=true;    //해당 위치에 참을 넣어줌
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

