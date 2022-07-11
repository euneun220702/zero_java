/*
서은경
*/

import java.util.Scanner;

public class three_park {

    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("나이를 입력해 주세요.(숫자): ");
        int age = scanner.nextInt();

        System.out.printf("입장시간을 입력해 주세요.(숫자입력): ");
        int time = scanner.nextInt();

        System.out.printf("국가유공자 여부를 입력해 주세요(y/n): ");
        String national = scanner.next();

        System.out.printf("복지카드 여부를 입력해 주세요(y/n): ");
        String card = scanner.next();

        String price = "";

        if(age < 3) { //나이가 3세 미만일 경우
            price="무료입장";
        } else if(age >= 3 && age < 13) { // 나이가 3세 이상 13세 미만일 경우
            price = "4000";
        } else if (time >= 17 ) { // 17시 이후에 입장하면 특별할인
            price= "4000";
        } else if (national.equals("y")) { // 국가유공자일 경우 일반할인
            price="8000";
        } else if (card.equals("y")) { // 복지카드가 있을 경우 일반할인
            price="8000";
        } else // 그 외 모두
            price="10000";

        System.out.println("입장료 : "+price);

    }//main

}//class
