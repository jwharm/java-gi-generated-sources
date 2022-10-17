package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Watches {@code GUnixMounts} for changes.
 */
public class UnixMountMonitor extends org.gtk.gobject.Object {

    public UnixMountMonitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixMountMonitor */
    public static UnixMountMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new UnixMountMonitor(gobject.refcounted());
    }
    
    private static final MethodHandle g_unix_mount_monitor_get = Interop.downcallHandle(
        "g_unix_mount_monitor_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
     */
    public static @NotNull UnixMountMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnixMountMonitor(Refcounted.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface MountpointsChangedHandler {
        void signalReceived(UnixMountMonitor source);
    }
    
    /**
     * Emitted when the unix mount points have changed.
     */
    public SignalHandle onMountpointsChanged(MountpointsChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mountpoints-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.Callbacks.class, "signalUnixMountMonitorMountpointsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountsChangedHandler {
        void signalReceived(UnixMountMonitor source);
    }
    
    /**
     * Emitted when the unix mounts have changed.
     */
    public SignalHandle onMountsChanged(MountsChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mounts-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.Callbacks.class, "signalUnixMountMonitorMountsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalUnixMountMonitorMountpointsChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (UnixMountMonitor.MountpointsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new UnixMountMonitor(Refcounted.get(source)));
        }
        
        public static void signalUnixMountMonitorMountsChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (UnixMountMonitor.MountsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new UnixMountMonitor(Refcounted.get(source)));
        }
        
    }
}
