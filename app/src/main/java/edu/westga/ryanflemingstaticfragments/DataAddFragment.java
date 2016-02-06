package edu.westga.ryanflemingstaticfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataAddFragment extends Fragment {

    private double number1;
    private double number2;
    private double sum;
    private TextView txtViewSum;

    public DataAddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_add, container, false);
        this.txtViewSum = (TextView) theView.findViewById(R.id.textView3);
        return theView;
    }

    /**
     * Sets the value of the first number entered
     *
     * @param number1 - the first number
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * sets the value of the second number entered
     * @param number2 - the second number
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * adds the numbers to get the sum
     */
    public void add() {
        this.sum = this.number1 + this.number2;
    }

    /**
     * Displays the sum
     */
    public void displaySum() {
        this.txtViewSum.setText(String.valueOf(this.sum));
    }
}
