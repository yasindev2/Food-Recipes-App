package uz.yasindev.foodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import coil.load
import uz.yasindev.foodapp.databinding.ItemDishBinding

class FoodAdapter : BaseAdapter() {
    private val data = ArrayList<FoodModel>()

    fun getData(data: ArrayList<FoodModel>) {
        this.data.addAll(data)
    }

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): FoodModel {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = ItemDishBinding.inflate(LayoutInflater.from(parent?.context),parent,false)

//        binding.foodItem.text = "Items:${getItem(position).items}"
        binding.foodName.text = getItem(position).name
        binding.imageView.load(getItem(position).image)


        return binding.root

    }
}