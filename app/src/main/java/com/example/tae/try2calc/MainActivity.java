import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tae.try2calc.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnAdd,btnSubst,btnDivide,btnMultiply;
    private TextView tvresult;

    private EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnSubstst = (Button)findViewById(R.id.btnSubststtract);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnMultiply= (Button)findViewById(R.id.btnMultiply);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond =(EditText)findViewById(R.id.etSecondNumber);
        tvresult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSubstst.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubststtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvresult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try{
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvresult.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiplytiply:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvresult.setText(String.valueOf(multiply));
                break;
        }
    }
}