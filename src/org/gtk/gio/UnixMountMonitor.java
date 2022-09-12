package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Watches #GUnixMounts for changes.
 */
public class UnixMountMonitor extends org.gtk.gobject.Object {

    public UnixMountMonitor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixMountMonitor */
    public static UnixMountMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new UnixMountMonitor(gobject.getReference());
    }
    
    /**
     * Gets the #GUnixMountMonitor for the current thread-default main
     * context.
     * 
     * The mount monitor can be used to monitor for changes to the list of
     * mounted filesystems as well as the list of mount points (ie: fstab
     * entries).
     * 
     * You must only call g_object_unref() on the return value from under
     * the same main context as you called this function.
     */
    public static UnixMountMonitor get() {
        var RESULT = gtk_h.g_unix_mount_monitor_get();
        return new UnixMountMonitor(References.get(RESULT, true));
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalUnixMountMonitorMountpointsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("mountpoints-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalUnixMountMonitorMountsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("mounts-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
