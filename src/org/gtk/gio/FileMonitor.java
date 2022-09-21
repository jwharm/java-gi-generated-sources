package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

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

    public FileMonitor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileMonitor */
    public static FileMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new FileMonitor(gobject.getReference());
    }
    
    /**
     * Cancels a file monitor.
     */
    public boolean cancel() {
        var RESULT = gtk_h.g_file_monitor_cancel(handle());
        return (RESULT != 0);
    }
    
    /**
     * Emits the {@link FileMonitor}::changed signal if a change
     * has taken place. Should be called from file monitor
     * implementations only.
     * <p>
     * Implementations are responsible to call this method from the
     * [thread-default main context][g-main-context-push-thread-default] of the
     * thread that the monitor was created in.
     */
    public void emitEvent(File child, File otherFile, FileMonitorEvent eventType) {
        gtk_h.g_file_monitor_emit_event(handle(), child.handle(), otherFile.handle(), eventType.getValue());
    }
    
    /**
     * Returns whether the monitor is canceled.
     */
    public boolean isCancelled() {
        var RESULT = gtk_h.g_file_monitor_is_cancelled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the rate limit to which the {@code monitor} will report
     * consecutive change events to the same file.
     */
    public void setRateLimit(int limitMsecs) {
        gtk_h.g_file_monitor_set_rate_limit(handle(), limitMsecs);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(FileMonitor source, File file, File otherFile, FileMonitorEvent eventType);
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
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileMonitorChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
