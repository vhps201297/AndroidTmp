package com.example.testmasktranformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testmasktranformation.Utils.MaskEditText;
import com.example.testmasktranformation.Utils.MaskTransformationMethod;

public class MainActivity extends AppCompatActivity {

    MaskEditText MaskValidarTarjea;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaskValidarTarjea = findViewById(R.id.edtxt_maskedittext);

        MaskValidarTarjea.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                final int DRAWABLE_LEFT = 0;
                final int DRAWABLE_TOP = 1;
                final int DRAWABLE_RIGHT = 2;
                final int DRAWABLE_BOTTOM = 3;


                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= (MaskValidarTarjea.getRight() - MaskValidarTarjea.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here

                        if (MaskValidarTarjea.isVisible) {

                            // Se esconde y se coloca la máscara personalizada
                            System.out.println("VISIBLE...");
                            Drawable img = VectorDrawableCompat.create(getResources(), R.drawable.ic_no_visibility, null);
                            img.setBounds(0, 0, 35, 35);
                            MaskValidarTarjea.setCompoundDrawablesWithIntrinsicBounds(null, null, img, null);
                            MaskValidarTarjea.setTransformationMethod(new MaskTransformationMethod());
                            MaskValidarTarjea.isVisible = false;

                            //System.out.println("SubsequenceMain: "+ MaskValidarTarjea.getRowText().subSequence(0,3));
                        } else {
                            // Se muestra y se quita la máscara
                            //Drawable img = RegistroActivity.this.getResources().getDrawable(R.drawable.ic_eye_visibility);
                            Drawable img = VectorDrawableCompat.create(getResources(), R.drawable.ic_eye, null);
                            img.setBounds(0, 0, 35, 35);
                            MaskValidarTarjea.setCompoundDrawablesWithIntrinsicBounds(null, null, img, null);

                            MaskValidarTarjea.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            MaskValidarTarjea.isVisible = true;

                        }

                    }
                }

                return false;

            }
        });

    }


    public void onClickPruebaMask(View view) {
        System.out.println("...Texto Mask: " + MaskValidarTarjea.getRowText());
    }
}
