package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The list of functions that can be implemented for the {@code GtkShortcutManager}
 * interface.
 * <p>
 * Note that no function is mandatory to implement, the default implementation
 * will work fine.
 */
public class ShortcutManagerInterface extends io.github.jwharm.javagi.ResourceBase {

    public ShortcutManagerInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ShortcutManagerInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkShortcutManagerInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
