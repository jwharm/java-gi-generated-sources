package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Adw {
    
    public static final int MAJOR_VERSION = 1;

    public static final int MICRO_VERSION = 4;

    public static final int MINOR_VERSION = 1;

    public static final java.lang.String VERSION_S = "1.1.4";

    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     */
    public static double easingEase(Easing self, double value) {
        var RESULT = gtk_h.adw_easing_ease(self.getValue(), value);
        return RESULT;
    }
    
    /**
     * Checks whether animations are enabled for {@code widget}.
     * <p>
     * This should be used when implementing an animated widget to know whether to
     * animate it or not.
     */
    public static boolean getEnableAnimations(org.gtk.gtk.Widget widget) {
        var RESULT = gtk_h.adw_get_enable_animations(widget.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the major version number of the Adwaita library.
     * <p>
     * For example, in libadwaita version 1.2.3 this is 1.
     * <p>
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
     * which represents the major version of the libadwaita headers you have
     * included when compiling your code.
     */
    public static int getMajorVersion() {
        var RESULT = gtk_h.adw_get_major_version();
        return RESULT;
    }
    
    /**
     * Returns the micro version number of the Adwaita library.
     * <p>
     * For example, in libadwaita version 1.2.3 this is 3.
     * <p>
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
     * which represents the micro version of the libadwaita headers you have
     * included when compiling your code.
     */
    public static int getMicroVersion() {
        var RESULT = gtk_h.adw_get_micro_version();
        return RESULT;
    }
    
    /**
     * Returns the minor version number of the Adwaita library.
     * <p>
     * For example, in libadwaita version 1.2.3 this is 2.
     * <p>
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
     * which represents the minor version of the libadwaita headers you have
     * included when compiling your code.
     */
    public static int getMinorVersion() {
        var RESULT = gtk_h.adw_get_minor_version();
        return RESULT;
    }
    
    /**
     * Initializes Libadwaita.
     * <p>
     * This function can be used instead of {@link Gtk#init} as it initializes GTK
     * implicitly.
     * <p>
     * There's no need to call this function if you're using {@link Application}.
     * <p>
     * If Libadwaita has already been initialized, the function will simply return.
     * <p>
     * This makes sure translations, types, themes, and icons for the Adwaita
     * library are set up properly.
     */
    public static void init() {
        gtk_h.adw_init();
    }
    
    /**
     * Use this function to check if libadwaita has been initialized with
     * {@link init#null}.
     */
    public static boolean isInitialized() {
        var RESULT = gtk_h.adw_is_initialized();
        return RESULT != 0;
    }
    
    /**
     * Computes the linear interpolation between @a and @b for @t.
     */
    public static double lerp(double a, double b, double t) {
        var RESULT = gtk_h.adw_lerp(a, b, t);
        return RESULT;
    }
    
    public static void __cbAnimationTargetFunc(double value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AnimationTargetFunc) Interop.signalRegistry.get(hash);
        handler.onAnimationTargetFunc(value);
    }
    
}
