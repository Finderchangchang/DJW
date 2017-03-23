package yx.djw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iv1)
    ImageView iv1;
    @Bind(R.id.iv2)
    ImageView iv2;
    @Bind(R.id.iv3)
    ImageView iv3;
    @Bind(R.id.iv4)
    ImageView iv4;
    @Bind(R.id.iv5)
    ImageView iv5;
    @Bind(R.id.iv6)
    ImageView iv6;
    @Bind(R.id.iv7)
    ImageView iv7;
    @Bind(R.id.iv8)
    ImageView iv8;
    @Bind(R.id.iv9)
    ImageView iv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        iv1.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.GONE);
        iv3.setVisibility(View.VISIBLE);
        iv4.setVisibility(View.VISIBLE);
        iv5.setVisibility(View.GONE);
        iv6.setVisibility(View.VISIBLE);
        iv7.setVisibility(View.VISIBLE);
        iv8.setVisibility(View.GONE);
        iv9.setVisibility(View.VISIBLE);
        iv1.setImageResource(R.mipmap.white_line);
        iv4.setImageResource(R.mipmap.white_line);
        iv7.setImageResource(R.mipmap.white_line);
        iv3.setImageResource(R.mipmap.solid_line);
        iv6.setImageResource(R.mipmap.solid_line);
        iv9.setImageResource(R.mipmap.solid_line);
    }
}
