/*
문제

준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.


입력

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력

첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.


예제입력 1									예제출력 1
10 4200                                 6
1
5
10
50
100
500
1000
5000
10000
50000

*/

import java.util.*;
import java.io.*;

//첫 번째 방법

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] coin = new int[n];
		
		
		for(int i = 0; i < n; i++){
			coin[i] = sc.nextInt();
		}
		
		
		int count = 0;
		
		for(int i = n - 1; i >= 0; i--){
			
			
			if(coin[i] <= k){   //50000 <= 4200 /  10000 <= 4200     5000<=4200   1000<=4200  500<=200  100<=200
				
				count += (k/coin[i]);   //4200/1000  count = 4  200/100 = 2 count = 6
				k = k % coin[i];  //4200% 1000 k = 200 200%100 = 0
			}
		}
		System.out.println(count);
	}
}


/*
정말 내가 많이 부족하다고 느끼는것... 코드를 봤을때 한참동안 머리속으로 코드진행 순서를 머리속으로 그리다...햇갈려서....저렇게 적는다....
*/


// 두 번째 방법

public class Main{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		
		for(int i = 0; i < n; i++){
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		
		for(int i = n - 1; i >= 0; i--){
			
			
			if(coin[i] <= k){   
				
				count += (k/coin[i]);   
				k = k % coin[i]; 
			}
		}
		System.out.println(count);
	
	
	}
}