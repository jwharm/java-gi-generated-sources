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
public class DataQueue extends org.gtk.gobject.Object {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDataQueue";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a DataQueue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataQueue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DataQueue if its GType is a (or inherits from) "GstDataQueue".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DataQueue} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDataQueue", a ClassCastException will be thrown.
     */
    public static DataQueue castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DataQueue.getType())) {
            return new DataQueue(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDataQueue");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.base.DataQueueCheckFullFunction checkfull, @NotNull org.gstreamer.base.DataQueueFullCallback fullcallback, @NotNull org.gstreamer.base.DataQueueEmptyCallback emptycallback) {
        java.util.Objects.requireNonNull(checkfull, "Parameter 'checkfull' must not be null");
        java.util.Objects.requireNonNull(fullcallback, "Parameter 'fullcallback' must not be null");
        java.util.Objects.requireNonNull(emptycallback, "Parameter 'emptycallback' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_data_queue_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstBase.Callbacks.class, "cbDataQueueCheckFullFunction",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, int.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstBase.Callbacks.class, "cbDataQueueFullCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, int.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstBase.Callbacks.class, "cbDataQueueEmptyCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, int.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(checkfull)));
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
    public DataQueue(@NotNull org.gstreamer.base.DataQueueCheckFullFunction checkfull, @NotNull org.gstreamer.base.DataQueueFullCallback fullcallback, @NotNull org.gstreamer.base.DataQueueEmptyCallback emptycallback) {
        super(constructNew(checkfull, fullcallback, emptycallback), Ownership.FULL);
    }
    
    /**
     * Pop and unref the head-most {@link org.gstreamer.gst.MiniObject} with the given {@link org.gtk.gobject.Type}.
     * @param type The {@link org.gtk.gobject.Type} of the item to drop.
     * @return {@code true} if an element was removed.
     */
    public boolean dropHead(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_drop_head.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void getLevel(@NotNull org.gstreamer.base.DataQueueSize level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
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
        return RESULT != 0;
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
        return RESULT != 0;
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
    public boolean peek(@NotNull Out<org.gstreamer.base.DataQueueItem> item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        MemorySegment itemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_peek.invokeExact(
                    handle(),
                    (Addressable) itemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        item.set(new org.gstreamer.base.DataQueueItem(itemPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Retrieves the first {@code item} available on the {@code queue}. If the queue is currently
     * empty, the call will block until at least one item is available, OR the
     * {@code queue} is set to the flushing state.
     * MT safe.
     * @param item pointer to store the returned {@link DataQueueItem}.
     * @return {@code true} if an {@code item} was successfully retrieved from the {@code queue}.
     */
    public boolean pop(@NotNull Out<org.gstreamer.base.DataQueueItem> item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        MemorySegment itemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_pop.invokeExact(
                    handle(),
                    (Addressable) itemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        item.set(new org.gstreamer.base.DataQueueItem(itemPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
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
    public boolean push(@NotNull org.gstreamer.base.DataQueueItem item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_push.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean pushForce(@NotNull org.gstreamer.base.DataQueueItem item) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_data_queue_push_force.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    flushing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(DataQueue sourceDataQueue);
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
                handle(),
                Interop.allocateNativeString("empty"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DataQueue.Callbacks.class, "signalDataQueueEmpty",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DataQueue.Empty>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Full {
        void signalReceived(DataQueue sourceDataQueue);
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
                handle(),
                Interop.allocateNativeString("full"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DataQueue.Callbacks.class, "signalDataQueueFull",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DataQueue.Full>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DataQueue.Build} object constructs a {@link DataQueue} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DataQueue} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DataQueue} using {@link DataQueue#castFrom}.
         * @return A new instance of {@code DataQueue} with the properties 
         *         that were set in the Build object.
         */
        public DataQueue construct() {
            return DataQueue.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DataQueue.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setCurrentLevelBytes(int currentLevelBytes) {
            names.add("current-level-bytes");
            values.add(org.gtk.gobject.Value.create(currentLevelBytes));
            return this;
        }
        
        public Build setCurrentLevelTime(long currentLevelTime) {
            names.add("current-level-time");
            values.add(org.gtk.gobject.Value.create(currentLevelTime));
            return this;
        }
        
        public Build setCurrentLevelVisible(int currentLevelVisible) {
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
    
    private static class Callbacks {
        
        public static void signalDataQueueEmpty(MemoryAddress sourceDataQueue, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DataQueue.Empty) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DataQueue(sourceDataQueue, Ownership.NONE));
        }
        
        public static void signalDataQueueFull(MemoryAddress sourceDataQueue, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DataQueue.Full) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DataQueue(sourceDataQueue, Ownership.NONE));
        }
    }
}
