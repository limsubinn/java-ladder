package ladder;

import static ladder.LadderPosition.createLadderPosition;
import static ladder.LadderSize.createLadderSize;
import static ladder.Position.createPosition;

public class RandomLadderGame {

    LadderSize ladderSize;
    RandomLadderCreator randomLadderCreator;

    public RandomLadderGame(LadderSize ladderSize) {
        this.ladderSize = ladderSize;
        randomLadderCreator = new RandomLadderCreator(ladderSize);
    }

    public void drawLine() {
        randomLadderCreator.drawLine(createLadderPosition(createPosition(1), createPosition(1)));
    }

    public int run(Position position) {
        LadderRunner ladderRunner = new LadderRunner(randomLadderCreator.getRow());
        return ladderRunner.run(position);
    }
}