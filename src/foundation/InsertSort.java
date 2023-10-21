package foundation;
/*
 * 삽입정렬 : 각 숫자를 적절한 위치에 삽입 (필요할 때만 위치를 바꿈)
 * 시간복잡도 : O(N * N)
 * 선택/버블/삽입 중에는 삽입정렬이 제일 빠름 (데이터가 이미 거의 정렬된 상태라면 ex) 2 3 4 5 6 7 8 9 10 1)
 */
public class InsertSort {
	public static void main(String[] args) {
	
		int temp = 0;
		int j = 0;
		int num[] = {5,4,1,10,7,8,6,3,2,9};
		int length = num.length;
		
		for(int i=0; i<length-1; i++) {
			j=i;
			while(j>=0 && num[j] > num[j+1]) {
				temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
				j--;
			}
		}
		for(int n : num) {
			System.out.print(n);
		}
	}

}
