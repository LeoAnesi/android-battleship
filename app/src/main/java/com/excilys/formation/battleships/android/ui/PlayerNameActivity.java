package com.excilys.formation.battleships.android.ui;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import battleships.formation.excilys.com.battleships.R;

public class PlayerNameActivity extends AppCompatActivity {
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
        preferences = getApplicationContext().getSharedPreferences("Pref", MODE_PRIVATE);

        String playerName = preferences.getString("playerName", null);

        if(playerName != null) {
            BattleShipsApplication.getGame().init(playerName);
        }
    }

    public void onClickButton(View view) {
        EditText editText = (EditText) findViewById(R.id.text_name);
        String playerName =  editText.getText().toString();
        preferences.edit().putString("playerName", playerName).apply();

        BattleShipsApplication.getGame().init(playerName);
    }
}
