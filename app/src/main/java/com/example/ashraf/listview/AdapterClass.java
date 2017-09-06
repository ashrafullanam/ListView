package com.example.ashraf.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ASHRAF on 9/6/2017.
 */

public class AdapterClass extends ArrayAdapter<ViewClass> {

    private Context context;
    private ArrayList<ViewClass>viewClasses;

    public AdapterClass(@NonNull Context context, ArrayList<ViewClass>viewClasses) {
        super(context, R.layout.list_row,viewClasses);
        this.context=context;
        this.viewClasses=viewClasses;
    }



    private class ViewHolder{
        TextView nameText;
        TextView idText;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            Toast.makeText(context, ""+position, Toast.LENGTH_LONG).show();
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            convertView=layoutInflater.inflate(R.layout.list_row,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.nameText= (TextView) convertView.findViewById(R.id.text_name);
            viewHolder.idText= (TextView) convertView.findViewById(R.id.text_id);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.nameText.setText(viewClasses.get(position).getStu_name());
        viewHolder.idText.setText(viewClasses.get(position).getStu_id());
        return convertView;
    }



   /* @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater= LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.list_row,parent,false);
        TextView textView = (TextView) convertView.findViewById(R.id.text_name);
        TextView textId = (TextView) convertView.findViewById(R.id.text_id);
        textView.setText(viewClasses.get(position).getStu_name());
        textId.setText(viewClasses.get(position).getStu_id());

        return convertView;
    }*/
}
