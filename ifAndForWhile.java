package thisIsJava;

import java.util.Random;
import java.util.Scanner;

public class ifAndForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� 100������ �����߿��� 3�� ��� �� ���� ���ϴ� �ڵ� �ۼ�
     /* int num ;
		int sum = 0;
		for(int a = 1; a <=100; a++){
			num = (a*3);
			if(num<100){
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println("3�ǹ�� ����: "+sum);*/

	
		
		//while���� Math.random()�޼ҵ� ���. �ΰ��� �ֻ��� ������ ������ ���� (��1,��2)�� ��Ÿ����. 
		//���� ���� 5�� �ƴϸ� ��� �ֻ����� ������ 5�̸� ������ ���ߴ� �ڵ� �ۼ�
		/*int num1,num2; 
		
		Random random = new Random();
		  
		
		while(true){
		 	num1 =(int)(Math.random()*6)+1;
		    num2 =(int)(Math.random()*6)+1;
		    int num3 = num1+num2; 
		    System.out.println(num1+", "+num2+"�� :"+num3);
		    
		    if(num3 == 5){
		    	break;
		    }
	
		}*/
		
		
		//��ø for���� �̿��ؼ� ������ 4x + 5y =60�� ��� �ظ� ���ؼ� (x,y)���·� ����غ���. 
		//�� x�� y�� 10������ �ڿ����̴�. 
		
		/*for(int x = 1; x<=10;x++){
			for(int y=1; y<=10;y++){
				int sik = (4*x) + (5*y);
				//System.out.println(sik+": "+"("+x+","+y+")");
				if(sik==60){
					System.out.println("��:"+"("+x+","+y+")"+sik);	
				}
			}
		}*/
	
		//�ﰢ�� ����ϱ�.
/*
 		* 
 		* * 
 		* * * 
 		* * * * 
 		* * * * * 
		//�̷��������
*/		
		
		/*for(int a =0; a <5; a++){
			for(int b= 0; b<5; b++){
				if(a>=b){
					System.out.print("*"+" ");
				}
			}
			System.out.println("");
		}	*/
	

		// while���� Scanner �� �̿��ؼ� Ű����� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����. 
		// �� ���α׷��� �����Ű�� ������ ���� ����� ���;� �Ѵ�.
		
		/*
			1.���� | 2.��� | 3.�ܰ� | 4.����
			����> 1
			���ݾ�> 10000
			
			1.���� | 2.��� | 3.�ܰ� | 4.����
			����> 2
			���ݾ�> 2000
			
			1.���� | 2.��� | 3.�ܰ� | 4.����
			����> 3
			���ݾ�> 8000
			
			1.���� | 2.��� | 3.�ܰ� | 4.����
			����> 4
			
			���α׷� ����...
			
		 */	
		
		/*Scanner input = new Scanner(System.in);
		
		while(true){
			
			System.out.println("1.����  |  2.���  |  3.�ܰ�  |  4.���� ");
			System.out.println("�۾��� �������ּ���");
			int choice = input.nextInt();
			
			int money1 = 10000;
			int money2 = 2000;
			
			
			switch(choice){
			
			case 1: 
				System.out.println("����> 1 \n���ݾ�> "+ money1);
				continue;
			case 2:
				System.out.println("����> 2 \n���ݾ�> "+ money2);
				continue;
				
			case 3:
				System.out.println("����> 3 \n���ݾ�> "+(money1-money2));
				continue;
				
			case 4:
				System.out.println("����> 4 \n\n���α׷� ����...");
				break;
			}
			
			if(choice==4){ // ���α׷� ����
				break;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
