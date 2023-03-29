package ladder;

public class LadderGame {

    LadderSize ladderSize;
    LadderCreator ladderCreator;

    public LadderGame(LadderSize ladderSize) {
        ladderCreator = new LadderCreator(ladderSize);
    }

//    public LadderGame(NaturalNumber row, NaturalNumber numberOfPerson) {
//        ladderCreator = new LadderCreator(row, numberOfPerson);
//    }

    public void drawLine(LadderPosition ladderPosition) {
        ladderCreator.drawLine(ladderPosition);
    }

//    public void drawLine(Position x, Position y) {
//        ladderCreator.drawLine(x, y);
//    }

    public int run(Position position) {
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
        return ladderRunner.run(position);
    }
}