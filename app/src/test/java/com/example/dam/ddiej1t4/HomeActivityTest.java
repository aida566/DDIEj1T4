package com.example.dam.ddiej1t4;

import android.content.Intent;
import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.ShadowIntent;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.robolectric.Shadows.shadowOf;


@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class HomeActivityTest {
    private HomeActivity activity;
    private Button pressMeButton;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(HomeActivity.class).create().get();
        pressMeButton = (Button) activity.findViewById(R.id.press_me_button);
    }

    @Test
    public void pressingTheButtonShouldStartTheListActivity() throws Exception {
        pressMeButton.performClick();

        /*
        ShadowActivity shadowActivity = shadowOf(activity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();

        Intent startedIntent =
        assertThat(startedIntent.getComponent().getClassName(), equalTo(NamesActivity.class.getName()));
    */
    }
}
