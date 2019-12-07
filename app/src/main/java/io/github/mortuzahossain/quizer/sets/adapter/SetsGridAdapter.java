package io.github.mortuzahossain.quizer.sets.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import io.github.mortuzahossain.quizer.R;

/**
 * Created by Mortuza Hossain on 07-Dec-2019
 * Email : mortuzahossain1997@gmail.com
 **/
public class SetsGridAdapter extends BaseAdapter {

    private int sets = 0;

    public SetsGridAdapter(int sets) {
        this.sets = sets;
    }

    @Override
    public int getCount() {
        return sets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sets_item, parent, false);
        } else {
            view = convertView;
        }
        TextView title = view.findViewById(R.id.title);
        title.setText(String.valueOf(position + 1));
        return view;
    }
}
