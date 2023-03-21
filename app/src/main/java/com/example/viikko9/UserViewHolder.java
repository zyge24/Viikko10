package com.example.viikko9;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView name, email, subject;

    public UserViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.tvUserName);
        email = itemView.findViewById(R.id.tvEmail);
        subject = itemView.findViewById(R.id.tvSubject);

    }
}
