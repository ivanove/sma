package ma.beyondcom.sma.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import ma.beyondcom.sma.Activities.inApplication;
import ma.beyondcom.sma.R;

/**
 * Created by lenovo on 27/11/2017.
 */

public class SearchFragment extends Fragment {

    private  static  ImageView img ;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       final View v = inflater.inflate(R.layout.search, container, false);

        v.findViewById(R.id.search_agence).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                v.findViewById(R.id.items).setVisibility(View.VISIBLE);
                return false;
            }
        });

        v.findViewById(R.id.open_list_eleves).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((inApplication)getActivity().getApplication()).setUpFragment(getActivity(), new ListElevesFragment(), R.id.fragment_container);
            }
        });

        v.findViewById(R.id.open_list_profs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((inApplication)getActivity().getApplication()).setUpFragment(getActivity(), new ListProfFragments(), R.id.fragment_container);

            }
        });
        img = (ImageView)v.findViewById(R.id.infop);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Info_Pratiques");
                startActivity(intent);
            }
        });
        img = (ImageView)v.findViewById(R.id.inter);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Intervenants");
                startActivity(intent);

            }
        });
        img = (ImageView)v.findViewById(R.id.ep);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Eposters");
                startActivity(intent);
            }
        });

        img = (ImageView)v.findViewById(R.id.exp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Exposants");
                startActivity(intent);
            }
        });

        img = (ImageView)v.findViewById(R.id.mp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.MotPresident");
                startActivity(intent);
            }
        });
        img = (ImageView)v.findViewById(R.id.p);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Programme");
                startActivity(intent);
            }
        });

        img = (ImageView)v.findViewById(R.id.com);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Communications");
                startActivity(intent);
            }
        });

        img = (ImageView)v.findViewById(R.id.mb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.MembreBureau");
                startActivity(intent);
            }
        });

        img = (ImageView)v.findViewById(R.id.v);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma.Vote");
                startActivity(intent);
            }
        });
        return v;
    }

}
