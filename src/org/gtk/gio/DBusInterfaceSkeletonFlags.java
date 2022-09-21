package org.gtk.gio;

/**
 * Flags describing the behavior of a {@link DBusInterfaceSkeleton} instance.
 */
public class DBusInterfaceSkeletonFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Each method invocation is handled in
     *   a thread dedicated to the invocation. This means that the method implementation can use blocking IO
     *   without blocking any other part of the process. It also means that the method implementation must
     *   use locking to access data structures used by other threads.
     */
    public static final int HANDLE_METHOD_INVOCATIONS_IN_THREAD = 1;
    
}
