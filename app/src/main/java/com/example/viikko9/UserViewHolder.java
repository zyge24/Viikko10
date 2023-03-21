package com.example.viikko9;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView firstName, lastName, email, subject;

    public UserViewHolder(View itemView){
        super(itemView);
        firstName = itemView.findViewById(R.id.txtFirstName);
        lastName = itemView.findViewById(R.id.txtLastName);
        email = itemView.findViewById(R.id.txtEmail);
        subject = itemView.findViewById(R.id.rgSubject);

    }
}
