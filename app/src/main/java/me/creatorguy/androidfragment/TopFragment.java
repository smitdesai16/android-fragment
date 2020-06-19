package me.creatorguy.androidfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment implements View.OnClickListener {

    private static EditText etFragmentTopTop, etFragmentTopBottom;
    private static Button btnFragmentSubmit;

    ITopFragmentListener topFragmentListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        etFragmentTopTop = view.findViewById(R.id.etFragmentTopTop);
        etFragmentTopBottom = view.findViewById(R.id.etFragmentTopBottom);
        btnFragmentSubmit = view.findViewById(R.id.btnFragmentSubmit);

        btnFragmentSubmit.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            topFragmentListener = (ITopFragmentListener) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFragmentSubmit:
                topFragmentListener.SendData(etFragmentTopTop.getText().toString(), etFragmentTopBottom.getText().toString());
                break;
            default:

                break;
        }
    }
}