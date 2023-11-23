package team.viceversa.loqui.ui.auth

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AuthScreenButton(label: String, onClicked: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        shape = RoundedCornerShape(8.dp),
        onClick = { /*TODO*/ },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(text = label)
    }
}