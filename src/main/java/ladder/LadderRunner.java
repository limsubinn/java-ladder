package ladder;

public class LadderRunner {

    Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public int run(Position position) {
        for (int i=1; i<rows.length; i++) {

            System.out.println("Before");
            printRows(position, i);

            rows[i].nextPosition(position);

            System.out.println("After");
            printRows(position, i);

        }

        return position.getPosition();
    }

    private void printRows(Position position, int row) {
        for (int i=1; i<rows.length; i++) {
            System.out.println(rows[i].rowToString(position, row, i));
        }
    }
}
