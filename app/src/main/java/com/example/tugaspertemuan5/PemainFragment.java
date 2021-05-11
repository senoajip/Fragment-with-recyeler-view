package com.example.tugaspertemuan5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PemainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_pemain, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        PemainAdapter pemainAdapter = new PemainAdapter(PemainData.fill_with_data(),getContext());
        RecyclerView rvPemain = getView().findViewById(R.id.rv_pemain);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        rvPemain.setLayoutManager(layoutManager);
        rvPemain.setHasFixedSize(true);
        rvPemain.setAdapter(pemainAdapter);
    }

}