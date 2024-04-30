import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intList1 = new ArrayList<Integer>();
        ArrayList<Integer> test = new ArrayList<>();

        int result = 0;


        while (true) {
            System.out.println("첫번째 정수를 입력하세요");
            int number1 = sc.nextInt();

            while (true) {
                System.out.println("사칙연산 기호를 입력하세요");
                String operation = sc.next();

                //operation에 입력받은 연산자를 비교
                if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {

                    System.out.println("두번째 정수를 입력하세요");
                    int number2 = sc.nextInt();

                    //입력받은 연산자를 비교하여 알맞는 if문 동작후 연산된 값을 result 에 저장
                    while (true){


                        if (operation.equals("+")) {
                            result = number1 + number2;
                        } else if (operation.equals("-")) {
                            result = number1 - number2;
                        } else if (operation.equals("*")) {
                            result = number1 * number2;
                        } else if (operation.equals("/")) {
                            result = number1 / number2;
                        }
                        break;
                    }
                    //결과값 출력후 리스트에 결과값 저장
                    System.out.println("결과 :" + result);
                    intList1.add(result);
                }
                break;
            }
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            //"remove"라는 값이 들어오면 첫번째 배열값 삭제
            if(remove.equals("remove")){
            intList1.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            //"inquiry"라는 값이 들어오면 배열에 저장된 모든 값을 출력
            if (inquiry.equals("inquiry")) {
                System.out.println(intList1.toString());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String text = sc.next();
            //"exit"라는 값이 들어오면 실행 종료
            if (text.equals("exit")) {
                break;
            }
        }
    }
}
