package cntt61.t61131036.th_29_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==5000)
            if (resultCode==RESULT_OK)
            {
                //Lấy dữ liệu gửi về
                //ở đây dữ liệu được gửi về theo cặp Key(Name) --Value
                //Bóc dữ liệu ra theo Key
                String usernameNhan = data.getStringExtra("UN");//UN là key đặt ở activity nhập liệu

                //Đưa lên điều khiển ta muốn hiện kết quả nhận được
                //Lấy tham chiếu
                TextView tvTen = (TextView)findViewById(R.id.tvUsername);
                //Gán cho thuộc tính
                tvTen.setText(usernameNhan);
            }
            else
                Toast.makeText(this, "Trả về thất bại",Toast.LENGTH_LONG);
        else
            super.onActivityResult(requestCode,resultCode,data);
    }
}