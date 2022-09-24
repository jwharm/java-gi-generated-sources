package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public Permission(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Permission */
    public static Permission castFrom(org.gtk.gobject.Object gobject) {
        return new Permission(gobject.getReference());
    }
    
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
    public boolean acquire(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_permission_acquire(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Attempts to acquire the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_acquire().
     */
    public void acquireAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_permission_acquire_async(handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Collects the result of attempting to acquire the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_acquire().
     */
    public boolean acquireFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_permission_acquire_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'allowed' property.  This property is {@code true} if
     * the caller currently has permission to perform the action that
     * {@code permission} represents the permission to perform.
     */
    public boolean getAllowed() {
        var RESULT = gtk_h.g_permission_get_allowed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'can-acquire' property.  This property is {@code true}
     * if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     */
    public boolean getCanAcquire() {
        var RESULT = gtk_h.g_permission_get_can_acquire(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'can-release' property.  This property is {@code true}
     * if it is generally possible to release the permission by calling
     * g_permission_release().
     */
    public boolean getCanRelease() {
        var RESULT = gtk_h.g_permission_get_can_release(handle());
        return (RESULT != 0);
    }
    
    /**
     * This function is called by the {@link Permission} implementation to update
     * the properties of the permission.  You should never call this
     * function except from a {@link Permission} implementation.
     * <p>
     * GObject notify signals are generated, as appropriate.
     */
    public void implUpdate(boolean allowed, boolean canAcquire, boolean canRelease) {
        gtk_h.g_permission_impl_update(handle(), allowed ? 1 : 0, canAcquire ? 1 : 0, canRelease ? 1 : 0);
    }
    
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
    public boolean release(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_permission_release(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Attempts to release the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_release().
     */
    public void releaseAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_permission_release_async(handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Collects the result of attempting to release the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_release().
     */
    public boolean releaseFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_permission_release_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
