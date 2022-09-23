package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TestConfig extends io.github.jwharm.javagi.ResourceBase {

    public TestConfig(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TestConfig() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTestConfig.allocate(Interop.getAllocator()).address()));
    }
    
}
