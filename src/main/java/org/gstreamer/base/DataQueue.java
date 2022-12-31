package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DataQueue} is an object that handles threadsafe queueing of objects. It
 * also provides size-related functionality. This object should be used for
 * any {@link org.gstreamer.gst.Element} that wishes to provide some sort of queueing functionality.
 */
public class DataQueue extends org.gtk.gobject.GObject {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDataQueue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DataQueue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DataQueue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataQueue> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DataQueue(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.base.DataQueueCheckFullFunction checkfull, org.gstreamer.base.DataQueueFullCallback fullcallback, org.gstreamer.base.DataQueueEmptyCallback emptycallback) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_data_queue_new.invokeExact(
                    (Addressable) checkfull.toCallback(),
                    (Addressable) fullcallback.toCallback(),
                    (Addressable) emptycallback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DataQueue}. If {@code fullcallback} or {@code emptycallback} are supplied, then
     * the {@link DataQueue} will call the respective callback to signal full or empty condition.
     * If the callbacks are NULL the {@link DataQueue} will instead emit 'full' and 'empty'
     * signals.
     * @param checkfull the callback used to tell if the element considers the queue full
     * or not.
     * @param fullcallback the callback which will be called when the queue is considered full.
     * @param emptycallback the callback which will be called when the queue is considered empty.
     */
    public DataQueue(org.gstreamer.base.DataQueueCheckFullFunction checkfull, org.gstreamer.base.DataQueueFullCallback fullcallback, org.gstreamer.base.DataQueueEmptyCallback emptycallback) {
        super(constructNew(checkfull, fullcallback, emptycallback), Ownership.FULL);
    }
    
    /**
     * Pop and unref the head-most {@link org.gstreamer.gst.MiniObject} with the given {@link org.gtk.glib.Type}.
     * @param type The {@link org.gtk.glib.Type} of the item to drop.
     * @return {@code true} if an element was removed.
     */
    public boolean dropHead(org.gtk.glib.Type type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_drop_head.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Flushes all the contents of the {@code queue}. Any call to {@code gst_data_queue_push} and
     * {@code gst_data_queue_pop} will be released.
     * MT safe.
     */
    public void flush() {
        try {
            DowncallHandles.gst_data_queue_flush.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the current level of the queue.
     * @param level the location to store the result
     */
    public void getLevel(org.gstreamer.base.DataQueueSize level) {
        try {
            DowncallHandles.gst_data_queue_get_level.invokeExact(
                    handle(),
                    level.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Queries if there are any items in the {@code queue}.
     * MT safe.
     * @return {@code true} if {@code queue} is empty.
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries if {@code queue} is full. This check will be done using the
     * {@link DataQueueCheckFullFunction} registered with {@code queue}.
     * MT safe.
     * @return {@code true} if {@code queue} is full.
     */
    public boolean isFull() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_is_full.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Inform the queue that the limits for the fullness check have changed and that
     * any blocking gst_data_queue_push() should be unblocked to recheck the limits.
     */
    public void limitsChanged() {
        try {
            DowncallHandles.gst_data_queue_limits_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the first {@code item} available on the {@code queue} without removing it.
     * If the queue is currently empty, the call will block until at least
     * one item is available, OR the {@code queue} is set to the flushing state.
     * MT safe.
     * @param item pointer to store the returned {@link DataQueueItem}.
     * @return {@code true} if an {@code item} was successfully retrieved from the {@code queue}.
     */
    public boolean peek(Out<org.gstreamer.base.DataQueueItem> item) {
        MemorySegment itemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_peek.invokeExact(
                    handle(),
                    (Addressable) itemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        item.set(org.gstreamer.base.DataQueueItem.fromAddress.marshal(itemPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the first {@code item} available on the {@code queue}. If the queue is currently
     * empty, the call will block until at least one item is available, OR the
     * {@code queue} is set to the flushing state.
     * MT safe.
     * @param item pointer to store the returned {@link DataQueueItem}.
     * @return {@code true} if an {@code item} was successfully retrieved from the {@code queue}.
     */
    public boolean pop(Out<org.gstreamer.base.DataQueueItem> item) {
        MemorySegment itemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_pop.invokeExact(
                    handle(),
                    (Addressable) itemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        item.set(org.gstreamer.base.DataQueueItem.fromAddress.marshal(itemPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pushes a {@link DataQueueItem} (or a structure that begins with the same fields)
     * on the {@code queue}. If the {@code queue} is full, the call will block until space is
     * available, OR the {@code queue} is set to flushing state.
     * MT safe.
     * <p>
     * Note that this function has slightly different semantics than gst_pad_push()
     * and gst_pad_push_event(): this function only takes ownership of {@code item} and
     * the {@link org.gstreamer.gst.MiniObject} contained in {@code item} if the push was successful. If {@code false}
     * is returned, the caller is responsible for freeing {@code item} and its contents.
     * @param item a {@link DataQueueItem}.
     * @return {@code true} if the {@code item} was successfully pushed on the {@code queue}.
     */
    public boolean push(org.gstreamer.base.DataQueueItem item) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_push.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pushes a {@link DataQueueItem} (or a structure that begins with the same fields)
     * on the {@code queue}. It ignores if the {@code queue} is full or not and forces the {@code item}
     * to be pushed anyway.
     * MT safe.
     * <p>
     * Note that this function has slightly different semantics than gst_pad_push()
     * and gst_pad_push_event(): this function only takes ownership of {@code item} and
     * the {@link org.gstreamer.gst.MiniObject} contained in {@code item} if the push was successful. If {@code false}
     * is returned, the caller is responsible for freeing {@code item} and its contents.
     * @param item a {@link DataQueueItem}.
     * @return {@code true} if the {@code item} was successfully pushed on the {@code queue}.
     */
    public boolean pushForce(org.gstreamer.base.DataQueueItem item) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_push_force.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the queue to flushing state if {@code flushing} is {@code true}. If set to flushing
     * state, any incoming data on the {@code queue} will be discarded. Any call currently
     * blocking on {@code gst_data_queue_push} or {@code gst_data_queue_pop} will return straight
     * away with a return value of {@code false}. While the {@code queue} is in flushing state,
     * all calls to those two functions will return {@code false}.
     * <p>
     * MT Safe.
     * @param flushing a {@code gboolean} stating if the queue will be flushing or not.
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_data_queue_set_flushing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flushing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_data_queue_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Empty {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDataQueue) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Empty.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Reports that the queue became empty (empty).
     * A queue is empty if the total amount of visible items inside it (num-visible, time,
     * size) is lower than the boundary values which can be set through the GObject
     * properties.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DataQueue.Empty> onEmpty(DataQueue.Empty handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("empty"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Full {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDataQueue) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Full.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Reports that the queue became full (full).
     * A queue is full if the total amount of data inside it (num-visible, time,
     * size) is higher than the boundary values which can be set through the GObject
     * properties.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DataQueue.Full> onFull(DataQueue.Full handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("full"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DataQueue.Builder} object constructs a {@link DataQueue} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DataQueue.Builder#build()}. 
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
         * Finish building the {@link DataQueue} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DataQueue}.
         * @return A new instance of {@code DataQueue} with the properties 
         *         that were set in the Builder object.
         */
        public DataQueue build() {
            return (DataQueue) org.gtk.gobject.GObject.newWithProperties(
                DataQueue.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCurrentLevelBytes(int currentLevelBytes) {
            names.add("current-level-bytes");
            values.add(org.gtk.gobject.Value.create(currentLevelBytes));
            return this;
        }
        
        public Builder setCurrentLevelTime(long currentLevelTime) {
            names.add("current-level-time");
            values.add(org.gtk.gobject.Value.create(currentLevelTime));
            return this;
        }
        
        public Builder setCurrentLevelVisible(int currentLevelVisible) {
            names.add("current-level-visible");
            values.add(org.gtk.gobject.Value.create(currentLevelVisible));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_data_queue_new = Interop.downcallHandle(
            "gst_data_queue_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_drop_head = Interop.downcallHandle(
            "gst_data_queue_drop_head",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_data_queue_flush = Interop.downcallHandle(
            "gst_data_queue_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_get_level = Interop.downcallHandle(
            "gst_data_queue_get_level",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_is_empty = Interop.downcallHandle(
            "gst_data_queue_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_is_full = Interop.downcallHandle(
            "gst_data_queue_is_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_limits_changed = Interop.downcallHandle(
            "gst_data_queue_limits_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_peek = Interop.downcallHandle(
            "gst_data_queue_peek",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_pop = Interop.downcallHandle(
            "gst_data_queue_pop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_push = Interop.downcallHandle(
            "gst_data_queue_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_push_force = Interop.downcallHandle(
            "gst_data_queue_push_force",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_data_queue_set_flushing = Interop.downcallHandle(
            "gst_data_queue_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_data_queue_get_type = Interop.downcallHandle(
            "gst_data_queue_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
