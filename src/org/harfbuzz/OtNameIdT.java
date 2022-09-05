package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An integral type representing an OpenType 'name' table name identifier.
 * There are predefined name IDs, as well as name IDs return from other
 * API.  These can be used to fetch name strings from a font face.
 * 
 * For more information on these fields, see the
 * [OpenType spec](https://docs.microsoft.com/en-us/typography/opentype/spec/name#name-ids).
 */
public class OtNameIdT {

    private final int value;
    
    public OtNameIdT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
