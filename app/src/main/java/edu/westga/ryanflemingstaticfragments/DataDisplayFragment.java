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
public class DataDisplayFragment extends Fragment {

    private TextView displayProductTextView;
    private double number1;
    private double number2;
    private double product;

    public DataDisplayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_display, container, false);
        this.displayProductTextView = (TextView) theView.findViewById(R.id.textView2);
        return theView;
    }

    /**
     * Sets the number1 to the value of the first number sent to the fragment
     * @param number1 - the first number
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * sets the number2 to the second number sent to the fragment
     * @param number2 - the second number
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * calculates the product of the two numbers and sets the
     * value to this.product.
     */
    public void multiply() {
        this.product = number1 * number2;
    }

    /**
     * sets the text of the TextView to the value of the product
     */
    public void displayProduct() {
        this.displayProductTextView.setText(String.valueOf(this.product));
    }
}
