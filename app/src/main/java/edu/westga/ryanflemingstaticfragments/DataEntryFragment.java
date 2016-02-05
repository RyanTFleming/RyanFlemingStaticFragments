package edu.westga.ryanflemingstaticfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataEntryFragment extends Fragment {

    private TextView number1Text;
    private TextView number2Text;
    public static interface DataEntryListener {
        void onDataEntry(double number1, double number2);
    }
    private DataEntryListener listener;

    public DataEntryFragment() {
        // Required empty public constructor
    }

    /**
     * called when the view is created.
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return theView
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_entry, container, false);
        this.number1Text = (EditText) theView.findViewById(R.id.editText);
        this.number2Text = (EditText) theView.findViewById(R.id.editText2);

        Button multiplyButton = (Button) theView.findViewById(R.id.button);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                multiplyButtonClicked(view);
            }
        });

        return theView;
    }

    /**
     * Action performed when the button is clicked
     * @param view - the button
     */
    private void multiplyButtonClicked(View view) {
        double number1 = Double.parseDouble(this.number1Text.getText().toString());
        double number2 = Double.parseDouble((this.number2Text.getText().toString()));
        this.listener.onDataEntry(number1, number2);
    }

    /**
     * Called when fragment is activated
     * @param context - the activity that contains the fragment
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (DataEntryListener) context;
    }
}
