package edu.ecu.cs.pirateplaces

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

private const val KEY_INDEX = "index"
private const val REQUEST_CODE_CHECK_IN = 0

class PiratePlacesListActivity : AppCompatActivity() {

  //  private lateinit var nameTextView: TextView
  //  private lateinit var visitedWithTextView: TextView

    private val piratePlacesViewModel: PiratePlacesViewModel by lazy {
        ViewModelProvider(this).get(PiratePlacesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pirate_places_list)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
            val fragment = PiratePlacesListFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
      //  nameTextView = findViewById(R.id.name_text_view)
        //visitedWithTextView = findViewById(R.id.visited_with)
        // val currentIndex = savedInstanceState?.getInt(KEY_INDEX, 0) ?: 0
      //  piratePlacesViewModel.currentIndex = currentIndex




      // nameTextView.setOnClickListener {
        // Launch new activity
        //val intent = CheckInActivity.newIntent(this, piratePlacesViewModel.currentName)
        //startActivityForResult(intent, REQUEST_CODE_CHECK_IN)
       // }

        //updateUI()
        }


       /** override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_INDEX, piratePlacesViewModel.currentIndex)
        }**/



        //private fun updateUI() {
       // nameTextView.setText(piratePlacesViewModel.currentName)
       // visitedWithTextView.setText(piratePlacesViewModel.currentVisitedWith)
       // }
    }

