package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for languages. Each #hb_language_t corresponds to a BCP 47
 * language tag.
 */
public class LanguageT extends io.github.jwharm.javagi.interop.ResourceBase {

    public LanguageT(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Converts an #hb_language_t to a string.
     */
    public java.lang.String String() {
        var RESULT = gtk_h.hb_language_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
