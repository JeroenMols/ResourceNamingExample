package com.jeroenmols.resourcenaming;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author Jeroen Mols on 25/03/2017.
 */

public class ArticleDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articledetail, container, false);

        TextView title = (TextView) view.findViewById(R.id.textview_articledetail_title);

        return view;
    }
}



















