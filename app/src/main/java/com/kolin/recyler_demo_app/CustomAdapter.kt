package com.kolin.recyler_demo_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList:List<itemviewmodel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    //create new views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
//inflates the cardviewdesign
        //that is used to list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design,parent,false)
        return ViewHolder(view)
    }
    //binds a list items to a view
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val itemviewmodel=mList[position]
        //sets the image to imageview from our itemholder class
        holder.imageview.setImageResource(itemviewmodel.image)

        //sets the text to the textview from item holder class
        holder.textview.text = itemviewmodel.text


    }
//return number of items in the list
    override fun getItemCount(): Int {
        return mList.size

    }
    //Holds  the views for adding for adding itto the image and
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageview:ImageView= itemView.findViewById(R.id.ivimage)
        val textview:TextView = itemView.findViewById(R.id.textitem)

    }
}
