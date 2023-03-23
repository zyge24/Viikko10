package com.example.viikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView name, email, subject;
    ImageView picture;

    public UserViewHolder(View itemView){
        super(itemView);
        picture = itemView.findViewById(R.id.ivUserPicture);
        name = itemView.findViewById(R.id.tvUserName);
        email = itemView.findViewById(R.id.tvEmail);
        subject = itemView.findViewById(R.id.tvSubject);

    }
}
