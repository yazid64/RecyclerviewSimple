package com.example.submisiondicoding;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

public class product_adapter extends RecyclerView.Adapter<product_adapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<product> productList;

    //getting the context and product list with constructor
    public product_adapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }



    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_cardview, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final ProductViewHolder holder, final int position) {
        //getting the product of the specified position
        final product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getNama());
        holder.textViewShortDesc.setText(product.getTanggal_lahir());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                intent.putExtra("detail",product.getBiodata());
            }
        });
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx.getApplicationContext(), detailbiodata.class);
                intent.putExtra("image",product.getImage());
                intent.putExtra("nama",product.getNama());
                intent.putExtra("desc",product.getDesc());
                intent.putExtra("wafat",product.getWafat());
                intent.putExtra("lahir",product.getTanggal_lahir());
//                intent.putExtra(R.string.Ryandhika);
                mCtx.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc;
        ImageView imageView;
        CardView cardView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            imageView = itemView.findViewById(R.id.img_item_photo);
            cardView = itemView.findViewById(R.id.card);

        }
    }
        public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        productList.clear();
        if (charText.length()==0){
            productList.addAll(productList);
        }
        else {
            for (product model : productList){
                if (model.getNama().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    productList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
