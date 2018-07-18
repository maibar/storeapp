package com.example.lenovo.a1010store;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private Context mContext;
    private List<Item> aItem;

    public ItemAdapter(Context mContext, List<Item> aItem){
        this.mContext = mContext;
        this.aItem = aItem;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.view_item_product,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_title.setText(aItem.get(position).getTitle());
        holder.img_item.setImageResource(aItem.get(position).getImgep());

    }

    @Override
    public int getItemCount() {
        return aItem.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title;
        ImageView img_item;


        public MyViewHolder(View itemView){
            super(itemView);

            tv_title = (TextView) itemView.findViewById(R.id.titleitem);
            img_item = (ImageView) itemView.findViewById(R.id.ivitem);

        }
    }
}
