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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProxyInterface newInstance = new ProxyInterface(segment.address(), Ownership.NONE);
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
    public interface ConnectCallback {
        org.gtk.gio.IOStream run(org.gtk.gio.Proxy proxy, org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress proxy, MemoryAddress connection, MemoryAddress proxyAddress, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Proxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.Proxy.fromAddress).marshal(proxy, Ownership.NONE), (org.gtk.gio.IOStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.IOStream.fromAddress).marshal(connection, Ownership.NONE), (org.gtk.gio.ProxyAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxyAddress)), org.gtk.gio.ProxyAddress.fromAddress).marshal(proxyAddress, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConnectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect}
     * @param connect The new value of the field {@code connect}
     */
    public void setConnect(ConnectCallback connect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("connect"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connect == null ? MemoryAddress.NULL : connect.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConnectAsyncCallback {
        void run(org.gtk.gio.Proxy proxy, org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress proxy, MemoryAddress connection, MemoryAddress proxyAddress, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Proxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.Proxy.fromAddress).marshal(proxy, Ownership.NONE), (org.gtk.gio.IOStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.IOStream.fromAddress).marshal(connection, Ownership.NONE), (org.gtk.gio.ProxyAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxyAddress)), org.gtk.gio.ProxyAddress.fromAddress).marshal(proxyAddress, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConnectAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect_async}
     * @param connectAsync The new value of the field {@code connect_async}
     */
    public void setConnectAsync(ConnectAsyncCallback connectAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("connect_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connectAsync == null ? MemoryAddress.NULL : connectAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConnectFinishCallback {
        org.gtk.gio.IOStream run(org.gtk.gio.Proxy proxy, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress proxy, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Proxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.Proxy.fromAddress).marshal(proxy, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConnectFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code connect_finish}
     * @param connectFinish The new value of the field {@code connect_finish}
     */
    public void setConnectFinish(ConnectFinishCallback connectFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("connect_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connectFinish == null ? MemoryAddress.NULL : connectFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface SupportsHostnameCallback {
        boolean run(org.gtk.gio.Proxy proxy);

        @ApiStatus.Internal default int upcall(MemoryAddress proxy) {
            var RESULT = run((org.gtk.gio.Proxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(proxy)), org.gtk.gio.Proxy.fromAddress).marshal(proxy, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SupportsHostnameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_hostname}
     * @param supportsHostname The new value of the field {@code supports_hostname}
     */
    public void setSupportsHostname(SupportsHostnameCallback supportsHostname) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsHostname == null ? MemoryAddress.NULL : supportsHostname.toCallback()));
    }
    
    /**
     * Create a ProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ProxyInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ProxyInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setConnect(ConnectCallback connect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connect == null ? MemoryAddress.NULL : connect.toCallback()));
            return this;
        }
        
        public Builder setConnectAsync(ConnectAsyncCallback connectAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connectAsync == null ? MemoryAddress.NULL : connectAsync.toCallback()));
            return this;
        }
        
        public Builder setConnectFinish(ConnectFinishCallback connectFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connectFinish == null ? MemoryAddress.NULL : connectFinish.toCallback()));
            return this;
        }
        
        public Builder setSupportsHostname(SupportsHostnameCallback supportsHostname) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsHostname == null ? MemoryAddress.NULL : supportsHostname.toCallback()));
            return this;
        }
    }
}
