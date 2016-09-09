package com.imageslider.www.imageslider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Faizi on 28-11-2015.
 */

public class RevolveFragment extends Fragment{

    private String text;
    private TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);
        tv = (TextView) v.findViewById(R.id.tvFragFirst);
        System.out.println("Called");
        tv.setText(getArguments().getString("msg"));
        return v;
    }



    public RevolveFragment newInstance(String text) {
        this.text=text;
//        RevolveFragment f = new RevolveFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);
        this.setArguments(b);
        return this;
    }

}
