package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A numerical value which represents the unique identifier of a registered
 * type.
 */
public class Type {

    private final long value;
    
    public Type(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return this.value;
    }
    
    public static long[] getValues(Type[] array) {
        long[] values = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
