package com.gh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리하세요.
		public void method() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			double kor = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("영어 : ");
			double eng = sc.nextDouble();
			
			System.out.print("수학 : ");
			double math = sc.nextDouble();
			
			// double -> int 강제 형변환
			int total = (int)(kor + eng + math);
			int avg = total / 3;
			
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);
			
			// double 변수에 계산 값 저장한 후 출력할때 강제 형변환
//			double total = kor + eng + math;
//			double avg = total / 3;
//			
//			System.out.println("총점 : " + (int)total);
//			System.out.println("평균 : " + (int)avg);
			
			// 변수 따로 안 만들고 계산 결과에서 바로 형변환한 후 출력
//			System.out.println("총점 : " + (int)(kor + eng + math));
//			System.out.println("평균 : " + (int)((kor + eng + math) / 3));
		}
}
