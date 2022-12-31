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
public class Attribute extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttribute";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("klass"),
            Interop.valueLayout.C_INT.withName("start_index"),
            Interop.valueLayout.C_INT.withName("end_index")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Attribute}
     * @return A new, uninitialized @{link Attribute}
     */
    public static Attribute allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Attribute newInstance = new Attribute(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code klass}
     * @return The value of the field {@code klass}
     */
    public org.pango.AttrClass getKlass() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("klass"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.pango.AttrClass.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code klass}
     * @param klass The new value of the field {@code klass}
     */
    public void setKlass(org.pango.AttrClass klass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("klass"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (klass == null ? MemoryAddress.NULL : klass.handle()));
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int getStartIndex() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param startIndex The new value of the field {@code start_index}
     */
    public void setStartIndex(int startIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startIndex);
    }
    
    /**
     * Get the value of the field {@code end_index}
     * @return The value of the field {@code end_index}
     */
    public int getEndIndex() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end_index}
     * @param endIndex The new value of the field {@code end_index}
     */
    public void setEndIndex(int endIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), endIndex);
    }
    
    /**
     * Create a Attribute proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Attribute(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Attribute> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Attribute(input, ownership);
    
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
        return org.pango.AttrColor.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrFloat.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrFontDesc.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrFontFeatures.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrInt.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrLanguage.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrShape.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrSize.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return org.pango.AttrString.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Make a copy of an attribute.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}.
     */
    public org.pango.Attribute copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attribute_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Attribute.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public boolean equal(org.pango.Attribute attr2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attribute_equal.invokeExact(
                    handle(),
                    attr2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Initializes {@code attr}'s klass to {@code klass}, it's start_index to
     * {@code PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING} and end_index to
     * {@code PANGO_ATTR_INDEX_TO_TEXT_END} such that the attribute applies
     * to the entire text by default.
     * @param klass a {@code PangoAttrClass}
     */
    public void init(org.pango.AttrClass klass) {
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
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_float = Interop.downcallHandle(
            "pango_attribute_as_float",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_font_desc = Interop.downcallHandle(
            "pango_attribute_as_font_desc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_font_features = Interop.downcallHandle(
            "pango_attribute_as_font_features",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_int = Interop.downcallHandle(
            "pango_attribute_as_int",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_language = Interop.downcallHandle(
            "pango_attribute_as_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_shape = Interop.downcallHandle(
            "pango_attribute_as_shape",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_size = Interop.downcallHandle(
            "pango_attribute_as_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_as_string = Interop.downcallHandle(
            "pango_attribute_as_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_copy = Interop.downcallHandle(
            "pango_attribute_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_destroy = Interop.downcallHandle(
            "pango_attribute_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_equal = Interop.downcallHandle(
            "pango_attribute_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attribute_init = Interop.downcallHandle(
            "pango_attribute_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Attribute.Builder} object constructs a {@link Attribute} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Attribute.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Attribute struct;
        
        private Builder() {
            struct = Attribute.allocate();
        }
        
         /**
         * Finish building the {@link Attribute} struct.
         * @return A new instance of {@code Attribute} with the fields 
         *         that were set in the Builder object.
         */
        public Attribute build() {
            return struct;
        }
        
        /**
         * the class structure holding information about the type of the attribute
         * @param klass The value for the {@code klass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKlass(org.pango.AttrClass klass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("klass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (klass == null ? MemoryAddress.NULL : klass.handle()));
            return this;
        }
        
        /**
         * the start index of the range (in bytes).
         * @param startIndex The value for the {@code startIndex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStartIndex(int startIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), startIndex);
            return this;
        }
        
        /**
         * end index of the range (in bytes). The character at this index
         *   is not included in the range.
         * @param endIndex The value for the {@code endIndex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEndIndex(int endIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), endIndex);
            return this;
        }
    }
}
