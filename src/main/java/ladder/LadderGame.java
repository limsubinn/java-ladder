package ladder;

public class LadderGame {

    LadderCreator ladderCreator;

    public LadderGame(LadderSize ladderSize) {
        ladderCreator = new LadderCreator(ladderSize);
    }

    public void drawLine(LadderPosition ladderPosition) {
        ladderCreator.drawLine(ladderPosition);
    }

    public int run(Position position) {
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRow());
        return ladderRunner.run(position);
    }
}