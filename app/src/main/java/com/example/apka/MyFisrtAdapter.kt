package com.example.apka

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.apka.databinding.ContactRowBinding

class MyFisrtAdapter(private val contacts: List<Contact>):
    RecyclerView.Adapter<MyFisrtAdapter.MyViewHolder>() {

    inner class MyViewHolder(binding: ContactRowBinding): ViewHolder(binding.root){
        val nameTv = binding.nameTv
        val numberTv = binding.numberTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val contactRowBinding = ContactRowBinding.inflate(inflater, parent,false)
        return MyViewHolder(contactRowBinding)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameTv.text = contacts[position].name
        holder.numberTv.text = contacts[position].number
    }

}