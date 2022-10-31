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
public class InputMessage extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInputMessage";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("address"),
        Interop.valueLayout.ADDRESS.withName("vectors"),
        ValueLayout.JAVA_INT.withName("num_vectors"),
        MemoryLayout.paddingLayout(32),
        ValueLayout.JAVA_LONG.withName("bytes_received"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("control_messages"),
        Interop.valueLayout.ADDRESS.withName("num_control_messages")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static InputMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InputMessage newInstance = new InputMessage(Refcounted.get(segment.address()));
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
    
    @ApiStatus.Internal
    public InputMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
