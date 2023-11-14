package com.example.navigationwithdata

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit
) {
    var namaTxt by remember {
        mutableStateOf("")
    }
    var alamatTxt by remember {
        mutableStateOf("")
    }
    var telponTxt by remember {
        mutableStateOf("")
    }
    var lisDataTxt: MutableList<String> = mutableListOf(namaTxt, alamatTxt, telponTxt)
}