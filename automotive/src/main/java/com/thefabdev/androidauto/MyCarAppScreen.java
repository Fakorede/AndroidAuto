package com.thefabdev.androidauto;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
// import androidx.car.app.model.Action;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

public class MyCarAppScreen extends Screen {
    public MyCarAppScreen(CarContext carContext) {
        super(carContext);
    }

    @NonNull
    @Override
    public Template onGetTemplate() {
        Row row = new Row.Builder().setTitle("Hello world!").addText("My Car App").build();
        Pane pane = new Pane.Builder().addRow(row).build();
        return new PaneTemplate.Builder(pane)
                .setTitle("Something here...")
                //.setHeaderAction(Action.APP_ICON)
                .build();
    }
}
