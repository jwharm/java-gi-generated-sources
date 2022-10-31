package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A struct that specifies a border around a rectangular area.
 * <p>
 * Each side can have different width.
 */
public class Border extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBorder";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("left"),
        ValueLayout.JAVA_SHORT.withName("right"),
        ValueLayout.JAVA_SHORT.withName("top"),
        ValueLayout.JAVA_SHORT.withName("bottom")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Border allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Border newInstance = new Border(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code left}
     * @return The value of the field {@code left}
     */
    public short left$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("left"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code left}
     * @param left The new value of the field {@code left}
     */
    public void left$set(short left) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("left"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), left);
    }
    
    /**
     * Get the value of the field {@code right}
     * @return The value of the field {@code right}
     */
    public short right$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("right"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code right}
     * @param right The new value of the field {@code right}
     */
    public void right$set(short right) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("right"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), right);
    }
    
    /**
     * Get the value of the field {@code top}
     * @return The value of the field {@code top}
     */
    public short top$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("top"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code top}
     * @param top The new value of the field {@code top}
     */
    public void top$set(short top) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("top"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), top);
    }
    
    /**
     * Get the value of the field {@code bottom}
     * @return The value of the field {@code bottom}
     */
    public short bottom$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bottom"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bottom}
     * @param bottom The new value of the field {@code bottom}
     */
    public void bottom$set(short bottom) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bottom"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bottom);
    }
    
    @ApiStatus.Internal
    public Border(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_border_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@code GtkBorder} struct and initializes its elements to zero.
     */
    public Border() {
        super(constructNew());
    }
    
    /**
     * Copies a {@code GtkBorder}.
     * @return a copy of {@code border_}.
     */
    public @NotNull org.gtk.gtk.Border copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_border_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Border(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code GtkBorder}.
     */
    public void free() {
        try {
            DowncallHandles.gtk_border_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_border_new = Interop.downcallHandle(
            "gtk_border_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_border_copy = Interop.downcallHandle(
            "gtk_border_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_border_free = Interop.downcallHandle(
            "gtk_border_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
