package Apr10;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// �ִ� �ּҰ�
		
		int[] num = {79,88,91,33,100,55,95};
		
		int min = 100;
		int max = 100;
		
		for(int i=0; i<num.length; i++) {
			min = Math.min(min, num[i]);   // �ּҰ��� ���ϴ� Math�Լ� 
			max = Math.max(max, num[i]);   // �ִ밪�� ���ϴ� Math�Լ�
		
// �ִ�,�ּҰ� ���ϱ� (1)	
//		int max = num[0];  �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ��.
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
