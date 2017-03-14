package com.despedo.remindme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.despedo.remindme.R;

/**
 * Created by Despedo on 13.03.2017.
 */

public class ExampleFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;
    private View view;

    public static ExampleFragment getInstance(){
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}