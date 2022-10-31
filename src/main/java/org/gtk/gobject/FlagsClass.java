package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class of a flags type holds information about its
 * possible values.
 */
public class FlagsClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFlagsClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("n_values"),
        Interop.valueLayout.ADDRESS.withName("values")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FlagsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlagsClass newInstance = new FlagsClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass g_type_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return new org.gtk.gobject.TypeClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code mask}
     * @return The value of the field {@code mask}
     */
    public int mask$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mask}
     * @param mask The new value of the field {@code mask}
     */
    public void mask$set(int mask) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mask);
    }
    
    /**
     * Get the value of the field {@code n_values}
     * @return The value of the field {@code n_values}
     */
    public int n_values$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_values}
     * @param n_values The new value of the field {@code n_values}
     */
    public void n_values$set(int n_values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_values);
    }
    
    /**
     * Get the value of the field {@code values}
     * @return The value of the field {@code values}
     */
    public org.gtk.gobject.FlagsValue values$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.FlagsValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code values}
     * @param values The new value of the field {@code values}
     */
    public void values$set(org.gtk.gobject.FlagsValue values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), values.handle());
    }
    
    @ApiStatus.Internal
    public FlagsClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
