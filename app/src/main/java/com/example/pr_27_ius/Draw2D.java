package com.example.pr_27_ius;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {
    private Paint mPaint = new Paint();
    public Draw2D(Context context) {
        super(context);
    }
    private Rect mRect = new Rect();
    int x = 700;
    int y = 350;


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);//холст

        mPaint.setStyle(Paint.Style.FILL);// стиль Заливка
        mPaint.setColor(Color.WHITE);// закрашиваем холст белым цветом
        canvas.drawPaint(mPaint);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(950, 100, 100, mPaint);//Рисуем круг



        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, 1050, 1100, 2200, mPaint);//Рисуем прямоугольник

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(42);
        canvas.drawText("Это Моя Лужайка", 30, 1000, mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(36);
        String str2rotate = "Лучик солнца!";
        canvas.save();

        mPaint.setColor(Color.GRAY);
        canvas.drawRect(500, 1050, 1000, 700, mPaint);// Рисуем основание дома

// Рисуем крышу
        Path path = new Path();
        path.moveTo(500, 700);
        path.lineTo(750, 450);
        path.lineTo(1000, 700);
        path.close();

        mPaint.setColor(Color.BLACK);
        canvas.drawPath(path, mPaint);

// Рисуем дверь
        mPaint.setColor(Color.BLACK);
        canvas.drawRect(830, 1050, 900, 850, mPaint);

// Рисуем окно
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(550, 1000, 700, 850, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawRect(550, 920, 700, 925, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawRect(625, 1000, 620, 850, mPaint);

        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x, y, mPaint);
        canvas.restore();

    }
}