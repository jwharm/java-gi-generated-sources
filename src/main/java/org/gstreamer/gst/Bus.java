package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Bus} is an object responsible for delivering {@link Message} packets in
 * a first-in first-out way from the streaming threads (see {@link Task}) to the
 * application.
 * <p>
 * Since the application typically only wants to deal with delivery of these
 * messages from one thread, the GstBus will marshall the messages between
 * different threads. This is important since the actual streaming of media
 * is done in another thread than the application.
 * <p>
 * The GstBus provides support for {@link org.gtk.glib.Source} based notifications. This makes it
 * possible to handle the delivery in the glib {@link org.gtk.glib.MainLoop}.
 * <p>
 * The {@link org.gtk.glib.Source} callback function gst_bus_async_signal_func() can be used to
 * convert all bus messages into signal emissions.
 * <p>
 * A message is posted on the bus with the gst_bus_post() method. With the
 * gst_bus_peek() and gst_bus_pop() methods one can look at or retrieve a
 * previously posted message.
 * <p>
 * The bus can be polled with the gst_bus_poll() method. This methods blocks
 * up to the specified timeout value until one of the specified messages types
 * is posted on the bus. The application can then gst_bus_pop() the messages
 * from the bus to handle them.
 * Alternatively the application can register an asynchronous bus function
 * using gst_bus_add_watch_full() or gst_bus_add_watch(). This function will
 * install a {@link org.gtk.glib.Source} in the default glib main loop and will deliver messages
 * a short while after they have been posted. Note that the main loop should
 * be running for the asynchronous callbacks.
 * <p>
 * It is also possible to get messages from the bus without any thread
 * marshalling with the gst_bus_set_sync_handler() method. This makes it
 * possible to react to a message in the same thread that posted the
 * message on the bus. This should only be used if the application is able
 * to deal with messages from different threads.
 * <p>
 * Every {@link Pipeline} has one bus.
 * <p>
 * Note that a {@link Pipeline} will set its bus into flushing state when changing
 * from READY to NULL state.
 */
public class Bus extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBus";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Bus proxy instance for the provided memory address.
     * <p>
     * Because Bus is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Bus(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Bus> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Bus(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Bus} instance.
     */
    public Bus() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a bus signal watch to the default main context with the default priority
     * ( {@code G_PRIORITY_DEFAULT} ). It is also possible to use a non-default
     * main context set up using g_main_context_push_thread_default() (before
     * one had to create a bus watch source and attach it to the desired main
     * context 'manually').
     * <p>
     * After calling this statement, the bus will emit the "message" signal for each
     * message posted on the bus.
     * <p>
     * This function may be called multiple times. To clean up, the caller is
     * responsible for calling gst_bus_remove_signal_watch() as many times as this
     * function is called.
     */
    public void addSignalWatch() {
        try {
            DowncallHandles.gst_bus_add_signal_watch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a bus signal watch to the default main context with the given {@code priority}
     * (e.g. {@code G_PRIORITY_DEFAULT}). It is also possible to use a non-default main
     * context set up using g_main_context_push_thread_default()
     * (before one had to create a bus watch source and attach it to the desired
     * main context 'manually').
     * <p>
     * After calling this statement, the bus will emit the "message" signal for each
     * message posted on the bus when the {@link org.gtk.glib.MainLoop} is running.
     * <p>
     * This function may be called multiple times. To clean up, the caller is
     * responsible for calling gst_bus_remove_signal_watch() as many times as this
     * function is called.
     * <p>
     * There can only be a single bus watch per bus, you must remove any signal
     * watch before you can set another type of watch.
     * @param priority The priority of the watch.
     */
    public void addSignalWatchFull(int priority) {
        try {
            DowncallHandles.gst_bus_add_signal_watch_full.invokeExact(
                    handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a bus watch to the default main context with the given {@code priority} (e.g.
     * {@code G_PRIORITY_DEFAULT}). It is also possible to use a non-default  main
     * context set up using g_main_context_push_thread_default() (before
     * one had to create a bus watch source and attach it to the desired main
     * context 'manually').
     * <p>
     * This function is used to receive asynchronous messages in the main loop.
     * There can only be a single bus watch per bus, you must remove it before you
     * can set a new one.
     * <p>
     * The bus watch will only work if a {@link org.gtk.glib.MainLoop} is being run.
     * <p>
     * When {@code func} is called, the message belongs to the caller; if you want to
     * keep a copy of it, call gst_message_ref() before leaving {@code func}.
     * <p>
     * The watch can be removed using gst_bus_remove_watch() or by returning {@code false}
     * from {@code func}. If the watch was added to the default main context it is also
     * possible to remove the watch using g_source_remove().
     * <p>
     * The bus watch will take its own reference to the {@code bus}, so it is safe to unref
     * {@code bus} using gst_object_unref() after setting the bus watch.
     * @param priority The priority of the watch.
     * @param func A function to call when a message is received.
     * @param notify the function to call when the source is removed.
     * @return The event source id or 0 if {@code bus} already got an event source.
     */
    public int addWatch(int priority, org.gstreamer.gst.BusFunc func, org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_add_watch_full.invokeExact(
                    handle(),
                    priority,
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A helper {@link BusFunc} that can be used to convert all asynchronous messages
     * into signals.
     * @param message the {@link Message} received
     * @return {@code true}
     */
    public boolean asyncSignalFunc(org.gstreamer.gst.Message message) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_async_signal_func.invokeExact(
                    handle(),
                    message.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create watch for this bus. The {@link org.gtk.glib.Source} will be dispatched whenever
     * a message is on the bus. After the GSource is dispatched, the
     * message is popped off the bus and unreffed.
     * <p>
     * As with other watches, there can only be one watch on the bus, including
     * any signal watch added with {@code gst_bus_add_signal_watch}.
     * @return a {@link org.gtk.glib.Source} that can be added to a {@link org.gtk.glib.MainLoop}.
     */
    public @Nullable org.gtk.glib.Source createWatch() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_create_watch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Source.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Instructs GStreamer to stop emitting the "sync-message" signal for this bus.
     * See gst_bus_enable_sync_message_emission() for more information.
     * <p>
     * In the event that multiple pieces of code have called
     * gst_bus_enable_sync_message_emission(), the sync-message emissions will only
     * be stopped after all calls to gst_bus_enable_sync_message_emission() were
     * "cancelled" by calling this function. In this way the semantics are exactly
     * the same as gst_object_ref() that which calls enable should also call
     * disable.
     */
    public void disableSyncMessageEmission() {
        try {
            DowncallHandles.gst_bus_disable_sync_message_emission.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Instructs GStreamer to emit the "sync-message" signal after running the bus's
     * sync handler. This function is here so that code can ensure that they can
     * synchronously receive messages without having to affect what the bin's sync
     * handler is.
     * <p>
     * This function may be called multiple times. To clean up, the caller is
     * responsible for calling gst_bus_disable_sync_message_emission() as many times
     * as this function is called.
     * <p>
     * While this function looks similar to gst_bus_add_signal_watch(), it is not
     * exactly the same -- this function enables <em>synchronous</em> emission of
     * signals when messages arrive; gst_bus_add_signal_watch() adds an idle callback
     * to pop messages off the bus <em>asynchronously</em>. The sync-message signal
     * comes from the thread of whatever object posted the message; the "message"
     * signal is marshalled to the main thread via the {@link org.gtk.glib.MainLoop}.
     */
    public void enableSyncMessageEmission() {
        try {
            DowncallHandles.gst_bus_enable_sync_message_emission.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the file descriptor from the bus which can be used to get notified about
     * messages being available with functions like g_poll(), and allows integration
     * into other event loops based on file descriptors.
     * Whenever a message is available, the POLLIN / {@link org.gtk.glib.IOCondition#IN} event is set.
     * <p>
     * Warning: NEVER read or write anything to the returned fd but only use it
     * for getting notifications via g_poll() or similar and then use the normal
     * GstBus API, e.g. gst_bus_pop().
     * @param fd A GPollFD to fill
     */
    public void getPollfd(org.gtk.glib.PollFD fd) {
        try {
            DowncallHandles.gst_bus_get_pollfd.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if there are pending messages on the bus that
     * should be handled.
     * @return {@code true} if there are messages on the bus to be handled, {@code false}
     * otherwise.
     */
    public boolean havePending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_have_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Peeks the message on the top of the bus' queue. The message will remain
     * on the bus' message queue.
     * @return the {@link Message} that is on the
     *     bus, or {@code null} if the bus is empty.
     */
    public @Nullable org.gstreamer.gst.Message peek() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_peek.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Polls the bus for messages. Will block while waiting for messages to come.
     * You can specify a maximum time to poll with the {@code timeout} parameter. If
     * {@code timeout} is negative, this function will block indefinitely.
     * <p>
     * All messages not in {@code events} will be popped off the bus and will be ignored.
     * It is not possible to use message enums beyond {@code GST_MESSAGE_EXTENDED} in the
     * {@code events} mask
     * <p>
     * Because poll is implemented using the "message" signal enabled by
     * gst_bus_add_signal_watch(), calling gst_bus_poll() will cause the "message"
     * signal to be emitted for every message that poll sees. Thus a "message"
     * signal handler will see the same messages that this function sees -- neither
     * will steal messages from the other.
     * <p>
     * This function will run a {@link org.gtk.glib.MainLoop} from the default main context when
     * polling.
     * <p>
     * You should never use this function, since it is pure evil. This is
     * especially true for GUI applications based on Gtk+ or Qt, but also for any
     * other non-trivial application that uses the GLib main loop. As this function
     * runs a GLib main loop, any callback attached to the default GLib main
     * context may be invoked. This could be timeouts, GUI events, I/O events etc.;
     * even if gst_bus_poll() is called with a 0 timeout. Any of these callbacks
     * may do things you do not expect, e.g. destroy the main application window or
     * some other resource; change other application state; display a dialog and
     * run another main loop until the user clicks it away. In short, using this
     * function may add a lot of complexity to your code through unexpected
     * re-entrancy and unexpected changes to your application's state.
     * <p>
     * For 0 timeouts use gst_bus_pop_filtered() instead of this function; for
     * other short timeouts use gst_bus_timed_pop_filtered(); everything else is
     * better handled by setting up an asynchronous bus watch and doing things
     * from there.
     * @param events a mask of {@link MessageType}, representing the set of message types to
     * poll for (note special handling of extended message types below)
     * @param timeout the poll timeout, as a {@link ClockTime}, or {@code GST_CLOCK_TIME_NONE} to poll
     * indefinitely.
     * @return the message that was received,
     *     or {@code null} if the poll timed out.
     */
    public @Nullable org.gstreamer.gst.Message poll(org.gstreamer.gst.MessageType events, org.gstreamer.gst.ClockTime timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_poll.invokeExact(
                    handle(),
                    events.getValue(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a message from the bus.
     * @return the {@link Message} that is on the
     *     bus, or {@code null} if the bus is empty.
     */
    public @Nullable org.gstreamer.gst.Message pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_pop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a message matching {@code type} from the bus.  Will discard all messages on
     * the bus that do not match {@code type} and that have been posted before the first
     * message that does match {@code type}.  If there is no message matching {@code type} on
     * the bus, all messages will be discarded. It is not possible to use message
     * enums beyond {@code GST_MESSAGE_EXTENDED} in the {@code events} mask.
     * @param types message types to take into account
     * @return the next {@link Message} matching
     *     {@code type} that is on the bus, or {@code null} if the bus is empty or there
     *     is no message matching {@code type}.
     */
    public @Nullable org.gstreamer.gst.Message popFiltered(org.gstreamer.gst.MessageType types) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_pop_filtered.invokeExact(
                    handle(),
                    types.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Posts a message on the given bus. Ownership of the message
     * is taken by the bus.
     * @param message the {@link Message} to post
     * @return {@code true} if the message could be posted, {@code false} if the bus is flushing.
     */
    public boolean post(org.gstreamer.gst.Message message) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_post.invokeExact(
                    handle(),
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        message.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a signal watch previously added with gst_bus_add_signal_watch().
     */
    public void removeSignalWatch() {
        try {
            DowncallHandles.gst_bus_remove_signal_watch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an installed bus watch from {@code bus}.
     * @return {@code true} on success or {@code false} if {@code bus} has no event source.
     */
    public boolean removeWatch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_remove_watch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If {@code flushing}, flushes out and unrefs any messages queued in the bus. Releases
     * references to the message origin objects. Will flush future messages until
     * gst_bus_set_flushing() sets {@code flushing} to {@code false}.
     * @param flushing whether or not to flush the bus
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_bus_set_flushing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flushing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the synchronous handler on the bus. The function will be called
     * every time a new message is posted on the bus. Note that the function
     * will be called in the same thread context as the posting object. This
     * function is usually only called by the creator of the bus. Applications
     * should handle messages asynchronously using the gst_bus watch and poll
     * functions.
     * <p>
     * Before 1.16.3 it was not possible to replace an existing handler and
     * clearing an existing handler with {@code null} was not thread-safe.
     * @param func The handler function to install
     * @param notify called when {@code user_data} becomes unused
     */
    public void setSyncHandler(@Nullable org.gstreamer.gst.BusSyncHandler func, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_bus_set_sync_handler.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A helper {@link BusSyncHandler} that can be used to convert all synchronous
     * messages into signals.
     * @param message the {@link Message} received
     * @return {@link BusSyncReply#PASS}
     */
    public org.gstreamer.gst.BusSyncReply syncSignalHandler(org.gstreamer.gst.Message message) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bus_sync_signal_handler.invokeExact(
                    handle(),
                    message.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.BusSyncReply.of(RESULT);
    }
    
    /**
     * Gets a message from the bus, waiting up to the specified timeout.
     * <p>
     * If {@code timeout} is 0, this function behaves like gst_bus_pop(). If {@code timeout} is
     * {@code GST_CLOCK_TIME_NONE}, this function will block forever until a message was
     * posted on the bus.
     * @param timeout a timeout
     * @return the {@link Message} that is on the
     *     bus after the specified timeout or {@code null} if the bus is empty
     *     after the timeout expired.
     */
    public @Nullable org.gstreamer.gst.Message timedPop(org.gstreamer.gst.ClockTime timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_timed_pop.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a message from the bus whose type matches the message type mask {@code types},
     * waiting up to the specified timeout (and discarding any messages that do not
     * match the mask provided).
     * <p>
     * If {@code timeout} is 0, this function behaves like gst_bus_pop_filtered(). If
     * {@code timeout} is {@code GST_CLOCK_TIME_NONE}, this function will block forever until a
     * matching message was posted on the bus.
     * @param timeout a timeout in nanoseconds, or {@code GST_CLOCK_TIME_NONE} to wait forever
     * @param types message types to take into account, {@link MessageType#ANY} for any type
     * @return a {@link Message} matching the
     *     filter in {@code types}, or {@code null} if no matching message was found on
     *     the bus until the timeout expired.
     */
    public @Nullable org.gstreamer.gst.Message timedPopFiltered(org.gstreamer.gst.ClockTime timeout, org.gstreamer.gst.MessageType types) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bus_timed_pop_filtered.invokeExact(
                    handle(),
                    timeout.getValue().longValue(),
                    types.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_bus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Message {
        void run(org.gstreamer.gst.Message message);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceBus, MemoryAddress message) {
            run(org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Message.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * A message has been posted on the bus. This signal is emitted from a
     * {@link org.gtk.glib.Source} added to the mainloop. this signal will only be emitted when
     * there is a {@link org.gtk.glib.MainLoop} running.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bus.Message> onMessage(@Nullable String detail, Bus.Message handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("message" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SyncMessage {
        void run(org.gstreamer.gst.Message message);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceBus, MemoryAddress message) {
            run(org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SyncMessage.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * A message has been posted on the bus. This signal is emitted from the
     * thread that posted the message so one has to be careful with locking.
     * <p>
     * This signal will not be emitted by default, you have to call
     * gst_bus_enable_sync_message_emission() before.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bus.SyncMessage> onSyncMessage(@Nullable String detail, Bus.SyncMessage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("sync-message" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Bus.Builder} object constructs a {@link Bus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Bus.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Bus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Bus}.
         * @return A new instance of {@code Bus} with the properties 
         *         that were set in the Builder object.
         */
        public Bus build() {
            return (Bus) org.gtk.gobject.GObject.newWithProperties(
                Bus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Enables async message delivery support for bus watches,
         * gst_bus_pop() and similar API. Without this only the
         * synchronous message handlers are called.
         * <p>
         * This property is used to create the child element buses
         * in {@link Bin}.
         * @param enableAsync The value for the {@code enable-async} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableAsync(boolean enableAsync) {
            names.add("enable-async");
            values.add(org.gtk.gobject.Value.create(enableAsync));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_bus_new = Interop.downcallHandle(
            "gst_bus_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_add_signal_watch = Interop.downcallHandle(
            "gst_bus_add_signal_watch",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_add_signal_watch_full = Interop.downcallHandle(
            "gst_bus_add_signal_watch_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bus_add_watch_full = Interop.downcallHandle(
            "gst_bus_add_watch_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_async_signal_func = Interop.downcallHandle(
            "gst_bus_async_signal_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_create_watch = Interop.downcallHandle(
            "gst_bus_create_watch",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_disable_sync_message_emission = Interop.downcallHandle(
            "gst_bus_disable_sync_message_emission",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_enable_sync_message_emission = Interop.downcallHandle(
            "gst_bus_enable_sync_message_emission",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_get_pollfd = Interop.downcallHandle(
            "gst_bus_get_pollfd",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_have_pending = Interop.downcallHandle(
            "gst_bus_have_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_peek = Interop.downcallHandle(
            "gst_bus_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_poll = Interop.downcallHandle(
            "gst_bus_poll",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_bus_pop = Interop.downcallHandle(
            "gst_bus_pop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_pop_filtered = Interop.downcallHandle(
            "gst_bus_pop_filtered",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bus_post = Interop.downcallHandle(
            "gst_bus_post",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_remove_signal_watch = Interop.downcallHandle(
            "gst_bus_remove_signal_watch",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_remove_watch = Interop.downcallHandle(
            "gst_bus_remove_watch",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_set_flushing = Interop.downcallHandle(
            "gst_bus_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bus_set_sync_handler = Interop.downcallHandle(
            "gst_bus_set_sync_handler",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_sync_signal_handler = Interop.downcallHandle(
            "gst_bus_sync_signal_handler",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bus_timed_pop = Interop.downcallHandle(
            "gst_bus_timed_pop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_bus_timed_pop_filtered = Interop.downcallHandle(
            "gst_bus_timed_pop_filtered",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bus_get_type = Interop.downcallHandle(
            "gst_bus_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
