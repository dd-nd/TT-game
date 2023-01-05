package game.ddnd.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  Скрыть верхнюю панель
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//  Подключение GameActivity к кнопке
        Button button_singule = (Button) findViewById(R.id.button_single);
        View.OnClickListener oclButton_single = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        };
        button_singule.setOnClickListener(oclButton_single);
//  Подключение HelpActivity к кнопке
        Button button_help = (Button) findViewById(R.id.button_help);
        View.OnClickListener oclButton_help = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent1);
            }
        };
        button_help.setOnClickListener(oclButton_help);
    }
}