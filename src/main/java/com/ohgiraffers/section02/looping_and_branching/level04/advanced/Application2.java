package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int b = sc.nextInt();
		int c = a - b;
		int count = 0;
		float d = c / 50000F;
		System.out.println("===================");
		for(int j = 1; j <= 8; j++) {
			if(c >= 50000) {
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("50000원권 지폐 " + count + "장");
				c %= 50000;
			} else if(c < 50000 && c >= 10000) {
				d = c / 10000F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("10000원권 지폐 " + count + "장");
				c %= 10000;
			} else if(c < 10000 && c >= 5000) {
				d = c / 5000F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("5000원권 지폐 " + count + "장");
				c %= 5000;
			} else if(c < 5000 && c >= 1000) {
				d = c / 1000F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("1000원권 지폐 " + count + "장");
				c %= 1000;
			} else if(c < 1000 && c >= 500) {
				d = c / 500F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("500원권 동전 " + count + "개");
				c %= 500;
			} else if(c < 500 && c >= 100) {
				d = c / 100F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("100원권 동전 " + count + "개");
				c %= 100;
			} else if(c < 100 && c >= 50) {
				d = c / 50F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("50원권 동전 " + count + "개");
				c %= 50;
			} else if(c < 50 && c >= 10) {
				d = c / 10F;
				count = 0;
				for(int i = 0; i < (int)d; i++){
					count++;
				}
				System.out.println("10원권 동전 " + count + "개");
				c %= 10;
			}
		}
		System.out.println("===================");
		c = a - b;
		System.out.println("거스름돈 : " + c);

	}

}
