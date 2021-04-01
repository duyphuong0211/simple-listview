package com.example.listviewvip;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class traicayadapter extends BaseAdapter {

    private Context context; // mainactivy
    private  int layout;
    private List<TraiCay> traiCayList;

    public traicayadapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override// trả về số dòng của list view
    public int getCount() {
        //return 0;
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //holder giúp giảm thiểu tài nguyên, chạy nhanh hơn.

    private class ViewHolder
    {
            ImageView imgHinh;
            TextView txtTen, txtMoTa;

    }


    @Override // mỗi dòng trả về view khi gọi adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null) // laafn dau mo len chua co gi
        {
            // Lấy phần context nào có thể nhấn layout vào
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // convert view chứa layout mỗi dòng
            convertView = inflater.inflate(layout,null);

            holder = new ViewHolder();

            // anh xa

            holder.txtTen = (TextView) convertView.findViewById(R.id.textviewten);
            holder.txtMoTa = (TextView) convertView.findViewById(R.id.textviewmota);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imagehinh);
            convertView.setTag(holder); // truyen vao trang thai anh xa -- giữ trạng thái ánh xa
            // sau khi dufng holder, cofn klhoong dung holder anh xa nhu bth
        }
        else  // hi kéo view, nó xuất hiện lại thì chỉ lấy phần ánh xạ, không ánh xạ lại.
        {
                holder = (ViewHolder) convertView.getTag();
        }



        // gan gia tr

        TraiCay traiCay =  traiCayList.get(position);

        holder.txtTen.setText(traiCay.getTen());
        holder.txtMoTa.setText((traiCay.getMota()));
        holder.imgHinh.setImageResource(traiCay.getHinh());


        //return null;
        return convertView;
    }
}
