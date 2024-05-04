package com.example.androidproject

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import com.example.androidproject.AlarmManagerBroadcast

class RingAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ring_alarm)

        var hours = 0
        var min = 0

        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        timePicker.setOnTimeChangedListener { _, hour, minute ->
            var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {
                hour == 0 -> {
                    hour += 12
                    am_pm = "AM"
                }

                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }

                else -> am_pm = "AM"
            }


            hours = hour
            min = minute
        }

        val set = findViewById<Button>(R.id.set)
        val stop = findViewById<Button>(R.id.stop)



        var alarmManager: AlarmManager

        val intent = Intent(this, AlarmManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,224,intent, PendingIntent.FLAG_UPDATE_CURRENT)

        set.setOnClickListener {
            val i = hours*3600 + min*60
            val diff = ((i*1000) - System.currentTimeMillis())/1000
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP,(i*1000) - System.currentTimeMillis(),pendingIntent)
            Toast.makeText(this,"Alarm in $diff seconds", Toast.LENGTH_SHORT).show()
        }

        stop.setOnClickListener {
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm cancelled", Toast.LENGTH_SHORT).show()
        }
    }
}