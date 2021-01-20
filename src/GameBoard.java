import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoard {
  private int height;
  private int width;
  private int score;
  private Snake snake;
  private Food food;
  private boolean isGameOver;

  public GameBoard(int height, int width) {
    this.height = height;
    this.width = width;
    this.score = 0;
    this.snake = new Snake();
    this.food = new Food(1, 10, 10);
    this.isGameOver = false;
//    this.updateFood();
  }


//
//  private void updateFood() {
//    if (this.food.getNumFood() != this.food.getFoodCoords().size()) {
//
//    }
//    int randRow = (int) Math.round(Math.random() * height);
//    int randCol = (int) Math.round(Math.random() * width);
//
//    if (this.board.get(randRow).get(randCol).getIsSnake()) {
//      this.updateFood();
//    }
//    else {
//      this.board.get(randRow).get(randCol).becomesFood();
//      this.updateScore();
//    }
//  }

  public void updateScore() {
    this.score += 1;
  }

  //advance snake or update food first??
  public void advanceSnake() {
    this.snake.addToFront();
    this.isGameOver();
    boolean foodUpdated = false;
    Cell head = this.snake.getSnakeCoords().get(0);
    for (int i = 0; i < this.food.getFoodCoords().size(); i++) {
      if (head.getRow() == this.food.getFoodCoords().get(i).getRow()
          && head.getCol() == this.food.getFoodCoords().get(i).getCol()) {
        this.food.updateFood();
        this.updateScore();
        foodUpdated = true;
      }
    }

    if (!foodUpdated) {
      // Remove the tail
      this.snake.getSnakeCoords().remove(this.snake.getSnakeCoords().size() - 1);
    }

  }


  // checks if indices of snake are greater than 0 or less than height and width or if the same cell
  // is in the snake twice
  public void isGameOver() {
    Cell head = this.snake.getSnakeCoords().get(0);
    // Checks to see if the snake is still on the board
    if (head.getRow() < 0 || head.getRow() >= height || head.getCol() < 0 || head.getCol() >= width) {
      this.isGameOver = true;
    }

    // Check if snake is hitting itself
    for (int i = 1; i < this.snake.getSnakeCoords().size(); i++) {
      if (head.getRow() == this.snake.getSnakeCoords().get(i).getRow()
          && head.getCol() == this.snake.getSnakeCoords().get(i).getCol()) {
        this.isGameOver = true;
      }
    }
  }

  public void updateGame() {

  }




  // Order of updates:
  // 1) Cell becomes snake
  // 2) Cell gets updated to not food
  // If Cell isSnake and isFood is true, do the following:
  // 3) Update Score
  // 4) Snake gets extended
  // 5) New Food is placed
}
