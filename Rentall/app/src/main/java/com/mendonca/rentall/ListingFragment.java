package com.mendonca.rentall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;

/**
 * Created by Warren on 8/18/2015.
 */
public class ListingFragment extends android.app.Fragment {

    private ParseQueryAdapter<ParseObject> mainAdapter;
    private ListView mListView;

    public ListingFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainAdapter=new ParseQueryAdapter<ParseObject>(getActivity().getApplicationContext(), RentList.class);
        mainAdapter.setTextKey("title");
        mainAdapter.setImageKey("photo");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_listing,container,false);

        mListView = (ListView) view.findViewById(R.id.rent_list);
        mListView.setAdapter(mainAdapter);
        return view;
    }
}
