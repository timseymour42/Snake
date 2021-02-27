package Model;

import java.util.Objects;

// Position on the game board
public class Cell {

  private int row;
  private int col;

  public Cell(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public int getRow() {
    return this.row;
  }

  public int getCol() {
    return this.col;
  }

  @Override
  public boolean equals(Object c) {
    Cell tempC = (Cell) c;
    return tempC.getRow() == this.row && tempC.getCol() == this.col;


  }

  @Override
  public int hashCode() {
    return Objects.hash(this.row, this.col);
  }

}
