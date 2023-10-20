package edu.uw.ischool.dkaria.activityspy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.uw.ischool.dkaria.activityspy.ui.theme.ActivitySpyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivitySpyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("UW")
                }
            }

            Log.i("ActivitySpy", "onCreate event fired")
        }
    }

    override fun onDestroy() {
        Log.i("ActivitySpy", "Woah. --Neo, The Matrix")
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivitySpy", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivitySpy", "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivitySpy", "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivitySpy", "onResume event fired")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Greetings, $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActivitySpyTheme {
        Greeting("UW")
    }
}