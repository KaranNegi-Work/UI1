package com.example.ui1.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui1.R;

public class Recycler2Adapter extends RecyclerView.Adapter<Recycler2Adapter.viewHolder> {
    String[] name;
    int[] Images;
    public Recycler2Adapter(String[] name,int[] Images){
        this.name=name;
        this.Images=Images;
    }
    @NonNull
    @Override
    public Recycler2Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recycler2_temp,parent,false );
        return new Recycler2Adapter.viewHolder(view);

    }



    @Override
    public void onBindViewHolder(@NonNull Recycler2Adapter.viewHolder holder, int position) {
        holder.tv.setText(name[position]);
        holder.I.setImageResource(Images[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        de.hdodenhof.circleimageview.CircleImageView I;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.name2);
            I=itemView.findViewById(R.id.pf);

        }
    }

}
