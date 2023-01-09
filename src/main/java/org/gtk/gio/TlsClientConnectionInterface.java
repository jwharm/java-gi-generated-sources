package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * vtable for a {@link TlsClientConnection} implementation.
 * @version 2.26
 */
public class TlsClientConnectionInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsClientConnectionInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("copy_session_state")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsClientConnectionInterface}
     * @return A new, uninitialized @{link TlsClientConnectionInterface}
     */
    public static TlsClientConnectionInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsClientConnectionInterface newInstance = new TlsClientConnectionInterface(segment.address());
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
     * Functional interface declaration of the {@code CopySessionStateCallback} callback.
     */
    @FunctionalInterface
    public interface CopySessionStateCallback {
    
        void run(org.gtk.gio.TlsClientConnection conn, org.gtk.gio.TlsClientConnection source);
        
        @ApiStatus.Internal default void upcall(MemoryAddress conn, MemoryAddress source) {
            run((org.gtk.gio.TlsClientConnection) Interop.register(conn, org.gtk.gio.TlsClientConnection.fromAddress).marshal(conn, null), (org.gtk.gio.TlsClientConnection) Interop.register(source, org.gtk.gio.TlsClientConnection.fromAddress).marshal(source, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopySessionStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_session_state}
     * @param copySessionState The new value of the field {@code copy_session_state}
     */
    public void setCopySessionState(CopySessionStateCallback copySessionState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copySessionState == null ? MemoryAddress.NULL : copySessionState.toCallback()));
        }
    }
    
    /**
     * Create a TlsClientConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsClientConnectionInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsClientConnectionInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsClientConnectionInterface(input);
    
    /**
     * A {@link TlsClientConnectionInterface.Builder} object constructs a {@link TlsClientConnectionInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsClientConnectionInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsClientConnectionInterface struct;
        
        private Builder() {
            struct = TlsClientConnectionInterface.allocate();
        }
        
        /**
         * Finish building the {@link TlsClientConnectionInterface} struct.
         * @return A new instance of {@code TlsClientConnectionInterface} with the fields 
         *         that were set in the Builder object.
         */
        public TlsClientConnectionInterface build() {
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
        
        public Builder setCopySessionState(CopySessionStateCallback copySessionState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copySessionState == null ? MemoryAddress.NULL : copySessionState.toCallback()));
                return this;
            }
        }
    }
}
