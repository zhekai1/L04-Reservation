package sg.edu.rp.c346.id21024750.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etNumber;
    EditText etSize;
    TextView tvHintTime;
    TimePicker timePicker;
    TextView tvHintDate;
    DatePicker datePicker;
    Button btnReserve;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etSize = findViewById(R.id.etSize);
        tvHintTime = findViewById(R.id.tvHintTime);
        tvHintDate = findViewById(R.id.tvHintDate);
        timePicker = findViewById(R.id.timePicker);
        datePicker = findViewById(R.id.datePicker);
        btnReserve = findViewById(R.id.btnReserve);
        btnReset = findViewById(R.id.btnReset);
        tvDisplay = findViewById(R.id.tvDisplay);

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnReserve.setEnabled(true);
                Toast.makeText(MainActivity.this, "You have successfully reserved: " + etName + etNumber + etSize + datePicker + timePicker, Toast.LENGTH_SHORT).show();
            } else {

            }
        });
    }

}
