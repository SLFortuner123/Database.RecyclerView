package com.slfortuner.myapplication111111111111111111.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.slfortuner.myapplication111111111111111111.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MyModel> userList;

    public MyAdapter(List<MyModel> userList) {
        this.userList = userList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_item_cell, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imgid = userList.get( position ).getImageID();
        String txt1 = userList.get( position ).getText1();
        String txt2 = userList.get( position ).getText2();

        holder.setData( imgid, txt1, txt2 );

    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView1;
        private TextView textView1;
        private TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            imageView1 = itemView.findViewById( R.id.imageview1 );
            textView1 = itemView.findViewById( R.id.text1 );
            textView2 = itemView.findViewById( R.id.text22 );

        }

        public void setData(int imgid, String txt1, String txt2) {

            imageView1.setImageResource( imgid );
            textView1.setText( txt1 );
            textView2.setText( txt2 );
        }
    }
}








