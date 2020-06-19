package me.creatorguy.androidfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BottomFragment extends Fragment {

    private static TextView tvFragmentBottomTop, tvFragmentBottomBottom;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        tvFragmentBottomTop = view.findViewById(R.id.tvFragmentBottomTop);
        tvFragmentBottomBottom = view.findViewById(R.id.tvFragmentBottomBottom);

        return view;
    }

    public void setDataText(String top, String bottom) {
        tvFragmentBottomTop.setText(top);
        tvFragmentBottomBottom.setText(bottom);
    }
}