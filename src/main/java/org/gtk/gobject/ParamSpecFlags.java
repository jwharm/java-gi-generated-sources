package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for flags
 * properties.
 */
public class ParamSpecFlags extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecFlags";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("flags_class"),
        ValueLayout.JAVA_INT.withName("default_value")
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
    
    /**
     * Get the value of the field {@code flags_class}
     * @return The value of the field {@code flags_class}
     */
    public org.gtk.gobject.FlagsClass flags_class$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags_class"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.FlagsClass(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code flags_class}
     * @param flags_class The new value of the field {@code flags_class}
     */
    public void flags_class$set(org.gtk.gobject.FlagsClass flags_class) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags_class.handle());
    }
    
    /**
     * Get the value of the field {@code default_value}
     * @return The value of the field {@code default_value}
     */
    public int default_value$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code default_value}
     * @param default_value The new value of the field {@code default_value}
     */
    public void default_value$set(int default_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), default_value);
    }
    
    @ApiStatus.Internal
    public ParamSpecFlags(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecFlags if its GType is a (or inherits from) "GParamSpecFlags".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecFlags" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecFlags", a ClassCastException will be thrown.
     */
    public static ParamSpecFlags castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecFlags"))) {
            return new ParamSpecFlags(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecFlags");
        }
    }
}
