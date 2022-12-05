package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Watches {@code GUnixMounts} for changes.
 */
public class UnixMountMonitor extends org.gtk.gobject.Object {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnixMountMonitor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to UnixMountMonitor if its GType is a (or inherits from) "GUnixMountMonitor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code UnixMountMonitor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixMountMonitor", a ClassCastException will be thrown.
     */
    public static UnixMountMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), UnixMountMonitor.getType())) {
            return new UnixMountMonitor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixMountMonitor");
        }
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
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.UnixMountMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.UnixMountMonitor(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface MountpointsChanged {
        void signalReceived(UnixMountMonitor sourceUnixMountMonitor);
    }
    
    /**
     * Emitted when the unix mount points have changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<UnixMountMonitor.MountpointsChanged> onMountpointsChanged(UnixMountMonitor.MountpointsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mountpoints-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.Callbacks.class, "signalUnixMountMonitorMountpointsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<UnixMountMonitor.MountpointsChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountsChanged {
        void signalReceived(UnixMountMonitor sourceUnixMountMonitor);
    }
    
    /**
     * Emitted when the unix mounts have changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<UnixMountMonitor.MountsChanged> onMountsChanged(UnixMountMonitor.MountsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mounts-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.Callbacks.class, "signalUnixMountMonitorMountsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<UnixMountMonitor.MountsChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link UnixMountMonitor.Build} object constructs a {@link UnixMountMonitor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link UnixMountMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixMountMonitor} using {@link UnixMountMonitor#castFrom}.
         * @return A new instance of {@code UnixMountMonitor} with the properties 
         *         that were set in the Build object.
         */
        public UnixMountMonitor construct() {
            return UnixMountMonitor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    UnixMountMonitor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalUnixMountMonitorMountpointsChanged(MemoryAddress sourceUnixMountMonitor, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (UnixMountMonitor.MountpointsChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new UnixMountMonitor(sourceUnixMountMonitor, Ownership.NONE));
        }
        
        public static void signalUnixMountMonitorMountsChanged(MemoryAddress sourceUnixMountMonitor, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (UnixMountMonitor.MountsChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new UnixMountMonitor(sourceUnixMountMonitor, Ownership.NONE));
        }
    }
}
