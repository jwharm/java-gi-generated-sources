package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Watches {@code GUnixMounts} for changes.
 */
public class UnixMountMonitor extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixMountMonitor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a UnixMountMonitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UnixMountMonitor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixMountMonitor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UnixMountMonitor(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_monitor_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Deprecated alias for g_unix_mount_monitor_get().
     * <p>
     * This function was never a true constructor, which is why it was
     * renamed.
     * @deprecated Use g_unix_mount_monitor_get() instead.
     */
    @Deprecated
    public UnixMountMonitor() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * This function does nothing.
     * <p>
     * Before 2.44, this was a partially-effective way of controlling the
     * rate at which events would be reported under some uncommon
     * circumstances.  Since {@code mount_monitor} is a singleton, it also meant
     * that calling this function would have side effects for other users of
     * the monitor.
     * @param limitMsec a integer with the limit in milliseconds to
     *     poll for changes.
     * @deprecated This function does nothing.  Don't call it.
     */
    @Deprecated
    public void setRateLimit(int limitMsec) {
        try {
            DowncallHandles.g_unix_mount_monitor_set_rate_limit.invokeExact(
                    handle(),
                    limitMsec);
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
            RESULT = (long) DowncallHandles.g_unix_mount_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link UnixMountMonitor} for the current thread-default main
     * context.
     * <p>
     * The mount monitor can be used to monitor for changes to the list of
     * mounted filesystems as well as the list of mount points (ie: fstab
     * entries).
     * <p>
     * You must only call g_object_unref() on the return value from under
     * the same main context as you called this function.
     * @return the {@link UnixMountMonitor}.
     */
    public static org.gtk.gio.UnixMountMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.UnixMountMonitor) Interop.register(RESULT, org.gtk.gio.UnixMountMonitor.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Functional interface declaration of the {@code MountpointsChanged} callback.
     */
    @FunctionalInterface
    public interface MountpointsChanged {
    
        /**
         * Emitted when the unix mount points have changed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceUnixMountMonitor) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountpointsChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the unix mount points have changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<UnixMountMonitor.MountpointsChanged> onMountpointsChanged(UnixMountMonitor.MountpointsChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mountpoints-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountsChanged} callback.
     */
    @FunctionalInterface
    public interface MountsChanged {
    
        /**
         * Emitted when the unix mounts have changed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceUnixMountMonitor) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountsChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the unix mounts have changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<UnixMountMonitor.MountsChanged> onMountsChanged(UnixMountMonitor.MountsChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mounts-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link UnixMountMonitor.Builder} object constructs a {@link UnixMountMonitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link UnixMountMonitor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link UnixMountMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixMountMonitor}.
         * @return A new instance of {@code UnixMountMonitor} with the properties 
         *         that were set in the Builder object.
         */
        public UnixMountMonitor build() {
            return (UnixMountMonitor) org.gtk.gobject.GObject.newWithProperties(
                UnixMountMonitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_mount_monitor_new = Interop.downcallHandle(
                "g_unix_mount_monitor_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_mount_monitor_set_rate_limit = Interop.downcallHandle(
                "g_unix_mount_monitor_set_rate_limit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_unix_mount_monitor_get_type = Interop.downcallHandle(
                "g_unix_mount_monitor_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_unix_mount_monitor_get = Interop.downcallHandle(
                "g_unix_mount_monitor_get",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_unix_mount_monitor_get_type != null;
    }
}
