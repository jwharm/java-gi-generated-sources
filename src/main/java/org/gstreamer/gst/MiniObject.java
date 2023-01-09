package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MiniObject} is a simple structure that can be used to implement refcounted
 * types.
 * <p>
 * Subclasses will include {@link MiniObject} as the first member in their structure
 * and then call gst_mini_object_init() to initialize the {@link MiniObject} fields.
 * <p>
 * gst_mini_object_ref() and gst_mini_object_unref() increment and decrement the
 * refcount respectively. When the refcount of a mini-object reaches 0, the
 * dispose function is called first and when this returns {@code true}, the free
 * function of the miniobject is called.
 * <p>
 * A copy can be made with gst_mini_object_copy().
 * <p>
 * gst_mini_object_is_writable() will return {@code true} when the refcount of the
 * object is exactly 1 and there is no parent or a single parent exists and is
 * writable itself, meaning the current caller has the only reference to the
 * object. gst_mini_object_make_writable() will return a writable version of
 * the object, which might be a new copy when the refcount was not 1.
 * <p>
 * Opaque data can be associated with a {@link MiniObject} with
 * gst_mini_object_set_qdata() and gst_mini_object_get_qdata(). The data is
 * meant to be specific to the particular object and is not automatically copied
 * with gst_mini_object_copy() or similar methods.
 * <p>
 * A weak reference can be added and remove with gst_mini_object_weak_ref()
 * and gst_mini_object_weak_unref() respectively.
 */
public class MiniObject extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMiniObject";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.C_INT.withName("refcount"),
            Interop.valueLayout.C_INT.withName("lockstate"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("dispose"),
            Interop.valueLayout.ADDRESS.withName("free"),
            Interop.valueLayout.C_INT.withName("priv_uint"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("priv_pointer")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MiniObject}
     * @return A new, uninitialized @{link MiniObject}
     */
    public static MiniObject allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MiniObject newInstance = new MiniObject(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code refcount}
     * @return The value of the field {@code refcount}
     */
    public int getRefcount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code refcount}
     * @param refcount The new value of the field {@code refcount}
     */
    public void setRefcount(int refcount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), refcount);
        }
    }
    
    /**
     * Get the value of the field {@code lockstate}
     * @return The value of the field {@code lockstate}
     */
    public int getLockstate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code lockstate}
     * @param lockstate The new value of the field {@code lockstate}
     */
    public void setLockstate(int lockstate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), lockstate);
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), flags);
        }
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gst.MiniObjectCopyFunction getCopy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(org.gstreamer.gst.MiniObjectCopyFunction copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code dispose}
     * @return The value of the field {@code dispose}
     */
    public org.gstreamer.gst.MiniObjectDisposeFunction getDispose() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code dispose}
     * @param dispose The new value of the field {@code dispose}
     */
    public void setDispose(org.gstreamer.gst.MiniObjectDisposeFunction dispose) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispose == null ? MemoryAddress.NULL : (Addressable) dispose.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code free}
     * @return The value of the field {@code free}
     */
    public org.gstreamer.gst.MiniObjectFreeFunction getFree() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(org.gstreamer.gst.MiniObjectFreeFunction free) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
        }
    }
    
    /**
     * Create a MiniObject proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MiniObject(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MiniObject> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MiniObject(input);
    
    /**
     * This adds {@code parent} as a parent for {@code object}. Having one ore more parents affects the
     * writability of {@code object}: if a {@code parent} is not writable, {@code object} is also not
     * writable, regardless of its refcount. {@code object} is only writable if all
     * the parents are writable and its own refcount is exactly 1.
     * <p>
     * Note: This function does not take ownership of {@code parent} and also does not
     * take an additional reference. It is the responsibility of the caller to
     * remove the parent again at a later time.
     * @param parent a parent {@link MiniObject}
     */
    public void addParent(org.gstreamer.gst.MiniObject parent) {
        try {
            DowncallHandles.gst_mini_object_add_parent.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a copy of the mini-object.
     * <p>
     * MT safe
     * @return the new mini-object if copying is
     * possible, {@code null} otherwise.
     */
    public @Nullable org.gstreamer.gst.MiniObject copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This function gets back user data pointers stored via
     * gst_mini_object_set_qdata().
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return The user data pointer set, or
     * {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_get_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a mini-object with the desired type and copy/dispose/free
     * functions.
     * @param flags initial {@link MiniObjectFlags}
     * @param type the {@link org.gtk.glib.Type} of the mini-object to create
     * @param copyFunc the copy function, or {@code null}
     * @param disposeFunc the dispose function, or {@code null}
     * @param freeFunc the free function or {@code null}
     */
    public void init(int flags, org.gtk.glib.Type type, @Nullable org.gstreamer.gst.MiniObjectCopyFunction copyFunc, @Nullable org.gstreamer.gst.MiniObjectDisposeFunction disposeFunc, @Nullable org.gstreamer.gst.MiniObjectFreeFunction freeFunc) {
        try {
            DowncallHandles.gst_mini_object_init.invokeExact(
                    handle(),
                    flags,
                    type.getValue().longValue(),
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) copyFunc.toCallback()),
                    (Addressable) (disposeFunc == null ? MemoryAddress.NULL : (Addressable) disposeFunc.toCallback()),
                    (Addressable) (freeFunc == null ? MemoryAddress.NULL : (Addressable) freeFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code mini_object} has the LOCKABLE flag set, check if the current EXCLUSIVE
     * lock on {@code object} is the only one, this means that changes to the object will
     * not be visible to any other object.
     * <p>
     * If the LOCKABLE flag is not set, check if the refcount of {@code mini_object} is
     * exactly 1, meaning that no other reference exists to the object and that the
     * object is therefore writable.
     * <p>
     * Modification of a mini-object should only be done after verifying that it
     * is writable.
     * @return {@code true} if the object is writable.
     */
    public boolean isWritable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_is_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Lock the mini-object with the specified access mode in {@code flags}.
     * @param flags {@link LockFlags}
     * @return {@code true} if {@code object} could be locked.
     */
    public boolean lock(org.gstreamer.gst.LockFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_lock.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a mini-object is writable.  If not, a writable copy is made and
     * returned.  This gives away the reference to the original mini object,
     * and returns a reference to the new object.
     * <p>
     * MT safe
     * @return a mini-object (possibly the same pointer) that
     *     is writable.
     */
    public org.gstreamer.gst.MiniObject makeWritable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_make_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Increase the reference count of the mini-object.
     * <p>
     * Note that the refcount affects the writability
     * of {@code mini}-object, see gst_mini_object_is_writable(). It is
     * important to note that keeping additional references to
     * GstMiniObject instances can potentially increase the number
     * of memcpy operations in a pipeline, especially if the miniobject
     * is a {@link Buffer}.
     * @return the mini-object.
     */
    public org.gstreamer.gst.MiniObject ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This removes {@code parent} as a parent for {@code object}. See
     * gst_mini_object_add_parent().
     * @param parent a parent {@link MiniObject}
     */
    public void removeParent(org.gstreamer.gst.MiniObject parent) {
        try {
            DowncallHandles.gst_mini_object_remove_parent.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This sets an opaque, named pointer on a miniobject.
     * The name is specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer
     * can be gotten back from the {@code object} with gst_mini_object_get_qdata()
     * until the {@code object} is disposed.
     * Setting a previously set user data pointer, overrides (frees)
     * the old pointer set, using {@code null} as pointer essentially
     * removes the data stored.
     * <p>
     * {@code destroy} may be specified which is called with {@code data} as argument
     * when the {@code object} is disposed, or the data is being overwritten by
     * a call to gst_mini_object_set_qdata() with the same {@code quark}.
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param destroy Function to invoke with {@code data} as argument, when {@code data}
     *           needs to be freed
     */
    public void setQdata(org.gtk.glib.Quark quark, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gst_mini_object_set_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function gets back user data pointers stored via gst_mini_object_set_qdata()
     * and removes the data from {@code object} without invoking its {@code destroy()} function (if
     * any was set).
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return The user data pointer set, or
     * {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_steal_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Unlock the mini-object with the specified access mode in {@code flags}.
     * @param flags {@link LockFlags}
     */
    public void unlock(org.gstreamer.gst.LockFlags flags) {
        try {
            DowncallHandles.gst_mini_object_unlock.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of the mini-object, possibly freeing
     * the mini-object.
     */
    public void unref() {
        try {
            DowncallHandles.gst_mini_object_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a weak reference callback to a mini object. Weak references are
     * used for notification when a mini object is finalized. They are called
     * "weak references" because they allow you to safely hold a pointer
     * to the mini object without calling gst_mini_object_ref()
     * (gst_mini_object_ref() adds a strong reference, that is, forces the object
     * to stay alive).
     * @param notify callback to invoke before the mini object is freed
     */
    public void weakRef(org.gstreamer.gst.MiniObjectNotify notify) {
        try {
            DowncallHandles.gst_mini_object_weak_ref.invokeExact(
                    handle(),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a weak reference callback from a mini object.
     * @param notify callback to search for
     */
    public void weakUnref(org.gstreamer.gst.MiniObjectNotify notify) {
        try {
            DowncallHandles.gst_mini_object_weak_unref.invokeExact(
                    handle(),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Atomically modifies a pointer to point to a new mini-object.
     * The reference count of {@code olddata} is decreased and the reference count of
     * {@code newdata} is increased.
     * <p>
     * Either {@code newdata} and the value pointed to by {@code olddata} may be {@code null}.
     * @param olddata pointer to a pointer to a
     *     mini-object to be replaced
     * @param newdata pointer to new mini-object
     * @return {@code true} if {@code newdata} was different from {@code olddata}
     */
    public static boolean replace(@Nullable Out<org.gstreamer.gst.MiniObject> olddata, @Nullable org.gstreamer.gst.MiniObject newdata) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mini_object_replace.invokeExact(
                        (Addressable) (olddata == null ? MemoryAddress.NULL : (Addressable) olddataPOINTER.address()),
                        (Addressable) (newdata == null ? MemoryAddress.NULL : newdata.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (olddata != null) olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Replace the current {@link MiniObject} pointer to by {@code olddata} with {@code null} and
     * return the old value.
     * @param olddata pointer to a pointer to a mini-object to
     *     be stolen
     * @return the {@link MiniObject} at {@code oldata}
     */
    public static @Nullable org.gstreamer.gst.MiniObject steal(Out<org.gstreamer.gst.MiniObject> olddata) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_steal.invokeExact((Addressable) olddataPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Modifies a pointer to point to a new mini-object. The modification
     * is done atomically. This version is similar to gst_mini_object_replace()
     * except that it does not increase the refcount of {@code newdata} and thus
     * takes ownership of {@code newdata}.
     * <p>
     * Either {@code newdata} and the value pointed to by {@code olddata} may be {@code null}.
     * @param olddata pointer to a pointer to a mini-object to
     *     be replaced
     * @param newdata pointer to new mini-object
     * @return {@code true} if {@code newdata} was different from {@code olddata}
     */
    public static boolean take(Out<org.gstreamer.gst.MiniObject> olddata, org.gstreamer.gst.MiniObject newdata) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment olddataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mini_object_take.invokeExact(
                        (Addressable) olddataPOINTER.address(),
                        newdata.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    olddata.set(org.gstreamer.gst.MiniObject.fromAddress.marshal(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mini_object_add_parent = Interop.downcallHandle(
                "gst_mini_object_add_parent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_copy = Interop.downcallHandle(
                "gst_mini_object_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_get_qdata = Interop.downcallHandle(
                "gst_mini_object_get_qdata",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mini_object_init = Interop.downcallHandle(
                "gst_mini_object_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_is_writable = Interop.downcallHandle(
                "gst_mini_object_is_writable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_lock = Interop.downcallHandle(
                "gst_mini_object_lock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mini_object_make_writable = Interop.downcallHandle(
                "gst_mini_object_make_writable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_ref = Interop.downcallHandle(
                "gst_mini_object_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_remove_parent = Interop.downcallHandle(
                "gst_mini_object_remove_parent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_set_qdata = Interop.downcallHandle(
                "gst_mini_object_set_qdata",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_steal_qdata = Interop.downcallHandle(
                "gst_mini_object_steal_qdata",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mini_object_unlock = Interop.downcallHandle(
                "gst_mini_object_unlock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_mini_object_unref = Interop.downcallHandle(
                "gst_mini_object_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_weak_ref = Interop.downcallHandle(
                "gst_mini_object_weak_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_weak_unref = Interop.downcallHandle(
                "gst_mini_object_weak_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_replace = Interop.downcallHandle(
                "gst_mini_object_replace",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_steal = Interop.downcallHandle(
                "gst_mini_object_steal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mini_object_take = Interop.downcallHandle(
                "gst_mini_object_take",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link MiniObject.Builder} object constructs a {@link MiniObject} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MiniObject.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MiniObject struct;
        
        private Builder() {
            struct = MiniObject.allocate();
        }
        
        /**
         * Finish building the {@link MiniObject} struct.
         * @return A new instance of {@code MiniObject} with the fields 
         *         that were set in the Builder object.
         */
        public MiniObject build() {
            return struct;
        }
        
        /**
         * the GType of the object
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * atomic refcount
         * @param refcount The value for the {@code refcount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefcount(int refcount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refcount);
                return this;
            }
        }
        
        /**
         * atomic state of the locks
         * @param lockstate The value for the {@code lockstate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLockstate(int lockstate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), lockstate);
                return this;
            }
        }
        
        /**
         * extra flags.
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), flags);
                return this;
            }
        }
        
        /**
         * a copy function
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopy(org.gstreamer.gst.MiniObjectCopyFunction copy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
                return this;
            }
        }
        
        /**
         * a dispose function
         * @param dispose The value for the {@code dispose} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDispose(org.gstreamer.gst.MiniObjectDisposeFunction dispose) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispose == null ? MemoryAddress.NULL : (Addressable) dispose.toCallback()));
                return this;
            }
        }
        
        /**
         * the free function
         * @param free The value for the {@code free} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFree(org.gstreamer.gst.MiniObjectFreeFunction free) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
                return this;
            }
        }
        
        public Builder setPrivUint(int privUint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv_uint"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), privUint);
                return this;
            }
        }
        
        public Builder setPrivPointer(java.lang.foreign.MemoryAddress privPointer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv_pointer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (privPointer == null ? MemoryAddress.NULL : (Addressable) privPointer));
                return this;
            }
        }
    }
}
