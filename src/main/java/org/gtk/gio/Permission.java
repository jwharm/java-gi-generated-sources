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
public class Permission extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPermission";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Permission proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Permission(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Permission> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Permission(input, ownership);
    
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
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if the permission was successfully acquired
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean acquire(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_acquire.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempts to acquire the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_acquire().
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback the {@link AsyncReadyCallback} to call when done
     */
    public void acquireAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_permission_acquire_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects the result of attempting to acquire the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_acquire().
     * @param result the {@link AsyncResult} given to the {@link AsyncReadyCallback}
     * @return {@code true} if the permission was successfully acquired
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean acquireFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_acquire_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value of the 'allowed' property.  This property is {@code true} if
     * the caller currently has permission to perform the action that
     * {@code permission} represents the permission to perform.
     * @return the value of the 'allowed' property
     */
    public boolean getAllowed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_get_allowed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value of the 'can-acquire' property.  This property is {@code true}
     * if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     * @return the value of the 'can-acquire' property
     */
    public boolean getCanAcquire() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_get_can_acquire.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value of the 'can-release' property.  This property is {@code true}
     * if it is generally possible to release the permission by calling
     * g_permission_release().
     * @return the value of the 'can-release' property
     */
    public boolean getCanRelease() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_get_can_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function is called by the {@link Permission} implementation to update
     * the properties of the permission.  You should never call this
     * function except from a {@link Permission} implementation.
     * <p>
     * GObject notify signals are generated, as appropriate.
     * @param allowed the new value for the 'allowed' property
     * @param canAcquire the new value for the 'can-acquire' property
     * @param canRelease the new value for the 'can-release' property
     */
    public void implUpdate(boolean allowed, boolean canAcquire, boolean canRelease) {
        try {
            DowncallHandles.g_permission_impl_update.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(allowed, null).intValue(),
                    Marshal.booleanToInteger.marshal(canAcquire, null).intValue(),
                    Marshal.booleanToInteger.marshal(canRelease, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} if the permission was successfully released
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean release(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_release.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempts to release the permission represented by {@code permission}.
     * <p>
     * This is the first half of the asynchronous version of
     * g_permission_release().
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback the {@link AsyncReadyCallback} to call when done
     */
    public void releaseAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_permission_release_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects the result of attempting to release the permission
     * represented by {@code permission}.
     * <p>
     * This is the second half of the asynchronous version of
     * g_permission_release().
     * @param result the {@link AsyncResult} given to the {@link AsyncReadyCallback}
     * @return {@code true} if the permission was successfully released
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean releaseFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_permission_release_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_permission_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Permission.Builder} object constructs a {@link Permission} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Permission.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Permission} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Permission}.
         * @return A new instance of {@code Permission} with the properties 
         *         that were set in the Builder object.
         */
        public Permission build() {
            return (Permission) org.gtk.gobject.GObject.newWithProperties(
                Permission.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if the caller currently has permission to perform the action that
         * {@code permission} represents the permission to perform.
         * @param allowed The value for the {@code allowed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowed(boolean allowed) {
            names.add("allowed");
            values.add(org.gtk.gobject.Value.create(allowed));
            return this;
        }
        
        /**
         * {@code true} if it is generally possible to acquire the permission by calling
         * g_permission_acquire().
         * @param canAcquire The value for the {@code can-acquire} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanAcquire(boolean canAcquire) {
            names.add("can-acquire");
            values.add(org.gtk.gobject.Value.create(canAcquire));
            return this;
        }
        
        /**
         * {@code true} if it is generally possible to release the permission by calling
         * g_permission_release().
         * @param canRelease The value for the {@code can-release} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanRelease(boolean canRelease) {
            names.add("can-release");
            values.add(org.gtk.gobject.Value.create(canRelease));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_permission_acquire = Interop.downcallHandle(
            "g_permission_acquire",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_acquire_async = Interop.downcallHandle(
            "g_permission_acquire_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_acquire_finish = Interop.downcallHandle(
            "g_permission_acquire_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_get_allowed = Interop.downcallHandle(
            "g_permission_get_allowed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_get_can_acquire = Interop.downcallHandle(
            "g_permission_get_can_acquire",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_get_can_release = Interop.downcallHandle(
            "g_permission_get_can_release",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_impl_update = Interop.downcallHandle(
            "g_permission_impl_update",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_permission_release = Interop.downcallHandle(
            "g_permission_release",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_release_async = Interop.downcallHandle(
            "g_permission_release_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_release_finish = Interop.downcallHandle(
            "g_permission_release_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_permission_get_type = Interop.downcallHandle(
            "g_permission_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
