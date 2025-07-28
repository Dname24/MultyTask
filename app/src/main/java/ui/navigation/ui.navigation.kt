package ui.navigation

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.rememberNavController
import com.multytask.ui.navigation.NavGraph
import com.multytask.ui.theme.MultyTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultyTaskTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}