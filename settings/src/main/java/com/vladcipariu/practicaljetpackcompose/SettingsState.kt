package com.vladcipariu.practicaljetpackcompose

import androidx.annotation.StringRes

data class SettingsState(
    val notificationsEnabled: Boolean = false,
    val hintsEnabled: Boolean = false,
    val marketingOption: MarketingOption = MarketingOption.ALLOWED,
    val themeOption: Theme = Theme.LIGHT
)

enum class MarketingOption(val id: Int) {
    ALLOWED(0), NOT_ALLOWED(1)
}

enum class Theme(@StringRes val label: Int) {
    LIGHT(R.string.theme_light),
    DARK(R.string.theme_light),
    SYSTEM(R.string.theme_light)
}