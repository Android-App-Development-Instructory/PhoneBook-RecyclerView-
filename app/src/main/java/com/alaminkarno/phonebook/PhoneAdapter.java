package com.alaminkarno.phonebook;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder> {

    List<Phone> phones;
    Context context;

    public static String NAME = "name";
    public static String PHONE = "phoneNo";
    public static String IMAGE = "Image";

    public PhoneAdapter(List<Phone> phones, Context context) {
        this.phones = phones;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_phone_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Phone phone = phones.get(position);

        holder.nameTV.setText(phone.getName());
        holder.phoneTV.setText(phone.getPhone());
        holder.imageView.setImageResource(phone.getImage());

        holder.callIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phone.getPhone()));
                context.startActivity(intent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra(NAME,phone.getName());
                intent.putExtra(PHONE,phone.getPhone());
                intent.putExtra(IMAGE,phone.getImage());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {

        return phones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView callIV,imageView;
        TextView nameTV,phoneTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            callIV = itemView.findViewById(R.id.phoneCallIV);
            imageView = itemView.findViewById(R.id.imageView);
            nameTV = itemView.findViewById(R.id.nameTV);
            phoneTV = itemView.findViewById(R.id.phoneTV);
        }
    }
}
