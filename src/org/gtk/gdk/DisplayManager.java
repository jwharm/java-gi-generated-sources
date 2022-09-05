package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A singleton object that offers notification when displays appear or
 * disappear.
 * 
 * You can use [func@Gdk.DisplayManager.get] to obtain the `GdkDisplayManager`
 * singleton, but that should be rarely necessary. Typically, initializing
 * GTK opens a display that you can work with without ever accessing the
 * `GdkDisplayManager`.
 * 
 * The GDK library can be built with support for multiple backends.
 * The `GdkDisplayManager` object determines which backend is used
 * at runtime.
 * 
 * In the rare case that you need to influence which of the backends
 * is being used, you can use [func@Gdk.set_allowed_backends]. Note
 * that you need to call this function before initializing GTK.
 * 
 * ## Backend-specific code
 * 
 * When writing backend-specific code that is supposed to work with
 * multiple GDK backends, you have to consider both compile time and
 * runtime. At compile time, use the `GDK_WINDOWING_X11`, `GDK_WINDOWING_WIN32`
 * macros, etc. to find out which backends are present in the GDK library
 * you are building your application against. At runtime, use type-check
 * macros like GDK_IS_X11_DISPLAY() to find out which backend is in use:
 * 
 * ```c
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
 * ```
 */
public class DisplayManager extends org.gtk.gobject.Object {

    public DisplayManager(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DisplayManager */
    public static DisplayManager castFrom(org.gtk.gobject.Object gobject) {
        return new DisplayManager(gobject.getProxy());
    }
    
    /**
     * Gets the default `GdkDisplay`.
     */
    public Display getDefaultDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_manager_get_default_display(HANDLE());
        return new Display(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * List all currently open displays.
     */
    public org.gtk.glib.SList listDisplays() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_manager_list_displays(HANDLE());
        return new org.gtk.glib.SList(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Opens a display.
     */
    public Display openDisplay(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_manager_open_display(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return new Display(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets @display as the default display.
     */
    public void setDefaultDisplay(Display display) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_display_manager_set_default_display(HANDLE(), display.HANDLE());
    }
    
    @FunctionalInterface
    public interface DisplayOpenedHandler {
        void signalReceived(DisplayManager source, Display display);
    }
    
    /**
     * Emitted when a display is opened.
     */
    public void onDisplayOpened(DisplayOpenedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDisplayManagerDisplayOpened", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("display-opened").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
