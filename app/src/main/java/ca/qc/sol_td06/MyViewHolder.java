package ca.qc.sol_td06;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView contactName;
    View container;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        contactName = itemView.findViewById(R.id.demo_contact_name);
        container = itemView;
    }
}
