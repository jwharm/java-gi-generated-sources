package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned 64bit integer properties.
 */
public class ParamSpecUInt64 extends ParamSpec {

    public ParamSpecUInt64(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecUInt64 */
    public static ParamSpecUInt64 castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUInt64(gobject.getReference());
    }
    
}
