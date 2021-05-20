package step6;

public class NO_1 {

	long sum(int[] a) {
		long ans=0;  // 배열의 합을 넣을 공간
		
		for(int i=0;i<a.length;i++) {
			ans+=a[i];  //a배열의 길이만큼 누적해서 더함
		}
		return ans;  //합을 리턴
		
	}

}


