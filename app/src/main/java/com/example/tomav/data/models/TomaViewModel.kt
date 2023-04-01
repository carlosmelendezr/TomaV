package com.example.tomav.data.models


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tomav.data.use_case.TomaUseCases
import com.example.tomav.data.util.TomaOrden
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TomaViewModel @Inject constructor(
    private val tomaUseCases: TomaUseCases
): ViewModel() {
    private val _state = mutableStateOf(TomaState())
    private val state : State<TomaState> = _state

    private var recentlyDeletedToma:Toma? = null

    fun onEvent(event: TomaEvents) {
        when(event) {
            is TomaEvents.Order -> {
                if (state.value.tomaOrden::class==event.tomaOrden::class &&
                    state.value.tomaOrden.orderType==event.tomaOrden.orderType  ) {
                    return
                }
                getTomas(event.tomaOrden)
            }
            is TomaEvents.deleteToma -> {
                viewModelScope.launch {
                   tomaUseCases.deleteToma(event.toma)
                    recentlyDeletedToma = event.toma
                }

            }
            is TomaEvents.insertToma -> {

            }
            is TomaEvents.restoreToma -> {


            }
            is TomaEvents.toggleOrderSelection -> {
                _state.value = _state.value.copy(
                    isOrderSelecionVisible = !_state.value.isOrderSelecionVisible)
            }
        }

    }

    private fun getTomas(tomaOrden: TomaOrden) {
        tomaUseCases.getToma(tomaOrden).
        onEach {tomas -> _state.value = state.value.copy(
            tomas = tomas,
            tomaOrden = tomaOrden
        )

        }.launchIn(viewModelScope)
    }
}

