package com.example.android.tourindia;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CityFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class CityFragment extends Fragment {

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city, container, false);


        ArrayList<places> place = new ArrayList<>();
        place.add(new places(R.drawable.delhi, getResources().getString(R.string.name) + getResources().getString(R.string.delhi), getResources().getString(R.string.state) + getResources().getString(R.string.union), getResources().getString(R.string.like) + 198));
        place.add(new places(R.drawable.mumbai, getResources().getString(R.string.name) + getResources().getString(R.string.mumbai), getResources().getString(R.string.state) + getResources().getString(R.string.maharatra), getResources().getString(R.string.like) + 214));
        place.add(new places(R.drawable.ahmedabad, getResources().getString(R.string.name) + getResources().getString(R.string.ahmedabad), getResources().getString(R.string.state) + getResources().getString(R.string.karnataka), getResources().getString(R.string.like) + 193));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), place);
        ListView listView = view.findViewById(R.id.listData);
        listView.setAdapter(placeAdapter);
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
