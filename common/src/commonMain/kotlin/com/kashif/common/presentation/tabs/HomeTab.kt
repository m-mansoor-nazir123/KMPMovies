package com.kashif.common.presentation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.kashif.common.presentation.HomeScreen
import com.kashif.common.presentation.provide

/*class HomeTab : Tab {


    @Composable
    override fun Content() {
        HomeScreen(provide.screenModel)
    }

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Rounded.Home)

            return remember { TabOptions(index = 0u, title = "Home", icon = icon) }
        }

}*/
