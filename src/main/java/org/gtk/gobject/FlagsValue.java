package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFlagsValue";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("value"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("value_name"),
        Interop.valueLayout.ADDRESS.withName("value_nick")
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
    
    public static FlagsValue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlagsValue newInstance = new FlagsValue(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public int value$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void value$set(int value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Get the value of the field {@code value_name}
     * @return The value of the field {@code value_name}
     */
    public java.lang.String value_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_name}
     * @param value_name The new value of the field {@code value_name}
     */
    public void value_name$set(java.lang.String value_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(value_name));
    }
    
    /**
     * Get the value of the field {@code value_nick}
     * @return The value of the field {@code value_nick}
     */
    public java.lang.String value_nick$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_nick}
     * @param value_nick The new value of the field {@code value_nick}
     */
    public void value_nick$set(java.lang.String value_nick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_nick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(value_nick));
    }
    
    /**
     * Create a FlagsValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FlagsValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
