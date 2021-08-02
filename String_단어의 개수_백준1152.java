/*
문제

영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

입력

첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 
이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.


예제 입력 1
The Curious Case of Benjamin Button

예제 출력 1
6

*/

//  첫 번째 방법

import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		sc.close();
		
		// StringTokenizer - 문자열을 내가 지정한 구분자로 문자열을 쪼개주는 클래스. 그렇게 쪼개진 문자열을 '토큰(token)'이라고 부름
		
		
		// st 에 공백을 기준으로 나눈 토큰들을 저장한다.
		StringTokenizer st = new StringTokenizer(word," ");
		
		// countTokens()는 토큰의 개수를 반환한다.    countTokens()는 StringTokenizer 클래스의 안에서 제공하는 기본 메서드다.

		System.out.println(st.countTokens());
		
		}
	}	


// 두 번째 방법

public class Main {

	public static void main(String[] args) throws IOException {
		
		/* 참조 : https://jhnyang.tistory.com/92
		   BufferedReader의 readLine()을 사용하면 데이터를 라인 단위로 읽을 수 있다.
		   InputStreamReader는 Reader의 하위 클래스로 BufferedReader의 생성자의 인자로 전달 할 수 있다.
		   InputStreamReader의 생성자에 필요한 인자는 표준 입력을 통해 획득하고 BufferedReader의 생성자에서 필요한 인자는 InputStreamReader를 사용하면 된다.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.print(st.countTokens());
	
		}	
	}	