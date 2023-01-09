package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for handling proxy connection and payload.
 * @version 2.26
 */
public class ProxyInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("connect"),
            Interop.valueLayout.ADDRESS.withName("connect_async"),
            Interop.valueLayout.ADDRESS.withName("connect_finish"),
            Interop.valueLayout.ADDRESS.withName("supports_hostname")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ProxyInterface}
     * @return A new, uninitialized @{link ProxyInterface}
     */
    public static ProxyInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ProxyInterface newInstance = new ProxyInterface(segment.address());
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
     * Functional interface declaration of the {@code ConnectCallback} callback.
     */
    @FunctionalInterface
    public interface ConnectCallback {
    
        org.gtk.gio.IOStream run(org.gtk.gio.Proxy proxy, org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress proxy, MemoryAddress connection, MemoryAddress proxyAddress, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Proxy) Interop.register(proxy, org.gtk.gio.Proxy.fromAddress).marshal(proxy, null), (org.gtk.gio.IOStream) Interop.register(connection, org.gtk.gio.IOStream.fromAddress).marshal(connection, null), (org.gtk.gio.ProxyAddress) Interop.register(proxyAddress, org.gtk.gio.ProxyAddress.fromAddress).marshal(proxyAddress, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConnectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect}
     * @param connect The new value of the field {@code connect}
     */
    public void setConnect(ConnectCallback connect) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connect == null ? MemoryAddress.NULL : connect.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConnectAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ConnectAsyncCallback {
    
        void run(org.gtk.gio.Proxy proxy, org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress connection, MemoryAddress proxyAddress, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Proxy) Interop.register(proxy, org.gtk.gio.Proxy.fromAddress).marshal(proxy, null), (org.gtk.gio.IOStream) Interop.register(connection, org.gtk.gio.IOStream.fromAddress).marshal(connection, null), (org.gtk.gio.ProxyAddress) Interop.register(proxyAddress, org.gtk.gio.ProxyAddress.fromAddress).marshal(proxyAddress, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConnectAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect_async}
     * @param connectAsync The new value of the field {@code connect_async}
     */
    public void setConnectAsync(ConnectAsyncCallback connectAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connectAsync == null ? MemoryAddress.NULL : connectAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConnectFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ConnectFinishCallback {
    
        org.gtk.gio.IOStream run(org.gtk.gio.Proxy proxy, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress proxy, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Proxy) Interop.register(proxy, org.gtk.gio.Proxy.fromAddress).marshal(proxy, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConnectFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect_finish}
     * @param connectFinish The new value of the field {@code connect_finish}
     */
    public void setConnectFinish(ConnectFinishCallback connectFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connectFinish == null ? MemoryAddress.NULL : connectFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SupportsHostnameCallback} callback.
     */
    @FunctionalInterface
    public interface SupportsHostnameCallback {
    
        boolean run(org.gtk.gio.Proxy proxy);
        
        @ApiStatus.Internal default int upcall(MemoryAddress proxy) {
            var RESULT = run((org.gtk.gio.Proxy) Interop.register(proxy, org.gtk.gio.Proxy.fromAddress).marshal(proxy, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SupportsHostnameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_hostname}
     * @param supportsHostname The new value of the field {@code supports_hostname}
     */
    public void setSupportsHostname(SupportsHostnameCallback supportsHostname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsHostname == null ? MemoryAddress.NULL : supportsHostname.toCallback()));
        }
    }
    
    /**
     * Create a ProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ProxyInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyInterface(input);
    
    /**
     * A {@link ProxyInterface.Builder} object constructs a {@link ProxyInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ProxyInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ProxyInterface struct;
        
        private Builder() {
            struct = ProxyInterface.allocate();
        }
        
        /**
         * Finish building the {@link ProxyInterface} struct.
         * @return A new instance of {@code ProxyInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ProxyInterface build() {
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
        
        public Builder setConnect(ConnectCallback connect) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("connect"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connect == null ? MemoryAddress.NULL : connect.toCallback()));
                return this;
            }
        }
        
        public Builder setConnectAsync(ConnectAsyncCallback connectAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("connect_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connectAsync == null ? MemoryAddress.NULL : connectAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setConnectFinish(ConnectFinishCallback connectFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("connect_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connectFinish == null ? MemoryAddress.NULL : connectFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setSupportsHostname(SupportsHostnameCallback supportsHostname) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsHostname == null ? MemoryAddress.NULL : supportsHostname.toCallback()));
                return this;
            }
        }
    }
}
