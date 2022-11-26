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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("address"),
        Interop.valueLayout.ADDRESS.withName("vectors"),
        Interop.valueLayout.C_INT.withName("num_vectors"),
        Interop.valueLayout.C_INT.withName("bytes_sent"),
        Interop.valueLayout.ADDRESS.withName("control_messages"),
        Interop.valueLayout.C_INT.withName("num_control_messages")
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
     * Allocate a new {@link OutputMessage}
     * @return A new, uninitialized @{link OutputMessage}
     */
    public static OutputMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputMessage newInstance = new OutputMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public org.gtk.gio.SocketAddress address$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.SocketAddress(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void address$set(org.gtk.gio.SocketAddress address) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), address.handle());
    }
    
    /**
     * Get the value of the field {@code vectors}
     * @return The value of the field {@code vectors}
     */
    public org.gtk.gio.OutputVector vectors$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.OutputVector(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code vectors}
     * @param vectors The new value of the field {@code vectors}
     */
    public void vectors$set(org.gtk.gio.OutputVector vectors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), vectors.handle());
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
     * Get the value of the field {@code bytes_sent}
     * @return The value of the field {@code bytes_sent}
     */
    public int bytes_sent$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bytes_sent}
     * @param bytes_sent The new value of the field {@code bytes_sent}
     */
    public void bytes_sent$set(int bytes_sent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes_sent);
    }
    
    /**
     * Get the value of the field {@code num_control_messages}
     * @return The value of the field {@code num_control_messages}
     */
    public int num_control_messages$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code num_control_messages}
     * @param num_control_messages The new value of the field {@code num_control_messages}
     */
    public void num_control_messages$set(int num_control_messages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), num_control_messages);
    }
    
    /**
     * Create a OutputMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OutputMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OutputMessage struct;
        
         /**
         * A {@link OutputMessage.Build} object constructs a {@link OutputMessage} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OutputMessage.allocate();
        }
        
         /**
         * Finish building the {@link OutputMessage} struct.
         * @return A new instance of {@code OutputMessage} with the fields 
         *         that were set in the Build object.
         */
        public OutputMessage construct() {
            return struct;
        }
        
        /**
         * a {@link SocketAddress}, or {@code null}
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddress(org.gtk.gio.SocketAddress address) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (address == null ? MemoryAddress.NULL : address.handle()));
            return this;
        }
        
        /**
         * pointer to an array of output vectors
         * @param vectors The value for the {@code vectors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVectors(org.gtk.gio.OutputVector vectors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vectors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vectors == null ? MemoryAddress.NULL : vectors.handle()));
            return this;
        }
        
        /**
         * the number of output vectors pointed to by {@code vectors}.
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
         * initialize to 0. Will be set to the number of bytes
         *     that have been sent
         * @param bytes_sent The value for the {@code bytes_sent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBytesSent(int bytes_sent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes_sent);
            return this;
        }
        
        /**
         * a pointer
         *   to an array of {@code GSocketControlMessages}, or {@code null}.
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
         * number of elements in {@code control_messages}.
         * @param num_control_messages The value for the {@code num_control_messages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumControlMessages(int num_control_messages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), num_control_messages);
            return this;
        }
    }
}
