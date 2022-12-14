package com.hfab.greetings_eml;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;


/**
 * @author Emanuel "Manny" Luna
 *
 * WelcomeFragment shows the user some options that
 * they can pick for the language they want to be
 * greeted by.
 */
public class WelcomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        Button btnTranslate = view.findViewById(R.id.btn_translate);
        Spinner spGreetings = view.findViewById(R.id.sp_languages);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = spGreetings.getSelectedItem().toString();

                // Pass a String argument over to the Translate Fragment
                WelcomeFragmentDirections.ActionWelcomeFragmentToTranslateFragment action =
                        WelcomeFragmentDirections.actionWelcomeFragmentToTranslateFragment(message);

                Navigation.findNavController(v).navigate(action);

            }
        });


        return view;
    }
}