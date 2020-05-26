package com.example.lightsout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HardGame extends AppCompatActivity {
    GameController game;
    ImageButton[][] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_game);

        buttons = new ImageButton[8][6];
        buttons[0][0] = (ImageButton) findViewById(R.id.imageButton42);
        buttons[0][1] = (ImageButton) findViewById(R.id.imageButton43);
        buttons[0][2] = (ImageButton) findViewById(R.id.imageButton44);
        buttons[0][3] = (ImageButton) findViewById(R.id.imageButton45);
        buttons[0][4] = (ImageButton) findViewById(R.id.imageButton46);
        buttons[0][5] = (ImageButton) findViewById(R.id.imageButton47);

        buttons[1][0] = (ImageButton) findViewById(R.id.imageButton48);
        buttons[1][1] = (ImageButton) findViewById(R.id.imageButton49);
        buttons[1][2] = (ImageButton) findViewById(R.id.imageButton50);
        buttons[1][3] = (ImageButton) findViewById(R.id.imageButton51);
        buttons[1][4] = (ImageButton) findViewById(R.id.imageButton52);
        buttons[1][5] = (ImageButton) findViewById(R.id.imageButton53);

        buttons[2][0] = (ImageButton) findViewById(R.id.imageButton54);
        buttons[2][1] = (ImageButton) findViewById(R.id.imageButton55);
        buttons[2][2] = (ImageButton) findViewById(R.id.imageButton56);
        buttons[2][3] = (ImageButton) findViewById(R.id.imageButton57);
        buttons[2][4] = (ImageButton) findViewById(R.id.imageButton58);
        buttons[2][5] = (ImageButton) findViewById(R.id.imageButton59);

        buttons[3][0] = (ImageButton) findViewById(R.id.imageButton60);
        buttons[3][1] = (ImageButton) findViewById(R.id.imageButton61);
        buttons[3][2] = (ImageButton) findViewById(R.id.imageButton62);
        buttons[3][3] = (ImageButton) findViewById(R.id.imageButton63);
        buttons[3][4] = (ImageButton) findViewById(R.id.imageButton64);
        buttons[3][5] = (ImageButton) findViewById(R.id.imageButton65);

        buttons[4][0] = (ImageButton) findViewById(R.id.imageButton66);
        buttons[4][1] = (ImageButton) findViewById(R.id.imageButton67);
        buttons[4][2] = (ImageButton) findViewById(R.id.imageButton68);
        buttons[4][3] = (ImageButton) findViewById(R.id.imageButton69);
        buttons[4][4] = (ImageButton) findViewById(R.id.imageButton70);
        buttons[4][5] = (ImageButton) findViewById(R.id.imageButton71);

        buttons[5][0] = (ImageButton) findViewById(R.id.imageButton72);
        buttons[5][1] = (ImageButton) findViewById(R.id.imageButton73);
        buttons[5][2] = (ImageButton) findViewById(R.id.imageButton74);
        buttons[5][3] = (ImageButton) findViewById(R.id.imageButton75);
        buttons[5][4] = (ImageButton) findViewById(R.id.imageButton76);
        buttons[5][5] = (ImageButton) findViewById(R.id.imageButton77);

        buttons[6][0] = (ImageButton) findViewById(R.id.imageButton78);
        buttons[6][1] = (ImageButton) findViewById(R.id.imageButton79);
        buttons[6][2] = (ImageButton) findViewById(R.id.imageButton80);
        buttons[6][3] = (ImageButton) findViewById(R.id.imageButton81);
        buttons[6][4] = (ImageButton) findViewById(R.id.imageButton82);
        buttons[6][5] = (ImageButton) findViewById(R.id.imageButton83);

        buttons[7][0] = (ImageButton) findViewById(R.id.imageButton84);
        buttons[7][1] = (ImageButton) findViewById(R.id.imageButton85);
        buttons[7][2] = (ImageButton) findViewById(R.id.imageButton86);
        buttons[7][3] = (ImageButton) findViewById(R.id.imageButton87);
        buttons[7][4] = (ImageButton) findViewById(R.id.imageButton88);
        buttons[7][5] = (ImageButton) findViewById(R.id.imageButton89);

        game = new GameController(buttons);
        game.updateView();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            // We determine which button was selected and insert the current user there.
            case R.id.imageButton42:
                game.click(0, 0);
                break;
            case R.id.imageButton43:
                game.click(0, 1);
                break;
            case R.id.imageButton44:
                game.click(0, 2);
                break;
            case R.id.imageButton45:
                game.click(0, 3);
                break;
            case R.id.imageButton46:
                game.click(0, 4);
                break;
            case R.id.imageButton47:
                game.click(0, 5);
                break;
            case R.id.imageButton48:
                game.click(1, 0);
                break;
            case R.id.imageButton49:
                game.click(1, 1);
                break;
            case R.id.imageButton50:
                game.click(1, 2);
                break;
            case R.id.imageButton51:
                game.click(1, 3);
                break;
            case R.id.imageButton52:
                game.click(1, 4);
                break;
            case R.id.imageButton53:
                game.click(1, 5);
                break;
            case R.id.imageButton54:
                game.click(2, 0);
                break;
            case R.id.imageButton55:
                game.click(2, 1);
                break;
            case R.id.imageButton56:
                game.click(2, 2);
                break;
            case R.id.imageButton57:
                game.click(2, 3);
                break;
            case R.id.imageButton58:
                game.click(2, 4);
                break;
            case R.id.imageButton59:
                game.click(2, 5);
                break;
            case R.id.imageButton60:
                game.click(3, 0);
                break;
            case R.id.imageButton61:
                game.click(3, 1);
                break;
            case R.id.imageButton62:
                game.click(3, 2);
                break;
            case R.id.imageButton63:
                game.click(3, 3);
                break;
            case R.id.imageButton64:
                game.click(3, 4);
                break;
            case R.id.imageButton65:
                game.click(3, 5);
                break;
            case R.id.imageButton66:
                game.click(4, 0);
                break;
            case R.id.imageButton67:
                game.click(4, 1);
                break;
            case R.id.imageButton68:
                game.click(4, 2);
                break;
            case R.id.imageButton69:
                game.click(4, 3);
                break;
            case R.id.imageButton70:
                game.click(4, 4);
                break;
            case R.id.imageButton71:
                game.click(4, 5);
                break;
            case R.id.imageButton72:
                game.click(5, 0);
                break;
            case R.id.imageButton73:
                game.click(5, 1);
                break;
            case R.id.imageButton74:
                game.click(5, 2);
                break;
            case R.id.imageButton75:
                game.click(5, 3);
                break;
            case R.id.imageButton76:
                game.click(5, 4);
                break;
            case R.id.imageButton77:
                game.click(5, 5);
                break;
            case R.id.imageButton78:
                game.click(6, 0);
                break;
            case R.id.imageButton79:
                game.click(6, 1);
                break;
            case R.id.imageButton80:
                game.click(6, 2);
                break;
            case R.id.imageButton81:
                game.click(6, 3);
                break;
            case R.id.imageButton82:
                game.click(6, 4);
                break;
            case R.id.imageButton83:
                game.click(6, 5);
                break;
            case R.id.imageButton84:
                game.click(7, 0);
                break;
            case R.id.imageButton85:
                game.click(7, 1);
                break;
            case R.id.imageButton86:
                game.click(7, 2);
                break;
            case R.id.imageButton87:
                game.click(7, 3);
                break;
            case R.id.imageButton88:
                game.click(7, 4);
                break;
            case R.id.imageButton89:
                game.click(7, 5);
                break;
            case R.id.button7:
                game = new GameController(buttons);
                game.updateView();
                break;
        }
        game.updateView();
        if (game.hasWon()){
            Toast.makeText(getApplicationContext(),"You've won! You really are a master of this game.",Toast.LENGTH_LONG).show();
        }
    }
}