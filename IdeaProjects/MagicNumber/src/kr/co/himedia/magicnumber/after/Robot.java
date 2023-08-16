package kr.co.himedia.magicnumber.after;

public class Robot {

    private String name;
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {

        if (command == COMMAND_WALK)                       // 걷기
            System.out.println(name + " walk");
        else if (command == COMMAND_STOP)                  // 멈추기
            System.out.println(name + " stop");
        else if (command == COMMAND_JUMP)                  // 점프
            System.out.println(name + " jump");
        else {
            System.out.println("error");
        }
    }
}









