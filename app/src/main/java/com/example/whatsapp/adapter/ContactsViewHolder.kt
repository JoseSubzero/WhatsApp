package com.example.whatsapp.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsapp.Contacts
import com.example.whatsapp.R
import com.example.whatsapp.databinding.ItemContactsBinding

class ContactsViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val b = ItemContactsBinding.bind(view)
    fun render(contactsModel: Contacts){
        b.tvContactName.text = contactsModel.Name
        b.tvTime.text = contactsModel.Time
        Glide.with(b.ivHero.context)
            .load(contactsModel.photo)
            .into(b.ivHero)

        itemView.setOnClickListener {
            Toast.makeText(b.ivHero.context, contactsModel.Name, Toast.LENGTH_SHORT).show()
        }
    }
}