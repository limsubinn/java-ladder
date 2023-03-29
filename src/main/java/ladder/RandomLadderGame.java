package ladder;

import static ladder.LadderSize.createLadderSize;

public class RandomLadderGame {

    LadderSize ladderSize;
    RandomLadderCreator randomLadderCreator;

    public RandomLadderGame(LadderSize ladderSize) {
        this.ladderSize = ladderSize;
        randomLadderCreator = new RandomLadderCreator(ladderSize);
    }

//    public RandomLadderGame(NaturalNumber row, NaturalNumber numberOfPerson) {
//        LadderSize ladderSize = createLadderSize(row, numberOfPerson);
//        randomLadderCreator = new RandomLadderCreator(ladderSize);
////        randomLadderCreator = new RandomLadderCreator(row, numberOfPerson);
//    }

    public void drawLine() {
        randomLadderCreator.drawLine();
    }

    public int run(Position position) {
        LadderRunner ladderRunner = new LadderRunner(randomLadderCreator.getRows());
        return ladderRunner.run(position);
    }
}