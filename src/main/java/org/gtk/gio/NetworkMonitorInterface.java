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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        NetworkMonitorInterface newInstance = new NetworkMonitorInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NetworkChangedCallback} callback.
     */
    @FunctionalInterface
    public interface NetworkChangedCallback {
    
        void run(org.gtk.gio.NetworkMonitor monitor, boolean networkAvailable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress monitor, int networkAvailable) {
            run((org.gtk.gio.NetworkMonitor) Interop.register(monitor, org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, null), Marshal.integerToBoolean.marshal(networkAvailable, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NetworkChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code network_changed}
     * @param networkChanged The new value of the field {@code network_changed}
     */
    public void setNetworkChanged(NetworkChangedCallback networkChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (networkChanged == null ? MemoryAddress.NULL : networkChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanReachCallback} callback.
     */
    @FunctionalInterface
    public interface CanReachCallback {
    
        boolean run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress monitor, MemoryAddress connectable, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.NetworkMonitor) Interop.register(monitor, org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, null), (org.gtk.gio.SocketConnectable) Interop.register(connectable, org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanReachCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach}
     * @param canReach The new value of the field {@code can_reach}
     */
    public void setCanReach(CanReachCallback canReach) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReach == null ? MemoryAddress.NULL : canReach.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanReachAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface CanReachAsyncCallback {
    
        void run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.SocketConnectable connectable, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress monitor, MemoryAddress connectable, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.NetworkMonitor) Interop.register(monitor, org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, null), (org.gtk.gio.SocketConnectable) Interop.register(connectable, org.gtk.gio.SocketConnectable.fromAddress).marshal(connectable, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanReachAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach_async}
     * @param canReachAsync The new value of the field {@code can_reach_async}
     */
    public void setCanReachAsync(CanReachAsyncCallback canReachAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReachAsync == null ? MemoryAddress.NULL : canReachAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanReachFinishCallback} callback.
     */
    @FunctionalInterface
    public interface CanReachFinishCallback {
    
        boolean run(org.gtk.gio.NetworkMonitor monitor, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress monitor, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.NetworkMonitor) Interop.register(monitor, org.gtk.gio.NetworkMonitor.fromAddress).marshal(monitor, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanReachFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_reach_finish}
     * @param canReachFinish The new value of the field {@code can_reach_finish}
     */
    public void setCanReachFinish(CanReachFinishCallback canReachFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReachFinish == null ? MemoryAddress.NULL : canReachFinish.toCallback()));
        }
    }
    
    /**
     * Create a NetworkMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NetworkMonitorInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetworkMonitorInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NetworkMonitorInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setNetworkChanged(NetworkChangedCallback networkChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("network_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (networkChanged == null ? MemoryAddress.NULL : networkChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setCanReach(CanReachCallback canReach) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_reach"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReach == null ? MemoryAddress.NULL : canReach.toCallback()));
                return this;
            }
        }
        
        public Builder setCanReachAsync(CanReachAsyncCallback canReachAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReachAsync == null ? MemoryAddress.NULL : canReachAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setCanReachFinish(CanReachFinishCallback canReachFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canReachFinish == null ? MemoryAddress.NULL : canReachFinish.toCallback()));
                return this;
            }
        }
    }
}
