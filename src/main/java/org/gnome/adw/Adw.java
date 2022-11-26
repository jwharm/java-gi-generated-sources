package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Adw namespace.
 */
public final class Adw {
    
    static {
        System.loadLibrary("adwaita-1");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Adwaita major version component (e.g. 1 if the version is 1.2.3).
     */
    public static final int MAJOR_VERSION = 1;
    
    /**
     * Adwaita micro version component (e.g. 3 if the version is 1.2.3).
     */
    public static final int MICRO_VERSION = 0;
    
    /**
     * Adwaita minor version component (e.g. 2 if the version is 1.2.3).
     */
    public static final int MINOR_VERSION = 2;
    
    /**
     * Adwaita version, encoded as a string, useful for printing and
     * concatenation.
     */
    public static final java.lang.String VERSION_S = "1.2.0";
    
    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     * @param self an easing value
     * @param value a value to ease
     * @return the easing for {@code value}
     */
    public static double easingEase(@NotNull org.gnome.adw.Easing self, double value) {
        java.util.Objects.requireNonNull(self, "Parameter 'self' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_easing_ease.invokeExact(
                    self.getValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether animations are enabled for {@code widget}.
     * <p>
     * This should be used when implementing an animated widget to know whether to
     * animate it or not.
     * @param widget a {@code GtkWidget}
     * @return whether animations are enabled for {@code widget}
     */
    public static boolean getEnableAnimations(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_get_enable_animations.invokeExact(
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the major version number of the Adwaita library
     */
    public static int getMajorVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_get_major_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the micro version number of the Adwaita library
     */
    public static int getMicroVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_get_micro_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the minor version number of the Adwaita library
     */
    public static int getMinorVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_get_minor_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes Libadwaita.
     * <p>
     * This function can be used instead of {@link org.gtk.gtk.Gtk#init} as it initializes GTK
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
            DowncallHandles.adw_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Use this function to check if libadwaita has been initialized with
     * {@link Adw#init}.
     * @return the initialization status
     */
    public static boolean isInitialized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_is_initialized.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Computes the linear interpolation between {@code a} and {@code b} for {@code t}.
     * @param a the start
     * @param b the end
     * @param t the interpolation rate
     * @return the computed value
     */
    public static double lerp(double a, double b, double t) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_lerp.invokeExact(
                    a,
                    b,
                    t);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A convenience function for showing an application’s about window.
     * @param parent the parent top-level window
     * @param firstPropertyName the name of the first property
     * @param varargs value of first property, followed by more pairs of property name and
     *   value, {@code NULL}-terminated
     */
    public static void showAboutWindow(@Nullable org.gtk.gtk.Window parent, @NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.adw_show_about_window.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_easing_ease = Interop.downcallHandle(
            "adw_easing_ease",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_get_enable_animations = Interop.downcallHandle(
            "adw_get_enable_animations",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_get_major_version = Interop.downcallHandle(
            "adw_get_major_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_get_micro_version = Interop.downcallHandle(
            "adw_get_micro_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_get_minor_version = Interop.downcallHandle(
            "adw_get_minor_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_init = Interop.downcallHandle(
            "adw_init",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle adw_is_initialized = Interop.downcallHandle(
            "adw_is_initialized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_lerp = Interop.downcallHandle(
            "adw_lerp",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_show_about_window = Interop.downcallHandle(
            "adw_show_about_window",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static void cbAnimationTargetFunc(double value, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AnimationTargetFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onAnimationTargetFunc(value);
        }
    }
}
