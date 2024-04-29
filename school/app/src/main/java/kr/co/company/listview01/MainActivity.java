package kr.co.company.listview01;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = { "권창영 교수님", "유동관 교수님","최용구 교수님"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

    }

}
