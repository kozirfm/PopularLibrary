package ru.geekbrains.kozirfm.popularlibrary.recycler.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private OnItemClickListener itemClickListener;

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public interface OnItemClickListener {
        void onItemClick();
    }

    public void setOnItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView imageView = itemView.findViewById(R.id.item);
            imageView.setOnClickListener((v) -> {
                if (itemClickListener != null) {
                    itemClickListener.onItemClick();
                }
            });
        }
    }
}
