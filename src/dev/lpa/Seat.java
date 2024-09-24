package dev.lpa;

public record Seat(char rowMarker, int seatNumber, double price) {

  public Seat(char rowMarker, int seatNumber) {
    this(rowMarker, seatNumber,
      rowMarker > 'C' && (seatNumber <= 2 || seatNumber >= 9) ? 50 : 75);
  }
}
