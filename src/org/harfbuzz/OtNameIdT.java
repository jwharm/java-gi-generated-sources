package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An integral type representing an OpenType &<code>#39</code> name&<code>#39</code>  table name identifier.
 * There are predefined name IDs, as well as name IDs return from other
 * API.  These can be used to fetch name strings from a font face.
 * 
 * For more information on these fields, see the
 * {@link [OpenType spec]}(https://docs.microsoft.com/en-us/typography/opentype/spec/name<code>#name</code> ids).
 */
public class OtNameIdT {

    private final int value;
    
    public OtNameIdT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public static int[] getValues(OtNameIdT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
