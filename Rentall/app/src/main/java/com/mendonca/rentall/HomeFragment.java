package com.mendonca.rentall;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Warren on 8/18/2015.
 */
public class HomeFragment extends Fragment {
    public HomeFragment(){
        //Blank constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_home,container,false);
    }

}
