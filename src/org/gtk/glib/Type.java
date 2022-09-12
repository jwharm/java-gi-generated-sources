package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class Type {

    private final long value;
    
    public Type(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return this.value;
    }
    
}
