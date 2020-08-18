package com.example.mapviewproximity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class LocationFragment extends Fragment {

    Location location;
    TextView textView;
    public LocationFragment() {
        // Required empty public constructor
    }

    public static LocationFragment newInstance(Location location) {
        LocationFragment fragment = new LocationFragment();
        fragment.location=location;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView= view.findViewById(R.id.tv1);
        textView.setText(location.getName());
    }
}
