// package line stays as Android Studio created it, for example:
// package com.example.worldflagscards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldflagscards.ui.theme.WorldFlagsCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldFlagsCardsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CountriesScreen()
                }
            }
        }
    }
}

@Composable
fun CountriesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Country Flags",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        CountryCard(
            countryName = "Finland",
            flag = "🇫🇮",
            capital = "Helsinki"
        )
        CountryCard(
            countryName = "Bangladesh",
            flag = "🇧🇩",
            capital = "Dhaka"
        )
        CountryCard(
            countryName = "Japan",
            flag = "🇯🇵",
            capital = "Tokyo"
        )
        CountryCard(
            countryName = "Brazil",
            flag = "🇧🇷",
            capital = "Brasília"
        )
    }
}

@Composable
fun CountryCard(
    countryName: String,
    flag: String,
    capital: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = flag,
                fontSize = 32.sp,
                modifier = Modifier.padding(end = 12.dp)
            )

            Column {
                Text(
                    text = countryName,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Capital: $capital",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CountriesScreenPreview() {
    WorldFlagsCardsTheme {
        CountriesScreen()
    }
}
