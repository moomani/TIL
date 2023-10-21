package foundation;
import java.io.*;
/*
 * 선택정렬 : 가장 작은것을 선택해서 제일 앞으로 보내는 정렬 방법
 * 시간복잡도: 10 * (10+1) / 2 = 55 
 *          O(N*N)  			
 */
public class SelectSort {
	public static void main(String[] args) throws IOException{ 
		
		int min;  
		int temp;
		int index = 0;
		int num[] = {5,4,1,10,7,8,6,3,2,9};
		int length = num.length;
		
		for(int i=0; i<length; i++) {	
			min = 9999;    				// 최솟값 미리 셋팅  
			for(int j=i; j<length; j++) {
				if(min > num[j]) {	
					min = num[j];
					index = j;		//해당 위치값을 넣어줌 	
				}
			}
			temp = num[i];			//한바퀴 돌았을 때 가장 작은 값이 선택 됐다면 이제 그 값을 맨 앞으로 넣어줘야함 
			num[i] = num[index];
			num[index] = temp;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int n : num) {
			bw.write(Integer.toString(n));
		}
		bw.flush();
		bw.close();
	}
	 
}
