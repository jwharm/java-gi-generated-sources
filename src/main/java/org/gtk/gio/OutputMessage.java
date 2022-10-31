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
public class OutputMessage extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputMessage";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("address"),
        Interop.valueLayout.ADDRESS.withName("vectors"),
        ValueLayout.JAVA_INT.withName("num_vectors"),
        ValueLayout.JAVA_INT.withName("bytes_sent"),
        Interop.valueLayout.ADDRESS.withName("control_messages"),
        ValueLayout.JAVA_INT.withName("num_control_messages")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static OutputMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputMessage newInstance = new OutputMessage(Refcounted.get(segment.address()));
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
        return new org.gtk.gio.SocketAddress(Refcounted.get(RESULT, false));
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
        return new org.gtk.gio.OutputVector(Refcounted.get(RESULT, false));
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
    
    @ApiStatus.Internal
    public OutputMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
