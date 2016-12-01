package thisIsJava;

import java.util.Random;
import java.util.Scanner;

public class ifAndForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100까지의 정수중에서 3의 배수 총 합을 구하는 코드 작성
     /* int num ;
		int sum = 0;
		for(int a = 1; a <=100; a++){
			num = (a*3);
			if(num<100){
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println("3의배수 총합: "+sum);*/

	
		
		//while문과 Math.random()메소드 사용. 두개의 주사위 던져서 나오는 눈을 (눈1,눈2)로 나타내기. 
		//눈의 합이 5가 아니면 계속 주사위를 던지고 5이면 실행을 멈추는 코드 작성
		/*int num1,num2; 
		
		Random random = new Random();
		  
		
		while(true){
		 	num1 =(int)(Math.random()*6)+1;
		    num2 =(int)(Math.random()*6)+1;
		    int num3 = num1+num2; 
		    System.out.println(num1+", "+num2+"합 :"+num3);
		    
		    if(num3 == 5){
		    	break;
		    }
	
		}*/
		
		
		//중첩 for문을 이용해서 방정식 4x + 5y =60의 모든 해를 구해서 (x,y)형태로 출력해보자. 
		//단 x와 y는 10이하의 자연수이다. 
		
		/*for(int x = 1; x<=10;x++){
			for(int y=1; y<=10;y++){
				int sik = (4*x) + (5*y);
				//System.out.println(sik+": "+"("+x+","+y+")");
				if(sik==60){
					System.out.println("답:"+"("+x+","+y+")"+sik);	
				}
			}
		}*/
	
		//삼각형 출력하기.
/*
 		* 
 		* * 
 		* * * 
 		* * * * 
 		* * * * * 
		//이런모양으로
*/		
		
		/*for(int a =0; a <5; a++){
			for(int b= 0; b<5; b++){
				if(a>=b){
					System.out.print("*"+" ");
				}
			}
			System.out.println("");
		}	*/
	

		// while문과 Scanner 를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요. 
		// 이 프로그램을 실행시키면 다음과 같은 결과가 나와야 한다.
		
		/*
			1.예금 | 2.출금 | 3.잔고 | 4.종료
			선택> 1
			예금액> 10000
			
			1.예금 | 2.출금 | 3.잔고 | 4.종료
			선택> 2
			예금액> 2000
			
			1.예금 | 2.출금 | 3.잔고 | 4.종료
			선택> 3
			예금액> 8000
			
			1.예금 | 2.출금 | 3.잔고 | 4.종료
			선택> 4
			
			프로그램 종료...
			
		 */	
		
		/*Scanner input = new Scanner(System.in);
		
		while(true){
			
			System.out.println("1.예금  |  2.출금  |  3.잔고  |  4.종료 ");
			System.out.println("작업을 선택해주세요");
			int choice = input.nextInt();
			
			int money1 = 10000;
			int money2 = 2000;
			
			
			switch(choice){
			
			case 1: 
				System.out.println("선택> 1 \n예금액> "+ money1);
				continue;
			case 2:
				System.out.println("선택> 2 \n예금액> "+ money2);
				continue;
				
			case 3:
				System.out.println("선택> 3 \n예금액> "+(money1-money2));
				continue;
				
			case 4:
				System.out.println("선택> 4 \n\n프로그램 종료...");
				break;
			}
			
			if(choice==4){ // 프로그램 종료
				break;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
