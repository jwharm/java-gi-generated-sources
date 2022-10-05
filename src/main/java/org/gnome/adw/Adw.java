package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Adw {
    
    public static final int MAJOR_VERSION = 1;

    public static final int MICRO_VERSION = 4;

    public static final int MINOR_VERSION = 1;

    public static final java.lang.String VERSION_S = "1.1.4";

    static final MethodHandle adw_easing_ease = Interop.downcallHandle(
        "adw_easing_ease",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     */
    public static double easingEase(Easing self, double value) {
        try {
            var RESULT = (double) adw_easing_ease.invokeExact(self.getValue(), value);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_get_enable_animations = Interop.downcallHandle(
        "adw_get_enable_animations",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether animations are enabled for {@code widget}.
     * <p>
     * This should be used when implementing an animated widget to know whether to
     * animate it or not.
     */
    public static boolean getEnableAnimations(org.gtk.gtk.Widget widget) {
        try {
            var RESULT = (int) adw_get_enable_animations.invokeExact(widget.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_get_major_version = Interop.downcallHandle(
        "adw_get_major_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) adw_get_major_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_get_micro_version = Interop.downcallHandle(
        "adw_get_micro_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) adw_get_micro_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_get_minor_version = Interop.downcallHandle(
        "adw_get_minor_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) adw_get_minor_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_init = Interop.downcallHandle(
        "adw_init",
        FunctionDescriptor.ofVoid()
    );
    
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
        try {
            adw_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_is_initialized = Interop.downcallHandle(
        "adw_is_initialized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Use this function to check if libadwaita has been initialized with
     * {@link init#null}.
     */
    public static boolean isInitialized() {
        try {
            var RESULT = (int) adw_is_initialized.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_lerp = Interop.downcallHandle(
        "adw_lerp",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Computes the linear interpolation between @a and @b for @t.
     */
    public static double lerp(double a, double b, double t) {
        try {
            var RESULT = (double) adw_lerp.invokeExact(a, b, t);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void __cbAnimationTargetFunc(double value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AnimationTargetFunc) Interop.signalRegistry.get(hash);
        handler.onAnimationTargetFunc(value);
    }
    
}
