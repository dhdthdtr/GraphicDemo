package com.example.graphicdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

public class CustomView extends View {
    Paint paint = new Paint(Paint.FAKE_BOLD_TEXT_FLAG);
    Paint textPaint = new Paint(Paint.LINEAR_TEXT_FLAG);
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // change canvas background color
        canvas.drawColor(Color.parseColor("#bababa"));
        //draw basic shapes
        canvas.drawLine(5,5,200,5,paint);
        canvas.drawLine(5,15,200,15,paint);
        canvas.drawLine(5,25,200,25,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50,70,25,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(new Rect(100,60,150,80), paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawOval(new RectF(160,60,250,80), paint);
        //draw text
        textPaint.setTextSize(22);
        canvas.drawText("Welcome", 20, 100, textPaint);
        textPaint.setColor(Color.MAGENTA);
        textPaint.setTextSize(40);
        canvas.drawText("Welcome", 20, 140, textPaint);
        //transparency
        textPaint.setColor(0xFF465574);
        textPaint.setTextSize(60);
        canvas.drawText("Android Rocks", 20, 340, textPaint);
        //opaque circle
        canvas.drawCircle(80,300,20,paint);
        //semi-transparent circle
        paint.setAlpha(110);
        canvas.drawCircle(80,300,20,paint);
        paint.setColor(Color.YELLOW);
        paint.setAlpha(140);
        canvas.drawCircle(240,330,30,paint);
        paint.setColor(Color.MAGENTA);
        paint.setAlpha(30);
        canvas.drawCircle(288,350,30,paint);
        paint.setColor(Color.CYAN);
        paint.setAlpha(100);
        canvas.drawCircle(380,330,50,paint);
        //shader
        Paint shaderPaint = new Paint();
        Shader shader = new LinearGradient(0,400,300,500,Color.RED, Color.GREEN, Shader.TileMode.CLAMP);
        shaderPaint.setShader(shader);
        canvas.drawRect(0,400,200,500,shaderPaint);
    }
}
