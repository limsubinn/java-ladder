package ladder;

public class LadderRunner {

    Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public int run(Position position) {
        for (int i=1; i<rows.length; i++) {
            rows[i].nextPosition(position);
        }

        return position.getPosition();
    }
}
