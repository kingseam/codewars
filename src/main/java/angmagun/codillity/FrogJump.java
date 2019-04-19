package angmagun.codillity;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        return ((Y-X) / D) * D >= Y-X ? ((Y-X) / D) : ((Y-X) / D)+1;
    }
}
