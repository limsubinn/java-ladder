package ladder;

import static ladder.NaturalNumber.createNaturalNumber;

public class LadderCreator {

    Row[] rows;
    LadderSize ladderSize;

    public LadderCreator(LadderSize ladderSize) {
        this.ladderSize = ladderSize;

        rows = new Row[ladderSize.getRowValue() + 1];
        for (int i=1; i<=ladderSize.getRowValue(); i++) {
            rows[i] = new Row(createNaturalNumber(ladderSize.getNumberOfPersonValue()));
        }
    }

//    public LadderCreator(NaturalNumber row, NaturalNumber numberOfPerson) {
//        rows = new Row[row.getNumber()+1];
//        for (int i=1; i<=row.getNumber(); i++) {
//            rows[i] = new Row(numberOfPerson);
//        }
//    }

    public void drawLine(LadderPosition ladderPosition) {
        validatePositionSize(ladderPosition.getX());
        rows[ladderPosition.getPositionX()].drawLine(ladderPosition.getY());
    }

//    public void drawLine(Position x, Position y) {
//        validatePositionSize(x);
//        rows[x.getPosition()].drawLine(y);
//    }

    public Row[] getRows() {
        return rows;
    }

    private void validatePositionSize(Position x) {
        if (!x.isSmaller(rows.length)) {
            throw new IllegalArgumentException("라인을 만들 행이 사다리 높이의 범위 안에 있어야 합니다.");
        }
    }
}
