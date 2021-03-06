package main;

import java.util.Objects;

/**
 * Created by iiekovenko on 03.10.16.
 * Outcome is one of possible combinations the money can be bet on.
 * Different outcomes have different probabilities so the coefficient (odds)
 * also differs.
 */
public class Outcome {
    private String name;
    private int odds;

    public Outcome(String name, int odds) {
        this.name = name;
        this.odds = odds;
    }
    public int winAmount(int amount) {
        return amount * odds;
    }

    public boolean equals(Outcome other) {
        return name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }
    @Override
    public String toString() {
        return String.format("%s (%d:1)", name, odds);
    }
    public String getName() {
        return name;
    }
    public int getOdds() {
        return odds;
    }
}
