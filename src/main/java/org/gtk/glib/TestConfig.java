package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
