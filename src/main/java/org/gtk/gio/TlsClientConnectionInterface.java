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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsClientConnectionInterface newInstance = new TlsClientConnectionInterface(segment.address(), Ownership.NONE);
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
    public interface CopySessionStateCallback {
        void run(org.gtk.gio.TlsClientConnection conn, org.gtk.gio.TlsClientConnection source);

        @ApiStatus.Internal default void upcall(MemoryAddress conn, MemoryAddress source) {
            run((org.gtk.gio.TlsClientConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.TlsClientConnection.fromAddress).marshal(conn, Ownership.NONE), (org.gtk.gio.TlsClientConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gtk.gio.TlsClientConnection.fromAddress).marshal(source, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopySessionStateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_session_state}
     * @param copySessionState The new value of the field {@code copy_session_state}
     */
    public void setCopySessionState(CopySessionStateCallback copySessionState) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copySessionState == null ? MemoryAddress.NULL : copySessionState.toCallback()));
    }
    
    /**
     * Create a TlsClientConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsClientConnectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsClientConnectionInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsClientConnectionInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setCopySessionState(CopySessionStateCallback copySessionState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copySessionState == null ? MemoryAddress.NULL : copySessionState.toCallback()));
            return this;
        }
    }
}
