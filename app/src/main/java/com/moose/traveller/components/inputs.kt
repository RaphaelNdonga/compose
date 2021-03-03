package com.moose.traveller.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun Input(placeholder: String, text: MutableState<TextFieldValue>, icon: ImageVector) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 20.dp))
    {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = text.value,
            textStyle = TextStyle(color = Color.Black),
            leadingIcon = { Icon(imageVector = icon, contentDescription = null) },
            label = { Text(text = placeholder, style = typography.body2) },
            onValueChange = { text.value = it }
        )
    }
}
