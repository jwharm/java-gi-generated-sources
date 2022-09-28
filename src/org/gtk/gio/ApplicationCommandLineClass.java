package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link ApplicationCommandLineClass}-struct
 * contains private data only.
 */
public class ApplicationCommandLineClass extends io.github.jwharm.javagi.ResourceBase {

    public ApplicationCommandLineClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ApplicationCommandLineClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GApplicationCommandLineClass.allocate(Interop.getAllocator()).address()));
    }
    
}
