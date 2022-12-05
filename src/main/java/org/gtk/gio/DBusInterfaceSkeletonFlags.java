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
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceSkeletonFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusInterfaceSkeletonFlags or(DBusInterfaceSkeletonFlags mask) {
        return new DBusInterfaceSkeletonFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusInterfaceSkeletonFlags combined(DBusInterfaceSkeletonFlags mask, DBusInterfaceSkeletonFlags... masks) {
        int value = mask.getValue();        for (DBusInterfaceSkeletonFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusInterfaceSkeletonFlags(value);
    }
}
