package com.example.android.tourindia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<places> {


    public PlaceAdapter(@NonNull Context context, @NonNull List<places> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewData = convertView;
        if (listViewData == null) {
            listViewData = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        places pls = getItem(position);

        ImageView image = listViewData.findViewById(R.id.img);
        TextView name = listViewData.findViewById(R.id.name);
        TextView about = listViewData.findViewById(R.id.about);
        TextView state = listViewData.findViewById(R.id.state);
        TextView likes = listViewData.findViewById(R.id.likes);

        name.setText(pls.getmName());
        about.setText(pls.getmAbout());
        state.setText(pls.getmState());
        likes.setText(pls.getmLikes());

        if (pls.isHasImage()) {
            image.setImageResource(pls.getmImageId());
            if (!pls.ismFlagForSecondImage()) {
                about.setVisibility(View.GONE);
            }
        } else {
            image.setVisibility(View.GONE);
        }

        return listViewData;
    }
}
