package com.example.ui1.Adapters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ui1.R;
import com.example.ui1.models.NamenImage;

import java.util.List;
import java.util.zip.Inflater;

public class Recycler1Adapter extends RecyclerView.Adapter<Recycler1Adapter.viewHolder> {
    String[] name;
    int[] Images;
public Recycler1Adapter(String[] name, int[] Images){
    this.name=name;
    this.Images=Images;
}
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recycler1_temp,parent,false );
        return new Recycler1Adapter.viewHolder(view);

}

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
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
tv=itemView.findViewById(R.id.tv);
I=itemView.findViewById(R.id.profile_image);

        }
    }

}
