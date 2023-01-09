package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link AtomicQueue} object implements a queue that can be used from multiple
 * threads without performing any blocking operations.
 */
public class AtomicQueue extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAtomicQueue";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtomicQueue}
     * @return A new, uninitialized @{link AtomicQueue}
     */
    public static AtomicQueue allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AtomicQueue newInstance = new AtomicQueue(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AtomicQueue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AtomicQueue(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtomicQueue> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AtomicQueue(input);
    
    private static MemoryAddress constructNew(int initialSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_atomic_queue_new.invokeExact(initialSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new atomic queue instance. {@code initial_size} will be rounded up to the
     * nearest power of 2 and used as the initial size of the queue.
     * @param initialSize initial queue size
     */
    public AtomicQueue(int initialSize) {
        super(constructNew(initialSize));
        this.takeOwnership();
    }
    
    /**
     * Get the amount of items in the queue.
     * @return the number of elements in the queue.
     */
    public int length() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_atomic_queue_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Peek the head element of the queue without removing it from the queue.
     * @return the head element of {@code queue} or
     * {@code null} when the queue is empty.
     */
    public @Nullable java.lang.foreign.MemoryAddress peek() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_atomic_queue_peek.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the head element of the queue.
     * @return the head element of {@code queue} or {@code null} when
     * the queue is empty.
     */
    public @Nullable java.lang.foreign.MemoryAddress pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_atomic_queue_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Append {@code data} to the tail of the queue.
     */
    public void push() {
        try {
            DowncallHandles.gst_atomic_queue_push.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increase the refcount of {@code queue}.
     */
    public void ref() {
        try {
            DowncallHandles.gst_atomic_queue_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unref {@code queue} and free the memory when the refcount reaches 0.
     */
    public void unref() {
        try {
            DowncallHandles.gst_atomic_queue_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_atomic_queue_new = Interop.downcallHandle(
                "gst_atomic_queue_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_length = Interop.downcallHandle(
                "gst_atomic_queue_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_peek = Interop.downcallHandle(
                "gst_atomic_queue_peek",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_pop = Interop.downcallHandle(
                "gst_atomic_queue_pop",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_push = Interop.downcallHandle(
                "gst_atomic_queue_push",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_ref = Interop.downcallHandle(
                "gst_atomic_queue_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_atomic_queue_unref = Interop.downcallHandle(
                "gst_atomic_queue_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
