package com.saucelabs.mydemoapp.android;

import android.app.Activity;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.rule.GrantPermissionRule;

import org.junit.Rule;

import com.squareup.spoon.Spoon;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

import static androidx.test.runner.lifecycle.Stage.RESUMED;

public class Screenshot {

    @Rule
    public GrantPermissionRule mRuntimeReadStoragePermissionRule = GrantPermissionRule.grant(android.Manifest.permission.READ_EXTERNAL_STORAGE);

    @Rule
    public GrantPermissionRule mRuntimeWriteStoragePermissionRule = GrantPermissionRule.grant(android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
    

    public static void takeScreenShot(String tag){
        Spoon.screenshot(getActivityInstance(), tag);
    }

    private static Activity getActivityInstance(){
        final AtomicReference<Activity> currentActivity = new AtomicReference<>();

        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable() {
            public void run() {
                Collection resumedActivities =
                        ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(RESUMED);
                if (resumedActivities.iterator().hasNext()){
                    currentActivity.set((Activity) resumedActivities.iterator().next());
                }
            }
        });

        return currentActivity.get();
    }

}
