package ladder;

import static ladder.Direction.*;

public class Row {
    int[] row;

    public Row(NaturalNumber numberOfPerson) {
        this.row = new int[numberOfPerson.getNumber()+1];
    }

    public void drawLine(Position y) {
        validatePosition(y);
        row[y.getPosition()] = RIGHT.getDirection();
        row[y.getNextPosition()] = LEFT.getDirection();
    }

    public void nextPosition(Position position) {
        if (isLeft(position)) {
            position.minus();
            return;
        }

        if (isRight(position)) {
            position.plus();
            return;
        }
    }

    public boolean isLeft(Position position) {
        return row[position.getPosition()] == LEFT.getDirection();
    }

    public boolean isRight(Position position) {
        return row[position.getPosition()] == RIGHT.getDirection();
    }

    private void validatePositionSize(Position y) {
        if (!y.isSmaller(row.length-1)) {
            throw new IllegalArgumentException("라인을 만들 줄이 사다리 라인 개수의 범위 안에 있어야 합니다.");
        }
    }

    private void validatePosition(Position y) {
        validatePositionSize(y);
        if (row[y.getPosition()] == LEFT.getDirection() ||
                row[y.getPosition() + 1] == RIGHT.getDirection()) {
            throw new IllegalArgumentException("이미 사다리가 생성된 줄입니다.");
        }
    }
}