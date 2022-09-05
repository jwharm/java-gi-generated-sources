package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoAttribute` structure represents the common portions of all
 * attributes.
 * 
 * Particular types of attributes include this structure as their initial
 * portion. The common portion of the attribute holds the range to which
 * the value in the type-specific part of the attribute applies and should
 * be initialized using [method@Pango.Attribute.init]. By default, an attribute
 * will have an all-inclusive range of [0,%G_MAXUINT].
 */
public class Attribute extends io.github.jwharm.javagi.interop.ResourceBase {

    public Attribute(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns the attribute cast to `PangoAttrColor`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrColor asColor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_color(HANDLE());
        return new AttrColor(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrFloat`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFloat asFloat() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_float(HANDLE());
        return new AttrFloat(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrFontDesc`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFontDesc asFontDesc() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_font_desc(HANDLE());
        return new AttrFontDesc(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrFontFeatures`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrFontFeatures asFontFeatures() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_font_features(HANDLE());
        return new AttrFontFeatures(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrInt`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrInt asInt() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_int(HANDLE());
        return new AttrInt(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrLanguage`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrLanguage asLanguage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_language(HANDLE());
        return new AttrLanguage(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrShape`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrShape asShape() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_shape(HANDLE());
        return new AttrShape(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrSize`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrSize asSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_size(HANDLE());
        return new AttrSize(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the attribute cast to `PangoAttrString`.
     * 
     * This is mainly useful for language bindings.
     */
    public AttrString asString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_as_string(HANDLE());
        return new AttrString(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Make a copy of an attribute.
     */
    public Attribute copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_copy(HANDLE());
        return new Attribute(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Destroy a `PangoAttribute` and free all associated memory.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_destroy(HANDLE());
    }
    
    /**
     * Compare two attributes for equality.
     * 
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     */
    public boolean equal(Attribute attr2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_equal(HANDLE(), attr2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Initializes @attr's klass to @klass, it's start_index to
     * %PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING and end_index to
     * %PANGO_ATTR_INDEX_TO_TEXT_END such that the attribute applies
     * to the entire text by default.
     */
    public void init(AttrClass klass) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_attribute_init(HANDLE(), klass.HANDLE());
    }
    
}
