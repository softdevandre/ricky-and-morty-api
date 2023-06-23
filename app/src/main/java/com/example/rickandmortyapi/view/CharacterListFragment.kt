package com.example.rickandmortyapi.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.rickandmortyapi.viewmodel.CharacterListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterListFragment : Fragment() {

    private val viewModel: CharacterListViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getCharacters()

        viewModel.charactersLiveData.observe(viewLifecycleOwner, Observer { characters ->
            // TODO: Atualizar a interface do usuário com a lista de usuários
        })

        viewModel.errorLiveData.observe(viewLifecycleOwner, Observer { error ->
            // TODO: Exibir mensagem de erro
        })

        viewModel.loadingLiveData.observe(viewLifecycleOwner, Observer { loading ->
            // TODO: Exibir ou esconder o loading
        })
    }

}