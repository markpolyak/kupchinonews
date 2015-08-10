package ru.guap.rssreader;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MeatBoy on 29.07.2015.
 */
public class NewsAdapter extends ArrayAdapter<NewsItem> {
    public NewsAdapter(Context context, ArrayList<NewsItem> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        NewsItem item = getItem(position);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_news, parent, false);
        }

        Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoCondensed-Regular.ttf");
        TextView title = (TextView) view.findViewById(R.id.item_text_view);
        title.setText(item.getTitle());
        title.setTypeface(custom_font);

        return view;
    }
}