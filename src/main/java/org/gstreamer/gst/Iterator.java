package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GstIterator is used to retrieve multiple objects from another object in
 * a threadsafe way.
 * <p>
 * Various GStreamer objects provide access to their internal structures using
 * an iterator.
 * <p>
 * Note that if calling a GstIterator function results in your code receiving
 * a refcounted object (with, say, g_value_get_object()), the refcount for that
 * object will not be increased. Your code is responsible for taking a reference
 * if it wants to continue using it later.
 * <p>
 * The basic use pattern of an iterator is as follows:
 * <pre>{@code <!-- language="C" -->
 *   GstIterator *it = _get_iterator(object);
 *   GValue item = G_VALUE_INIT;
 *   done = FALSE;
 *   while (!done) {
 *     switch (gst_iterator_next (it, &item)) {
 *       case GST_ITERATOR_OK:
 *         ...get/use/change item here...
 *         g_value_reset (&item);
 *         break;
 *       case GST_ITERATOR_RESYNC:
 *         ...rollback changes to items...
 *         gst_iterator_resync (it);
 *         break;
 *       case GST_ITERATOR_ERROR:
 *         ...wrong parameters were given...
 *         done = TRUE;
 *         break;
 *       case GST_ITERATOR_DONE:
 *         done = TRUE;
 *         break;
 *     }
 *   }
 *   g_value_unset (&item);
 *   gst_iterator_free (it);
 * }</pre>
 */
public class Iterator extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstIterator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("next"),
            Interop.valueLayout.ADDRESS.withName("item"),
            Interop.valueLayout.ADDRESS.withName("resync"),
            Interop.valueLayout.ADDRESS.withName("free"),
            Interop.valueLayout.ADDRESS.withName("pushed"),
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.ADDRESS.withName("lock"),
            Interop.valueLayout.C_INT.withName("cookie"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("master_cookie"),
            Interop.valueLayout.C_INT.withName("size"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Iterator}
     * @return A new, uninitialized @{link Iterator}
     */
    public static Iterator allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Iterator newInstance = new Iterator(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gst.IteratorCopyFunction getCopy() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(org.gstreamer.gst.IteratorCopyFunction copy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gstreamer.gst.IteratorNextFunction getNext() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(org.gstreamer.gst.IteratorNextFunction next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : (Addressable) next.toCallback()));
    }
    
    /**
     * Get the value of the field {@code item}
     * @return The value of the field {@code item}
     */
    public org.gstreamer.gst.IteratorItemFunction getItem() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code item}
     * @param item The new value of the field {@code item}
     */
    public void setItem(org.gstreamer.gst.IteratorItemFunction item) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (item == null ? MemoryAddress.NULL : (Addressable) item.toCallback()));
    }
    
    /**
     * Get the value of the field {@code resync}
     * @return The value of the field {@code resync}
     */
    public org.gstreamer.gst.IteratorResyncFunction getResync() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("resync"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code resync}
     * @param resync The new value of the field {@code resync}
     */
    public void setResync(org.gstreamer.gst.IteratorResyncFunction resync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("resync"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resync == null ? MemoryAddress.NULL : (Addressable) resync.toCallback()));
    }
    
    /**
     * Get the value of the field {@code free}
     * @return The value of the field {@code free}
     */
    public org.gstreamer.gst.IteratorFreeFunction getFree() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(org.gstreamer.gst.IteratorFreeFunction free) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
    }
    
    /**
     * Get the value of the field {@code pushed}
     * @return The value of the field {@code pushed}
     */
    public org.gstreamer.gst.Iterator getPushed() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pushed"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pushed}
     * @param pushed The new value of the field {@code pushed}
     */
    public void setPushed(org.gstreamer.gst.Iterator pushed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pushed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushed == null ? MemoryAddress.NULL : pushed.handle()));
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type getType() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code lock}
     * @return The value of the field {@code lock}
     */
    public org.gtk.glib.Mutex getLock() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Mutex.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code lock}
     * @param lock The new value of the field {@code lock}
     */
    public void setLock(org.gtk.glib.Mutex lock) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
    }
    
    /**
     * Get the value of the field {@code cookie}
     * @return The value of the field {@code cookie}
     */
    public int getCookie() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cookie"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cookie}
     * @param cookie The new value of the field {@code cookie}
     */
    public void setCookie(int cookie) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cookie"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cookie);
    }
    
    /**
     * Get the value of the field {@code master_cookie}
     * @return The value of the field {@code master_cookie}
     */
    public PointerInteger getMasterCookie() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("master_cookie"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code master_cookie}
     * @param masterCookie The new value of the field {@code master_cookie}
     */
    public void setMasterCookie(PointerInteger masterCookie) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("master_cookie"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (masterCookie == null ? MemoryAddress.NULL : masterCookie.handle()));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int getSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Create a Iterator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Iterator(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Iterator> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Iterator(input, ownership);
    
    private static MemoryAddress constructNew(int size, org.gtk.glib.Type type, org.gtk.glib.Mutex lock, PointerInteger masterCookie, org.gstreamer.gst.IteratorCopyFunction copy, org.gstreamer.gst.IteratorNextFunction next, org.gstreamer.gst.IteratorItemFunction item, org.gstreamer.gst.IteratorResyncFunction resync, org.gstreamer.gst.IteratorFreeFunction free) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_iterator_new.invokeExact(
                    size,
                    type.getValue().longValue(),
                    lock.handle(),
                    masterCookie.handle(),
                    (Addressable) copy.toCallback(),
                    (Addressable) next.toCallback(),
                    (Addressable) item.toCallback(),
                    (Addressable) resync.toCallback(),
                    (Addressable) free.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new iterator. This function is mainly used for objects
     * implementing the next/resync/free function to iterate a data structure.
     * <p>
     * For each item retrieved, the {@code item} function is called with the lock
     * held. The {@code free} function is called when the iterator is freed.
     * @param size the size of the iterator structure
     * @param type {@link org.gtk.glib.Type} of children
     * @param lock pointer to a {@link org.gtk.glib.Mutex}.
     * @param masterCookie pointer to a guint32 that is changed when the items in the
     *    iterator changed.
     * @param copy copy function
     * @param next function to get next item
     * @param item function to call on each item retrieved
     * @param resync function to resync the iterator
     * @param free function to free the iterator
     */
    public Iterator(int size, org.gtk.glib.Type type, org.gtk.glib.Mutex lock, PointerInteger masterCookie, org.gstreamer.gst.IteratorCopyFunction copy, org.gstreamer.gst.IteratorNextFunction next, org.gstreamer.gst.IteratorItemFunction item, org.gstreamer.gst.IteratorResyncFunction resync, org.gstreamer.gst.IteratorFreeFunction free) {
        super(constructNew(size, type, lock, masterCookie, copy, next, item, resync, free), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewList(org.gtk.glib.Type type, org.gtk.glib.Mutex lock, PointerInteger masterCookie, PointerProxy<org.gtk.glib.List> list, org.gtk.gobject.GObject owner, org.gstreamer.gst.IteratorItemFunction item) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_iterator_new_list.invokeExact(
                    type.getValue().longValue(),
                    lock.handle(),
                    masterCookie.handle(),
                    list.handle(),
                    owner.handle(),
                    (Addressable) item.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new iterator designed for iterating {@code list}.
     * <p>
     * The list you iterate is usually part of a data structure {@code owner} and is
     * protected with {@code lock}.
     * <p>
     * The iterator will use {@code lock} to retrieve the next item of the list and it
     * will then call the {@code item} function before releasing {@code lock} again.
     * <p>
     * When a concurrent update to the list is performed, usually by {@code owner} while
     * holding {@code lock}, {@code master_cookie} will be updated. The iterator implementation
     * will notice the update of the cookie and will return {@link IteratorResult#RESYNC} to
     * the user of the iterator in the next call to gst_iterator_next().
     * @param type {@link org.gtk.glib.Type} of elements
     * @param lock pointer to a {@link org.gtk.glib.Mutex} protecting the list.
     * @param masterCookie pointer to a guint32 that is incremented when the list
     *     is changed.
     * @param list pointer to the list
     * @param owner object owning the list
     * @param item function to call on each item retrieved
     * @return the new {@link Iterator} for {@code list}.
     * <p>
     * MT safe.
     */
    public static Iterator newList(org.gtk.glib.Type type, org.gtk.glib.Mutex lock, PointerInteger masterCookie, PointerProxy<org.gtk.glib.List> list, org.gtk.gobject.GObject owner, org.gstreamer.gst.IteratorItemFunction item) {
        var RESULT = constructNewList(type, lock, masterCookie, list, owner, item);
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSingle(org.gtk.glib.Type type, org.gtk.gobject.Value object) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_iterator_new_single.invokeExact(
                    type.getValue().longValue(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This {@link Iterator} is a convenient iterator for the common
     * case where a {@link Iterator} needs to be returned but only
     * a single object has to be considered. This happens often
     * for the {@link PadIterIntLinkFunction}.
     * @param type {@link org.gtk.glib.Type} of the passed object
     * @param object object that this iterator should return
     * @return the new {@link Iterator} for {@code object}.
     */
    public static Iterator newSingle(org.gtk.glib.Type type, org.gtk.gobject.Value object) {
        var RESULT = constructNewSingle(type, object);
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Copy the iterator and its state.
     * @return a new copy of {@code it}.
     */
    public org.gstreamer.gst.Iterator copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_iterator_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new iterator from an existing iterator. The new iterator
     * will only return those elements that match the given compare function {@code func}.
     * The first parameter that is passed to {@code func} is the {@link org.gtk.gobject.Value} of the current
     * iterator element and the second parameter is {@code user_data}. {@code func} should
     * return 0 for elements that should be included in the filtered iterator.
     * <p>
     * When this iterator is freed, {@code it} will also be freed.
     * @param func the compare function to select elements
     * @param userData user data passed to the compare function
     * @return a new {@link Iterator}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Iterator filter(org.gtk.glib.CompareFunc func, org.gtk.gobject.Value userData) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_iterator_filter.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    userData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Find the first element in {@code it} that matches the compare function {@code func}.
     * {@code func} should return 0 when the element is found. The first parameter
     * to {@code func} will be the current element of the iterator and the
     * second parameter will be {@code user_data}.
     * The result will be stored in {@code elem} if a result is found.
     * <p>
     * The iterator will not be freed.
     * <p>
     * This function will return {@code false} if an error happened to the iterator
     * or if the element wasn't found.
     * @param func the compare function to use
     * @param elem pointer to a {@link org.gtk.gobject.Value} where to store the result
     * @return Returns {@code true} if the element was found, else {@code false}.
     * <p>
     * MT safe.
     */
    public boolean findCustom(org.gtk.glib.CompareFunc func, org.gtk.gobject.Value elem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_iterator_find_custom.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    elem.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Folds {@code func} over the elements of {@code iter}. That is to say, {@code func} will be called
     * as {@code func} (object, {@code ret}, {@code user_data}) for each object in {@code it}. The normal use
     * of this procedure is to accumulate the results of operating on the objects in
     * {@code ret}.
     * <p>
     * This procedure can be used (and is used internally) to implement the
     * gst_iterator_foreach() and gst_iterator_find_custom() operations.
     * <p>
     * The fold will proceed as long as {@code func} returns {@code true}. When the iterator has no
     * more arguments, {@link IteratorResult#DONE} will be returned. If {@code func} returns {@code false},
     * the fold will stop, and {@link IteratorResult#OK} will be returned. Errors or resyncs
     * will cause fold to return {@link IteratorResult#ERROR} or {@link IteratorResult#RESYNC} as
     * appropriate.
     * <p>
     * The iterator will not be freed.
     * @param func the fold function
     * @param ret the seed value passed to the fold function
     * @return A {@link IteratorResult}, as described above.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.IteratorResult fold(org.gstreamer.gst.IteratorFoldFunction func, org.gtk.gobject.Value ret) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_iterator_fold.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    ret.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.IteratorResult.of(RESULT);
    }
    
    /**
     * Iterate over all element of {@code it} and call the given function {@code func} for
     * each element.
     * @param func the function to call for each element.
     * @return the result call to gst_iterator_fold(). The iterator will not be
     * freed.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.IteratorResult foreach(org.gstreamer.gst.IteratorForeachFunction func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_iterator_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.IteratorResult.of(RESULT);
    }
    
    /**
     * Free the iterator.
     * <p>
     * MT safe.
     */
    public void free() {
        try {
            DowncallHandles.gst_iterator_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the next item from the iterator in {@code elem}.
     * <p>
     * Only when this function returns {@link IteratorResult#OK}, {@code elem} will contain a valid
     * value. {@code elem} must have been initialized to the type of the iterator or
     * initialized to zeroes with g_value_unset(). The caller is responsible for
     * unsetting or resetting {@code elem} with g_value_unset() or g_value_reset()
     * after usage.
     * <p>
     * When this function returns {@link IteratorResult#DONE}, no more elements can be
     * retrieved from {@code it}.
     * <p>
     * A return value of {@link IteratorResult#RESYNC} indicates that the element list was
     * concurrently updated. The user of {@code it} should call gst_iterator_resync() to
     * get the newly updated list.
     * <p>
     * A return value of {@link IteratorResult#ERROR} indicates an unrecoverable fatal error.
     * @param elem pointer to hold next element
     * @return The result of the iteration. Unset {@code elem} after usage.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.IteratorResult next(org.gtk.gobject.Value elem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_iterator_next.invokeExact(
                    handle(),
                    elem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.IteratorResult.of(RESULT);
    }
    
    /**
     * Pushes {@code other} iterator onto {@code it}. All calls performed on {@code it} are
     * forwarded to {@code other}. If {@code other} returns {@link IteratorResult#DONE}, it is
     * popped again and calls are handled by {@code it} again.
     * <p>
     * This function is mainly used by objects implementing the iterator
     * next function to recurse into substructures.
     * <p>
     * When gst_iterator_resync() is called on {@code it}, {@code other} will automatically be
     * popped.
     * <p>
     * MT safe.
     * @param other The {@link Iterator} to push
     */
    public void push(org.gstreamer.gst.Iterator other) {
        try {
            DowncallHandles.gst_iterator_push.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resync the iterator. this function is mostly called
     * after gst_iterator_next() returned {@link IteratorResult#RESYNC}.
     * <p>
     * When an iterator was pushed on {@code it}, it will automatically be popped again
     * with this function.
     * <p>
     * MT safe.
     */
    public void resync() {
        try {
            DowncallHandles.gst_iterator_resync.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_iterator_new = Interop.downcallHandle(
            "gst_iterator_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_new_list = Interop.downcallHandle(
            "gst_iterator_new_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_new_single = Interop.downcallHandle(
            "gst_iterator_new_single",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_copy = Interop.downcallHandle(
            "gst_iterator_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_filter = Interop.downcallHandle(
            "gst_iterator_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_find_custom = Interop.downcallHandle(
            "gst_iterator_find_custom",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_fold = Interop.downcallHandle(
            "gst_iterator_fold",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_foreach = Interop.downcallHandle(
            "gst_iterator_foreach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_free = Interop.downcallHandle(
            "gst_iterator_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_next = Interop.downcallHandle(
            "gst_iterator_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_push = Interop.downcallHandle(
            "gst_iterator_push",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_iterator_resync = Interop.downcallHandle(
            "gst_iterator_resync",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Iterator.Builder} object constructs a {@link Iterator} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Iterator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Iterator struct;
        
        private Builder() {
            struct = Iterator.allocate();
        }
        
         /**
         * Finish building the {@link Iterator} struct.
         * @return A new instance of {@code Iterator} with the fields 
         *         that were set in the Builder object.
         */
        public Iterator build() {
            return struct;
        }
        
        /**
         * The function to copy the iterator
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopy(org.gstreamer.gst.IteratorCopyFunction copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : (Addressable) copy.toCallback()));
            return this;
        }
        
        /**
         * The function to get the next item in the iterator
         * @param next The value for the {@code next} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNext(org.gstreamer.gst.IteratorNextFunction next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : (Addressable) next.toCallback()));
            return this;
        }
        
        /**
         * The function to be called for each item retrieved
         * @param item The value for the {@code item} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItem(org.gstreamer.gst.IteratorItemFunction item) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (item == null ? MemoryAddress.NULL : (Addressable) item.toCallback()));
            return this;
        }
        
        /**
         * The function to call when a resync is needed.
         * @param resync The value for the {@code resync} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResync(org.gstreamer.gst.IteratorResyncFunction resync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resync == null ? MemoryAddress.NULL : (Addressable) resync.toCallback()));
            return this;
        }
        
        /**
         * The function to call when the iterator is freed
         * @param free The value for the {@code free} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFree(org.gstreamer.gst.IteratorFreeFunction free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : (Addressable) free.toCallback()));
            return this;
        }
        
        /**
         * The iterator that is currently pushed with gst_iterator_push()
         * @param pushed The value for the {@code pushed} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPushed(org.gstreamer.gst.Iterator pushed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pushed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushed == null ? MemoryAddress.NULL : pushed.handle()));
            return this;
        }
        
        /**
         * The type of the object that this iterator will return
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * The lock protecting the data structure and the cookie.
         * @param lock The value for the {@code lock} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        /**
         * The cookie; the value of the master_cookie when this iterator was
         *          created.
         * @param cookie The value for the {@code cookie} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCookie(int cookie) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cookie"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), cookie);
            return this;
        }
        
        /**
         * A pointer to the master cookie.
         * @param masterCookie The value for the {@code masterCookie} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMasterCookie(PointerInteger masterCookie) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("master_cookie"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (masterCookie == null ? MemoryAddress.NULL : masterCookie.handle()));
            return this;
        }
        
        /**
         * the size of the iterator
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
