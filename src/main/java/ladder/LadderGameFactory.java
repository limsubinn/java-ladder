package ladder;

import static ladder.LadderPosition.createLadderPosition;
import static ladder.Position.createPosition;

public class LadderGameFactory {

    static LadderGame createLadderGame(LadderSize ladderSize) {
        LadderCreator ladderCreator = new LadderCreator(ladderSize);
        LadderGame ladderGame = new LadderGame(ladderCreator);

        return ladderGame;
    }

    static RandomLadderGame createRandomLadderGame(LadderSize ladderSize) {
        RandomLadderCreator randomLadderCreator = new RandomLadderCreator(ladderSize);
        RandomLadderGame randomLadderGame = new RandomLadderGame(randomLadderCreator);

        return randomLadderGame;
    }
}
