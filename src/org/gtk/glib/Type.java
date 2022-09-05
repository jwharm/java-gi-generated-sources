package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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
