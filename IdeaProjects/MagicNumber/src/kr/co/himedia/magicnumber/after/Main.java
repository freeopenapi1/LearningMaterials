package kr.co.himedia.magicnumber.after;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("이순신");
        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_JUMP);
        robot.order(Robot.COMMAND_STOP);

        //robot.order(100);
    }
}
