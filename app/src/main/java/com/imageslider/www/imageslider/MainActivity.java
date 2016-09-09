package com.imageslider.www.imageslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {

    EditText et;
    private String [] radioSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        radioSwap=getResources().getStringArray(R.array.steps);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        et=(EditText) findViewById(R.id.radio_swap);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {
                et.setText(radioSwap[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: {return new RevolveFragment().newInstance("Page 1");}
                case 1: {return new RevolveFragment().newInstance("Page 2");}
                case 2: {return new RevolveFragment().newInstance("Page 3");}
                case 3: {return new RevolveFragment().newInstance("Page 4");}
                case 4: {return new RevolveFragment().newInstance("Page 5");}
                default: {et.setText(radioSwap[0]);return new RevolveFragment().newInstance("Page 6");}
//                case 0: return RevolveFragment.newInstance("FirstFragment, Instance 1");
//                case 1: return RevolveFragment.newInstance("SecondFragment, Instance 1");
//                case 2: return RevolveFragment.newInstance("ThirdFragment, Instance 1");
//                case 3: return RevolveFragment.newInstance("ThirdFragment, Instance 2");
//                case 4: return RevolveFragment.newInstance("ThirdFragment, Instance 3");
//                default: return RevolveFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
