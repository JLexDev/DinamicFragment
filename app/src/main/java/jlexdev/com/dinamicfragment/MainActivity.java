package jlexdev.com.dinamicfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);

/**
        // Fragment
        OneFragment fragment1 = new OneFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frame_content, fragment1);

*/
        // Eventos onClick
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_1:

                OneFragment fragment1 = new OneFragment();

                FragmentTransaction transaction = getSupportFragmentManager()
                        .beginTransaction().add(R.id.frame_content, fragment1);

                transaction.replace(R.id.frame_content, fragment1);
                transaction.commit();
                break;

            case R.id.btn_2:

                TwoFragment fragment2 = new TwoFragment();

                FragmentTransaction transaction2 = getSupportFragmentManager()
                        .beginTransaction().add(R.id.frame_content, fragment2);

                transaction2.replace(R.id.frame_content, fragment2);
                transaction2.commit();
                break;
        }
    }


}
