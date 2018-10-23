package mx.edu.ittepic.dadm_u3_practica1_arleymagnoliaaquinogarcia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Circulo c1, c2, c3, c4, c5;

    public Lienzo(Context context) {
        super(context);
        c1 = new Circulo(100, 200, this, Color.parseColor("#ec7e7e"), 100);
        c2 = new Circulo(180, 550, this, Color.parseColor("#fdd84f"),80);
        c3 = new Circulo(300, 800, this, Color.parseColor("#68ea9a"),150);
        c4 = new Circulo(220, 1000, this, Color.parseColor("#68a3ea"),20);
        c5 = new Circulo(350, 350, this, Color.parseColor("#ea68c1"),90);

        c1.mover(10,8);
        c2.mover(5, 10);
        c3.mover(8, 12);
        c4.mover(12,5 );
        c5.mover(15, 8);
    }

    public void onDraw(Canvas c){
        super.onDraw(c);
        Paint p=new Paint();
        c.drawColor(Color.CYAN);

        c1.pintar(c,p);
        c2.pintar(c,p);
        c3.pintar(c,p);
        c4.pintar(c,p);
        c5.pintar(c,p);

    }
}
