package ladder;

import static ladder.Direction.LEFT;
import static ladder.Direction.RIGHT;

public class Row {
    int[] row;

    public Row(int numberOfPerson) {
        validateNumberOfPerson(numberOfPerson);
        this.row = new int[numberOfPerson+1];
    }

    public void drawLine(int y) {
        validatePositionY(y);
        row[y] = RIGHT.getDirection();
        row[y+1] = LEFT.getDirection();
    }

    public int getSelection(int selection) {
        switch (row[selection]) {
            case 1: selection++; break;
            case -1: selection--; break;
            case 0: return selection;
        }

        return selection;
    }

    private void validateNumberOfPerson(int numberOfPerson) {
        if (numberOfPerson < 1) {
            throw new IllegalArgumentException("참가자 수가 1보다 작은 수입니다.");
        }
    }

    private void validatePositionY(int y) {
        if ((y <= 0) || (y >= row.length - 1)) {
            throw new IllegalArgumentException("라인을 만들 줄이 사다리 라인 개수의 범위 안에 있어야 합니다.");
        }
    }
}