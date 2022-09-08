package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GPermission represents the status of the caller's permission to
 * perform a certain action.
 * 
 * You can query if the action is currently allowed and if it is
 * possible to acquire the permission so that the action will be allowed
 * in the future.
 * 
 * There is also an API to actually acquire the permission and one to
 * release it.
 * 
 * As an example, a #GPermission might represent the ability for the
 * user to write to a #GSettings object.  This #GPermission object could
 * then be used to decide if it is appropriate to show a "Click here to
 * unlock" button in a dialog and to provide the mechanism to invoke
 * when that button is clicked.
 */
public class Permission extends org.gtk.gobject.Object {

    public Permission(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Permission */
    public static Permission castFrom(org.gtk.gobject.Object gobject) {
        return new Permission(gobject.getReference());
    }
    
    /**
     * Attempts to acquire the permission represented by @permission.
     * 
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  A simple example is
     * that a dialog may appear asking the user to enter their password.
     * 
     * You should check with g_permission_get_can_acquire() before calling
     * this function.
     * 
     * If the permission is acquired then %TRUE is returned.  Otherwise,
     * %FALSE is returned and @error is set appropriately.
     * 
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_acquire_async() for
     * the non-blocking version.
     */
    public boolean acquire(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_acquire(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Collects the result of attempting to acquire the permission
     * represented by @permission.
     * 
     * This is the second half of the asynchronous version of
     * g_permission_acquire().
     */
    public boolean acquireFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_acquire_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'allowed' property.  This property is %TRUE if
     * the caller currently has permission to perform the action that
     * @permission represents the permission to perform.
     */
    public boolean getAllowed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_get_allowed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'can-acquire' property.  This property is %TRUE
     * if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     */
    public boolean getCanAcquire() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_get_can_acquire(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the 'can-release' property.  This property is %TRUE
     * if it is generally possible to release the permission by calling
     * g_permission_release().
     */
    public boolean getCanRelease() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_get_can_release(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This function is called by the #GPermission implementation to update
     * the properties of the permission.  You should never call this
     * function except from a #GPermission implementation.
     * 
     * GObject notify signals are generated, as appropriate.
     */
    public void implUpdate(boolean allowed, boolean canAcquire, boolean canRelease) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_impl_update(HANDLE(), allowed ? 1 : 0, canAcquire ? 1 : 0, canRelease ? 1 : 0);
    }
    
    /**
     * Attempts to release the permission represented by @permission.
     * 
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  In most cases the
     * permission will be dropped immediately without further action.
     * 
     * You should check with g_permission_get_can_release() before calling
     * this function.
     * 
     * If the permission is released then %TRUE is returned.  Otherwise,
     * %FALSE is returned and @error is set appropriately.
     * 
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_release_async() for
     * the non-blocking version.
     */
    public boolean release(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_release(HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Collects the result of attempting to release the permission
     * represented by @permission.
     * 
     * This is the second half of the asynchronous version of
     * g_permission_release().
     */
    public boolean releaseFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_permission_release_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
