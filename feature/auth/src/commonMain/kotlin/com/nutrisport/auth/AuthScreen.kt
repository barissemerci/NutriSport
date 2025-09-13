package com.nutrisport.auth

import ContentWithMessageBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nutrisport.auth.component.GoogleButton
import com.nutrisport.shared.Alpha
import com.nutrisport.shared.BebasNeueFont
import com.nutrisport.shared.FontSize
import com.nutrisport.shared.Surface
import com.nutrisport.shared.TextPrimary
import com.nutrisport.shared.TextSecondary
import rememberMessageBarState

@Composable
fun AuthScreen() {
    var messageBarState = rememberMessageBarState()
    Scaffold { paddingValues ->
        ContentWithMessageBar(
            contentBackgroundColor = Surface,
            messageBarState = messageBarState,
            errorMaxLines = 2,
            modifier = Modifier.padding(
                top = paddingValues.calculateTopPadding(),
                bottom = paddingValues.calculateBottomPadding()
            )
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(all = 24.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "NUTRISPORT",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontFamily = BebasNeueFont(),
                        fontSize = FontSize.EXTRA_LARGE,
                        color = TextSecondary
                    )
                    Text(
                        text = "Sign in to Continue",
                        modifier = Modifier
                            .fillMaxWidth()
                            .alpha(Alpha.HALF),
                        textAlign = TextAlign.Center,
                        fontSize = FontSize.EXTRA_REGULAR,
                        color = TextPrimary
                    )
                }
                GoogleButton(
                    loading = false,
                    onClick = {}
                )
            }

        }
    }
}