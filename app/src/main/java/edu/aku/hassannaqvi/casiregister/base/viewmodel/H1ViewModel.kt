package edu.aku.hassannaqvi.casiregister.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.aku.hassannaqvi.casiregister.base.repository.GeneralRepository
import edu.aku.hassannaqvi.casiregister.base.repository.ResponseStatusCallbacks
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class H1ViewModel(internal val repository: GeneralRepository) : ViewModel() {

    private val _districtResponse: MutableLiveData<ResponseStatusCallbacks<List<Districts>>> = MutableLiveData()
    val districtResponse: MutableLiveData<ResponseStatusCallbacks<List<Districts>>>
        get() = _districtResponse

    private val _ucResponse: MutableLiveData<ResponseStatusCallbacks<List<UCs>>> = MutableLiveData()
    val ucResponse: MutableLiveData<ResponseStatusCallbacks<List<UCs>>>
        get() = _ucResponse

    init {
        getDistrictFromDB()
    }

    private fun getDistrictFromDB() {
        _districtResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val district = repository.getDistrictsFromDB()
                _districtResponse.value = if (district.size > 0) {
                    ResponseStatusCallbacks.success(data = district, message = "District item found")
                } else
                    ResponseStatusCallbacks.error(data = null, message = "No district found!")
            } catch (e: Exception) {
                _districtResponse.value =
                        ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }

        }

    }

    fun getUCsDistrictFromDB(dCode: String) {
        _ucResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val uc = repository.getUcsByDistrictsFromDB(dCode)
                _ucResponse.value = if (uc.size > 0) {
                    ResponseStatusCallbacks.success(data = uc, message = "UC item found")
                } else
                    ResponseStatusCallbacks.error(data = null, message = "No uc found!")
            } catch (e: Exception) {
                _ucResponse.value =
                        ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }

        }

    }
}