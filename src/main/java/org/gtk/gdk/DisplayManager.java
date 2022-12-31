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
public class DisplayManager extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDisplayManager";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DisplayManager proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DisplayManager(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DisplayManager> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DisplayManager(input, ownership);
    
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
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * List all currently open displays.
     * @return a newly
     *   allocated {@code GSList} of {@code GdkDisplay} objects
     */
    public org.gtk.glib.SList listDisplays() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_list_displays.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Opens a display.
     * @param name the name of the display to open
     * @return a {@code GdkDisplay}, or {@code null}
     *   if the display could not be opened
     */
    public @Nullable org.gtk.gdk.Display openDisplay(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_open_display.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets {@code display} as the default display.
     * @param display a {@code GdkDisplay}
     */
    public void setDefaultDisplay(org.gtk.gdk.Display display) {
        try {
            DowncallHandles.gdk_display_manager_set_default_display.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_display_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    public static org.gtk.gdk.DisplayManager get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_display_manager_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.DisplayManager) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.DisplayManager.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface DisplayOpened {
        void run(org.gtk.gdk.Display display);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDisplayManager, MemoryAddress display) {
            run((org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(display)), org.gtk.gdk.Display.fromAddress).marshal(display, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DisplayOpened.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a display is opened.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DisplayManager.DisplayOpened> onDisplayOpened(DisplayManager.DisplayOpened handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("display-opened"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DisplayManager.Builder} object constructs a {@link DisplayManager} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DisplayManager.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DisplayManager} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DisplayManager}.
         * @return A new instance of {@code DisplayManager} with the properties 
         *         that were set in the Builder object.
         */
        public DisplayManager build() {
            return (DisplayManager) org.gtk.gobject.GObject.newWithProperties(
                DisplayManager.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The default display.
         * @param defaultDisplay The value for the {@code default-display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultDisplay(org.gtk.gdk.Display defaultDisplay) {
            names.add("default-display");
            values.add(org.gtk.gobject.Value.create(defaultDisplay));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_display_manager_get_default_display = Interop.downcallHandle(
            "gdk_display_manager_get_default_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_display_manager_list_displays = Interop.downcallHandle(
            "gdk_display_manager_list_displays",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_display_manager_open_display = Interop.downcallHandle(
            "gdk_display_manager_open_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_display_manager_set_default_display = Interop.downcallHandle(
            "gdk_display_manager_set_default_display",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_display_manager_get_type = Interop.downcallHandle(
            "gdk_display_manager_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_display_manager_get = Interop.downcallHandle(
            "gdk_display_manager_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
