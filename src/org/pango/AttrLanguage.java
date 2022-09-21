package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrLanguage} structure is used to represent attributes that
 * are languages.
 */
public class AttrLanguage extends io.github.jwharm.javagi.ResourceBase {

    public AttrLanguage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a new language tag attribute.
     */
    public static Attribute new_(Language language) {
        var RESULT = gtk_h.pango_attr_language_new(language.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
}
