package com.hng.pangolo.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.hng.pangolo.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {


    private static final String TAG = ItemsAdapter.class.getSimpleName() ;
    private final int testNo;
    private List<Object> items;
    Context c;
    private OnCardClickListener mListener;

    public interface OnCardClickListener{
        void onCardClicked(Object o);
    }

    public ItemsAdapter(List<Object> items, OnCardClickListener mListener,int testNo){
        this.items = items;
        this.mListener = mListener;
        this.testNo = testNo;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_object, parent, false);
        return new ItemsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return testNo;
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        @BindView(R.id.objCard)
        CardView objCard;

        ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);

        }

        void bind(int position){
            //Log.e("TAG","Click click2"+position);
        }

        @Override
        public void onClick(View v) {
            mListener.onCardClicked(items.get(getAdapterPosition()));
            Log.e("TAG","Click click"+ getAdapterPosition());
        }
    }

}
