package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data output when sending multiple
 * messages or packets in one go. You generally pass in an array of
 * {@code GOutputVectors} and the operation will use all the buffers as if they
 * were one buffer.
 * <p>
 * If {@code address} is {@code null} then the message is sent to the default receiver
 * (as previously set by g_socket_connect()).
 * @version 2.44
 */
public class OutputMessage extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputMessage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("address"),
            Interop.valueLayout.ADDRESS.withName("vectors"),
            Interop.valueLayout.C_INT.withName("num_vectors"),
            Interop.valueLayout.C_INT.withName("bytes_sent"),
            Interop.valueLayout.ADDRESS.withName("control_messages"),
            Interop.valueLayout.C_INT.withName("num_control_messages")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OutputMessage}
     * @return A new, uninitialized @{link OutputMessage}
     */
    public static OutputMessage allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        OutputMessage newInstance = new OutputMessage(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public org.gtk.gio.SocketAddress getAddress() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gtk.gio.SocketAddress) Interop.register(RESULT, org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void setAddress(org.gtk.gio.SocketAddress address) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code vectors}
     * @return The value of the field {@code vectors}
     */
    public org.gtk.gio.OutputVector getVectors() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.gio.OutputVector.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code vectors}
     * @param vectors The new value of the field {@code vectors}
     */
    public void setVectors(org.gtk.gio.OutputVector vectors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vectors == null ? MemoryAddress.NULL : vectors.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code num_vectors}
     * @return The value of the field {@code num_vectors}
     */
    public int getNumVectors() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code num_vectors}
     * @param numVectors The new value of the field {@code num_vectors}
     */
    public void setNumVectors(int numVectors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numVectors);
        }
    }
    
    /**
     * Get the value of the field {@code bytes_sent}
     * @return The value of the field {@code bytes_sent}
     */
    public int getBytesSent() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bytes_sent}
     * @param bytesSent The new value of the field {@code bytes_sent}
     */
    public void setBytesSent(int bytesSent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bytesSent);
        }
    }
    
    /**
     * Get the value of the field {@code control_messages}
     * @return The value of the field {@code control_messages}
     */
    public PointerProxy<org.gtk.gio.SocketControlMessage> getControlMessages() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("control_messages"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.SocketControlMessage>(RESULT, org.gtk.gio.SocketControlMessage.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code control_messages}
     * @param controlMessages The new value of the field {@code control_messages}
     */
    public void setControlMessages(org.gtk.gio.SocketControlMessage[] controlMessages) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (controlMessages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(controlMessages, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code num_control_messages}
     * @return The value of the field {@code num_control_messages}
     */
    public int getNumControlMessages() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code num_control_messages}
     * @param numControlMessages The new value of the field {@code num_control_messages}
     */
    public void setNumControlMessages(int numControlMessages) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numControlMessages);
        }
    }
    
    /**
     * Create a OutputMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected OutputMessage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, OutputMessage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new OutputMessage(input);
    
    /**
     * A {@link OutputMessage.Builder} object constructs a {@link OutputMessage} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OutputMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OutputMessage struct;
        
        private Builder() {
            struct = OutputMessage.allocate();
        }
        
        /**
         * Finish building the {@link OutputMessage} struct.
         * @return A new instance of {@code OutputMessage} with the fields 
         *         that were set in the Builder object.
         */
        public OutputMessage build() {
            return struct;
        }
        
        /**
         * a {@link SocketAddress}, or {@code null}
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddress(org.gtk.gio.SocketAddress address) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("address"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
                return this;
            }
        }
        
        /**
         * pointer to an array of output vectors
         * @param vectors The value for the {@code vectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVectors(org.gtk.gio.OutputVector vectors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vectors == null ? MemoryAddress.NULL : vectors.handle()));
                return this;
            }
        }
        
        /**
         * the number of output vectors pointed to by {@code vectors}.
         * @param numVectors The value for the {@code numVectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumVectors(int numVectors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numVectors);
                return this;
            }
        }
        
        /**
         * initialize to 0. Will be set to the number of bytes
         *     that have been sent
         * @param bytesSent The value for the {@code bytesSent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytesSent(int bytesSent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bytesSent);
                return this;
            }
        }
        
        /**
         * a pointer
         *   to an array of {@code GSocketControlMessages}, or {@code null}.
         * @param controlMessages The value for the {@code controlMessages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setControlMessages(org.gtk.gio.SocketControlMessage[] controlMessages) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("control_messages"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (controlMessages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(controlMessages, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * number of elements in {@code control_messages}.
         * @param numControlMessages The value for the {@code numControlMessages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumControlMessages(int numControlMessages) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numControlMessages);
                return this;
            }
        }
    }
}
