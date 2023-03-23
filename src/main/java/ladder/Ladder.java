package ladder;

public class Ladder {

    private final Row[] rows;

    public Ladder(int row, int numberOfPerson) {
        validateLadderRow(row);
        rows = new Row[row+1];
        for (int i=1; i<=row; i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(int row, int col) {
        validateDrawLineRow(row);
        rows[row].drawLine(col);
    }

    public int run(int selection) {
        for (int i=1; i<rows.length; i++) {
            selection = rows[i].getSelection(selection);
        }

        return selection;
    }

    private void validateLadderRow(int row) {
        if (row < 1) {
            throw new IllegalArgumentException("높이가 1보다 작은 수입니다.");
        }
    }

    private void validateDrawLineRow(int row) {
        if ((row <= 0) || (row >= rows.length)) {
            throw new IllegalArgumentException("라인을 만들 행이 사다리 높이의 범위 안에 있어야 합니다.");
        }
    }
}
