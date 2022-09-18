package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.ParamSpec} derived structure that contains the meta data for character properties.
 */
public class ParamSpecChar extends ParamSpec {

    public ParamSpecChar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecChar */
    public static ParamSpecChar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecChar(gobject.getReference());
    }
    
}
