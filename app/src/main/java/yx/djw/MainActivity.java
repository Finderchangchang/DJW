package yx.djw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

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
    int[] ints = new int[10];
    @Bind(R.id.ll1)
    LinearLayout ll1;
    @Bind(R.id.ll2)
    LinearLayout ll2;
    @Bind(R.id.ll3)
    LinearLayout ll3;
    @Bind(R.id.ll4)
    LinearLayout ll4;
    @Bind(R.id.ll5)
    LinearLayout ll5;
    @Bind(R.id.ll6)
    LinearLayout ll6;
    @Bind(R.id.ll7)
    LinearLayout ll7;
    @Bind(R.id.ll8)
    LinearLayout ll8;
    @Bind(R.id.ll9)
    LinearLayout ll9;
    int nowUser = 1;

    /**
     * @param position
     */
    private void move(int position) {
        if (checkCanMove(position)) {//能移动
            switch (position) {
                case 1:
                    if (ints[4] == 1) {
                        ints[1] = 1;
                        iv1.setVisibility(View.VISIBLE);
                        iv1.setImageResource(R.mipmap.white_line);
                    } else if (ints[4] == 2) {
                        ints[1] = 2;
                        iv1.setVisibility(View.VISIBLE);
                        iv1.setImageResource(R.mipmap.solid_line);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    /**
                     * 1.检测是左用户还是右用户
                     * 2.检测上下左右4个位置是1的
                     * */
                    switch (nowUser) {
                        case 1:
                            if (ints[4] == 1) {
                                ints[5] = 1;
                                iv4.setVisibility(View.INVISIBLE);
                                iv5.setVisibility(View.VISIBLE);
                                iv5.setImageResource(R.mipmap.white_line);
                            } else if (ints[4] == 2) {
                                ints[5] = 2;
                                iv4.setVisibility(View.INVISIBLE);
                                iv5.setVisibility(View.VISIBLE);
                                iv5.setImageResource(R.mipmap.solid_line);
                            }
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }
    }

    /**
     * 检查是否可以移动
     *
     * @param position 当前点击位置
     * @return true 可以移动
     */
    private boolean checkCanMove(int position) {
        if (ints[position] == 1 || ints[position] == 2) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 初始化坐标
     */
    private void init() {
        ints[1] = 1;//左边人
        ints[2] = 0;//空
        ints[3] = 2;//右边人
        ints[4] = 1;
        ints[5] = 0;
        ints[6] = 2;
        ints[7] = 1;
        ints[8] = 0;
        ints[9] = 2;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();//初始化数据
        iv1.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.VISIBLE);
        iv4.setVisibility(View.VISIBLE);
        iv5.setVisibility(View.INVISIBLE);
        iv6.setVisibility(View.VISIBLE);
        iv7.setVisibility(View.VISIBLE);
        iv8.setVisibility(View.INVISIBLE);
        iv9.setVisibility(View.VISIBLE);
        iv1.setImageResource(R.mipmap.white_line);
        iv4.setImageResource(R.mipmap.white_line);
        iv7.setImageResource(R.mipmap.white_line);
        iv3.setImageResource(R.mipmap.solid_line);
        iv6.setImageResource(R.mipmap.solid_line);
        iv9.setImageResource(R.mipmap.solid_line);
        ll1.setOnClickListener(view -> move(1));
        ll2.setOnClickListener(view -> move(2));
        ll3.setOnClickListener(view -> move(3));
        ll4.setOnClickListener(view -> move(4));
        ll5.setOnClickListener(view -> move(5));
        ll6.setOnClickListener(view -> move(6));
        ll7.setOnClickListener(view -> move(7));
        ll8.setOnClickListener(view -> move(8));
        ll9.setOnClickListener(view -> move(9));
    }
}
