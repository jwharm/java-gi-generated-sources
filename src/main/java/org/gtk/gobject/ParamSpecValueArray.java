package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link ValueArray} properties.
 */
public class ParamSpecValueArray extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecValueArray";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("element_spec"),
        ValueLayout.JAVA_INT.withName("fixed_n_elements")
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
     * Get the value of the field {@code element_spec}
     * @return The value of the field {@code element_spec}
     */
    public org.gtk.gobject.ParamSpec element_spec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code element_spec}
     * @param element_spec The new value of the field {@code element_spec}
     */
    public void element_spec$set(org.gtk.gobject.ParamSpec element_spec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), element_spec.handle());
    }
    
    /**
     * Get the value of the field {@code fixed_n_elements}
     * @return The value of the field {@code fixed_n_elements}
     */
    public int fixed_n_elements$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fixed_n_elements"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fixed_n_elements}
     * @param fixed_n_elements The new value of the field {@code fixed_n_elements}
     */
    public void fixed_n_elements$set(int fixed_n_elements) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fixed_n_elements"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fixed_n_elements);
    }
    
    @ApiStatus.Internal
    public ParamSpecValueArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecValueArray if its GType is a (or inherits from) "GParamSpecValueArray".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecValueArray" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecValueArray", a ClassCastException will be thrown.
     */
    public static ParamSpecValueArray castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecValueArray"))) {
            return new ParamSpecValueArray(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecValueArray");
        }
    }
}
