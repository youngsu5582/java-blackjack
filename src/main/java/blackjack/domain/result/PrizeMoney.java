package blackjack.domain.result;

public record PrizeMoney(int value) {
    public PrizeMoney(final double value) {
        this((int) value);
    }

    public int reverse() {
        return value * -1;
    }
}
