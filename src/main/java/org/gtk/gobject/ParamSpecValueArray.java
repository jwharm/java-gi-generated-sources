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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("element_spec"),
        Interop.valueLayout.C_INT.withName("fixed_n_elements")
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
     * Get the value of the field {@code element_spec}
     * @return The value of the field {@code element_spec}
     */
    public org.gtk.gobject.ParamSpec element_spec$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("element_spec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.UNKNOWN);
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
    
    /**
     * Create a ParamSpecValueArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecValueArray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ParamSpecValueArray if its GType is a (or inherits from) "GParamSpecValueArray".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ParamSpecValueArray} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpecValueArray", a ClassCastException will be thrown.
     */
    public static ParamSpecValueArray castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ParamSpecValueArray.getType())) {
            return new ParamSpecValueArray(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpecValueArray");
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
         * A {@link ParamSpecValueArray.Build} object constructs a {@link ParamSpecValueArray} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ParamSpecValueArray} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ParamSpecValueArray} using {@link ParamSpecValueArray#castFrom}.
         * @return A new instance of {@code ParamSpecValueArray} with the properties 
         *         that were set in the Build object.
         */
        public ParamSpecValueArray construct() {
            return ParamSpecValueArray.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ParamSpecValueArray.getType(),
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
