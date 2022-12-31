package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetAddressMeta} can be used to store a network address (a {@link org.gtk.gio.SocketAddress})
 * in a {@link org.gstreamer.gst.Buffer} so that it network elements can track the to and from address
 * of the buffer.
 */
public class NetAddressMeta extends Struct {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetAddressMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.ADDRESS.withName("addr")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NetAddressMeta}
     * @return A new, uninitialized @{link NetAddressMeta}
     */
    public static NetAddressMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetAddressMeta newInstance = new NetAddressMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Get the value of the field {@code addr}
     * @return The value of the field {@code addr}
     */
    public org.gtk.gio.SocketAddress getAddr() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code addr}
     * @param addr The new value of the field {@code addr}
     */
    public void setAddr(org.gtk.gio.SocketAddress addr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addr == null ? MemoryAddress.NULL : addr.handle()));
    }
    
    /**
     * Create a NetAddressMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetAddressMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetAddressMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetAddressMeta(input, ownership);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_address_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_address_meta_get_info = Interop.downcallHandle(
            "gst_net_address_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link NetAddressMeta.Builder} object constructs a {@link NetAddressMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NetAddressMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NetAddressMeta struct;
        
        private Builder() {
            struct = NetAddressMeta.allocate();
        }
        
         /**
         * Finish building the {@link NetAddressMeta} struct.
         * @return A new instance of {@code NetAddressMeta} with the fields 
         *         that were set in the Builder object.
         */
        public NetAddressMeta build() {
            return struct;
        }
        
        /**
         * the parent type
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * a {@link org.gtk.gio.SocketAddress} stored as metadata
         * @param addr The value for the {@code addr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddr(org.gtk.gio.SocketAddress addr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addr == null ? MemoryAddress.NULL : addr.handle()));
            return this;
        }
    }
}
