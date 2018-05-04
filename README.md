# ZKSpannableString
设置圆角背景的SpannableString

先上效果图:<br>

![](https://github.com/zyldzs/ZKSpannableString/blob/master/screenshots/abc.jpg)

下面说说怎么使用,在build.grdle添加依赖
```
compile 'com.zyldzs:ZKSpannableString:1.0.1'
```

在代码中这样使用

```
TextView tvSpannablestring = (TextView) findViewById(R.id.tv_spannablestring);
String s="标签";
SpannableString spannableString = new SpannableString(s+"决定我们成为什么样的人，不是我们的能力，而是我们的选择。" );
spannableString.setSpan(new RoundBackgroundColorSpan(MainActivity.this, R.color.colorAccent, "标签", 18, R.color.white,5), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
tvSpannablestring.setText(spannableString);
```
主要在这段代码,下面说下每个参数的意义
```
//每个参数依次的意义是:上下文,背景色,文字,文字大小,文字颜色,圆角半径
new RoundBackgroundColorSpan(MainActivity.this, R.color.colorAccent, "标签", 18, R.color.white,5)
```

