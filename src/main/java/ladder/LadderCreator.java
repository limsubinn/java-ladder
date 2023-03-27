package ladder;

public class LadderCreator {

    Row[] rows;

    public LadderCreator(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getNumber()+1];
        for (int i=1; i<=row.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position x, Position y) {
        validatePositionSize(x);
        rows[x.getPosition()].drawLine(y);
    }

    public Row[] getRows() {
        return rows;
    }

    private void validatePositionSize(Position x) {
        if (!x.isSmaller(rows.length)) {
            throw new IllegalArgumentException("라인을 만들 행이 사다리 높이의 범위 안에 있어야 합니다.");
        }
    }
}
