package cntt61.t61131036.th_29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NhapLieu(View v){
        // Tạo mới 1 Intent
        Intent nhap = new Intent(this, ActivityLogin.class);
        //Chuyển sang màn hình nhập liệu
        startActivity(nhap);
    }


}