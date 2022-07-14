package com.example.listatimes.Adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatimes.Model.Time;
import com.example.listatimes.R;

import java.util.List;

public class AdapterTimes  extends RecyclerView.Adapter<AdapterTimes.MyViewHolder> {

    private List<Time> timeList;

    public  AdapterTimes(List<Time> list){
        timeList = list;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
       TextView name,cidadeEstado;
       ImageView logo;

       public MyViewHolder(View view){
           super(view);
           name = view.findViewById(R.id.Name);
           cidadeEstado = view.findViewById(R.id.City);
           logo = view.findViewById(R.id.imageView);


       }

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_times,parent,false);
      return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Time obj = timeList.get(position);
        holder.name.setText(obj.getNome());
        holder.cidadeEstado.setText(obj.getCidadeEstado());
        holder.logo.setImageResource(obj.getLogo());

    }

    @Override
    public int getItemCount() {
       return timeList.size();
    }

}
