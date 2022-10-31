package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for string
 * properties.
 */
public class ParamSpecString extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecString";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("default_value"),
        Interop.valueLayout.ADDRESS.withName("cset_first"),
        Interop.valueLayout.ADDRESS.withName("cset_nth"),
        ValueLayout.JAVA_BYTE.withName("substitutor"),
        MemoryLayout.paddingLayout(24),
        ValueLayout.JAVA_INT.withName("null_fold_if_empty"),
        ValueLayout.JAVA_INT.withName("ensure_non_null")
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
     * Get the value of the field {@code default_value}
     * @return The value of the field {@code default_value}
     */
    public java.lang.String default_value$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code default_value}
     * @param default_value The new value of the field {@code default_value}
     */
    public void default_value$set(java.lang.String default_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(default_value));
    }
    
    /**
     * Get the value of the field {@code cset_first}
     * @return The value of the field {@code cset_first}
     */
    public java.lang.String cset_first$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_first"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_first}
     * @param cset_first The new value of the field {@code cset_first}
     */
    public void cset_first$set(java.lang.String cset_first) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_first"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cset_first));
    }
    
    /**
     * Get the value of the field {@code cset_nth}
     * @return The value of the field {@code cset_nth}
     */
    public java.lang.String cset_nth$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_nth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_nth}
     * @param cset_nth The new value of the field {@code cset_nth}
     */
    public void cset_nth$set(java.lang.String cset_nth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_nth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cset_nth));
    }
    
    /**
     * Get the value of the field {@code substitutor}
     * @return The value of the field {@code substitutor}
     */
    public byte substitutor$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("substitutor"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code substitutor}
     * @param substitutor The new value of the field {@code substitutor}
     */
    public void substitutor$set(byte substitutor) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("substitutor"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), substitutor);
    }
    
    /**
     * Get the value of the field {@code null_fold_if_empty}
     * @return The value of the field {@code null_fold_if_empty}
     */
    public int null_fold_if_empty$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("null_fold_if_empty"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code null_fold_if_empty}
     * @param null_fold_if_empty The new value of the field {@code null_fold_if_empty}
     */
    public void null_fold_if_empty$set(int null_fold_if_empty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("null_fold_if_empty"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), null_fold_if_empty);
    }
    
    /**
     * Get the value of the field {@code ensure_non_null}
     * @return The value of the field {@code ensure_non_null}
     */
    public int ensure_non_null$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ensure_non_null"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ensure_non_null}
     * @param ensure_non_null The new value of the field {@code ensure_non_null}
     */
    public void ensure_non_null$set(int ensure_non_null) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ensure_non_null"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ensure_non_null);
    }
    
    @ApiStatus.Internal
    public ParamSpecString(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecString if its GType is a (or inherits from) "GParamSpecString".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecString" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecString", a ClassCastException will be thrown.
     */
    public static ParamSpecString castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GParamSpecString"))) {
            return new ParamSpecString(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecString");
        }
    }
}
