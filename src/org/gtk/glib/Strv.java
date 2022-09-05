package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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
