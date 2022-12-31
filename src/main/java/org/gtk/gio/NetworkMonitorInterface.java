package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link NetworkMonitor}.
 * @version 2.32
 */
public class NetworkMonitorInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkMonitorInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("network_changed"),
            Interop.valueLayout.ADDRESS.withName("can_reach"),
            Interop.valueLayout.ADDRESS.withName("can_reach_async"),
            Interop.valueLayout.ADDRESS.withName("can_reach_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NetworkMonitorInterface}
     * @return A new, uninitialized @{link NetworkMonitorInterface}
     */
    public static NetworkMonitorInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetworkMonitorInterface newInstance = new NetworkMonitorInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface NetworkChangedCallback {
        void run(org.gtk.gio.NetworkMonitor monitor, boolean networkAvailable);

        @ApiStatus.Internal default void upcall(MemoryAddress monitor, int networkAvailable) {
            run((org.gtk.gio.NetworkMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(monitor)), org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, Ownership.NONE), Marshal.integerToBoolean.marshal(networkAvailable, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NetworkChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code network_changed}
     * @param networkChanged The new value of the field {@code network_changed}
     */
    public void setNetworkChanged(NetworkChangedCallback networkChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (networkChanged == null ? MemoryAddress.NULL : networkChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanReachCallback {
        boolean run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress monitor, MemoryAddress connectable, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.NetworkMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(monitor)), org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, Ownership.NONE), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connectable)), org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanReachCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach}
     * @param canReach The new value of the field {@code can_reach}
     */
    public void setCanReach(CanReachCallback canReach) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_reach"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReach == null ? MemoryAddress.NULL : canReach.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanReachAsyncCallback {
        void run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress monitor, MemoryAddress connectable, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.NetworkMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(monitor)), org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, Ownership.NONE), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connectable)), org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanReachAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach_async}
     * @param canReachAsync The new value of the field {@code can_reach_async}
     */
    public void setCanReachAsync(CanReachAsyncCallback canReachAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReachAsync == null ? MemoryAddress.NULL : canReachAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanReachFinishCallback {
        boolean run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress monitor, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.NetworkMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(monitor)), org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanReachFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach_finish}
     * @param canReachFinish The new value of the field {@code can_reach_finish}
     */
    public void setCanReachFinish(CanReachFinishCallback canReachFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReachFinish == null ? MemoryAddress.NULL : canReachFinish.toCallback()));
    }
    
    /**
     * Create a NetworkMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetworkMonitorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetworkMonitorInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetworkMonitorInterface(input, ownership);
    
    /**
     * A {@link NetworkMonitorInterface.Builder} object constructs a {@link NetworkMonitorInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NetworkMonitorInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NetworkMonitorInterface struct;
        
        private Builder() {
            struct = NetworkMonitorInterface.allocate();
        }
        
         /**
         * Finish building the {@link NetworkMonitorInterface} struct.
         * @return A new instance of {@code NetworkMonitorInterface} with the fields 
         *         that were set in the Builder object.
         */
        public NetworkMonitorInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setNetworkChanged(NetworkChangedCallback networkChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (networkChanged == null ? MemoryAddress.NULL : networkChanged.toCallback()));
            return this;
        }
        
        public Builder setCanReach(CanReachCallback canReach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReach == null ? MemoryAddress.NULL : canReach.toCallback()));
            return this;
        }
        
        public Builder setCanReachAsync(CanReachAsyncCallback canReachAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReachAsync == null ? MemoryAddress.NULL : canReachAsync.toCallback()));
            return this;
        }
        
        public Builder setCanReachFinish(CanReachFinishCallback canReachFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canReachFinish == null ? MemoryAddress.NULL : canReachFinish.toCallback()));
            return this;
        }
    }
}
