package edu.aku.hassannaqvi.casiregister.base.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.aku.hassannaqvi.casiregister.base.repository.GeneralRepository
import edu.aku.hassannaqvi.casiregister.base.viewmodel.ChildListViewModel
import edu.aku.hassannaqvi.casiregister.base.viewmodel.H1ViewModel
import edu.aku.hassannaqvi.casiregister.base.viewmodel.LoginViewModel

/*
* @author Ali Azaz Alam dt. 01.07.21
* */
@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: GeneralRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ChildListViewModel::class.java) -> ChildListViewModel(repository) as T
            modelClass.isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(repository) as T
            modelClass.isAssignableFrom(H1ViewModel::class.java) -> H1ViewModel(repository) as T
            else -> throw IllegalArgumentException("Unknown viewModel class $modelClass")
        }
    }

}