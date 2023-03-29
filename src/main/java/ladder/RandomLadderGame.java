package ladder;

public class RandomLadderGame {

    RandomLadderCreator randomLadderCreator;

    public RandomLadderGame(NaturalNumber row, NaturalNumber numberOfPerson) {
        randomLadderCreator = new RandomLadderCreator(row, numberOfPerson);
    }

    public void drawLine() {
        randomLadderCreator.drawLine();
    }

    public int run(Position position) {
        LadderRunner ladderRunner = new LadderRunner(randomLadderCreator.getRows());
        return ladderRunner.run(position);
    }
}