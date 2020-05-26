package enumexample;

public enum LevelEnum {

    LEVEL_1(10, 10, 10,100),
    LEVEL_2(20, 20, 20,200),
    LEVEL_3(30, 30, 30,300),
    LEVEL_4(40, 40, 40,400),
    LEVEL_5(50, 50, 50,500);

    private int length;
    private int width;
    private int cpuDifficulty;
    private int score;

    LevelEnum(int length, int width, int cpuDifficulty, int score) {
        this.length = length;
        this.width = width;
        this.cpuDifficulty = cpuDifficulty;
        this.score = score;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCpuDifficulty() {
        return cpuDifficulty;
    }

    public int getScore() {
        return score;
    }

}
