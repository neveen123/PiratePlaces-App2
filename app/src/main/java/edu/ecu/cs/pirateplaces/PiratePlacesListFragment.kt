package edu.ecu.cs.pirateplaces

import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class PiratePlacesListFragment: Fragment() {

    private lateinit var pirateRecyclerView: RecyclerView
    private var adapter: PirateAdapter? = null

    private val PiratePlacesListViewModel: PiratePlacesViewModel by lazy {
        ViewModelProviders.of(this).get(PiratePlacesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total places: ${PiratePlacesListViewModel.piratePlaceList.size}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pirate_places_list, container, false)
        pirateRecyclerView =
            view.findViewById(R.id.pirate_recycler_view) as RecyclerView
        pirateRecyclerView.layoutManager = LinearLayoutManager(context)
        updateUI()
        return view
    }
    private fun updateUI() {
        val pirate = PiratePlacesListViewModel.piratePlaceList
        adapter = PirateAdapter(pirate)
        pirateRecyclerView.adapter = adapter
    }
    companion object {
        fun newInstance(): PiratePlacesListFragment {
            return PiratePlacesListFragment()
        }
    }
    private inner class PirateHolder(view: View)
        : RecyclerView.ViewHolder(view){

        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val visitedWithTextView: TextView = itemView.findViewById(R.id.visited_with)
        }
    private inner class PirateAdapter(var pirateList: List<PiratePlace>)
        : RecyclerView.Adapter<PirateHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
                : PirateHolder {
            val view = layoutInflater.inflate(R.layout.list_item_place, parent, false)
            return PirateHolder(view)
        }
        override fun getItemCount() = pirateList.size
        override fun onBindViewHolder(holder: PirateHolder, position: Int) {
            val pirate  = pirateList[position]
            holder.apply {
                nameTextView.text = nameTextView.toString()
                visitedWithTextView.text = pirate.toString()
            }
        }
    }
    }
