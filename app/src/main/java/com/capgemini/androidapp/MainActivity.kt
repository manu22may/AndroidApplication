package com.capgemini.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "BLABLA"
    val msg="123"
    val msg1="1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //first life cycle method
        setContentView(R.layout.activity_main) //load the xml heirarchy
        Log.d(TAG,"onCreate called")
        //one time execution
        //long running task - respond within 5 secs(App is not responding)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart called")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        //put data in bundle
    }

    var count=0
    override fun onBackPressed() {
        count++
        if(count==2)
            super.onBackPressed()
        else{
            Toast.makeText(this,"Press Back Again to exit",Toast.LENGTH_LONG).show()
        }
    }
}