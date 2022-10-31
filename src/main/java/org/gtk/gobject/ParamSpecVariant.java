package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link org.gtk.glib.Variant} properties.
 * <p>
 * When comparing values with g_param_values_cmp(), scalar values with the same
 * type will be compared with g_variant_compare(). Other non-{@code null} variants will
 * be checked for equality with g_variant_equal(), and their sort order is
 * otherwise undefined. {@code null} is ordered before non-{@code null} variants. Two {@code null}
 * values compare equal.
 * @version 2.26
 */
public class ParamSpecVariant extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecVariant";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("type"),
        Interop.valueLayout.ADDRESS.withName("default_value"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("padding")
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
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.VariantType type$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.glib.VariantType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.handle());
    }
    
    /**
     * Get the value of the field {@code default_value}
     * @return The value of the field {@code default_value}
     */
    public org.gtk.glib.Variant default_value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code default_value}
     * @param default_value The new value of the field {@code default_value}
     */
    public void default_value$set(org.gtk.glib.Variant default_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), default_value.handle());
    }
    
    @ApiStatus.Internal
    public ParamSpecVariant(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecVariant if its GType is a (or inherits from) "GParamSpecVariant".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecVariant" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecVariant", a ClassCastException will be thrown.
     */
    public static ParamSpecVariant castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecVariant"))) {
            return new ParamSpecVariant(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecVariant");
        }
    }
}
