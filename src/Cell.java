public class Cell {

  private boolean isSnake;
  private boolean isFood;

  public Cell(boolean isSnake, boolean isFood) {
    this.isSnake = isSnake;
    this.isFood = isFood;
  }

  // for building default board
  public Cell() {
    this.isSnake = false;
    this.isFood = false;
  }


  public void becomesSnake() {
    this.isSnake = !this.isSnake;

  }

  public void becomesFood() {
    this.isFood = !this.isFood;
  }

  public boolean getIsSnake() {
    return this.isSnake;
  }

}
