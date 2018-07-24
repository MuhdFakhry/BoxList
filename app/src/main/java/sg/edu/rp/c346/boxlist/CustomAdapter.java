package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 15007803 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<BoxItem> BoxList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        BoxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);

        BoxItem currentItem = BoxList.get(position);

        if (currentItem.getBox().equals("Blue")) {
            ivBox.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getBox().equals("Orange")) {
            ivBox.setImageResource(R.drawable.orange_box);
        } else {
            ivBox.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }
}
