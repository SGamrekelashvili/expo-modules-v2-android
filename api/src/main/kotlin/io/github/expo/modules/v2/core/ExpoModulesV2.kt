package io.github.expo.modules.v2.core

import io.github.expo.kolibri.Kolibri

/**
 * The bridge library, which also carries kolibri's natives: `libexpo-modules-v2.so` on Android,
 * `libexpo-modules-v2.dylib` on the desktop.
 */
private const val LIBRARY_NAME = "expo-modules-v2"

object ExpoModulesV2 {
  /**
   * Must run before any kolibri class initializes: those load kolibri's library under its default
   * name, `expo-kolibri`, unless a [Kolibri.load] has already succeeded.
   */
  fun load() {
    Kolibri.load(LIBRARY_NAME)
  }
}
