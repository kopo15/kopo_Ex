package Apr10;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 최대 최소값
		
		int[] num = {79,88,91,33,100,55,95};
		
		int min = 100;
		int max = 100;
		
		for(int i=0; i<num.length; i++) {
			min = Math.min(min, num[i]);   // 최소값을 구하는 Math함수 
			max = Math.max(max, num[i]);   // 최대값을 구하는 Math함수
		
// 최대,최소값 구하기 (1)	
//		int max = num[0];  배열의 첫번째 값으로 최대값을 초기화함.
//		int min = num[0];
	
//		for(int i=1; i<num.length;i++) {
//			if(num[i]>max) {
//				max = num[i];
//				
//			}else if(num[i]<min) {
//				min = num[i];
//								
//			}
//			
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
