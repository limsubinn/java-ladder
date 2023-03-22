package ladder;

public class Ladder {

    private final int[][] rows;

    public Ladder(int row, int numberOfPerson) {
        validateLadder(row, numberOfPerson);
        rows = new int[row+1][numberOfPerson+1];
    }

    public void drawLine(int row, int col) {
        validatePosition(row, col);
        rows[row][col] = 1;
        rows[row][col+1] = -1;
    }
    
    public int run(int selection) {
        for (int i=1; i<rows.length; i++) {
            if (rows[i][selection] == 1) {
                selection += 1;
            } else if (rows[i][selection] == -1) {
                selection -= 1;
            }

            if (selection < 1) {
                selection = rows[i].length;
            } else if (selection > rows[i].length) {
                selection = 1;
            }
        }

        return selection;
    }

    private void validateLadder(int row, int numberOfPerson) {
        if (row < 1) {
            throw new IllegalArgumentException("높이가 1보다 작은 수입니다.");
        }
        if (numberOfPerson < 1) {
            throw new IllegalArgumentException("참가자 수가 1보다 작은 수입니다.");
        }
    }

    private void validatePosition(int row, int col) {
        if ((row <= 0) || (row > rows.length)) {
            throw new IllegalArgumentException("라인을 만들 행이 사다리 높이의 범위 안에 있어야 합니다.");
        }
        if ((col <= 0) || (col >= rows[0].length)) {
            throw new IllegalArgumentException("라인을 만들 줄이 사다리 라인 개수의 범위 안에 있어야 합니다.");
        }
    }
}
