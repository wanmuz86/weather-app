package my.com.anak2u.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        /// Create data

        var dataList = LinkedList<String>()
        for (i in 1..10){
            dataList.add("This is title $i")
        }

        var adapter = CustomAdapter();
        adapter.list = dataList
        recyclerView.setAdapter(adapter)

    }
}