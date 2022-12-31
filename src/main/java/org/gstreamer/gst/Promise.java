package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Promise} object implements the container for values that may
 * be available later. i.e. a Future or a Promise in
 * &lt;https://en.wikipedia.org/wiki/Futures_and_promises&gt;.
 * As with all Future/Promise-like functionality, there is the concept of the
 * producer of the value and the consumer of the value.
 * <p>
 * A {@link Promise} is created with gst_promise_new() by the consumer and passed
 * to the producer to avoid thread safety issues with the change callback.
 * A {@link Promise} can be replied to with a value (or an error) by the producer
 * with gst_promise_reply(). The exact value returned is defined by the API
 * contract of the producer and {@code null} may be a valid reply.
 * gst_promise_interrupt() is for the consumer to
 * indicate to the producer that the value is not needed anymore and producing
 * that value can stop.  The {@code GST_PROMISE_RESULT_EXPIRED} state set by a call
 * to gst_promise_expire() indicates to the consumer that a value will never
 * be produced and is intended to be called by a third party that implements
 * some notion of message handling such as {@link Bus}.
 * A callback can also be installed at {@link Promise} creation for
 * result changes with gst_promise_new_with_change_func().
 * The change callback can be used to chain {@code GstPromises}'s together as in the
 * following example.
 * <pre>{@code <!-- language="C" -->
 * const GstStructure *reply;
 * GstPromise *p;
 * if (gst_promise_wait (promise) != GST_PROMISE_RESULT_REPLIED)
 *   return; // interrupted or expired value
 * reply = gst_promise_get_reply (promise);
 * if (error in reply)
 *   return; // propagate error
 * p = gst_promise_new_with_change_func (another_promise_change_func, user_data, notify);
 * pass p to promise-using API
 * }</pre>
 * <p>
 * Each {@link Promise} starts out with a {@link PromiseResult} of
 * {@link PromiseResult#PENDING} and only ever transitions once
 * into one of the other {@link PromiseResult}'s.
 * <p>
 * In order to support multi-threaded code, gst_promise_reply(),
 * gst_promise_interrupt() and gst_promise_expire() may all be from
 * different threads with some restrictions and the final result of the promise
 * is whichever call is made first.  There are two restrictions on ordering:
 * <p>
 * 1. That gst_promise_reply() and gst_promise_interrupt() cannot be called
 * after gst_promise_expire()
 * 2. That gst_promise_reply() and gst_promise_interrupt()
 * cannot be called twice.
 * <p>
 * The change function set with gst_promise_new_with_change_func() is
 * called directly from either the gst_promise_reply(),
 * gst_promise_interrupt() or gst_promise_expire() and can be called
 * from an arbitrary thread.  {@link Promise} using APIs can restrict this to
 * a single thread or a subset of threads but that is entirely up to the API
 * that uses {@link Promise}.
 * @version 1.14
 */
public class Promise extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPromise";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Promise}
     * @return A new, uninitialized @{link Promise}
     */
    public static Promise allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Promise newInstance = new Promise(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.MiniObject parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Create a Promise proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Promise(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Promise> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Promise(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_promise_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public Promise() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithChangeFunc(org.gstreamer.gst.PromiseChangeFunc func, org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_promise_new_with_change_func.invokeExact(
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@code func} will be called exactly once when transitioning out of
     * {@link PromiseResult#PENDING} into any of the other {@link PromiseResult}
     * states.
     * @param func a {@link PromiseChangeFunc} to call
     * @param notify notification function that {@code user_data} is no longer needed
     * @return a new {@link Promise}
     */
    public static Promise newWithChangeFunc(org.gstreamer.gst.PromiseChangeFunc func, org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWithChangeFunc(func, notify);
        return org.gstreamer.gst.Promise.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Expire a {@code promise}.  This will wake up any waiters with
     * {@link PromiseResult#EXPIRED}.  Called by a message loop when the parent
     * message is handled and/or destroyed (possibly unanswered).
     */
    public void expire() {
        try {
            DowncallHandles.gst_promise_expire.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieve the reply set on {@code promise}.  {@code promise} must be in
     * {@link PromiseResult#REPLIED} and the returned structure is owned by {@code promise}
     * @return The reply set on {@code promise}
     */
    public @Nullable org.gstreamer.gst.Structure getReply() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_promise_get_reply.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Interrupt waiting for a {@code promise}.  This will wake up any waiters with
     * {@link PromiseResult#INTERRUPTED}.  Called when the consumer does not want
     * the value produced anymore.
     */
    public void interrupt() {
        try {
            DowncallHandles.gst_promise_interrupt.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set a reply on {@code promise}.  This will wake up any waiters with
     * {@link PromiseResult#REPLIED}.  Called by the producer of the value to
     * indicate success (or failure).
     * <p>
     * If {@code promise} has already been interrupted by the consumer, then this reply
     * is not visible to the consumer.
     * @param s a {@link Structure} with the the reply contents
     */
    public void reply(@Nullable org.gstreamer.gst.Structure s) {
        try {
            DowncallHandles.gst_promise_reply.invokeExact(
                    handle(),
                    (Addressable) (s == null ? MemoryAddress.NULL : s.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        s.yieldOwnership();
    }
    
    /**
     * Wait for {@code promise} to move out of the {@link PromiseResult#PENDING} state.
     * If {@code promise} is not in {@link PromiseResult#PENDING} then it will return
     * immediately with the current result.
     * @return the result of the promise
     */
    public org.gstreamer.gst.PromiseResult wait_() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_promise_wait.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.PromiseResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_promise_new = Interop.downcallHandle(
            "gst_promise_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_new_with_change_func = Interop.downcallHandle(
            "gst_promise_new_with_change_func",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_expire = Interop.downcallHandle(
            "gst_promise_expire",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_get_reply = Interop.downcallHandle(
            "gst_promise_get_reply",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_interrupt = Interop.downcallHandle(
            "gst_promise_interrupt",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_reply = Interop.downcallHandle(
            "gst_promise_reply",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_promise_wait = Interop.downcallHandle(
            "gst_promise_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Promise.Builder} object constructs a {@link Promise} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Promise.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Promise struct;
        
        private Builder() {
            struct = Promise.allocate();
        }
        
         /**
         * Finish building the {@link Promise} struct.
         * @return A new instance of {@code Promise} with the fields 
         *         that were set in the Builder object.
         */
        public Promise build() {
            return struct;
        }
        
        /**
         * parent {@link MiniObject}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
    }
}
