package ladder;

import org.junit.jupiter.api.Test;

import static ladder.NaturalNumber.createNaturalNumber;
import static ladder.Position.createPosition;

public class RandomLadderTest {
    @Test
    void randomLadderTest() {
        NaturalNumber row = createNaturalNumber(5);
        NaturalNumber numberOfPerson = createNaturalNumber(5);
        RandomLadderGame randomLadderGame = new RandomLadderGame(row, numberOfPerson);

        randomLadderGame.drawLine();
        randomLadderGame.run(createPosition(2));
    }
}
