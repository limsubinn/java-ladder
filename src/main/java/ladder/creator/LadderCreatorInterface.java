package ladder.creator;

import ladder.LadderPosition;
import ladder.Row;

public interface LadderCreatorInterface {
    public void drawLine(LadderPosition ladderPosition);
    public Row[] getRow();
}
