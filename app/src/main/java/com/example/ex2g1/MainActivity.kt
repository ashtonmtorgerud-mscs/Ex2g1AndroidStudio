package com.example.ex2g1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ex2g1.ui.theme.Ex2G1Theme
import java.time.LocalDateTime
import java.time.LocalDateTime.*
import java.time.format.DateTimeFormatter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ex2G1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

//                    SensorReadingJSONParser.readFile("/resources/readings.json")



                    val sensorReading = SensorReading(
                        99999,
                        2,
                        29.0f
                    );


                    val sensor = Sensor(1,2,3,"The Backrooms");


                    val sral = arrayListOf(sensorReading)
                    sral.add(sensorReading)
                    sensor.setSensorReadings(sral)


                    Column(modifier = Modifier.padding(innerPadding)){
                        for (sensorReading in sensor.sensorReadings) {
                            Text(
                                text = sensorReading.toString(),
                                modifier = Modifier
                            )
                        }
                    }

                }
            }
        }




    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! $",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ex2G1Theme {
        Greeting("Android")
    }
}