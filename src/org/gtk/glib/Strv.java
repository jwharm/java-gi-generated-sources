package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A typedef alias for gchar**. This is mostly useful when used together with
 * g_auto().
 */
public class Strv {

    private final java.lang.String value;
    
    public Strv(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getValue() {
        return this.value;
    }
    
}
