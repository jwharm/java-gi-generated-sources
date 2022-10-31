package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link Type} properties.
 * @version 2.10
 */
public class ParamSpecGType extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecGType";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        ValueLayout.JAVA_LONG.withName("is_a_type")
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
     * Get the value of the field {@code is_a_type}
     * @return The value of the field {@code is_a_type}
     */
    public org.gtk.glib.Type is_a_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_a_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code is_a_type}
     * @param is_a_type The new value of the field {@code is_a_type}
     */
    public void is_a_type$set(org.gtk.glib.Type is_a_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_a_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_a_type.getValue().longValue());
    }
    
    @ApiStatus.Internal
    public ParamSpecGType(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecGType if its GType is a (or inherits from) "GParamSpecGType".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecGType" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecGType", a ClassCastException will be thrown.
     */
    public static ParamSpecGType castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecGType"))) {
            return new ParamSpecGType(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecGType");
        }
    }
}
