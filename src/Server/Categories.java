package Server;

public enum Categories {
    GEOGRAPHY,
    NATURE,
    POLITICS,
    SPORT,
    FOOD;

    @Override
    public String toString() {
        return super.toString().toLowerCase();

    }
    public static Categories getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}