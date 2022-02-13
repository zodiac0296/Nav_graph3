package com.example.nav_graph_classwork.adapters
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nav_graph_classwork.R
import com.example.nav_graph_classwork.fragments.DetailFragment
import com.example.nav_graph_classwork.models.ModelClass

class GridAdapter(private val array: ArrayList<ModelClass>, private val context: FragmentActivity):
    RecyclerView.Adapter<GridAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView
        val name: TextView
        val description: TextView

        init {
            image = itemView.findViewById(R.id.imageView_grid)
            name = itemView.findViewById(R.id.name_grid)
            description = itemView.findViewById(R.id.description_grid)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        Glide.with(holder.itemView).load(item.image).into(holder.image)
        holder.name.text = item.name
        holder.description.text = item.description

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("KEY", item)

            context.supportFragmentManager.beginTransaction()
                .replace(R.id.fragContHome, DetailFragment::class.java, bundle)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}