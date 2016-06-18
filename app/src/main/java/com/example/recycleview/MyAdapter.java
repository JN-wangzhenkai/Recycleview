package com.example.recycleview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 继承adapter 时 传入泛型（具体的viewholder）
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String []mdata;

    public MyAdapter(String[] data) {
       mdata = data;
    }

    //拿到数据 放置的item
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       // View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_textview,parent,false);

        //cardview
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);

        ViewHolder viewHolder=new ViewHolder(v);

        return viewHolder;
    }

    //数据传递
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextview.setText(mdata[position]);
    }

    //获得数据集里面的 个数
    @Override
    public int getItemCount() {
        return mdata.length;
    }


    //必须要有viewholder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public  TextView mTextview;

        public ViewHolder(View t) {
            super(t);

           mTextview= (TextView) t.findViewById(R.id.card_tv);

        }
    }
}
