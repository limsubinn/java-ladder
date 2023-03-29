package ladder;

import java.util.HashSet;

import static ladder.LadderPosition.createLadderPosition;

public class RandomLadderCreator implements LadderCreatorInterface {

    LadderSize ladderSize;
    LadderCreator ladderCreator;

    public RandomLadderCreator(LadderSize ladderSize) {
        this.ladderSize = ladderSize;
        ladderCreator = new LadderCreator(ladderSize);
    }

    public int numberOfLine() {
        return (int) (ladderSize.getLadderSize() * 0.3);
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * (ladderSize.getRowValue() * (ladderSize.getNumberOfPersonValue() - 1)));
    }

    @Override
    public void drawLine(LadderPosition ladderPosition) {
        HashSet<LadderPosition> lines = new HashSet<>();

        while (lines.size() < numberOfLine()) {
            int randomNumber = generateRandomNumber();
            int x = (randomNumber / (ladderSize.getNumberOfPersonValue() - 1)) + 1;
            int y = (randomNumber % (ladderSize.getNumberOfPersonValue() - 1)) + 1;

            Position positionX = Position.createPosition(x);
            Position positionY = Position.createPosition(y);

            // 라인을 그릴 수 있으면 (존재하는 라인이 없으면)
            if (ladderCreator.rows[x].noLines(positionY)) {
                LadderPosition position = createLadderPosition(positionX, positionY);
                lines.add(position);
                ladderCreator.drawLine(position);
            }
        }
    }

    @Override
    public Row[] getRow() {
        return ladderCreator.getRow();
    }
}
