package thisIsJava;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class ReferenceType {
	
	public static int add(int[] scores){
			int sum = 0; 
			for(int i = 0; i<3; i++){
				sum +=scores[i];
			}
			return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String []names = null;
		names = new String[]{"����","�¿�","�ֶ�"};
		
		//�Ű������� int[]�迭�� ����� add�޼ҵ尡 ���� ���
		
		int[] scores;
		scores = new int[]{80,72,99};
		
		int sum1 = 0;
		for(int i = 0; i<scores.length; i++){
			sum1+=scores[i];
		}
		
		System.out.println("sum1 �� ��: "+sum1);
		
		//���ϵ� ������ sum2�� ���� 
		int sum2 = add(new int[]{80,72,99});
		System.out.println("sum2 �� ��: "+ sum2); 
		System.out.println();*/
		
		
		//Calendar Ŭ����
		/*Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week){
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUSEDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("���ÿ���: "+ today);*/
		
		//�ִ밪 ���ϱ� . 
		/*int max = 0; 
		int []array = {1,5,3,8,2};
		
		//Arrays.sort(array);
		//System.out.println(array[4]);
		
		for(int i = 0; i< array.length; i++){
			if(array[i]>max)max = array[i];
			System.out.println(max+" "+array[i]);
		}
		System.out.println(max);*/
		
		
		
		
		//�־��� �迭�� ��ü �׸��� �հ� ��հ��� ���϶�. 
		
/*		int [][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0; 
		double avg = 0.0; 
		double length = 0.0;
		
		for(int a = 0; a<array.length; a++){
			for(int b = 0; b<array[a].length; b++){
				//System.out.println(array[a][b]);
				sum += array[a][b];
			}
			//System.out.println("array[a].length: "+array[a].length);
			length += array[a].length; 
		} 		
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg(sum,length));
		//System.out.println("length: "+length);
		//System.out.println("avg: "+ sum/length);
*/	
	/* 
	public static double avg(int sum,double length){ //����Լ� 
		double avg = sum/length;
		return avg;
	}
	*/
		
		
		
	//Ű����κ��� �л� ���� �� �л����� ������ �Է� �޾� �ְ� ���� �� ��� ������ ���ϴ� ���α׷� 
	
/*	boolean run = true; 
	int studentNum = 0; 
	int[] scores = null; 
	Scanner input = new Scanner(System.in);
	
	while(run){
		System.out.println("____________________________________________");
		System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		System.out.println("____________________________________________");
		System.out.print("����> ");
		
		int selectNo = input.nextInt(); 
		
		if(selectNo==1){
			System.out.println("�л� �� �Է�");
			
			studentNum = input.nextInt(); 
		}
		else if(selectNo==2){
			System.out.println("���� �Է�");
			
			scores = new int[studentNum];
			
			for(int i = 0; i<scores.length; i++){
				System.out.print("scores["+i+"]��:");
				scores[i] = input.nextInt();
			}

			
		}
		else if(selectNo==3){
			System.out.println("���� ����Ʈ");
			
			for(int i = 0; i<scores.length; i++){
				System.out.println("scores["+i+"]��: "+scores[i]);
			}
		}
		else if(selectNo==4){
			System.out.println("�м�!!!");
			
			int max = scores[0];
			double sum = 0; 
			for(int i = 0; i<scores.length; i++){
				if(scores[i]>max)max = scores[i];
				sum+= scores[i];
			}
			System.out.println("�ְ�����:" +max);
			System.out.println("����: "+sum+", ����:"+scores.length);
			System.out.println("�������: "+(sum/scores.length));
			
		}
		else if(selectNo==5){
			run = false;
		}
		
	}
	System.out.println("���α׷� ����");*/
	
	
		

		
		
	
	
		
		
		
	}
	
	
}
