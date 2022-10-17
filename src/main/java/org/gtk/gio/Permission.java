package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Permission} represents the status of the caller's permission to
 * perform a certain action.
 * <p>
 * You can query if the action is currently allowed and if it is
 * possible to acquire the permission so that the action will be allowed
 * in the future.
 * <p>
 * There is also an API to actually acquire the permission and one to
 * release it.
 * <p>
 * As an example, a {@link Permission} might represent the ability for the
 * user to write to a {@link Settings} object.  This {@link Permission} object could
 * then be used to decide if it is appropriate to show a "Click here to
 * unlock" button in a dialog and to provide the mechanism to invoke
 * when that button is clicked.
 */
public class Permission extends org.gtk.gobject.Object {

    public Permission(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Permission */
    public static Permission castFrom(org.gtk.gobject.Object gobject) {
        return new Permission(gobject.refcounted());
    }
    
    private static final MethodHandle g_permission_acquire = Interop.downcallHandle(
        "g_permission_acquire",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to acquire the permission represented by {@code permission}.
     * <p>
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  A simple example is
     * that a dialog may appear asking the user to enter their password.
     * <p>
     * You should check with g_permission_get_can_acquire() before calling
     * this function.
     * <p>
     * If the permission is acquired then {@code true} is returned.  Otherwise,
     * {@code false} is returned and {@code error} is set appropriately.
     * <p>
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_acquire_async() for
     * the non-blocking version.
     */
    public boolean acquire(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_permission_acquire.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_acquire_async = Interop.downcallHandle(
        "g_permission_acquire_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to acquire the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_acquire().
     */
    public @NotNull void acquireAsync(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_permission_acquire_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_permission_acquire_finish = Interop.downcallHandle(
        "g_permission_acquire_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects the result of attempting to acquire the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_acquire().
     */
    public boolean acquireFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_permission_acquire_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_get_allowed = Interop.downcallHandle(
        "g_permission_get_allowed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the 'allowed' property.  This property is {@code true} if
     * the caller currently has permission to perform the action that
     * {@code permission} represents the permission to perform.
     */
    public boolean getAllowed() {
        int RESULT;
        try {
            RESULT = (int) g_permission_get_allowed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_get_can_acquire = Interop.downcallHandle(
        "g_permission_get_can_acquire",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the 'can-acquire' property.  This property is {@code true}
     * if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     */
    public boolean getCanAcquire() {
        int RESULT;
        try {
            RESULT = (int) g_permission_get_can_acquire.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_get_can_release = Interop.downcallHandle(
        "g_permission_get_can_release",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the 'can-release' property.  This property is {@code true}
     * if it is generally possible to release the permission by calling
     * g_permission_release().
     */
    public boolean getCanRelease() {
        int RESULT;
        try {
            RESULT = (int) g_permission_get_can_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_impl_update = Interop.downcallHandle(
        "g_permission_impl_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * This function is called by the {@link Permission} implementation to update
     * the properties of the permission.  You should never call this
     * function except from a {@link Permission} implementation.
     * <p>
     * GObject notify signals are generated, as appropriate.
     */
    public @NotNull void implUpdate(@NotNull boolean allowed, @NotNull boolean canAcquire, @NotNull boolean canRelease) {
        try {
            g_permission_impl_update.invokeExact(handle(), allowed ? 1 : 0, canAcquire ? 1 : 0, canRelease ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_permission_release = Interop.downcallHandle(
        "g_permission_release",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to release the permission represented by {@code permission}.
     * <p>
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  In most cases the
     * permission will be dropped immediately without further action.
     * <p>
     * You should check with g_permission_get_can_release() before calling
     * this function.
     * <p>
     * If the permission is released then {@code true} is returned.  Otherwise,
     * {@code false} is returned and {@code error} is set appropriately.
     * <p>
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_release_async() for
     * the non-blocking version.
     */
    public boolean release(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_permission_release.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_permission_release_async = Interop.downcallHandle(
        "g_permission_release_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to release the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_release().
     */
    public @NotNull void releaseAsync(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_permission_release_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_permission_release_finish = Interop.downcallHandle(
        "g_permission_release_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects the result of attempting to release the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_release().
     */
    public boolean releaseFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_permission_release_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
}
