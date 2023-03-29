package ladder;

import java.util.HashSet;

public class RandomLadderCreator {

    NaturalNumber row;
    NaturalNumber numberOfPerson;
    LadderCreator ladderCreator;

    public RandomLadderCreator(NaturalNumber row, NaturalNumber numberOfPerson) {
        ladderCreator = new LadderCreator(row, numberOfPerson);
        this.row = row;
        this.numberOfPerson = numberOfPerson;
    }

    public void drawLine() {
        HashSet<LadderPosition> lines = new HashSet<>();

        while (lines.size() < numberOfLine()) {
            int randomNumber = generateRandomNumber();
            int x = (randomNumber / (numberOfPerson.getNumber() - 1)) + 1;
            int y = (randomNumber % (numberOfPerson.getNumber() - 1)) + 1;

            Position positionX = Position.createPosition(x);
            Position positionY = Position.createPosition(y);

            // 라인을 그릴 수 있으면 (존재하는 라인이 없으면)
            if (ladderCreator.rows[x].noLines(positionY)) {
                lines.add(LadderPosition.createLadderPosition(positionX, positionY));
                ladderCreator.drawLine(positionX, positionY);
            }
        }
    }

    public int numberOfLine() {
        return (int) (row.getNumber() * numberOfPerson.getNumber() * 0.3);
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * (row.getNumber() * (numberOfPerson.getNumber() - 1)));
    }

    public Row[] getRows() {
        return ladderCreator.getRows();
    }

}
