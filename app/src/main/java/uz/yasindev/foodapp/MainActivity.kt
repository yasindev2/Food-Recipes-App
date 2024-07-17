package uz.yasindev.foodapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.yasindev.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val foodAdapter: FoodAdapter = FoodAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.listView?.adapter = foodAdapter
        foodAdapter.getData(LocalStorage.getFoods())
        setContentView(binding!!.root)
        loadAction()

    }

    private fun loadAction() {
        binding!!.listView.setOnItemClickListener { parent, view, position, id ->
            val intent: Intent = Intent(this, LearnActivity::class.java)
            Log.d("TAG11", id.toString())
            intent.putExtra("ID", id.toString())
            startActivity(intent)

        }
    }
}