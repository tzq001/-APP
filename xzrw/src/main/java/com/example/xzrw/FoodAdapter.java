package com.example.xzrw;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class FoodAdapter extends ArrayAdapter<Food>{
    public FoodAdapter(@NonNull Context context, int resource, @NonNull
            List<Food> objects){
        super(context,resource,objects);
    }
    //每个子项被滚动到屏幕内的时候会被调用
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
            ViewGroup parent){
        Food food=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(R.layout.food_item,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.foodimage=view.findViewById(R.id.food_image);
            viewHolder.foodname =view.findViewById(R.id.food_name);
            viewHolder.foodprice=view.findViewById(R.id.food_price);
            viewHolder.foodtime=view.findViewById(R.id.food_time);
            viewHolder.image=view.findViewById(R.id.shop_image);
            viewHolder.shopname=view.findViewById(R.id.shop_name);
            viewHolder.status=view.findViewById(R.id.status);
            view.setTag(viewHolder);//将 viewHolder 存储在 view 中
        }else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.foodimage.setImageResource(food.getImageID());
        viewHolder.image.setImageResource(food.getImage());
        viewHolder.foodname.setText(food.getName());
        viewHolder.foodprice.setText(food.getPrice());
        viewHolder.foodtime.setText(food.getTime());
        viewHolder.shopname.setText(food.getShopname());
        viewHolder.status.setText(food.getStatus());
        return view;

    }

    private class ViewHolder {
        ImageView foodimage;
        ImageView image;
        TextView foodname;
        TextView foodprice;
        TextView foodtime;
        TextView shopname;
        TextView status;
    }
}
