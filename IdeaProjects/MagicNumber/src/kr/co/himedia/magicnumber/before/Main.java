package kr.co.himedia.magicnumber.before;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("이순신");
        robot.order(0);
        robot.order(2);
        robot.order(1);

        robot.order(100);
    }
}
