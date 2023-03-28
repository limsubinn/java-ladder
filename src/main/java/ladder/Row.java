package ladder;

public class Row {

    Node[] nodes;

    public Row(NaturalNumber numberOfPerson) {
        nodes = new Node[numberOfPerson.getNumber()+1];
        for (int i=0; i<=numberOfPerson.getNumber(); i++) {
            nodes[i] = Node.createCenterNode();
        }
    }

    public void drawLine(Position y) {
        validatePosition(y);
        nodes[y.getPosition()] = Node.createRightNode();
        nodes[y.getNextPosition()] = Node.createLeftNode();
    }

    public void nextPosition(Position position) {
//        System.out.println("before");
//        System.out.println(position.getPosition());

        if (nodes[position.getPosition()].isLeft()) {
            position.minus();
//            System.out.println("after");
//            System.out.println(position.getPosition());
            return;
        }

        if (nodes[position.getPosition()].isRight()) {
            position.plus();
        }

//        System.out.println("after");
//        System.out.println(position.getPosition());
    }

    private void validatePositionSize(Position y) {
        if (!y.isSmaller(nodes.length-1)) {
            throw new IllegalArgumentException("라인을 만들 줄이 사다리 라인 개수의 범위 안에 있어야 합니다.");
        }
    }

    public String rowToString(Position position, int row, int now) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=1; i<nodes.length; i++) {
            stringBuilder.append(nodes[i].getNodeDirection());
            if (position.isEqual(i) && row == now) {
                stringBuilder.append("*");
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    private void validatePosition(Position y) {
        validatePositionSize(y);
        if (nodes[y.getPosition()].isLeft() ||
                nodes[y.getPosition()].isRight()) {
            throw new IllegalArgumentException("이미 사다리가 생성된 줄입니다.");
        }
    }
}