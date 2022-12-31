package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetControlMessageMeta} can be used to store control messages (ancillary
 * data) which was received with or is to be sent alongside the buffer data.
 * When used with socket sinks and sources which understand this meta it allows
 * sending and receiving ancillary data such as unix credentials (See
 * {@link org.gtk.gio.UnixCredentialsMessage}) and Unix file descriptions (See {@link org.gtk.gio.UnixFDMessage}).
 */
public class NetControlMessageMeta extends Struct {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetControlMessageMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.ADDRESS.withName("message")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NetControlMessageMeta}
     * @return A new, uninitialized @{link NetControlMessageMeta}
     */
    public static NetControlMessageMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetControlMessageMeta newInstance = new NetControlMessageMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code message}
     * @return The value of the field {@code message}
     */
    public org.gtk.gio.SocketControlMessage getMessage() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gtk.gio.SocketControlMessage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketControlMessage.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code message}
     * @param message The new value of the field {@code message}
     */
    public void setMessage(org.gtk.gio.SocketControlMessage message) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (message == null ? MemoryAddress.NULL : message.handle()));
    }
    
    /**
     * Create a NetControlMessageMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetControlMessageMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetControlMessageMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetControlMessageMeta(input, ownership);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_control_message_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_control_message_meta_get_info = Interop.downcallHandle(
            "gst_net_control_message_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link NetControlMessageMeta.Builder} object constructs a {@link NetControlMessageMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NetControlMessageMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NetControlMessageMeta struct;
        
        private Builder() {
            struct = NetControlMessageMeta.allocate();
        }
        
         /**
         * Finish building the {@link NetControlMessageMeta} struct.
         * @return A new instance of {@code NetControlMessageMeta} with the fields 
         *         that were set in the Builder object.
         */
        public NetControlMessageMeta build() {
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
         * a {@link org.gtk.gio.SocketControlMessage} stored as metadata
         * @param message The value for the {@code message} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessage(org.gtk.gio.SocketControlMessage message) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (message == null ? MemoryAddress.NULL : message.handle()));
            return this;
        }
    }
}
