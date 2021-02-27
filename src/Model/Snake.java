package Model;

import java.util.ArrayList;
import java.util.List;

public class Snake {
  String direction;
  List<Cell> snakeCoords;

  public Snake() {
    // Initialize the snake at the start of game
    this.direction = "right";
    this.snakeCoords = new ArrayList<Cell>();
    this.snakeCoords.add(new Cell(0, 0));
  }

  public String getDirection() {
    return this.direction;
  }

  public List<Cell> getSnakeCoords() {
    return this.snakeCoords;
  }

  public void addToFront() {
    int headRow = this.snakeCoords.get(0).getRow();
    int headCol = this.snakeCoords.get(0).getCol();
    switch (this.direction) {
      case "up":
        this.snakeCoords.add(0, new Cell(headRow - 1, headCol));
      case "down":
        this.snakeCoords.add(0, new Cell(headRow + 1, headCol));
      case "left":
        this.snakeCoords.add(0, new Cell(headRow, headCol - 1));
      case "right":
        this.snakeCoords.add(0, new Cell(headRow, headCol + 1));
      default:
        throw new IllegalArgumentException("bruh that is not a direction");
    }
  }

  // Turn Snake
    public void changeDirection(String dir) {
      this.direction = dir;
    }

}
