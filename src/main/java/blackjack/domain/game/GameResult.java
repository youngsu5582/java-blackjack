package blackjack.domain.game;

public enum GameResult {

    BLACKJACK(1.5),
    WIN(1.0),
    LOSE(-1.0),
    DRAW(0.0);

    private final double ratio;

    GameResult(final double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return this.ratio;
    }
}