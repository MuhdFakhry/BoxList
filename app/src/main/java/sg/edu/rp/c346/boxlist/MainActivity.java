package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxItem> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBoxList = new ArrayList<>();

        BoxItem box1 = new BoxItem("Blue");
        BoxItem box2 = new BoxItem("Orange");
        BoxItem box3 = new BoxItem("Brown");
        alBoxList.add(box1);
        alBoxList.add(box2);
        alBoxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBoxList);

        lvBox.setAdapter(caBox);
    }
}
