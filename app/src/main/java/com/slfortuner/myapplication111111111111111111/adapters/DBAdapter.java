package com.slfortuner.myapplication111111111111111111.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.slfortuner.myapplication111111111111111111.R;
import com.slfortuner.myapplication111111111111111111.models.DBModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DBAdapter extends RecyclerView.Adapter<DBAdapter.ViewHolder> {

    private Context context;
    private List<DBModel> DBlist;

    public DBAdapter(Context context, List<DBModel> DBlist) {
        this.context = context;
        this.DBlist = DBlist;
    }

    @NonNull
    @Override
    public DBAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.list_item_cell2, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull DBAdapter.ViewHolder holder, int position) {
        String newname = DBlist.get( position ).getName();
        String newemail = DBlist.get( position ).getEmail();
        String newage = DBlist.get( position ).getAge();

//       holder.setData1(newname, newemail, newage);
        holder.nameid.setText( newname );
        holder.emailid.setText( newemail );
        holder.ageid.setText( newage );

    }

    @Override
    public int getItemCount() {
        return DBlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameid, emailid, ageid;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            nameid = itemView.findViewById( R.id.text1 );
            emailid = itemView.findViewById( R.id.text22 );
            ageid = itemView.findViewById( R.id.text3 );
        }


    }

    public void setData1(String newname, String newemail, String newage) {

    }
}
