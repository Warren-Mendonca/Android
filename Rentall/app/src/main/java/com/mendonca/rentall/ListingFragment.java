package com.mendonca.rentall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Warren on 8/18/2015.
 */
public class ListingFragment extends android.app.Fragment {
    public ListingFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_listing,container,false);
    }
}
