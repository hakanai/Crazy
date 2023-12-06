
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun EphemeralLaboratoriesTheme(body: @Composable () -> Unit) {
    MaterialTheme(
        colors = darkColors(
            primary = Color(233, 55, 84),
            secondary = Color(65, 152, 223)
        )
    ) {
        body()
    }
}

object AppIcons {
    val Rat @Composable get() = painterResource("/Rat.ico")
}
