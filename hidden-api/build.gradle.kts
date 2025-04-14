plugins {
  alias(libs.plugins.android.library)
}

setupLibraryModule {
  namespace = "com.fireworld.libchecker.hidden_api"
}

dependencies {
  annotationProcessor(libs.rikka.refine.compiler)
  compileOnly(libs.rikka.refine.annotation)
  compileOnly(libs.androidX.annotation)
}
