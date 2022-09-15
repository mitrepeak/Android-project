package com.example.myapplication;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAddAdapter extends FragmentPagerAdapter {
    public ViewPagerAddAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
         public Fragment getItem(int position) {
        if (position == 0) {
            return new ChatFragment();
        } else if (position == 1) {
            return new statusFragment();
        } else {
            return new callFragment();
        }
    }
         @Override
                public int getCount(){
        return 3;
        }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "add";
        }else if(position==1){
            return "update";
        }else{
            return "delete";
        }
    }
}