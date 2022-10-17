package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class Adw {
    
    /**
     * Indicates an {@link Animation} with an infinite duration.
     * <p>
     * This value is mostly used internally.
     */
    /**
     * Adwaita major version component (e.g. 1 if the version is 1.2.3).
     */
    public static final int MAJOR_VERSION = 1;

    /**
     * Adwaita micro version component (e.g. 3 if the version is 1.2.3).
     */
    public static final int MICRO_VERSION = 4;

    /**
     * Adwaita minor version component (e.g. 2 if the version is 1.2.3).
     */
    public static final int MINOR_VERSION = 1;

    /**
     * Adwaita version, encoded as a string, useful for printing and
     * concatenation.
     */
    public static final java.lang.String VERSION_S = "1.1.4";

    private static final MethodHandle adw_easing_ease = Interop.downcallHandle(
        "adw_easing_ease",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     */
    public static double easingEase(@NotNull Easing self, @NotNull double value) {
        double RESULT;
        try {
            RESULT = (double) adw_easing_ease.invokeExact(self.getValue(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_get_enable_animations = Interop.downcallHandle(
        "adw_get_enable_animations",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether animations are enabled for {@code widget}.
     * <p>
     * This should be used when implementing an animated widget to know whether to
     * animate it or not.
     */
    public static boolean getEnableAnimations(@NotNull org.gtk.gtk.Widget widget) {
        int RESULT;
        try {
            RESULT = (int) adw_get_enable_animations.invokeExact(widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_get_major_version = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) adw_get_major_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_get_micro_version = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) adw_get_micro_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_get_minor_version = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) adw_get_minor_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_init = Interop.downcallHandle(
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
    public static @NotNull void init() {
        try {
            adw_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_is_initialized = Interop.downcallHandle(
        "adw_is_initialized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Use this function to check if libadwaita has been initialized with
     * {@link init#null}.
     */
    public static boolean isInitialized() {
        int RESULT;
        try {
            RESULT = (int) adw_is_initialized.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_lerp = Interop.downcallHandle(
        "adw_lerp",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Computes the linear interpolation between @a and @b for @t.
     */
    public static double lerp(@NotNull double a, @NotNull double b, @NotNull double t) {
        double RESULT;
        try {
            RESULT = (double) adw_lerp.invokeExact(a, b, t);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static void __cbAnimationTargetFunc(double value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AnimationTargetFunc) Interop.signalRegistry.get(hash);
        handler.onAnimationTargetFunc(value);
    }
    
}
