package cntt61.t61131036.th_29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void NhapLieu(View v){
        EditText edUN = (EditText) findViewById(R.id.edUsername);
        EditText edPW = (EditText) findViewById(R.id.edPassword);
        EditText edUE = (EditText) findViewById(R.id.edUserEmail);
        //lấy dữ liệu
        String username = edUN.getText().toString();
        //tạo mới intent
        Intent KQnhapLieu = new Intent();
        //đưa dữ liệu vào Intent để gửi về
        //Dữ liệu được đưa vào ở dạng Key (name) -- Value
        KQnhapLieu.putExtra("UN",username); // UN là key ta đặt để truy xuất, bóc dữ liệu ở bên nhận
        //Gửi kết quả về cho Activity đã gọi nó
        setResult(RESULT_OK, KQnhapLieu);

    }
    public void ChaoMung(View v){
        // Tạo mới 1 Intent
        Intent welcome = new Intent(this, ActivityHome.class);
        //Chuyển sang màn hình chào mừng
        startActivity(welcome);
    }

}