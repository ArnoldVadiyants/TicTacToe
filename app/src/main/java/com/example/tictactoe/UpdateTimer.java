package com.example.tictactoe;

import java.util.TimerTask;

public class UpdateTimer extends TimerTask {
  public BoardView boardView;
  
  @Override
  public void run() {
    GameService.getInstance().startGame( 0 );
    boardView.post(new Runnable(){ public void run(){ boardView.invalidate(); } });
  }
}