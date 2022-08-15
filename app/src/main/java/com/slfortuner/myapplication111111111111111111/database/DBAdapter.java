package com.slfortuner.myapplication111111111111111111.database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.slfortuner.myapplication111111111111111111.R;

import java.security.PrivateKey;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DBAdapter extends RecyclerView.Adapter<DBAdapter.ViewHolder> {

    private Context context;
    private ArrayList name_id, email_id, age_id;

    public DBAdapter(Context context, ArrayList name_id, ArrayList email_id, ArrayList age_id) {
        this.context = context;
        this.name_id = name_id;
        this.email_id = email_id;
        this.age_id = age_id;
    }

    @NonNull
    @Override
    public DBAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.list_item_cell2, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull DBAdapter.ViewHolder holder, int position) {
        holder.nameid.setText( String.valueOf( name_id.get( position ) ) );
        holder.emailid.setText( String.valueOf( email_id.get( position ) ) );
        holder.ageid.setText( String.valueOf( age_id.get( position ) ) );

    }

    @Override
    public int getItemCount() {
        return name_id.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameid, emailid, ageid;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            nameid = itemView.findViewById( R.id.text1 );
            emailid = itemView.findViewById( R.id.text22 );
            ageid  = itemView.findViewById( R.id.text3 );
        }
    }
}
