package com.turkcell.lyraapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// ─────────────────────────────────────────────────────────────────────────────
// Roboto Font Ailesi
// Kaynak: docs/design/01-typography-system.md
//
// NOT: Roboto, Android sistemi tarafından sağlanır; ek bağımlılık gerekmez.
//      Özel font eklenirse bu tanım güncellenmeli.
// ─────────────────────────────────────────────────────────────────────────────
val RobotoFontFamily = FontFamily.Default   // Android'de varsayılan = Roboto

// ─────────────────────────────────────────────────────────────────────────────
// LyraApp Tipografi
// Kaynak: docs/design/01-typography-system.md
//
// KURAL: Hiçbir @Composable içinde ham TextStyle(fontSize = …) yazılmaz.
//        Tüm metin stilleri MaterialTheme.typography.<slot> üzerinden okunur.
// ─────────────────────────────────────────────────────────────────────────────
val LyraTypography = Typography(

    // ── DISPLAY (Büyük ekran/arka plan sayıları veya çok büyük başlıklar) ──
    displayLarge = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Bold,
        fontSize      = 57.sp,
        lineHeight    = 64.sp,
        letterSpacing = (-0.25).sp,
    ),
    displayMedium = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 45.sp,
        lineHeight    = 52.sp,
        letterSpacing = 0.sp,
    ),
    displaySmall = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Normal,  // Regular = Normal
        fontSize      = 36.sp,
        lineHeight    = 44.sp,
        letterSpacing = 0.sp,
    ),

    // ── HEADLINE (Ekran başlıkları: Profil, Ara, Kütüphane) ──
    headlineLarge = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Bold,
        fontSize      = 32.sp,
        lineHeight    = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.SemiBold,
        fontSize      = 28.sp,
        lineHeight    = 36.sp,
        letterSpacing = 0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 24.sp,
        lineHeight    = 32.sp,
        letterSpacing = 0.sp,
    ),

    // ── TITLE (Bölüm başlıkları, çalma listesi isimleri, şimdi çalıyor şarkı adı) ──
    titleLarge = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Bold,
        fontSize      = 22.sp,
        lineHeight    = 28.sp,
        letterSpacing = 0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 16.sp,
        lineHeight    = 24.sp,
        letterSpacing = 0.15.sp,
    ),
    titleSmall = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.1.sp,
    ),

    // ── BODY (Normal metinler, ikincil bilgiler, şarkıcı isimleri, açıklamalar) ──
    bodyLarge = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Normal,
        fontSize      = 16.sp,
        lineHeight    = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Normal,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.25.sp,
    ),
    bodySmall = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Normal,
        fontSize      = 12.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.4.sp,
    ),

    // ── LABEL (Butonlar, navigasyon yazıları, küçük sayaçlar, tag'ler) ──
    labelLarge = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 14.sp,
        lineHeight    = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    labelMedium = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 12.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily    = RobotoFontFamily,
        fontWeight    = FontWeight.Medium,
        fontSize      = 11.sp,
        lineHeight    = 16.sp,
        letterSpacing = 0.5.sp,
    ),
)