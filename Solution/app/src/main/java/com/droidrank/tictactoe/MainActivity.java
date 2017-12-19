package com.droidrank.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;
    TicTacToe game;
    int player = 1;
    int wins = 0;
    int moves = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new TicTacToe(3);


        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);



        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(restart.getText().equals("Restart Game")){
                    //Put up the Yes/No message box
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder
                            .setTitle("Tic-Tac-Toe")
                            .setMessage("Do you want to restart the game?")
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    //Yes button clicked, do something
                                    game = new TicTacToe(3);
                                    restart.setText("Restart Game");
                                    result.setText("");
                                }
                            })
                            .setNegativeButton("No", null)						//Do nothing on no
                            .show();
                }
                else {
                    game = new TicTacToe(3);
                    restart.setText("Restart Game");
                    result.setText("");
                }
            }
        });

        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(0,0,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(0,1,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(0,2,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(1,0,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(1,1,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(1,2,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(2,0,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(2,1,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wins = game.move(2,2,player);
                player = player == 1 ? 2:1;
                if(wins!=0)
                {
                    result.setText("Player "+ wins + " Wins");
                    restart.setText("Start New Game");
                }
                else if(game.getMoves()==9)
                {
                    result.setText("It's a Tie");
                    restart.setText("Start New Game");
                }
            }
        });

    }

}
