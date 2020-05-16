package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorId;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokLanguageTextView = (TextView) listItemView.findViewById(R.id.word_miwok);
        TextView englishLanguageTextView = (TextView) listItemView.findViewById(R.id.word_english);
        LinearLayout textRootView = (LinearLayout) listItemView.findViewById(R.id.textRootView);

        //ContectCompact Returns a color associated with a particular resource ID
        int color = ContextCompat.getColor(getContext(), mColorId);
        textRootView.setBackgroundColor(color);
        miwokLanguageTextView.setText(currentWord.getmDefalutLanguage());
        englishLanguageTextView.setText(currentWord.getmMiwokLanguage());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageList);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
