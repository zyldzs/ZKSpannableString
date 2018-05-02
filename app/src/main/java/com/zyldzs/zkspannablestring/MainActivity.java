package com.zyldzs.zkspannablestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        TextView tvSpannablestring = (TextView) findViewById(R.id.tv_spannablestring);
        String s="标签";
        SpannableString spannableString = new SpannableString(s+"决定我们成为什么样的人，不是我们的能力，而是我们的选择。" );
        spannableString.setSpan(new RoundBackgroundColorSpan(MainActivity.this, R.color.colorAccent, "标签", 18, R.color.white), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvSpannablestring.setText(spannableString);
    }
}
