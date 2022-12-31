package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AppInfoMonitor} is a very simple object used for monitoring the app
 * info database for changes (ie: newly installed or removed
 * applications).
 * <p>
 * Call g_app_info_monitor_get() to get a {@link AppInfoMonitor} and connect
 * to the "changed" signal.
 * <p>
 * In the usual case, applications should try to make note of the change
 * (doing things like invalidating caches) but not act on it.  In
 * particular, applications should avoid making calls to {@link AppInfo} APIs
 * in response to the change signal, deferring these until the time that
 * the data is actually required.  The exception to this case is when
 * application information is actually being displayed on the screen
 * (eg: during a search or when the list of all applications is shown).
 * The reason for this is that changes to the list of installed
 * applications often come in groups (like during system updates) and
 * rescanning the list on every change is pointless and expensive.
 * @version 2.40
 */
public class AppInfoMonitor extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppInfoMonitor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AppInfoMonitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppInfoMonitor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppInfoMonitor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppInfoMonitor(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_app_info_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link AppInfoMonitor} for the current thread-default main
     * context.
     * <p>
     * The {@link AppInfoMonitor} will emit a "changed" signal in the
     * thread-default main context whenever the list of installed
     * applications (as reported by g_app_info_get_all()) may have changed.
     * <p>
     * You must only call g_object_unref() on the return value from under
     * the same main context as you created it.
     * @return a reference to a {@link AppInfoMonitor}
     */
    public static org.gtk.gio.AppInfoMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_info_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.AppInfoMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.AppInfoMonitor.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface Changed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppInfoMonitor) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signal emitted when the app info database for changes (ie: newly installed
     * or removed applications).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppInfoMonitor.Changed> onChanged(AppInfoMonitor.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppInfoMonitor.Builder} object constructs a {@link AppInfoMonitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppInfoMonitor.Builder#build()}. 
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
         * Finish building the {@link AppInfoMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppInfoMonitor}.
         * @return A new instance of {@code AppInfoMonitor} with the properties 
         *         that were set in the Builder object.
         */
        public AppInfoMonitor build() {
            return (AppInfoMonitor) org.gtk.gobject.GObject.newWithProperties(
                AppInfoMonitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_app_info_monitor_get_type = Interop.downcallHandle(
            "g_app_info_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_app_info_monitor_get = Interop.downcallHandle(
            "g_app_info_monitor_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
