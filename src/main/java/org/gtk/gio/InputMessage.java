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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InputMessage}
     * @return A new, uninitialized @{link InputMessage}
     */
    public static InputMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InputMessage newInstance = new InputMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public PointerProxy<org.gtk.gio.SocketAddress> address$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gtk.gio.SocketAddress>(RESULT, org.gtk.gio.SocketAddress.class);
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void address$set(PointerProxy<org.gtk.gio.SocketAddress> address) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), address.handle());
    }
    
    /**
     * Get the value of the field {@code num_vectors}
     * @return The value of the field {@code num_vectors}
     */
    public int num_vectors$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code num_vectors}
     * @param num_vectors The new value of the field {@code num_vectors}
     */
    public void num_vectors$set(int num_vectors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), num_vectors);
    }
    
    /**
     * Get the value of the field {@code bytes_received}
     * @return The value of the field {@code bytes_received}
     */
    public long bytes_received$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bytes_received}
     * @param bytes_received The new value of the field {@code bytes_received}
     */
    public void bytes_received$set(long bytes_received) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes_received);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code num_control_messages}
     * @return The value of the field {@code num_control_messages}
     */
    public PointerInteger num_control_messages$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code num_control_messages}
     * @param num_control_messages The new value of the field {@code num_control_messages}
     */
    public void num_control_messages$set(PointerInteger num_control_messages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), num_control_messages.handle());
    }
    
    /**
     * Create a InputMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InputMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InputMessage struct;
        
         /**
         * A {@link InputMessage.Build} object constructs a {@link InputMessage} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InputMessage.allocate();
        }
        
         /**
         * Finish building the {@link InputMessage} struct.
         * @return A new instance of {@code InputMessage} with the fields 
         *         that were set in the Build object.
         */
        public InputMessage construct() {
            return struct;
        }
        
        /**
         * return location
         *   for a {@link SocketAddress}, or {@code null}
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddress(PointerProxy<org.gtk.gio.SocketAddress> address) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
            return this;
        }
        
        /**
         * pointer to an
         *   array of input vectors
         * @param vectors The value for the {@code vectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVectors(org.gtk.gio.InputVector[] vectors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vectors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vectors, org.gtk.gio.InputVector.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * the number of input vectors pointed to by {@code vectors}
         * @param num_vectors The value for the {@code num_vectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumVectors(int num_vectors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), num_vectors);
            return this;
        }
        
        /**
         * will be set to the number of bytes that have been
         *   received
         * @param bytes_received The value for the {@code bytes_received} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBytesReceived(long bytes_received) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes_received);
            return this;
        }
        
        /**
         * collection of {@link SocketMsgFlags} for the received message,
         *   outputted by the call
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * return location for a
         *   caller-allocated array of {@code GSocketControlMessages}, or {@code null}
         * @param control_messages The value for the {@code control_messages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setControlMessages(org.gtk.gio.SocketControlMessage[] control_messages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (control_messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(control_messages, false)));
            return this;
        }
        
        /**
         * return location for the number of
         *   elements in {@code control_messages}
         * @param num_control_messages The value for the {@code num_control_messages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumControlMessages(PointerInteger num_control_messages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (num_control_messages == null ? MemoryAddress.NULL : num_control_messages.handle()));
            return this;
        }
    }
}
