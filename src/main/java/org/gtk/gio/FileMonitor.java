package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Monitors a file or directory for changes.
 * <p>
 * To obtain a {@link FileMonitor} for a file or directory, use
 * g_file_monitor(), g_file_monitor_file(), or
 * g_file_monitor_directory().
 * <p>
 * To get informed about changes to the file or directory you are
 * monitoring, connect to the {@link FileMonitor}::changed signal. The
 * signal will be emitted in the
 * [thread-default main context][g-main-context-push-thread-default]
 * of the thread that the monitor was created in
 * (though if the global default main context is blocked, this may
 * cause notifications to be blocked even if the thread-default
 * context is still running).
 */
public class FileMonitor extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileMonitor";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public FileMonitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FileMonitor if its GType is a (or inherits from) "GFileMonitor".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FileMonitor" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFileMonitor", a ClassCastException will be thrown.
     */
    public static FileMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFileMonitor"))) {
            return new FileMonitor(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFileMonitor");
        }
    }
    
    /**
     * Cancels a file monitor.
     * @return always {@code true}
     */
    public boolean cancel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_monitor_cancel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Emits the {@link FileMonitor}::changed signal if a change
     * has taken place. Should be called from file monitor
     * implementations only.
     * <p>
     * Implementations are responsible to call this method from the
     * [thread-default main context][g-main-context-push-thread-default] of the
     * thread that the monitor was created in.
     * @param child a {@link File}.
     * @param otherFile a {@link File}.
     * @param eventType a set of {@link FileMonitorEvent} flags.
     */
    public void emitEvent(@NotNull org.gtk.gio.File child, @NotNull org.gtk.gio.File otherFile, @NotNull org.gtk.gio.FileMonitorEvent eventType) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(otherFile, "Parameter 'otherFile' must not be null");
        java.util.Objects.requireNonNull(eventType, "Parameter 'eventType' must not be null");
        try {
            DowncallHandles.g_file_monitor_emit_event.invokeExact(
                    handle(),
                    child.handle(),
                    otherFile.handle(),
                    eventType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the monitor is canceled.
     * @return {@code true} if monitor is canceled. {@code false} otherwise.
     */
    public boolean isCancelled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_monitor_is_cancelled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the rate limit to which the {@code monitor} will report
     * consecutive change events to the same file.
     * @param limitMsecs a non-negative integer with the limit in milliseconds
     *     to poll for changes
     */
    public void setRateLimit(int limitMsecs) {
        try {
            DowncallHandles.g_file_monitor_set_rate_limit.invokeExact(
                    handle(),
                    limitMsecs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(FileMonitor source, @NotNull org.gtk.gio.File file, @Nullable org.gtk.gio.File otherFile, @NotNull org.gtk.gio.FileMonitorEvent eventType);
    }
    
    /**
     * Emitted when {@code file} has been changed.
     * <p>
     * If using {@link FileMonitorFlags#WATCH_MOVES} on a directory monitor, and
     * the information is available (and if supported by the backend),
     * {@code event_type} may be {@link FileMonitorEvent#RENAMED},
     * {@link FileMonitorEvent#MOVED_IN} or {@link FileMonitorEvent#MOVED_OUT}.
     * <p>
     * In all cases {@code file} will be a child of the monitored directory.  For
     * renames, {@code file} will be the old name and {@code other_file} is the new
     * name.  For "moved in" events, {@code file} is the name of the file that
     * appeared and {@code other_file} is the old name that it was moved from (in
     * another directory).  For "moved out" events, {@code file} is the name of
     * the file that used to be in this directory and {@code other_file} is the
     * name of the file at its new location.
     * <p>
     * It makes sense to treat {@link FileMonitorEvent#MOVED_IN} as
     * equivalent to {@link FileMonitorEvent#CREATED} and
     * {@link FileMonitorEvent#MOVED_OUT} as equivalent to
     * {@link FileMonitorEvent#DELETED}, with extra information.
     * {@link FileMonitorEvent#RENAMED} is equivalent to a delete/create
     * pair.  This is exactly how the events will be reported in the case
     * that the {@link FileMonitorFlags#WATCH_MOVES} flag is not in use.
     * <p>
     * If using the deprecated flag {@link FileMonitorFlags#SEND_MOVED} flag and {@code event_type} is
     * {@link FileMonitorEvent#MOVED}, {@code file} will be set to a {@link File} containing the
     * old path, and {@code other_file} will be set to a {@link File} containing the new path.
     * <p>
     * In all the other cases, {@code other_file} will be set to {@code NULL}.
     */
    public Signal<FileMonitor.Changed> onChanged(FileMonitor.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileMonitor.Callbacks.class, "signalFileMonitorChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileMonitor.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_monitor_cancel = Interop.downcallHandle(
            "g_file_monitor_cancel",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_monitor_emit_event = Interop.downcallHandle(
            "g_file_monitor_emit_event",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_file_monitor_is_cancelled = Interop.downcallHandle(
            "g_file_monitor_is_cancelled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_monitor_set_rate_limit = Interop.downcallHandle(
            "g_file_monitor_set_rate_limit",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalFileMonitorChanged(MemoryAddress source, MemoryAddress file, MemoryAddress otherFile, int eventType, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileMonitor.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileMonitor(Refcounted.get(source)), new org.gtk.gio.File.FileImpl(Refcounted.get(file, false)), new org.gtk.gio.File.FileImpl(Refcounted.get(otherFile, false)), new org.gtk.gio.FileMonitorEvent(eventType));
        }
    }
}
