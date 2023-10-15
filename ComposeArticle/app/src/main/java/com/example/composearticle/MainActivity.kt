package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        Column(modifier = modifier.padding(10.dp)) {
            Text(
                modifier = modifier.padding(16.dp),
                text = stringResource(R.string.title_article),
                fontSize = 24.sp
            )
            Text(
                modifier = modifier.padding(horizontal = 16.dp),
                text = stringResource(R.string.paragraf_1),
                textAlign = TextAlign.Justify
            )
            Text(
                modifier = modifier.padding(16.dp),
                text = stringResource(R.string.paragraf_2),
                textAlign = TextAlign.Justify
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ComposeArticle()
    }
}