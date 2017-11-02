package com.bp.pruebasensormanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancia de la clase SensorManager que permite el uso de sensores.
        final SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        //getSensorList permite obtener una lista de los sensores del dispositivo.
        List<Sensor> sensorsList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : sensorsList) {
            Log.v("SensorActivity", "sensor = " + sensor.getName());
        }

        /* defaultProximitySensor indica el sensor que gestiona un tipo concreto
        de sensores. En este caso muestra el modelo de sensor que controla el
        sensor de proximidad. */
        Sensor defaultProximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        Log.v("SensorActivity", "defaultProximitySensor = " + defaultProximitySensor.getName());
    }
}
