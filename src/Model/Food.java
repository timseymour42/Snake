package Model;

import java.util.ArrayList;
import java.util.List;

public class Food {
  List<Cell> foodCoords;
  int numFood;

  public Food(int numFood, int height, int width) {
    // Initialize food at start of game
    this.numFood = numFood;
    List<Cell> tempFood = new ArrayList<Cell>();
    for (int i = 0; i < this.numFood; i++) {
      // Randomize location
      int randRow = (int) Math.round(Math.random() * (height - 1));
      int randCol = (int) Math.round(Math.random() * (width -1));
      if (randRow == 0 && randCol == 0) {
        i--;
      }
      else {
        for (Cell c : tempFood) {
          if (c.getRow() == randRow && c.getCol() == randCol) {
            i--;
          } else {
            tempFood.add(c);
          }
        }
      }

      // Add to list

    }

    this.foodCoords = tempFood;
  }


  public List<Cell> getFoodCoords() {
    return this.foodCoords;
  }

  public int getNumFood() {
    return this.numFood;
  }
}
