package xyz.jpenilla.minecraftchess.data.piece;

public enum PieceColor {
  WHITE("w"),
  BLACK("b");

  private final String abbreviation;

  PieceColor(final String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public static PieceColor decode(final String s) {
    for (final PieceColor value : values()) {
      if (value.abbreviation.equals(s)) {
        return value;
      }
    }
    throw new IllegalArgumentException(s);
  }
}