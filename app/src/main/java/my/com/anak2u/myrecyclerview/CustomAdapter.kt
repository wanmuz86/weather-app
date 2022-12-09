package my.com.anak2u.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.util.*

class CustomAdapter : Adapter<CustomAdapter.CustomViewHolder>() {

    var list = LinkedList<String>()

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var titleTextView : TextView = itemView.findViewById(R.id.titleTextView)
        var subtitleTextView : TextView = itemView.findViewById(R.id.subtitleTextView)
        var imageView : ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val context = parent.context
        var inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.custom_row, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        // For each row, show the item inside the list.
        holder.titleTextView.text = list.get(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}