package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * {@link ParamSpec}/{@link Value} pairs to the {@code constructor} of a {@link ObjectClass}.
 */
public class ObjectConstructParam extends io.github.jwharm.javagi.ResourceBase {

    public ObjectConstructParam(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ObjectConstructParam() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GObjectConstructParam.allocate(Interop.getAllocator()).address()));
    }
    
}
