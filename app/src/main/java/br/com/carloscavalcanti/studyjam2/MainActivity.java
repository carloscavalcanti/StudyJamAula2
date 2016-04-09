package br.com.carloscavalcanti.studyjam2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMenos, btnMais, btnComprar;
    TextView txtQuantidade, txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMais = (Button) findViewById(R.id.btMais);
        btnMais.setOnClickListener(this);

        btnMenos = (Button) findViewById(R.id.btMenos);
        btnMenos.setOnClickListener(this);

        btnComprar = (Button) findViewById(R.id.btComprar);
        btnComprar.setOnClickListener(this);

        txtQuantidade = (TextView) findViewById(R.id.txtQuantidade);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
    }

    @Override
    public void onClick(View v) {
        int quantidade = Integer.valueOf(txtQuantidade.getText().toString());
        if (btnMais.getId() == v.getId()) {
            quantidade++;
            txtQuantidade.setText(String.valueOf(quantidade));
        } else if (btnMenos.getId() == v.getId()) {
            quantidade--;
            txtQuantidade.setText(String.valueOf(quantidade));
        } else if (btnComprar.getId() == v.getId()) {
            txtTotal.setText("R$ " + quantidade * 15);
        }
    }
}
