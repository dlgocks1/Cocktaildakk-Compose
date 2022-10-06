package com.compose.cocktaildakk_compose.ui.bookmark

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.compose.cocktaildakk_compose.ui.components.SearchButton
import com.compose.cocktaildakk_compose.ui.search.SearchViewModel
import com.compose.cocktaildakk_compose.ui.search.searchResult.SearchListItem
import com.compose.cocktaildakk_compose.ui.theme.Color_Default_Backgounrd

@Composable
fun BookmarkScreen(
  navController: NavController = rememberNavController(),
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(color = Color_Default_Backgounrd)
  ) {
    Text(
      text = "내 보관함",
      fontSize = 16.sp,
      modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 20.dp), textAlign = TextAlign.Center,
      color = Color.White,
      fontWeight = FontWeight.Bold
    )

    LazyColumn(
      modifier = Modifier
        .fillMaxSize()
    ) {
      items(20) { item ->
        SearchListItem()
      }
    }
  }
}