package com.despedo.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.despedo.remindme.R;

/**
 * Created by Despedo on 15.03.2017.
 */

public class IdeasFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context){
        Bundle args = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));

        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
