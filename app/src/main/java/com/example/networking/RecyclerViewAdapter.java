package com.example.networking;
import static java.lang.Integer.parseInt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Mountain> items;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    RecyclerViewAdapter(Context context, List<Mountain> items, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String image = items.get(position).getAuxdata().getImg();
        Log.i("==!", image);
        Picasso.get().load(image).into(holder.image);
        holder.name.setText("Mountain name: " + items.get(position).getName());
        holder.location.setText("Location: " + items.get(position).getLocation());
        holder.meters.setText("Height: " + items.get(position).getHeightInMeters() + " Meters");
        holder.feet.setText( + items.get(position).getHeightinFeet() + " Feet");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image;
        TextView name;
        TextView location;
        TextView meters;
        TextView feet;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            image = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.nameView);
            location = itemView.findViewById(R.id.locationView);
            meters = itemView.findViewById(R.id.metersView);
            feet = itemView.findViewById(R.id.feetView);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(items.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener {
        void onClick(Mountain item);
    }

    public void update(List<Mountain> listOfMountains) {
        items.clear();
        items.addAll(listOfMountains);
    }
}