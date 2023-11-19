package dev.seabat.android.screenshot2cloud.ui.compose.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.seabat.android.screenshot2cloud.ui.compose.Screenshot2CloudTopAppBar
import dev.seabat.android.screenshot2cloud.ui.theme.ScreenshotToCloudTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            Screenshot2CloudTopAppBar()
        }
    ) {
        HomeContent(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Text(text = "bodyLarge", style = MaterialTheme.typography.bodyLarge)
        Text(text = "bodyMedium", style = MaterialTheme.typography.bodyMedium)
        Text(text = "bodySmall", style = MaterialTheme.typography.bodySmall)
        Text(text = "displayLarge", style = MaterialTheme.typography.displayLarge)
        Text(text = "displayMedium", style = MaterialTheme.typography.displayMedium)
        Text(text = "displaySmall", style = MaterialTheme.typography.displaySmall)
        Text(text = "headlineLarge", style = MaterialTheme.typography.headlineLarge)
        Text(text = "headlineMedium", style = MaterialTheme.typography.headlineMedium)
        Text(text = "headlineSmall", style = MaterialTheme.typography.headlineSmall)
        Text(text = "labelLarge", style = MaterialTheme.typography.labelLarge)
        Text(text = "labelMedium", style = MaterialTheme.typography.labelMedium)
        Text(text = "labelSmall", style = MaterialTheme.typography.labelSmall)
        Text(text = "titleLarge", style = MaterialTheme.typography.titleLarge)
        Text(text = "titleMedium", style = MaterialTheme.typography.titleMedium)
        Text(text = "titleSmall", style = MaterialTheme.typography.titleSmall)
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    ScreenshotToCloudTheme {
        HomeScreen()
    }
}