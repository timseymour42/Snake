import java.util.ArrayList;
import java.util.List;

public class GameBoard {
  private List<List<Cell>> board;
  private int height;
  private int width;
  private int score;

  public GameBoard(int height, int width) {
    this.board = new ArrayList<List<Cell>>();
    this.height = height;
    this.width = width;
    this.score = 0;

    // Initialize the game board, the food, and the snake
    this.initializeBoard();
    this.updateFood();
    this.initializeSnake();
  }

  private void initializeBoard() {
    for (int i = 0; i < height; i++) {
      this.board.add(new ArrayList<Cell>());
      for (int j = 0; j < width; j++) {
        this.board.get(i).add(new Cell());
      }
    }
  }

  private void initializeSnake() {
    this.board.get(0).get(0).becomesSnake();
  }

  private void updateFood() {
    int randRow = (int) Math.round(Math.random() * height);
    int randCol = (int) Math.round(Math.random() * width);

    if (this.board.get(randRow).get(randCol).getIsSnake()) {
      this.updateFood();
    }
    else {
      this.board.get(randRow).get(randCol).becomesFood();
    }
  }

  public void updateScore() {
    this.score += 1;
  }

  public void advanceSnake() {

  }

  public void isGameOver() {

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
