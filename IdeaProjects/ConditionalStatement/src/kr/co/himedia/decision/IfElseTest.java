package kr.co.himedia.decision;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = -12;
        if(x>=0) {
            System.out.println("0 또는 양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        // Quze1) 정수 1개를 입력받아 짝수인지 홀수인지를 판단하는 프로그램을 작성하시오
        // 예시) 짝수입니다.
        // 예시) 홀수입니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        /*
            Quze2) 입력 받은 수가 15의 배수인지를 출력하는 프로그램을 하시오.
            예시) 15의 배수입니다.
                 15의 배수가 아닙니다.
         */
        System.out.print("정수를 또 입력하세요 : ");
        int num2 = scanner.nextInt();
        if (num2 % 15 == 0) {
            System.out.println("15의 배수입니다.");
        } else {
            System.out.println("15의 배수가 아닙니다.");
        }

        /*
            Quze3) 년도를 입력받아서 해당 년도가 윤년인지 아닌지를 판단하여
                   출력하는 코드를 작성하시오.
              예시) 윤년입니다.
                   윤년이 아닙니다.
         */

        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

        scanner.close();
    }
}
