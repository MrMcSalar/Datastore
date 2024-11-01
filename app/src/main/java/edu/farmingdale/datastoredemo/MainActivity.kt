package edu.farmingdale.datastoredemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.farmingdale.datastoredemo.ui.EmojiReleaseApp
import edu.farmingdale.datastoredemo.ui.EmojiScreenViewModel
import edu.farmingdale.datastoredemo.ui.theme.DataStoreDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val emojiViewModel: EmojiScreenViewModel = viewModel(factory = EmojiScreenViewModel.Factory)
            val uiState by emojiViewModel.uiState.collectAsState()
            val darkTheme = uiState.isDarkTheme

            DataStoreDemoTheme(darkTheme = darkTheme) {
                EmojiReleaseApp()
            }
        }
    }
}
