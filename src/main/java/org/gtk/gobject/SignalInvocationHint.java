package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SignalInvocationHint} structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalInvocationHint";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("signal_id"),
        ValueLayout.JAVA_INT.withName("detail"),
        Interop.valueLayout.C_INT.withName("run_type")
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
    
    public static SignalInvocationHint allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SignalInvocationHint newInstance = new SignalInvocationHint(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code signal_id}
     * @return The value of the field {@code signal_id}
     */
    public int signal_id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code signal_id}
     * @param signal_id The new value of the field {@code signal_id}
     */
    public void signal_id$set(int signal_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signal_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signal_id);
    }
    
    /**
     * Get the value of the field {@code detail}
     * @return The value of the field {@code detail}
     */
    public org.gtk.glib.Quark detail$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detail"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code detail}
     * @param detail The new value of the field {@code detail}
     */
    public void detail$set(org.gtk.glib.Quark detail) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detail"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), detail.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code run_type}
     * @return The value of the field {@code run_type}
     */
    public org.gtk.gobject.SignalFlags run_type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.SignalFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code run_type}
     * @param run_type The new value of the field {@code run_type}
     */
    public void run_type$set(org.gtk.gobject.SignalFlags run_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), run_type.getValue());
    }
    
    /**
     * Create a SignalInvocationHint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalInvocationHint(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
