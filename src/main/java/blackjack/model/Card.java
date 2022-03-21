package blackjack.model;

import static blackjack.model.Rank.ACE;

import java.util.Objects;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int hardRank() {
        return rank.getRank();
    }

    public int softRank() {
        if (rank == ACE) {
            return 11;
        }
        return rank.getRank();
    }

    public boolean isAce() {
        return rank == ACE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return rank.getRank() + "-" + suit;
    }
}