package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttribute} structure represents the common portions of all
 * attributes.
 * <p>
 * Particular types of attributes include this structure as their initial
 * portion. The common portion of the attribute holds the range to which
 * the value in the type-specific part of the attribute applies and should
 * be initialized using {@link Attribute#init}. By default, an attribute
 * will have an all-inclusive range of [0,{@code G_MAXUINT}].
 */
public class Attribute extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttribute";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("klass"),
        ValueLayout.JAVA_INT.withName("start_index"),
        ValueLayout.JAVA_INT.withName("end_index")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Attribute allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Attribute newInstance = new Attribute(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code klass}
     * @return The value of the field {@code klass}
     */
    public org.pango.AttrClass klass$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("klass"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.AttrClass(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code klass}
     * @param klass The new value of the field {@code klass}
     */
    public void klass$set(org.pango.AttrClass klass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("klass"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), klass.handle());
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int start_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param start_index The new value of the field {@code start_index}
     */
    public void start_index$set(int start_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start_index);
    }
    
    /**
     * Get the value of the field {@code end_index}
     * @return The value of the field {@code end_index}
     */
    public int end_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_index}
     * @param end_index The new value of the field {@code end_index}
     */
    public void end_index$set(int end_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end_index);
    }
    
    @ApiStatus.Internal
    public Attribute(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrColor}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrColor},
     *   or {@code null} if it's not a color attribute
     */
    public @Nullable org.pango.AttrColor asColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrColor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFloat}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrFloat},
     *   or {@code null} if it's not a floating point attribute
     */
    public @Nullable org.pango.AttrFloat asFloat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_float.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrFloat(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontDesc}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrFontDesc},
     *   or {@code null} if it's not a font description attribute
     */
    public @Nullable org.pango.AttrFontDesc asFontDesc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_font_desc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrFontDesc(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontFeatures}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrFontFeatures},
     *   or {@code null} if it's not a font features attribute
     */
    public @Nullable org.pango.AttrFontFeatures asFontFeatures() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_font_features.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrFontFeatures(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrInt}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrInt},
     *   or {@code null} if it's not an integer attribute
     */
    public @Nullable org.pango.AttrInt asInt() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_int.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrInt(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrLanguage}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrLanguage},
     *   or {@code null} if it's not a language attribute
     */
    public @Nullable org.pango.AttrLanguage asLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrLanguage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrShape}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrShape},
     *   or {@code null} if it's not a shape attribute
     */
    public @Nullable org.pango.AttrShape asShape() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_shape.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrShape(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrSize}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrSize},
     *   or NULL if it's not a size attribute
     */
    public @Nullable org.pango.AttrSize asSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrSize(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrString}.
     * <p>
     * This is mainly useful for language bindings.
     * @return The attribute as {@code PangoAttrString},
     *   or {@code null} if it's not a string attribute
     */
    public @Nullable org.pango.AttrString asString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_as_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrString(Refcounted.get(RESULT, false));
    }
    
    /**
     * Make a copy of an attribute.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}.
     */
    public @NotNull org.pango.Attribute copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(Refcounted.get(RESULT, true));
    }
    
    /**
     * Destroy a {@code PangoAttribute} and free all associated memory.
     */
    public void destroy() {
        try {
            DowncallHandles.pango_attribute_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compare two attributes for equality.
     * <p>
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     * @param attr2 another {@code PangoAttribute}
     * @return {@code true} if the two attributes have the same value
     */
    public boolean equal(@NotNull org.pango.Attribute attr2) {
        java.util.Objects.requireNonNull(attr2, "Parameter 'attr2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attribute_equal.invokeExact(
                    handle(),
                    attr2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code attr}'s klass to {@code klass}, it's start_index to
     * {@code PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING} and end_index to
     * {@code PANGO_ATTR_INDEX_TO_TEXT_END} such that the attribute applies
     * to the entire text by default.
     * @param klass a {@code PangoAttrClass}
     */
    public void init(@NotNull org.pango.AttrClass klass) {
        java.util.Objects.requireNonNull(klass, "Parameter 'klass' must not be null");
        try {
            DowncallHandles.pango_attribute_init.invokeExact(
                    handle(),
                    klass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attribute_as_color = Interop.downcallHandle(
            "pango_attribute_as_color",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_float = Interop.downcallHandle(
            "pango_attribute_as_float",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_font_desc = Interop.downcallHandle(
            "pango_attribute_as_font_desc",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_font_features = Interop.downcallHandle(
            "pango_attribute_as_font_features",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_int = Interop.downcallHandle(
            "pango_attribute_as_int",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_language = Interop.downcallHandle(
            "pango_attribute_as_language",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_shape = Interop.downcallHandle(
            "pango_attribute_as_shape",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_size = Interop.downcallHandle(
            "pango_attribute_as_size",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_as_string = Interop.downcallHandle(
            "pango_attribute_as_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_copy = Interop.downcallHandle(
            "pango_attribute_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_destroy = Interop.downcallHandle(
            "pango_attribute_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_equal = Interop.downcallHandle(
            "pango_attribute_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_attribute_init = Interop.downcallHandle(
            "pango_attribute_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
