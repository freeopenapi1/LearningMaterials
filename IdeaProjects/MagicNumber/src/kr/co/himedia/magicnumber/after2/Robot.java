package kr.co.himedia.magicnumber.after2;

public class Robot {

    private String name;
//    public static final int COMMAND_WALK = 0;
//    public static final int COMMAND_STOP = 1;
//    public static final int COMMAND_JUMP = 2;

    public enum Command {
        WALK,
        STOP,
        JUMP
    }

    public Robot(String name) {
        this.name = name;
    }

    public void order(Robot.Command command) {

        if (command == Command.WALK)                       // 걷기
            System.out.println(name + " walk");
        else if (command == Command.STOP)                  // 멈추기
            System.out.println(name + " stop");
        else if (command == Command.JUMP)                  // 점프
            System.out.println(name + " jump");
        else {
            System.out.println("error");
        }
    }
}









