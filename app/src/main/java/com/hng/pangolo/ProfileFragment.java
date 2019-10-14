package com.hng.pangolo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hng.pangolo.adapters.ItemsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProfileFragment extends Fragment implements ItemsAdapter.OnCardClickListener{

    @BindView(R.id.studio)
    RecyclerView studio;

    @BindView(R.id.playlists)
    RecyclerView playlist;

    @BindView(R.id.broadcasts)
    RecyclerView broadcast;

    ItemsAdapter mAdapter;

    public ProfileFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this,v);
        // Inflate the layout for this fragment
        mAdapter = new ItemsAdapter(null,this,10);

        studio.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        studio.setAdapter(mAdapter);

        playlist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        playlist.setAdapter(mAdapter);

        broadcast.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        broadcast.setAdapter(mAdapter);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCardClicked(Object o) {

    }
}
