package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing the behavior of a {@link DBusInterfaceSkeleton} instance.
 * @version 2.30
 */
public class DBusInterfaceSkeletonFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags set.
     */
    public static final DBusInterfaceSkeletonFlags NONE = new DBusInterfaceSkeletonFlags(0);
    
    /**
     * Each method invocation is handled in
     *   a thread dedicated to the invocation. This means that the method implementation can use blocking IO
     *   without blocking any other part of the process. It also means that the method implementation must
     *   use locking to access data structures used by other threads.
     */
    public static final DBusInterfaceSkeletonFlags HANDLE_METHOD_INVOCATIONS_IN_THREAD = new DBusInterfaceSkeletonFlags(1);
    
    public DBusInterfaceSkeletonFlags(int value) {
        super(value);
    }
}
