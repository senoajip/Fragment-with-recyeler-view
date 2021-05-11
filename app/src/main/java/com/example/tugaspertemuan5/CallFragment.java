package com.example.tugaspertemuan5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

//import com.google.android.material.textfield.TextInputLayout;

public class CallFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnDial = getActivity().findViewById(R.id.btnDial);
        EditText numberPhone = getActivity().findViewById(R.id.number_phone);

        btnDial.setOnClickListener(v ->  {
            Intent call = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:" + Uri.encode(numberPhone.getText().toString())));
            startActivity(call);
        });
    }
}