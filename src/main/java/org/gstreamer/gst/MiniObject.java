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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MiniObject}
     * @return A new, uninitialized @{link MiniObject}
     */
    public static MiniObject allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MiniObject newInstance = new MiniObject(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code refcount}
     * @return The value of the field {@code refcount}
     */
    public int refcount$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refcount}
     * @param refcount The new value of the field {@code refcount}
     */
    public void refcount$set(int refcount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refcount);
    }
    
    /**
     * Get the value of the field {@code lockstate}
     * @return The value of the field {@code lockstate}
     */
    public int lockstate$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lockstate}
     * @param lockstate The new value of the field {@code lockstate}
     */
    public void lockstate$set(int lockstate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lockstate);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gst.MiniObjectCopyFunction copy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code dispose}
     * @return The value of the field {@code dispose}
     */
    public org.gstreamer.gst.MiniObjectDisposeFunction dispose$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code free}
     * @return The value of the field {@code free}
     */
    public org.gstreamer.gst.MiniObjectFreeFunction free$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a MiniObject proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MiniObject(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
    public void addParent(@NotNull org.gstreamer.gst.MiniObject parent) {
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
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
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
    }
    
    /**
     * This function gets back user data pointers stored via
     * gst_mini_object_set_qdata().
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return The user data pointer set, or
     * {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
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
     * @param type the {@link org.gtk.gobject.Type} of the mini-object to create
     * @param copyFunc the copy function, or {@code null}
     * @param disposeFunc the dispose function, or {@code null}
     * @param freeFunc the free function or {@code null}
     */
    public void init(int flags, @NotNull org.gtk.glib.Type type, @Nullable org.gstreamer.gst.MiniObjectCopyFunction copyFunc, @Nullable org.gstreamer.gst.MiniObjectDisposeFunction disposeFunc, @Nullable org.gstreamer.gst.MiniObjectFreeFunction freeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
            RESULT = (int) DowncallHandles.gst_mini_object_is_writable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lock the mini-object with the specified access mode in {@code flags}.
     * @param flags {@link LockFlags}
     * @return {@code true} if {@code object} could be locked.
     */
    public boolean lock(@NotNull org.gstreamer.gst.LockFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_lock.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull org.gstreamer.gst.MiniObject makeWritable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_make_writable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
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
    public @NotNull org.gstreamer.gst.MiniObject ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
    }
    
    /**
     * This removes {@code parent} as a parent for {@code object}. See
     * gst_mini_object_add_parent().
     * @param parent a parent {@link MiniObject}
     */
    public void removeParent(@NotNull org.gstreamer.gst.MiniObject parent) {
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
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
     * @param data An opaque user data pointer
     * @param destroy Function to invoke with {@code data} as argument, when {@code data}
     *           needs to be freed
     */
    public void setQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data, @NotNull org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.gst_mini_object_set_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) data,
                    Interop.cbDestroyNotifySymbol());
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
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
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
    public void unlock(@NotNull org.gstreamer.gst.LockFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
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
            DowncallHandles.gst_mini_object_unref.invokeExact(
                    handle());
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
    public void weakRef(@NotNull org.gstreamer.gst.MiniObjectNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.gst_mini_object_weak_ref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbMiniObjectNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a weak reference callback from a mini object.
     * @param notify callback to search for
     */
    public void weakUnref(@NotNull org.gstreamer.gst.MiniObjectNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.gst_mini_object_weak_unref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbMiniObjectNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
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
        MemorySegment olddataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_replace.invokeExact(
                    (Addressable) (olddata == null ? MemoryAddress.NULL : (Addressable) olddataPOINTER.address()),
                    (Addressable) (newdata == null ? MemoryAddress.NULL : newdata.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (olddata != null) olddata.set(new org.gstreamer.gst.MiniObject(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Replace the current {@link MiniObject} pointer to by {@code olddata} with {@code null} and
     * return the old value.
     * @param olddata pointer to a pointer to a mini-object to
     *     be stolen
     * @return the {@link MiniObject} at {@code oldata}
     */
    public static @Nullable org.gstreamer.gst.MiniObject steal(@NotNull Out<org.gstreamer.gst.MiniObject> olddata) {
        java.util.Objects.requireNonNull(olddata, "Parameter 'olddata' must not be null");
        MemorySegment olddataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mini_object_steal.invokeExact(
                    (Addressable) olddataPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        olddata.set(new org.gstreamer.gst.MiniObject(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
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
    public static boolean take(@NotNull Out<org.gstreamer.gst.MiniObject> olddata, @NotNull org.gstreamer.gst.MiniObject newdata) {
        java.util.Objects.requireNonNull(olddata, "Parameter 'olddata' must not be null");
        MemorySegment olddataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(newdata, "Parameter 'newdata' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mini_object_take.invokeExact(
                    (Addressable) olddataPOINTER.address(),
                    newdata.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        olddata.set(new org.gstreamer.gst.MiniObject(olddataPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MiniObject struct;
        
         /**
         * A {@link MiniObject.Build} object constructs a {@link MiniObject} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MiniObject.allocate();
        }
        
         /**
         * Finish building the {@link MiniObject} struct.
         * @return A new instance of {@code MiniObject} with the fields 
         *         that were set in the Build object.
         */
        public MiniObject construct() {
            return struct;
        }
        
        /**
         * the GType of the object
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * atomic refcount
         * @param refcount The value for the {@code refcount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRefcount(int refcount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refcount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refcount);
            return this;
        }
        
        /**
         * atomic state of the locks
         * @param lockstate The value for the {@code lockstate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLockstate(int lockstate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lockstate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lockstate);
            return this;
        }
        
        /**
         * extra flags.
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * a copy function
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        /**
         * a dispose function
         * @param dispose The value for the {@code dispose} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDispose(java.lang.foreign.MemoryAddress dispose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose));
            return this;
        }
        
        /**
         * the free function
         * @param free The value for the {@code free} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFree(java.lang.foreign.MemoryAddress free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free));
            return this;
        }
        
        public Build setPrivUint(int privUint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv_uint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), privUint);
            return this;
        }
        
        public Build setPrivPointer(java.lang.foreign.MemoryAddress privPointer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv_pointer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (privPointer == null ? MemoryAddress.NULL : (Addressable) privPointer));
            return this;
        }
    }
}
