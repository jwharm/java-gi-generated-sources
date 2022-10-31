package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for pointer properties.
 */
public class ParamSpecPointer extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecPointer";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.ParamSpec parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.ParamSpec(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ParamSpecPointer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecPointer if its GType is a (or inherits from) "GParamSpecPointer".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecPointer" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecPointer", a ClassCastException will be thrown.
     */
    public static ParamSpecPointer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecPointer"))) {
            return new ParamSpecPointer(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecPointer");
        }
    }
}
