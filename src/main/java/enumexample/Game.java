package enumexample;


public class Game {

    public void play(LevelEnum levelEnum) {
        generateBoard(levelEnum.getLength(), levelEnum.getWidth());
        generateCpu(levelEnum.getCpuDifficulty());
        setMaxScore(levelEnum.getScore());
        start();
    }

    private void generateBoard(int length, int width) {
        System.out.println("Generating board " + length + " " + width);
    }

    private void generateCpu(int cpuDifficulty) {
        System.out.println("Generate cpu player with " + cpuDifficulty);
    }

    private void setMaxScore(int score) {
        System.out.println("Setting score: " + score);
    }

    private void start() {
        System.out.println("Starting game!");
    }

}
