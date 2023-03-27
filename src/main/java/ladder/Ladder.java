package ladder;

public class Ladder {

    private final Row[] rows;

    public Ladder(NaturalNumber row, NaturalNumber numberOfPerson) {
        rows = new Row[row.getNumber()+1];
        for (int i=1; i<=row.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(int x, int y) {
        validatePositionX(x);
        rows[x].drawLine(y);
    }

    public int run(int selection) {
        for (int i=1; i<rows.length; i++) {
            selection = rows[i].getSelection(selection);
        }

        return selection;
    }

    private void validatePositionX(int x) {
        if ((x <= 0) || (x >= rows.length)) {
            throw new IllegalArgumentException("라인을 만들 행이 사다리 높이의 범위 안에 있어야 합니다.");
        }
    }
}