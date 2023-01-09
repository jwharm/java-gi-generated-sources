package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * {@code GInputVectors} and the operation will use all the buffers as if they
 * were one buffer, and will set {@code bytes_received} to the total number of bytes
 * received across all {@code GInputVectors}.
 * <p>
 * This structure closely mirrors {@code struct mmsghdr} and {@code struct msghdr} from
 * the POSIX sockets API (see {@code man 2 recvmmsg}).
 * <p>
 * If {@code address} is non-{@code null} then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 * <p>
 * If {@code control_messages} is non-{@code null} then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. {@code num_control_messages} is set to the number of elements in
 * this array, which may be zero.
 * <p>
 * Flags relevant to this message will be returned in {@code flags}. For example,
 * {@code MSG_EOR} or {@code MSG_TRUNC}.
 * @version 2.48
 */
public class InputMessage extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInputMessage";
    
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
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("bytes_received"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("control_messages"),
            Interop.valueLayout.ADDRESS.withName("num_control_messages")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InputMessage}
     * @return A new, uninitialized @{link InputMessage}
     */
    public static InputMessage allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InputMessage newInstance = new InputMessage(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public PointerProxy<org.gtk.gio.SocketAddress> getAddress() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.SocketAddress>(RESULT, org.gtk.gio.SocketAddress.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void setAddress(PointerProxy<org.gtk.gio.SocketAddress> address) {
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
    public PointerProxy<org.gtk.gio.InputVector> getVectors() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.InputVector>(RESULT, org.gtk.gio.InputVector.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code vectors}
     * @param vectors The new value of the field {@code vectors}
     */
    public void setVectors(org.gtk.gio.InputVector[] vectors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vectors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vectors, org.gtk.gio.InputVector.getMemoryLayout(), false, SCOPE)));
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
     * Get the value of the field {@code bytes_received}
     * @return The value of the field {@code bytes_received}
     */
    public long getBytesReceived() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bytes_received}
     * @param bytesReceived The new value of the field {@code bytes_received}
     */
    public void setBytesReceived(long bytesReceived) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bytesReceived);
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), flags);
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
    public PointerInteger getNumControlMessages() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerInteger(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code num_control_messages}
     * @param numControlMessages The new value of the field {@code num_control_messages}
     */
    public void setNumControlMessages(PointerInteger numControlMessages) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (numControlMessages == null ? MemoryAddress.NULL : numControlMessages.handle()));
        }
    }
    
    /**
     * Create a InputMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InputMessage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InputMessage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InputMessage(input);
    
    /**
     * A {@link InputMessage.Builder} object constructs a {@link InputMessage} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InputMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InputMessage struct;
        
        private Builder() {
            struct = InputMessage.allocate();
        }
        
        /**
         * Finish building the {@link InputMessage} struct.
         * @return A new instance of {@code InputMessage} with the fields 
         *         that were set in the Builder object.
         */
        public InputMessage build() {
            return struct;
        }
        
        /**
         * return location
         *   for a {@link SocketAddress}, or {@code null}
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddress(PointerProxy<org.gtk.gio.SocketAddress> address) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("address"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
                return this;
            }
        }
        
        /**
         * pointer to an
         *   array of input vectors
         * @param vectors The value for the {@code vectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVectors(org.gtk.gio.InputVector[] vectors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vectors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vectors, org.gtk.gio.InputVector.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the number of input vectors pointed to by {@code vectors}
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
         * will be set to the number of bytes that have been
         *   received
         * @param bytesReceived The value for the {@code bytesReceived} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytesReceived(long bytesReceived) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bytesReceived);
                return this;
            }
        }
        
        /**
         * collection of {@link SocketMsgFlags} for the received message,
         *   outputted by the call
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), flags);
                return this;
            }
        }
        
        /**
         * return location for a
         *   caller-allocated array of {@code GSocketControlMessages}, or {@code null}
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
         * return location for the number of
         *   elements in {@code control_messages}
         * @param numControlMessages The value for the {@code numControlMessages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumControlMessages(PointerInteger numControlMessages) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (numControlMessages == null ? MemoryAddress.NULL : numControlMessages.handle()));
                return this;
            }
        }
    }
}
