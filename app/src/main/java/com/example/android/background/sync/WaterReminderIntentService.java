package com.example.android.background.sync;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

// TODO (9) Create WaterReminderIntentService and extend it from IntentService
public class WaterReminderIntentService extends IntentService {
//  TODO (10) Create a default constructor that calls super with the name of this class
    public  WaterReminderIntentService(){ super("WaterReminderIntentService");}

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
//  TODO (11) Override onHandleIntent
        String action = intent.getAction();
//      TODO (12) Get the action from the Intent that started this Service
        ReminderTasks.executeTask(this,action);
//      TODO (13) Call ReminderTasks.executeTask and pass in the action to be performed

    }

}