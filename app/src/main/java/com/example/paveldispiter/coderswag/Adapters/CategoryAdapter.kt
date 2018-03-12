package com.example.paveldispiter.coderswag.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.paveldispiter.coderswag.Model.Category
import com.example.paveldispiter.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by paveldispiter on 3/12/18.
 */
class CategoryAdapter (context: Context, categories: List<Category>): BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View     //new view
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()                                                       //initialisation of holder
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)        // UI elements views
            holder.categoryName = categoryView.findViewById(R.id.categoryName)        // UI elements views
            println("I exist for the first time")
            categoryView.tag = holder

        } else {
            holder = convertView.tag as ViewHolder         // reusing cells set in holder
            categoryView=convertView
            println("Go green, recycle")
        }


        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName) // by coverting image name to resource id
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}