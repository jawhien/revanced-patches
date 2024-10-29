package app.revanced.patches.music.utils.compatibility

import app.revanced.patcher.patch.Patch

object Constants {
    val COMPATIBLE_PACKAGE = setOf(
        Patch.CompatiblePackage(
            "com.google.android.apps.youtube.music",
            setOf(
                "6.20.51", // This is the latest version that supports Android 5.0
                "6.29.59", // This is the latest version that supports the 'Restore old player layout' setting.
                "6.42.55", // This is the latest version that supports Android 7.0
                "6.51.53", // This is the latest version of YouTube Music 6.xx.xx
                "7.16.53", // This is the latest version supported by the RVX patch.
            )
        )
    )
}