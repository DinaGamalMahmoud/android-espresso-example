package com.example.addam.espressotesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by addam on 9/21/17.
 */


@SuppressWarnings("DefaultFileTemplate")
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentalTesting {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureTextExist(){
        onView(withId(R.id.username))
                .perform(typeText("Hello Amir"));
    }

    @Test
    public void reTypeText(){
        onView(withId(R.id.username))
                .perform(typeText("Hello Pamela"));
    }
       @Test
    public void reTypeText(){
        onView(withId(R.id.username))
                .perform(typeText("Good Bye ;)"));
    }
}
