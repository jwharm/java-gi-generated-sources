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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("default_value"),
        Interop.valueLayout.ADDRESS.withName("cset_first"),
        Interop.valueLayout.ADDRESS.withName("cset_nth"),
        Interop.valueLayout.C_BYTE.withName("substitutor"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("null_fold_if_empty"),
        Interop.valueLayout.C_INT.withName("ensure_non_null")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.ParamSpec parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.ParamSpec(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
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
    
    /**
     * Create a ParamSpecString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecString(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ParamSpecString if its GType is a (or inherits from) "GParamSpecString".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ParamSpecString} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecString", a ClassCastException will be thrown.
     */
    public static ParamSpecString castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ParamSpecString.getType())) {
            return new ParamSpecString(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecString");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.intern.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.ParamSpec.Build {
        
         /**
         * A {@link ParamSpecString.Build} object constructs a {@link ParamSpecString} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ParamSpecString} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ParamSpecString} using {@link ParamSpecString#castFrom}.
         * @return A new instance of {@code ParamSpecString} with the properties 
         *         that were set in the Build object.
         */
        public ParamSpecString construct() {
            return ParamSpecString.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ParamSpecString.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle intern = Interop.downcallHandle(
            "intern",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
