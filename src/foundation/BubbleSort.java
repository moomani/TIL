package foundation;
/*
 * 버블정렬 : 옆에 있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬 방법 (가장 효율이 낮다)
 * 시간복잡도 : O(N * N) 
 * 버블정렬이 선택정렬보다 느린 이유 : 옆자리랑 비교하여 매번 교체를 하기 때문에 
 */
public class BubbleSort {	
	public static void main(String[] args) {
		
		int temp = 0;
		int num[] = {5,4,1,10,7,8,6,3,2,9};
		int length = num.length;
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<(length-1)-i; j++) {		//버블정렬은 뒤에서부터 집합의 크기를 하나씩 감소시키므로 
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int n : num) {
			System.out.print(n);
		}
	}

}
