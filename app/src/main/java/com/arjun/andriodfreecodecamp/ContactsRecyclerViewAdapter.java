package com.arjun.andriodfreecodecamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsRecyclerViewAdapter extends RecyclerView.Adapter<ContactsRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private Context mContext;

    public ContactsRecyclerViewAdapter(Context context){
        mContext=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.mTextviewContact.setText(contacts.get(position).getName());
        holder.mTextviewEmail.setText(contacts.get(position).getEmail());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,contacts.get(position).getName() , Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(mContext).load(contacts.get(position).getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextviewContact;
        TextView mTextviewEmail;
        CardView relativeLayout;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextviewContact = itemView.findViewById(R.id.textView);
            mTextviewEmail=itemView.findViewById(R.id.textView2);
            relativeLayout=itemView.findViewById(R.id.parent);
            imageView=itemView.findViewById(R.id.imgeview);
        }
    }
}
