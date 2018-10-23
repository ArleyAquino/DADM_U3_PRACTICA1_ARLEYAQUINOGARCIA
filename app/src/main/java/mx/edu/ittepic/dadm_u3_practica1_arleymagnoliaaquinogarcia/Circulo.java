package mx.edu.ittepic.dadm_u3_practica1_arleymagnoliaaquinogarcia;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {
    float x, y;
    int desplazamientox, desplazamientoy;
    CountDownTimer timer;
    int color, radio;

    public Circulo(int posx, int posy, final Lienzo l, int c, int r){
        x=posx;
        y=posy;
        color=c;
        radio=r;
        timer =new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                x+=desplazamientox;
                y+=desplazamientoy;
                if(x>= l.getWidth()-70 || x<=0 ){
                    desplazamientox *=-1;
                }
                if(y>=l.getHeight()-70 || y<=0){
                    desplazamientoy *=-1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }
    public  void pintar(Canvas c, Paint p){
        p.setColor(color);
        c.drawCircle(x, y, radio, p);
    }
    public void mover(int desplazax, int desplazay){
        desplazamientox=desplazax;
        desplazamientoy=desplazay;
        timer.start();
    }
}
