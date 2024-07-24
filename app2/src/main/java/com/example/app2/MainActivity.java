package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button bnClose;
    private Button bn_safe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn_safe = (Button) findViewById(R.id.bn_safe);
        bnClose = (Button) findViewById(R.id.bnClose);


        bn_safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.setting_password,null);

                // 设置对话框的标题及布局文件
                AlertDialog.Builder adBuilder = new AlertDialog.Builder(MainActivity.this);
                adBuilder.setTitle("请输入修改后的密码：");
                adBuilder.setView(view);

                // 获取布局中的EditText控件
                final EditText pEditText = view.findViewById(R.id.password);

                // 单击确定按钮事件：对EditText输入的内容进行判断
                adBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // 获取密码输入框中的文本
                        String password = pEditText.getText().toString().trim();

                        // 进行密码验证
                        if (password.isEmpty()) {
                            // 密码为空的情况
                            Toast.makeText(MainActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                        } else if (password.length() < 6) {
                            // 密码长度小于6的情况
                            Toast.makeText(MainActivity.this, "密码长度不能小于6", Toast.LENGTH_SHORT).show();
                        } else {
                            // 符合条件的情况
                            Toast.makeText(MainActivity.this, "密码验证通过", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                adBuilder.setNegativeButton(R.string.cancel, null);

                //让提示框点击外部空白处时不主动消失
                adBuilder.setCancelable(false);

                // 3.构造Dialog对象并弹出对话框
                adBuilder.create().show();
            }
        });

        bnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1.创建构造器builder对象
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                // 2.设置提示对话框外观
                builder.setTitle("提示");
                builder.setMessage("是否退出登录");
                builder.setIcon(R.drawable.info);
                builder.setPositiveButton(R.string.OK, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "退出成功！",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton(R.string.cancel, null);

                //让提示框点击外部空白处时不主动消失
                builder.setCancelable(false);

                // 3.构造Dialog对象并弹出对话框
                builder.create().show();
            }
        });
    }

    public void User(View view) {
        //intent设置要跳转的页面：
        Intent intent =new Intent(this,JumpActivity.class);
        //跳转：
        startActivity(intent);
    }
}
