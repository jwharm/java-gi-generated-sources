package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See {@link Gtk#distributeNaturalAllocation}.
 */
public class RequestedSize extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRequestedSize";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        ValueLayout.JAVA_INT.withName("minimum_size"),
        ValueLayout.JAVA_INT.withName("natural_size")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RequestedSize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RequestedSize newInstance = new RequestedSize(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data);
    }
    
    /**
     * Get the value of the field {@code minimum_size}
     * @return The value of the field {@code minimum_size}
     */
    public int minimum_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minimum_size}
     * @param minimum_size The new value of the field {@code minimum_size}
     */
    public void minimum_size$set(int minimum_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minimum_size);
    }
    
    /**
     * Get the value of the field {@code natural_size}
     * @return The value of the field {@code natural_size}
     */
    public int natural_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code natural_size}
     * @param natural_size The new value of the field {@code natural_size}
     */
    public void natural_size$set(int natural_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), natural_size);
    }
    
    @ApiStatus.Internal
    public RequestedSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
