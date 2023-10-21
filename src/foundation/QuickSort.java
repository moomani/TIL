package foundation;
/*
 * 퀵 정렬 알고리즘 : 기준값이 있음(Pivot) 
 * 오른쪽으로는 기준값보다 큰값을 찾고, 왼쪽으로는 기준값보다 작은 값을 찾아 위치 변경
 * 시간복잡도 : O(N * logN) 
 * 최악복잡도 : O(N * N) -> 이미 정렬되어있는 경우나 정렬이 거의되어있을 경우
 */
public class QuickSort {
	static int num[] = {3,7,8,1,5,9,6,10,2,4};
	
	static void quickSort(int[] data, int start, int end) {
		if(start >= end) {	//원소가 1개인 경우
			return;
		}
		
		int key = start;
		int i = start+1;	// 키값보다 큰 값을 찾음 
		int j = end;		// 키값보다 작은 값을 찾음
		int temp;
		
		while(i<=j) {	
			while(i <= end && num[i] <= num[key]) {		//키 값보다 큰 값을 만날 때까지 오른쪽으로 이동 
				i++;
			}
			while(j > start && num[j] >= num[key]) {	//키 값보다 작은 값을 만날 때까지 왼쪽으로 이동 
				j--;
			}
			if(i>j) {	//현재 엇갈린 상태면 키 값과 교체
				temp = num[j];
				num[j] = num[key];
				num[key] = temp;
			} else {	//엇갈리지 않았다면 큰값과 작은 값 교체 
				temp = num[j];
				num[j] = num[i];
				num[i] = temp;
			}
		}
		// 재귀함수 - 데이터가 엇갈려서 바깥으로 빠져나오는 경우에는 키값을 기준으로 왼쪽과 오른쪽에서 각각 다시 퀵정렬 수행 
		quickSort(num,start,j - 1);
		quickSort(num,j + 1,end);
	}
	
	public static void main(String[] args) {
		
		quickSort(num,0,num.length - 1);
		for(int n : num) {
			System.out.print(n);
			
		}
		
	}

}
