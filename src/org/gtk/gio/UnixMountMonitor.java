package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Watches {@code GUnixMounts} for changes.
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mountpoints-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.class, "__signalUnixMountMonitorMountpointsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalUnixMountMonitorMountpointsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountpointsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mounts-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(UnixMountMonitor.class, "__signalUnixMountMonitorMountsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalUnixMountMonitorMountsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
    }
    
}
