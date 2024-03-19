package me.tbsten.lintpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import me.tbsten.lintpractice.ui.theme.LintpracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LintpracticeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) { // Modifierがない  [rule:https://slackhq.github.io/compose-lints/rules/#when-should-i-expose-modifier-parameters]
    Text(
        text = "Hello $name!",
        fontSize = 32.sp, // 引数最後のカンマがない [rule:https://pinterest.github.io/ktlint/latest/rules/standard/#trailing-comma-on-call-site]
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LintpracticeTheme {
        Greeting("Android")
    }
}
