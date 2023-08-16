package kr.co.himedia.magicnumber.after2;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("이순신");
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.JUMP);
        robot.order(Robot.Command.STOP);

        //robot.order(Robot.Command.);
    }
}
