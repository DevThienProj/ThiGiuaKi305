package com.example.thigiuaki305;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlayListSongAdapter extends RecyclerView.Adapter<PlayListSongAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ListMusic> listMusics;

    public PlayListSongAdapter(Context context,ArrayList<ListMusic> listMusics)
    {
        this.context = context;
        this.listMusics = listMusics;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View PlayListView = inflater.inflate(R.layout.item_row,parent,false);
        ViewHolder viewHolder= new ViewHolder(PlayListView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTenBaiBat.setText(listMusics.get(position).getSong());
        holder.tvTenCaSi.setText(listMusics.get(position).getVoider());
        holder.imgHinh.setImageResource(listMusics.get(position).getImgSong());
    }

    @Override
    public int getItemCount() {
        return listMusics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTenBaiBat;
        private TextView tvTenCaSi;
        private ImageView imgHinh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenBaiBat = itemView.findViewById(R.id.tvTenBaiHat);
            tvTenCaSi = itemView.findViewById(R.id.tvCaSi);
            imgHinh = itemView.findViewById(R.id.imgPlaySong);
        }
    }
}
