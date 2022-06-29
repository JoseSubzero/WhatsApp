package com.example.whatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.ContactsProvider
import com.example.whatsapp.R
import com.example.whatsapp.adapter.ContactsAdapter
import com.example.whatsapp.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)


        FragmentFirstBinding.inflate(inflater, container, false)
        initRecyclerView()
        return _binding!!.root
    }


    fun initRecyclerView(){
        val manager = LinearLayoutManager(this.context)
        val decoration = DividerItemDecoration(this.context, manager.orientation)
        binding.recyclerContacts.layoutManager = manager
        binding.recyclerContacts.addItemDecoration(decoration)
        binding.recyclerContacts.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerContacts.adapter = ContactsAdapter(ContactsProvider.contactsList)

    }

}