package the.codeholic.buddybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val item = ArrayList<User>()
        //adding user
        item.add(User("Ananthan", "The Boss", R.drawable.boss))
        item.add(User("Dani", "Pucham Only", R.drawable.dani))
        item.add(User("Deeps", "Writer", R.drawable.deepraj))
        item.add(User("Rafi", "Homie", R.drawable.rafi))
        item.add(User("Rahulji", "The Sage", R.drawable.rahulji))
        item.add(User("Vinu", "FLutter stickeroli", R.drawable.vinu))
        //Adapter setting
        val mAdapter = RecyclerViewAdapter(item)
        recyclerView.adapter = mAdapter
    }

}
