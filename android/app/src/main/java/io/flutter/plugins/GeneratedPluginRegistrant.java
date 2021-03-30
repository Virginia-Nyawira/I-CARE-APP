package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      pt.tribeiro.flutter_plugin_pdf_viewer.FlutterPluginPdfViewerPlugin.registerWith(shimPluginRegistry.registrarFor("pt.tribeiro.flutter_plugin_pdf_viewer.FlutterPluginPdfViewerPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
      io.flutter.plugins.videoplayer.VideoPlayerPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
    flutterEngine.getPlugins().add(new creativecreatorormaybenot.wakelock.WakelockPlugin());
  }
}
