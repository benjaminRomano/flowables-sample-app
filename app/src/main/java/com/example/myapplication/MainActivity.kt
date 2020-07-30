package com.example.myapplication

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.reactivex.rxkotlin.Flowables
import io.reactivex.rxkotlin.toFlowable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val a = listOf("a","b","c").toFlowable()
        val b = listOf("a", "b", "c").toFlowable()

        Flowables.combineLatest(a, b).map { (a,b) -> Log.i("test", "$a + $b") }
                .subscribe()
    }
}