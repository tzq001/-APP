package com.example.xzrw;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //1、定义对象
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list_view);
        final List<Food> foodlist=new ArrayList<>();
        Food food1=new Food(R.drawable.food1,R.drawable.shop1,"烤肉","55$","2023.9.21","特莱克烧烤","骑手待取餐");
        foodlist.add(food1);
        Food food2 =new Food(R.drawable.food2,R.drawable.shop2,"炸串","25$","2023.9.20","快点炸炸串铺","待评价");
        foodlist.add(food2);
        Food food3 =new Food(R.drawable.food3,R.drawable.shop3,"鸡翅","20$","2023.9.19","台湾味道","待评价");
        foodlist.add(food3);
        Food food4 =new Food(R.drawable.food4,R.drawable.shop4,"梅菜扣肉","30$","2023.9.18","西门炒饭王","待评价");
        foodlist.add(food4);
        Food food5 =new Food(R.drawable.food5,R.drawable.shop4,"猪蹄饭","35$","2023.9.17","西门炒饭王","待评价");
        foodlist.add(food5);
        Food food6 =new Food(R.drawable.food6,R.drawable.shop4,"麻婆豆腐","15$","2023.9.16","西门炒饭王","待评价");
        foodlist.add(food6);
        Food food7 =new Food(R.drawable.food7,R.drawable.shop2,"烤冷面","13$","2023.9.15","快点炸炸串铺","待评价");
        foodlist.add(food7);
        Food food8 =new Food(R.drawable.food8,R.drawable.shop5,"草莓蛋糕","26$","2023.9.14","悦子甜品","待评价");
        foodlist.add(food8);
        for (int i=0;i<2;i++){
        }
        //第四步：设计每一个列表项的子布局
        //第五步：定义适配器 控件 -桥梁-数据
        FoodAdapter adapter=new FoodAdapter(MainActivity.this,R.layout.food_item,foodlist);
        listView.setAdapter(adapter);
        //第六步：listview 的点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Food food=foodlist.get(position);
                Toast.makeText(MainActivity.this, "你选择的订单是："+food.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
