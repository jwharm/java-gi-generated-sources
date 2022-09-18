package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.Permission} represents the status of the caller&<code>#39</code> s permission to
 * perform a certain action.
 * 
 * You can query if the action is currently allowed and if it is
 * possible to acquire the permission so that the action will be allowed
 * in the future.
 * 
 * There is also an API to actually acquire the permission and one to
 * release it.
 * 
 * As an example, a {@link org.gtk.gio.Permission} might represent the ability for the
 * user to write to a {@link org.gtk.gio.Settings} object.  This {@link org.gtk.gio.Permission} object could
 * then be used to decide if it is appropriate to show a &<code>#34</code> Click here to
 * unlock&<code>#34</code>  button in a dialog and to provide the mechanism to invoke
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
     * Attempts to acquire the permission represented by @permission.
     * 
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  A simple example is
     * that a dialog may appear asking the user to enter their password.
     * 
     * You should check with g_permission_get_can_acquire() before calling
     * this function.
     * 
     * If the permission is acquired then <code>true</code> is returned.  Otherwise,
     * <code>false</code> is returned and @error is set appropriately.
     * 
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
     * Attempts to acquire the permission represented by @permission.
     * 
     * This is the first half of the asynchronous version of
     * g_permission_acquire().
     */
    public void acquireAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_permission_acquire_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Collects the result of attempting to acquire the permission
     * represented by @permission.
     * 
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
     * Gets the value of the &<code>#39</code> allowed&<code>#39</code>  property.  This property is <code>true</code> if
     * the caller currently has permission to perform the action that
     * @permission represents the permission to perform.
     */
    public boolean getAllowed() {
        var RESULT = gtk_h.g_permission_get_allowed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the &<code>#39</code> can-acquire&<code>#39</code>  property.  This property is <code>true</code> if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     */
    public boolean getCanAcquire() {
        var RESULT = gtk_h.g_permission_get_can_acquire(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the &<code>#39</code> can-release&<code>#39</code>  property.  This property is <code>true</code> if it is generally possible to release the permission by calling
     * g_permission_release().
     */
    public boolean getCanRelease() {
        var RESULT = gtk_h.g_permission_get_can_release(handle());
        return (RESULT != 0);
    }
    
    /**
     * This function is called by the {@link org.gtk.gio.Permission} implementation to update
     * the properties of the permission.  You should never call this
     * function except from a {@link org.gtk.gio.Permission} implementation.
     * 
     * GObject notify signals are generated, as appropriate.
     */
    public void implUpdate(boolean allowed, boolean canAcquire, boolean canRelease) {
        gtk_h.g_permission_impl_update(handle(), allowed ? 1 : 0, canAcquire ? 1 : 0, canRelease ? 1 : 0);
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
     * If the permission is released then <code>true</code> is returned.  Otherwise,
     * <code>false</code> is returned and @error is set appropriately.
     * 
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
     * Attempts to release the permission represented by @permission.
     * 
     * This is the first half of the asynchronous version of
     * g_permission_release().
     */
    public void releaseAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_permission_release_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Collects the result of attempting to release the permission
     * represented by @permission.
     * 
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
