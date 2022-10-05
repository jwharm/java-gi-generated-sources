package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A singleton object that offers notification when displays appear or
 * disappear.
 * <p>
 * You can use {@link Gdk#DisplayManager} to obtain the {@code GdkDisplayManager}
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
 * <h2>Backend-specific code</h2>
 * <p>
 * When writing backend-specific code that is supposed to work with
 * multiple GDK backends, you have to consider both compile time and
 * runtime. At compile time, use the {@code GDK_WINDOWING_X11}, {@code GDK_WINDOWING_WIN32}
 * macros, etc. to find out which backends are present in the GDK library
 * you are building your application against. At runtime, use type-check
 * macros like GDK_IS_X11_DISPLAY() to find out which backend is in use:
 * <p>
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

    public DisplayManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DisplayManager */
    public static DisplayManager castFrom(org.gtk.gobject.Object gobject) {
        return new DisplayManager(gobject.refcounted());
    }
    
    static final MethodHandle gdk_display_manager_get_default_display = Interop.downcallHandle(
        "gdk_display_manager_get_default_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@code GdkDisplay}.
     */
    public Display getDefaultDisplay() {
        try {
            var RESULT = (MemoryAddress) gdk_display_manager_get_default_display.invokeExact(handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_manager_list_displays = Interop.downcallHandle(
        "gdk_display_manager_list_displays",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * List all currently open displays.
     */
    public org.gtk.glib.SList listDisplays() {
        try {
            var RESULT = (MemoryAddress) gdk_display_manager_list_displays.invokeExact(handle());
            return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_manager_open_display = Interop.downcallHandle(
        "gdk_display_manager_open_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a display.
     */
    public Display openDisplay(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) gdk_display_manager_open_display.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_manager_set_default_display = Interop.downcallHandle(
        "gdk_display_manager_set_default_display",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code display} as the default display.
     */
    public void setDefaultDisplay(Display display) {
        try {
            gdk_display_manager_set_default_display.invokeExact(handle(), display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_display_manager_get = Interop.downcallHandle(
        "gdk_display_manager_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the singleton {@code GdkDisplayManager} object.
     * <p>
     * When called for the first time, this function consults the
     * {@code GDK_BACKEND} environment variable to find out which of the
     * supported GDK backends to use (in case GDK has been compiled
     * with multiple backends).
     * <p>
     * Applications can use {@link set_allowed_backends#null} to limit what
     * backends wil be used.
     */
    public static DisplayManager get() {
        try {
            var RESULT = (MemoryAddress) gdk_display_manager_get.invokeExact();
            return new DisplayManager(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DisplayOpenedHandler {
        void signalReceived(DisplayManager source, Display display);
    }
    
    /**
     * Emitted when a display is opened.
     */
    public SignalHandle onDisplayOpened(DisplayOpenedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("display-opened").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DisplayManager.Callbacks.class, "signalDisplayManagerDisplayOpened",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDisplayManagerDisplayOpened(MemoryAddress source, MemoryAddress display, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DisplayManager.DisplayOpenedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DisplayManager(Refcounted.get(source)), new Display(Refcounted.get(display, false)));
        }
        
    }
}
