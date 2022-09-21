package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The class for {@link TlsInteraction}. Derived classes implement the various
 * virtual interaction methods to handle TLS interactions.
 * <p>
 * Derived classes can choose to implement whichever interactions methods they'd
 * like to support by overriding those virtual methods in their class
 * initialization function. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * <p>
 * The synchronous interaction methods should implement to display modal dialogs,
 * and the asynchronous methods to display modeless dialogs.
 * <p>
 * If the user cancels an interaction, then the result should be
 * {@link TlsInteractionResult#FAILED} and the error should be set with a domain of
 * {@code G_IO_ERROR} and code of {@link IOErrorEnum#CANCELLED}.
 */
public class TlsInteractionClass extends io.github.jwharm.javagi.ResourceBase {

    public TlsInteractionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
