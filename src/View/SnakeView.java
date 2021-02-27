package View;

import Model.GameBoard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Timer;
import javax.swing.JFrame;


public class SnakeView extends JFrame implements ActionListener, ItemListener {
  private Timer timer;
  private GameBoard gameBoard;

  public SnakeView(GameBoard gameBoard) {
    this.gameBoard = gameBoard;
  }
  @Override
  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void itemStateChanged(ItemEvent e) {

  }
}
