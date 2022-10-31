package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A singleton object that offers notification when displays appear or
 * disappear.
 * <p>
 * You can use {@link DisplayManager#get} to obtain the {@code GdkDisplayManager}
 * singleton, but that should be rarely necessary. Typically, initializing
 * GTK opens a display that you can work with without ever accessing the
 * {@code GdkDisplayManager}.
 * <p>
 * The GDK library can be built with support for multiple backends.
 * The {@code GdkDisplayManager} object determines which backend is used
 * at runtime.
 * <p>
 * In the rare case that you need to influence which of the backends
 * is being used, you can use {@link Gdk#setAllowedBackends}. Note
 * that you need to call this function before initializing GTK.
 * <p>
 * <strong>Backend-specific code</strong><br/>
 * When writing backend-specific code that is supposed to work with
 * multiple GDK backends, you have to consider both compile time and
 * runtime. At compile time, use the {@code GDK_WINDOWING_X11}, {@code GDK_WINDOWING_WIN32}
 * macros, etc. to find out which backends are present in the GDK library
 * you are building your application against. At runtime, use type-check
 * macros like GDK_IS_X11_DISPLAY() to find out which backend is in use:
 * <pre>{@code c
 * #ifdef GDK_WINDOWING_X11
 *   if (GDK_IS_X11_DISPLAY (display))
 *     {
 *       // make X11-specific calls here
 *     }
 *   else
 * #endif
 * #ifdef GDK_WINDOWING_MACOS
 *   if (GDK_IS_MACOS_DISPLAY (display))
 *     {
 *       // make Quartz-specific calls here
 *     }
 *   else
 * #endif
 *   g_error ("Unsupported GDK backend");
 * }</pre>
 */
public class DisplayManager extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDisplayManager";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DisplayManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DisplayManager if its GType is a (or inherits from) "GdkDisplayManager".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DisplayManager" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDisplayManager", a ClassCastException will be thrown.
     */
    public static DisplayManager castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkDisplayManager"))) {
            return new DisplayManager(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDisplayManager");
        }
    }
    
    /**
     * Gets the default {@code GdkDisplay}.
     * @return a {@code GdkDisplay}
     */
    public @Nullable org.gtk.gdk.Display getDefaultDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_get_default_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * List all currently open displays.
     * @return a newly
     *   allocated {@code GSList} of {@code GdkDisplay} objects
     */
    public @NotNull org.gtk.glib.SList listDisplays() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_list_displays.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
    /**
     * Opens a display.
     * @param name the name of the display to open
     * @return a {@code GdkDisplay}, or {@code null}
     *   if the display could not be opened
     */
    public @Nullable org.gtk.gdk.Display openDisplay(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_open_display.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets {@code display} as the default display.
     * @param display a {@code GdkDisplay}
     */
    public void setDefaultDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        try {
            DowncallHandles.gdk_display_manager_set_default_display.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the singleton {@code GdkDisplayManager} object.
     * <p>
     * When called for the first time, this function consults the
     * {@code GDK_BACKEND} environment variable to find out which of the
     * supported GDK backends to use (in case GDK has been compiled
     * with multiple backends).
     * <p>
     * Applications can use {@link Gdk#setAllowedBackends} to limit what
     * backends wil be used.
     * @return The global {@code GdkDisplayManager} singleton
     */
    public static @NotNull org.gtk.gdk.DisplayManager get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DisplayManager(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DisplayOpened {
        void signalReceived(DisplayManager source, @NotNull org.gtk.gdk.Display display);
    }
    
    /**
     * Emitted when a display is opened.
     */
    public Signal<DisplayManager.DisplayOpened> onDisplayOpened(DisplayManager.DisplayOpened handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("display-opened"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DisplayManager.Callbacks.class, "signalDisplayManagerDisplayOpened",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DisplayManager.DisplayOpened>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_display_manager_get_default_display = Interop.downcallHandle(
            "gdk_display_manager_get_default_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_display_manager_list_displays = Interop.downcallHandle(
            "gdk_display_manager_list_displays",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_display_manager_open_display = Interop.downcallHandle(
            "gdk_display_manager_open_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_display_manager_set_default_display = Interop.downcallHandle(
            "gdk_display_manager_set_default_display",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_display_manager_get = Interop.downcallHandle(
            "gdk_display_manager_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDisplayManagerDisplayOpened(MemoryAddress source, MemoryAddress display, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DisplayManager.DisplayOpened) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DisplayManager(Refcounted.get(source)), new org.gtk.gdk.Display(Refcounted.get(display, false)));
        }
    }
}
