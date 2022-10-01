package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    public Attribute() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttribute.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrColor}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrColor asColor() {
        var RESULT = gtk_h.pango_attribute_as_color(handle());
        return new AttrColor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFloat}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFloat asFloat() {
        var RESULT = gtk_h.pango_attribute_as_float(handle());
        return new AttrFloat(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontDesc}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFontDesc asFontDesc() {
        var RESULT = gtk_h.pango_attribute_as_font_desc(handle());
        return new AttrFontDesc(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrFontFeatures}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrFontFeatures asFontFeatures() {
        var RESULT = gtk_h.pango_attribute_as_font_features(handle());
        return new AttrFontFeatures(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrInt}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrInt asInt() {
        var RESULT = gtk_h.pango_attribute_as_int(handle());
        return new AttrInt(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrLanguage}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrLanguage asLanguage() {
        var RESULT = gtk_h.pango_attribute_as_language(handle());
        return new AttrLanguage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrShape}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrShape asShape() {
        var RESULT = gtk_h.pango_attribute_as_shape(handle());
        return new AttrShape(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrSize}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrSize asSize() {
        var RESULT = gtk_h.pango_attribute_as_size(handle());
        return new AttrSize(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to {@code PangoAttrString}.
     * <p>
     * This is mainly useful for language bindings.
     */
    public AttrString asString() {
        var RESULT = gtk_h.pango_attribute_as_string(handle());
        return new AttrString(Refcounted.get(RESULT, false));
    }
    
    /**
     * Make a copy of an attribute.
     */
    public Attribute copy() {
        var RESULT = gtk_h.pango_attribute_copy(handle());
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
    /**
     * Destroy a {@code PangoAttribute} and free all associated memory.
     */
    public void destroy() {
        gtk_h.pango_attribute_destroy(handle());
    }
    
    /**
     * Compare two attributes for equality.
     * <p>
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     */
    public boolean equal(Attribute attr2) {
        var RESULT = gtk_h.pango_attribute_equal(handle(), attr2.handle());
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code attr}'s klass to {@code klass}, it's start_index to
     * {@code PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING} and end_index to
     * {@code PANGO_ATTR_INDEX_TO_TEXT_END} such that the attribute applies
     * to the entire text by default.
     */
    public void init(AttrClass klass) {
        gtk_h.pango_attribute_init(handle(), klass.handle());
    }
    
}
