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
public class FileMonitor extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileMonitor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FileMonitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileMonitor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileMonitor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileMonitor(input, ownership);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public void emitEvent(org.gtk.gio.File child, org.gtk.gio.File otherFile, org.gtk.gio.FileMonitorEvent eventType) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void run(org.gtk.gio.File file, @Nullable org.gtk.gio.File otherFile, org.gtk.gio.FileMonitorEvent eventType);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileMonitor, MemoryAddress file, MemoryAddress otherFile, int eventType) {
            run((org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(file)), org.gtk.gio.File.fromAddress).marshal(file, Ownership.NONE), (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(otherFile)), org.gtk.gio.File.fromAddress).marshal(otherFile, Ownership.NONE), org.gtk.gio.FileMonitorEvent.of(eventType));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileMonitor.Changed> onChanged(FileMonitor.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FileMonitor.Builder} object constructs a {@link FileMonitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileMonitor.Builder#build()}. 
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
         * Finish building the {@link FileMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileMonitor}.
         * @return A new instance of {@code FileMonitor} with the properties 
         *         that were set in the Builder object.
         */
        public FileMonitor build() {
            return (FileMonitor) org.gtk.gobject.GObject.newWithProperties(
                FileMonitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCancelled(boolean cancelled) {
            names.add("cancelled");
            values.add(org.gtk.gobject.Value.create(cancelled));
            return this;
        }
        
        public Builder setRateLimit(int rateLimit) {
            names.add("rate-limit");
            values.add(org.gtk.gobject.Value.create(rateLimit));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_monitor_cancel = Interop.downcallHandle(
            "g_file_monitor_cancel",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_monitor_emit_event = Interop.downcallHandle(
            "g_file_monitor_emit_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_monitor_is_cancelled = Interop.downcallHandle(
            "g_file_monitor_is_cancelled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_monitor_set_rate_limit = Interop.downcallHandle(
            "g_file_monitor_set_rate_limit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_monitor_get_type = Interop.downcallHandle(
            "g_file_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
