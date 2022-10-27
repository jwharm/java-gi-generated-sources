package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for {@code GtkRecentManager} operations
 */
public class RecentManagerError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the URI specified does not exists in
     *   the recently used resources list.
     */
    public static final RecentManagerError NOT_FOUND = new RecentManagerError(0);
    
    /**
     * the URI specified is not valid.
     */
    public static final RecentManagerError INVALID_URI = new RecentManagerError(1);
    
    /**
     * the supplied string is not
     *   UTF-8 encoded.
     */
    public static final RecentManagerError INVALID_ENCODING = new RecentManagerError(2);
    
    /**
     * no application has registered
     *   the specified item.
     */
    public static final RecentManagerError NOT_REGISTERED = new RecentManagerError(3);
    
    /**
     * failure while reading the recently used
     *   resources file.
     */
    public static final RecentManagerError READ = new RecentManagerError(4);
    
    /**
     * failure while writing the recently used
     *   resources file.
     */
    public static final RecentManagerError WRITE = new RecentManagerError(5);
    
    /**
     * unspecified error.
     */
    public static final RecentManagerError UNKNOWN = new RecentManagerError(6);
    
    public RecentManagerError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_recent_manager_error_quark = Interop.downcallHandle(
            "gtk_recent_manager_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
