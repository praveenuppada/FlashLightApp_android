package com.example.flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleFlashLightOnOff;

    private CameraManager cameraManager;

    private String getCameraId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleFlashLightOnOff = (ToggleButton) findViewById(R.id.toggle_flashlight);

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            getCameraId = cameraManager.getCameraIdList()[0];
        } catch(CameraAccessException e) {
            e.printStackTrace();
        }
    }
}