package com.turkcell.lyraapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// ─────────────────────────────────────────────
// Dark Color Scheme
// Kaynak: docs/design/00-color-system.md
// ─────────────────────────────────────────────
private val LyraDarkColorScheme = darkColorScheme(
    primary              = DarkPrimary,
    onPrimary            = DarkOnPrimary,
    primaryContainer     = DarkPrimaryContainer,
    onPrimaryContainer   = DarkOnPrimaryContainer,
    secondary            = DarkSecondary,
    onSecondary          = DarkOnSecondary,
    secondaryContainer   = DarkSecondaryContainer,
    onSecondaryContainer = DarkOnSecondaryContainer,
    tertiary             = DarkTertiary,
    onTertiary           = DarkOnTertiary,
    tertiaryContainer    = DarkTertiaryContainer,
    onTertiaryContainer  = DarkOnTertiaryContainer,
    error                = DarkError,
    onError              = DarkOnError,
    errorContainer       = DarkErrorContainer,
    onErrorContainer     = DarkOnErrorContainer,
    background           = DarkSurface,           // türetilen: surface ile aynı
    onBackground         = DarkOnSurface,         // türetilen: onSurface ile aynı
    surface              = DarkSurface,
    onSurface            = DarkOnSurface,
    surfaceVariant       = DarkSurfaceVariant,
    onSurfaceVariant     = DarkOnSurfaceVariant,
    surfaceTint          = DarkPrimary,           // M3 varsayılanı = primary
    surfaceDim           = DarkSurfaceDim,
    surfaceBright        = DarkSurfaceBright,
    surfaceContainerLowest  = DarkSurfaceContainerLowest,
    surfaceContainerLow     = DarkSurfaceContainerLow,
    surfaceContainer        = DarkSurfaceContainer,
    surfaceContainerHigh    = DarkSurfaceContainerHigh,
    surfaceContainerHighest = DarkSurfaceContainerHighest,
    outline              = DarkOutline,
    outlineVariant       = DarkOutlineVariant,
    inverseSurface       = DarkInverseSurface,
    inverseOnSurface     = DarkInverseOnSurface,
    inversePrimary       = DarkInversePrimary,
    scrim                = DarkScrim,
)

// ─────────────────────────────────────────────
// Light Color Scheme
// Kaynak: docs/design/00-color-system.md
// ─────────────────────────────────────────────
private val LyraLightColorScheme = lightColorScheme(
    primary              = LightPrimary,
    onPrimary            = LightOnPrimary,
    primaryContainer     = LightPrimaryContainer,
    onPrimaryContainer   = LightOnPrimaryContainer,
    secondary            = LightSecondary,
    onSecondary          = LightOnSecondary,
    secondaryContainer   = LightSecondaryContainer,
    onSecondaryContainer = LightOnSecondaryContainer,
    tertiary             = LightTertiary,
    onTertiary           = LightOnTertiary,
    tertiaryContainer    = LightTertiaryContainer,
    onTertiaryContainer  = LightOnTertiaryContainer,
    error                = LightError,
    onError              = LightOnError,
    errorContainer       = LightErrorContainer,
    onErrorContainer     = LightOnErrorContainer,
    background           = LightSurface,
    onBackground         = LightOnSurface,
    surface              = LightSurface,
    onSurface            = LightOnSurface,
    surfaceVariant       = LightSurfaceVariant,
    onSurfaceVariant     = LightOnSurfaceVariant,
    surfaceTint          = LightPrimary,
    surfaceDim           = LightSurfaceDim,
    surfaceBright        = LightSurfaceBright,
    surfaceContainerLowest  = LightSurfaceContainerLowest,
    surfaceContainerLow     = LightSurfaceContainerLow,
    surfaceContainer        = LightSurfaceContainer,
    surfaceContainerHigh    = LightSurfaceContainerHigh,
    surfaceContainerHighest = LightSurfaceContainerHighest,
    outline              = LightOutline,
    outlineVariant       = LightOutlineVariant,
    inverseSurface       = LightInverseSurface,
    inverseOnSurface     = LightInverseOnSurface,
    inversePrimary       = LightInversePrimary,
    scrim                = LightScrim,
)

// ─────────────────────────────────────────────
// LyraApp Tema
//
// Kural: Dinamik renk (Dynamic Color) kullanılmaz.
//   Marka kimliğini korumak için dynamicColor kaldırıldı.
//   Varsayılan tema: Dark — kullanıcı değiştirebilir.
//   Kural kaynağı: docs/design/00-color-system.md
// ─────────────────────────────────────────────
@Composable
fun LyraAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) LyraDarkColorScheme else LyraLightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = LyraTypography,
        content     = content
    )
}