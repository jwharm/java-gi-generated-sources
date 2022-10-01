package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrLanguage} structure is used to represent attributes that
 * are languages.
 */
public class AttrLanguage extends io.github.jwharm.javagi.ResourceBase {

    public AttrLanguage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrLanguage() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrLanguage.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Create a new language tag attribute.
     */
    public static Attribute new_(Language language) {
        var RESULT = gtk_h.pango_attr_language_new(language.handle());
        return new Attribute(Refcounted.get(RESULT, true));
    }
    
}
