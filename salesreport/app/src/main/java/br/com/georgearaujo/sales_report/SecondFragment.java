package br.com.georgearaujo.sales_report;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.math.BigDecimal;
import java.util.logging.Logger;

import br.com.georgearaujo.sales_report.controller.FeedstockController;
import br.com.georgearaujo.sales_report.exception.InvalidFieldException;
import br.com.georgearaujo.sales_report.product.Feedstock;
import br.com.georgearaujo.sales_report.util.NumberUtils;
import br.com.georgearaujo.sales_report.util.StringUtils;
import br.com.georgearaujo.sales_report.util.ValidateUtils;
import lombok.Lombok;

public class SecondFragment extends Fragment {

    private static final Logger logger = Logger.getLogger("[Feedstock]");

    private View viewFragment;

    private FeedstockController feedstockController = new FeedstockController();
    private EditText name;
    private EditText description;
    private EditText price;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewFragment = view;

        view.findViewById(R.id.feedstockPrevius).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        view.findViewById(R.id.feedstockRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerFeedstock();
            }
        });
    }

    private void recoverParameters(){
        name = viewFragment.findViewById(R.id.feedstockName);
        description = viewFragment.findViewById(R.id.feedstockDescription);
        price = viewFragment.findViewById(R.id.feedstockPrice);
    }

    public void registerFeedstock(){
        try {
            recoverParameters();
            validateFields();
            feedstockController.addFeedstock(getFeedstock());
        }catch (InvalidFieldException e){
            logger.warning(e.getMessage());
        }
    }

    private Feedstock getFeedstock(){
        return feedstockController.buildFeedstock(StringUtils.getStringToField(name),
                                                  StringUtils.getStringToField(description),
                                                  NumberUtils.getBigDecimalToField(price));
    }

    private void validateFields() throws InvalidFieldException {
        ValidateUtils.validateEmptyString(name, getString(R.string.exception_field_name));
        ValidateUtils.validateEmptyString(description, getString(R.string.exception_field_description));
        ValidateUtils.validateEmptyString(price, getString(R.string.exception_field_price));
    }
}