package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>PangoAttribute</code> structure represents the common portions of all
 * attributes.
 * 
 * Particular types of attributes include this structure as their initial
 * portion. The common portion of the attribute holds the range to which
 * the value in the type-specific part of the attribute applies and should
 * be initialized using {@link org.pango.Attribute<code>#init</code> . By default, an attribute
 * will have an all-inclusive range of {@link [0,<code>G_MAXUINT</code> }.
 */
public class Attribute extends io.github.jwharm.javagi.ResourceBase {

    public Attribute(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrColor</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrColor asColor() {
        var RESULT = gtk_h.pango_attribute_as_color(handle());
        return new AttrColor(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrFloat</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFloat asFloat() {
        var RESULT = gtk_h.pango_attribute_as_float(handle());
        return new AttrFloat(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrFontDesc</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFontDesc asFontDesc() {
        var RESULT = gtk_h.pango_attribute_as_font_desc(handle());
        return new AttrFontDesc(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrFontFeatures</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFontFeatures asFontFeatures() {
        var RESULT = gtk_h.pango_attribute_as_font_features(handle());
        return new AttrFontFeatures(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrInt</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrInt asInt() {
        var RESULT = gtk_h.pango_attribute_as_int(handle());
        return new AttrInt(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrLanguage</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrLanguage asLanguage() {
        var RESULT = gtk_h.pango_attribute_as_language(handle());
        return new AttrLanguage(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrShape</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrShape asShape() {
        var RESULT = gtk_h.pango_attribute_as_shape(handle());
        return new AttrShape(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrSize</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrSize asSize() {
        var RESULT = gtk_h.pango_attribute_as_size(handle());
        return new AttrSize(References.get(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to <code>PangoAttrString</code>.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrString asString() {
        var RESULT = gtk_h.pango_attribute_as_string(handle());
        return new AttrString(References.get(RESULT, false));
    }
    
    /**
     * Make a copy of an attribute.
     */
    public Attribute copy() {
        var RESULT = gtk_h.pango_attribute_copy(handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Destroy a <code>PangoAttribute</code> and free all associated memory.
     */
    public void destroy() {
        gtk_h.pango_attribute_destroy(handle());
    }
    
    /**
     * Compare two attributes for equality.
     * 
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     */
    public boolean equal(Attribute attr2) {
        var RESULT = gtk_h.pango_attribute_equal(handle(), attr2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes @attr&<code>#39</code> s klass to @klass, it&<code>#39</code> s start_index to
     * <code>PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING</code> and end_index to
     * <code>PANGO_ATTR_INDEX_TO_TEXT_END</code> such that the attribute applies
     * to the entire text by default.
     */
    public void init(AttrClass klass) {
        gtk_h.pango_attribute_init(handle(), klass.handle());
    }
    
}
