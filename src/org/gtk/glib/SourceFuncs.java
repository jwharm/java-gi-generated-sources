package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GSourceFuncs` struct contains a table of
 * functions used to handle event sources in a generic manner.
 * 
 * For idle sources, the prepare and check functions always return %TRUE
 * to indicate that the source is always ready to be processed. The prepare
 * function also returns a timeout value of 0 to ensure that the poll() call
 * doesn't block (since that would be time wasted which could have been spent
 * running the idle function).
 * 
 * For timeout sources, the prepare and check functions both return %TRUE
 * if the timeout interval has expired. The prepare function also returns
 * a timeout value to ensure that the poll() call doesn't block too long
 * and miss the next timeout.
 * 
 * For file descriptor sources, the prepare function typically returns %FALSE,
 * since it must wait until poll() has been called before it knows whether
 * any events need to be processed. It sets the returned timeout to -1 to
 * indicate that it doesn't mind how long the poll() call blocks. In the
 * check function, it tests the results of the poll() call to see if the
 * required condition has been met, and returns %TRUE if so.
 */
public class SourceFuncs extends io.github.jwharm.javagi.ResourceBase {

    public SourceFuncs(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
