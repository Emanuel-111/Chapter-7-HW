package com.hfab.greetings_eml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Translate Fragment translates the greeting to the language
 * the user asked for and displays the gretting in that
 * language.
 */
public class TranslateFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_translate, container, false);
        String message = TranslateFragmentArgs.fromBundle(requireArguments()).getMessage();

        TextView spGreeting = view.findViewById(R.id.greeting_message);

        // If the user selected a specific language, they will get that greeting in that language

        if (message.equals("English"))
        {
            spGreeting.setText("Hello");
        }

        else if (message.equals("Spanish"))
        {
            spGreeting.setText("Hola");
        }

        else
        {
            spGreeting.setText("Bonjour");
        }

        return view;
    }
}