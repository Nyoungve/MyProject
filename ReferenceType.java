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
		names = new String[]{"윤아","태연","솔라"};
		
		//매개변수로 int[]배열이 선언된 add메소드가 있을 경우
		
		int[] scores;
		scores = new int[]{80,72,99};
		
		int sum1 = 0;
		for(int i = 0; i<scores.length; i++){
			sum1+=scores[i];
		}
		
		System.out.println("sum1 총 합: "+sum1);
		
		//리턴된 총합을 sum2에 저장 
		int sum2 = add(new int[]{80,72,99});
		System.out.println("sum2 총 합: "+ sum2); 
		System.out.println();*/
		
		
		//Calendar 클래스
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
		
		System.out.println("오늘요일: "+ today);*/
		
		//최대값 구하기 . 
		/*int max = 0; 
		int []array = {1,5,3,8,2};
		
		//Arrays.sort(array);
		//System.out.println(array[4]);
		
		for(int i = 0; i< array.length; i++){
			if(array[i]>max)max = array[i];
			System.out.println(max+" "+array[i]);
		}
		System.out.println(max);*/
		
		
		
		
		//주어진 배열의 전체 항목의 합과 평균값을 구하라. 
		
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
	public static double avg(int sum,double length){ //평균함수 
		double avg = sum/length;
		return avg;
	}
	*/
		
		
		
	//키보드로부터 학생 수와 각 학생들의 점수를 입력 받아 최고 점수 및 평균 점수를 구하는 프로그램 
	
/*	boolean run = true; 
	int studentNum = 0; 
	int[] scores = null; 
	Scanner input = new Scanner(System.in);
	
	while(run){
		System.out.println("____________________________________________");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("____________________________________________");
		System.out.print("선택> ");
		
		int selectNo = input.nextInt(); 
		
		if(selectNo==1){
			System.out.println("학생 수 입력");
			
			studentNum = input.nextInt(); 
		}
		else if(selectNo==2){
			System.out.println("점수 입력");
			
			scores = new int[studentNum];
			
			for(int i = 0; i<scores.length; i++){
				System.out.print("scores["+i+"]번:");
				scores[i] = input.nextInt();
			}

			
		}
		else if(selectNo==3){
			System.out.println("점수 리스트");
			
			for(int i = 0; i<scores.length; i++){
				System.out.println("scores["+i+"]번: "+scores[i]);
			}
		}
		else if(selectNo==4){
			System.out.println("분석!!!");
			
			int max = scores[0];
			double sum = 0; 
			for(int i = 0; i<scores.length; i++){
				if(scores[i]>max)max = scores[i];
				sum+= scores[i];
			}
			System.out.println("최고점수:" +max);
			System.out.println("총점: "+sum+", 길이:"+scores.length);
			System.out.println("평균점수: "+(sum/scores.length));
			
		}
		else if(selectNo==5){
			run = false;
		}
		
	}
	System.out.println("프로그램 종료");*/
	
	
		

		
		
	
	
		
		
		
	}
	
	
}
