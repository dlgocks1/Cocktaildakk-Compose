package com.compose.cocktaildakk_compose.data.repository

import com.compose.cocktaildakk_compose.data.data_source.RecentStrDao
import com.compose.cocktaildakk_compose.domain.model.RecentStr
import com.compose.cocktaildakk_compose.domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
  private val recentStrDao: RecentStrDao
) : SearchRepository {

  override fun getResentSearchAll(): Flow<List<RecentStr>> = recentStrDao.recentStrAll()

  override suspend fun addSearchStr(seartchStr: String) {
    return recentStrDao.insert(RecentStr(seartchStr))
  }

  override suspend fun removeSearchStr(searchStr: RecentStr) {
    return recentStrDao.delete(searchStr)
  }

  override suspend fun removeAllSearchStr() {
    return recentStrDao.deleteAll()
  }
}