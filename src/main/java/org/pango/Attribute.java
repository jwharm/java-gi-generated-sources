package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public Attribute(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_attribute_as_color = Interop.downcallHandle(
        "pango_attribute_as_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrColor}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrColor asColor() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_color.invokeExact(handle());
            return new AttrColor(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_float = Interop.downcallHandle(
        "pango_attribute_as_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrFloat}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFloat asFloat() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_float.invokeExact(handle());
            return new AttrFloat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_font_desc = Interop.downcallHandle(
        "pango_attribute_as_font_desc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontDesc}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFontDesc asFontDesc() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_font_desc.invokeExact(handle());
            return new AttrFontDesc(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_font_features = Interop.downcallHandle(
        "pango_attribute_as_font_features",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontFeatures}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFontFeatures asFontFeatures() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_font_features.invokeExact(handle());
            return new AttrFontFeatures(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_int = Interop.downcallHandle(
        "pango_attribute_as_int",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrInt}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrInt asInt() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_int.invokeExact(handle());
            return new AttrInt(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_language = Interop.downcallHandle(
        "pango_attribute_as_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrLanguage}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrLanguage asLanguage() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_language.invokeExact(handle());
            return new AttrLanguage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_shape = Interop.downcallHandle(
        "pango_attribute_as_shape",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrShape}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrShape asShape() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_shape.invokeExact(handle());
            return new AttrShape(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_size = Interop.downcallHandle(
        "pango_attribute_as_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrSize}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrSize asSize() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_size.invokeExact(handle());
            return new AttrSize(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_as_string = Interop.downcallHandle(
        "pango_attribute_as_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the attribute cast to {@code PangoAttrString}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrString asString() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_as_string.invokeExact(handle());
            return new AttrString(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_copy = Interop.downcallHandle(
        "pango_attribute_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make a copy of an attribute.
     */
    public Attribute copy() {
        try {
            var RESULT = (MemoryAddress) pango_attribute_copy.invokeExact(handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_destroy = Interop.downcallHandle(
        "pango_attribute_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroy a {@code PangoAttribute} and free all associated memory.
     */
    public void destroy() {
        try {
            pango_attribute_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_equal = Interop.downcallHandle(
        "pango_attribute_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compare two attributes for equality.
     * <p>
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     */
    public boolean equal(Attribute attr2) {
        try {
            var RESULT = (int) pango_attribute_equal.invokeExact(handle(), attr2.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attribute_init = Interop.downcallHandle(
        "pango_attribute_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code attr}'s klass to {@code klass}, it's start_index to
     * {@code PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING} and end_index to
     * {@code PANGO_ATTR_INDEX_TO_TEXT_END} such that the attribute applies
     * to the entire text by default.
     */
    public void init(AttrClass klass) {
        try {
            pango_attribute_init.invokeExact(handle(), klass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
