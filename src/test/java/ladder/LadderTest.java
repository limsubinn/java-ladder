package ladder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {

    Ladder ladder;

    @BeforeEach
    void init() {
        ladder = new Ladder(3, 3);
    }

    @Test
    @DisplayName("사다리게임")
    void run() {
        ladder.drawLine(1, 1);
        ladder.drawLine(2, 2);
        ladder.drawLine(3, 2);
        assertEquals(2, ladder.run(1));
    }

    @Test
    @DisplayName("음수 사다리 높이 생성 시 에러")
    void minusLadderRow() {
        assertThrows(IllegalArgumentException.class,() -> new Ladder(-1, 3));
    }

    @Test
    @DisplayName("사다리 범위를 벗어난 라인 생성 시 에러")
    void outOfRangeLine() {
        assertThrows(IllegalArgumentException.class,() -> ladder.drawLine(2, 3));
        assertThrows(IllegalArgumentException.class,() -> ladder.drawLine(4, 2));
    }
}