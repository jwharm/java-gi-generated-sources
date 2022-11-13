package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadActionEntry";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.JAVA_INT.withName("mode"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("label"),
        Interop.valueLayout.ADDRESS.withName("action_name")
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
    
    public static PadActionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PadActionEntry newInstance = new PadActionEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.gtk.PadActionType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gtk.PadActionType(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.gtk.PadActionType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code index}
     * @return The value of the field {@code index}
     */
    public int index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code index}
     * @param index The new value of the field {@code index}
     */
    public void index$set(int index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), index);
    }
    
    /**
     * Get the value of the field {@code mode}
     * @return The value of the field {@code mode}
     */
    public int mode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mode}
     * @param mode The new value of the field {@code mode}
     */
    public void mode$set(int mode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
    }
    
    /**
     * Get the value of the field {@code label}
     * @return The value of the field {@code label}
     */
    public java.lang.String label$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("label"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code label}
     * @param label The new value of the field {@code label}
     */
    public void label$set(java.lang.String label) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("label"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(label));
    }
    
    /**
     * Get the value of the field {@code action_name}
     * @return The value of the field {@code action_name}
     */
    public java.lang.String action_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("action_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code action_name}
     * @param action_name The new value of the field {@code action_name}
     */
    public void action_name$set(java.lang.String action_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("action_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(action_name));
    }
    
    /**
     * Create a PadActionEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PadActionEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
