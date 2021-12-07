package com.aug.bmianalyzer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OldStatusAdapter extends RecyclerView.Adapter<OldStatusAdapter.Holder>{
    ArrayList<UserRecord> userRecordsList;

    public OldStatusAdapter(ArrayList<UserRecord> userRecordsList) {
        this.userRecordsList = userRecordsList;
    }
    public class Holder extends RecyclerView.ViewHolder{
        TextView dob,weight,status,height;

        public Holder(final View view) {
            super(view);

            weight = view.findViewById(R.id.weight);
            dob = view.findViewById(R.id.dob);
            status = view.findViewById(R.id.status);
            height = view.findViewById(R.id.height);
        }
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.old_status_item, null, false);
        Holder holder = new Holder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String DateOfBirth = userRecordsList.get(position).getDob();
        String status = userRecordsList.get(position).getStatus();
        String weight = userRecordsList.get(position).getWeight();
        String height = userRecordsList.get(position).getHeight();

        holder.dob.setText(DateOfBirth);
        holder.height.setText(height);
        holder.status.setText(status);
        holder.weight.setText(weight);


    }

    @Override
    public int getItemCount() {
        return userRecordsList.size();
    }
}
