package com.example.rickandmortyapi.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmortyapi.databinding.FragmentCharacterListBinding
import com.example.rickandmortyapi.viewmodel.CharacterListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterListFragment : Fragment() {

    private val viewModel: CharacterListViewModel by viewModel()
    private lateinit var binding: FragmentCharacterListBinding
    private lateinit var adapter: CharacterListAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterListBinding.inflate(inflater, container, false)
        val layoutManager = LinearLayoutManager(context)

        viewModel.charactersLiveData.observe(viewLifecycleOwner) { characters ->
            adapter = CharacterListAdapter(characters)
            binding.rvCharacterList.layoutManager = layoutManager
            binding.rvCharacterList.adapter = adapter
        }

        viewModel.errorLiveData.observe(viewLifecycleOwner) { error ->
            Toast.makeText(requireContext(), error, Toast.LENGTH_SHORT).show()
        }

        viewModel.loadingLiveData.observe(viewLifecycleOwner) { loading ->
            // TODO: Exibir ou esconder o loading
        }

        return binding.root
    }

}