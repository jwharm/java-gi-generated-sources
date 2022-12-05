package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Messages are implemented as a subclass of {@link MiniObject} with a generic
 * {@link Structure} as the content. This allows for writing custom messages without
 * requiring an API change while allowing a wide range of different types
 * of messages.
 * <p>
 * Messages are posted by objects in the pipeline and are passed to the
 * application using the {@link Bus}.
 * <p>
 * The basic use pattern of posting a message on a {@link Bus} is as follows:
 * <pre>{@code <!-- language="C" -->
 *   gst_bus_post (bus, gst_message_new_eos());
 * }</pre>
 * <p>
 * A {@link Element} usually posts messages on the bus provided by the parent
 * container using gst_element_post_message().
 */
public class Message extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMessage";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("timestamp"),
        Interop.valueLayout.ADDRESS.withName("src"),
        Interop.valueLayout.C_INT.withName("seqnum"),
        MemoryLayout.paddingLayout(32),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
        org.gtk.glib.Cond.getMemoryLayout().withName("cond")
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
     * Allocate a new {@link Message}
     * @return A new, uninitialized @{link Message}
     */
    public static Message allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Message newInstance = new Message(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject miniObject$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.gst.MessageType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MessageType(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.gst.MessageType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code timestamp}
     * @return The value of the field {@code timestamp}
     */
    public long timestamp$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code timestamp}
     * @param timestamp The new value of the field {@code timestamp}
     */
    public void timestamp$set(long timestamp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), timestamp);
    }
    
    /**
     * Get the value of the field {@code src}
     * @return The value of the field {@code src}
     */
    public org.gstreamer.gst.Object src$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Object(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code src}
     * @param src The new value of the field {@code src}
     */
    public void src$set(org.gstreamer.gst.Object src) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), src.handle());
    }
    
    /**
     * Get the value of the field {@code seqnum}
     * @return The value of the field {@code seqnum}
     */
    public int seqnum$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seqnum}
     * @param seqnum The new value of the field {@code seqnum}
     */
    public void seqnum$set(int seqnum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seqnum);
    }
    
    /**
     * Create a Message proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Message(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewApplication(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Structure structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_application.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new application-typed message. GStreamer will never create these
     * messages; they are a gift from us to you. Enjoy.
     * @param src The object originating the message.
     * @param structure the structure for the message. The message
     *     will take ownership of the structure.
     * @return The new application message.
     * <p>
     * MT safe.
     */
    public static Message newApplication(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Structure structure) {
        return new Message(constructNewApplication(src, structure), Ownership.FULL);
    }
    
    private static Addressable constructNewAsyncDone(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ClockTime runningTime) {
        java.util.Objects.requireNonNull(runningTime, "Parameter 'runningTime' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_async_done.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    runningTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The message is posted when elements completed an ASYNC state change.
     * {@code running_time} contains the time of the desired running_time when this
     * elements goes to PLAYING. A value of {@code GST_CLOCK_TIME_NONE} for {@code running_time}
     * means that the element has no clock interaction and thus doesn't care about
     * the running_time of the pipeline.
     * @param src The object originating the message.
     * @param runningTime the desired running_time
     * @return The new async_done message.
     * <p>
     * MT safe.
     */
    public static Message newAsyncDone(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ClockTime runningTime) {
        return new Message(constructNewAsyncDone(src, runningTime), Ownership.FULL);
    }
    
    private static Addressable constructNewAsyncStart(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_async_start.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message is posted by elements when they start an ASYNC state change.
     * @param src The object originating the message.
     * @return The new async_start message.
     * <p>
     * MT safe.
     */
    public static Message newAsyncStart(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewAsyncStart(src), Ownership.FULL);
    }
    
    private static Addressable constructNewBuffering(@Nullable org.gstreamer.gst.Object src, int percent) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_buffering.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    percent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new buffering message. This message can be posted by an element that
     * needs to buffer data before it can continue processing. {@code percent} should be a
     * value between 0 and 100. A value of 100 means that the buffering completed.
     * <p>
     * When {@code percent} is &lt; 100 the application should PAUSE a PLAYING pipeline. When
     * {@code percent} is 100, the application can set the pipeline (back) to PLAYING.
     * The application must be prepared to receive BUFFERING messages in the
     * PREROLLING state and may only set the pipeline to PLAYING after receiving a
     * message with {@code percent} set to 100, which can happen after the pipeline
     * completed prerolling.
     * <p>
     * MT safe.
     * @param src The object originating the message.
     * @param percent The buffering percent
     * @return The new buffering message.
     */
    public static Message newBuffering(@Nullable org.gstreamer.gst.Object src, int percent) {
        return new Message(constructNewBuffering(src, percent), Ownership.FULL);
    }
    
    private static Addressable constructNewClockLost(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_clock_lost.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    clock.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a clock lost message. This message is posted whenever the
     * clock is not valid anymore.
     * <p>
     * If this message is posted by the pipeline, the pipeline will
     * select a new clock again when it goes to PLAYING. It might therefore
     * be needed to set the pipeline to PAUSED and PLAYING again.
     * @param src The object originating the message.
     * @param clock the clock that was lost
     * @return The new clock lost message.
     * <p>
     * MT safe.
     */
    public static Message newClockLost(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock) {
        return new Message(constructNewClockLost(src, clock), Ownership.FULL);
    }
    
    private static Addressable constructNewClockProvide(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock, boolean ready) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_clock_provide.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    clock.handle(),
                    ready ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a clock provide message. This message is posted whenever an
     * element is ready to provide a clock or lost its ability to provide
     * a clock (maybe because it paused or became EOS).
     * <p>
     * This message is mainly used internally to manage the clock
     * selection.
     * @param src The object originating the message.
     * @param clock the clock it provides
     * @param ready {@code true} if the sender can provide a clock
     * @return the new provide clock message.
     * <p>
     * MT safe.
     */
    public static Message newClockProvide(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock, boolean ready) {
        return new Message(constructNewClockProvide(src, clock, ready), Ownership.FULL);
    }
    
    private static Addressable constructNewCustom(@NotNull org.gstreamer.gst.MessageType type, @Nullable org.gstreamer.gst.Object src, @Nullable org.gstreamer.gst.Structure structure) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_custom.invokeExact(
                    type.getValue(),
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    (Addressable) (structure == null ? MemoryAddress.NULL : structure.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new custom-typed message. This can be used for anything not
     * handled by other message-specific functions to pass a message to the
     * app. The structure field can be {@code null}.
     * @param type The {@link MessageType} to distinguish messages
     * @param src The object originating the message.
     * @param structure the structure for the
     *     message. The message will take ownership of the structure.
     * @return The new message.
     * <p>
     * MT safe.
     */
    public static Message newCustom(@NotNull org.gstreamer.gst.MessageType type, @Nullable org.gstreamer.gst.Object src, @Nullable org.gstreamer.gst.Structure structure) {
        return new Message(constructNewCustom(type, src, structure), Ownership.FULL);
    }
    
    private static Addressable constructNewDeviceAdded(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_device_added.invokeExact(
                    src.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new device-added message. The device-added message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. They announce the appearance
     * of monitored devices.
     * @param src The {@link Object} that created the message
     * @param device The new {@link Device}
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceAdded(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device) {
        return new Message(constructNewDeviceAdded(src, device), Ownership.FULL);
    }
    
    private static Addressable constructNewDeviceChanged(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device, @NotNull org.gstreamer.gst.Device changedDevice) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(changedDevice, "Parameter 'changedDevice' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_device_changed.invokeExact(
                    src.handle(),
                    device.handle(),
                    changedDevice.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new device-changed message. The device-changed message is produced
     * by {@link DeviceProvider} or a {@link DeviceMonitor}. They announce that a device
     * properties has changed and {@code device} represent the new modified version of {@code changed_device}.
     * @param src The {@link Object} that created the message
     * @param device The newly created device representing {@code replaced_device}
     *         with its new configuration.
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceChanged(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device, @NotNull org.gstreamer.gst.Device changedDevice) {
        return new Message(constructNewDeviceChanged(src, device, changedDevice), Ownership.FULL);
    }
    
    private static Addressable constructNewDeviceRemoved(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_device_removed.invokeExact(
                    src.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new device-removed message. The device-removed message is produced
     * by {@link DeviceProvider} or a {@link DeviceMonitor}. They announce the
     * disappearance of monitored devices.
     * @param src The {@link Object} that created the message
     * @param device The removed {@link Device}
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceRemoved(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Device device) {
        return new Message(constructNewDeviceRemoved(src, device), Ownership.FULL);
    }
    
    private static Addressable constructNewDurationChanged(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_duration_changed.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new duration changed message. This message is posted by elements
     * that know the duration of a stream when the duration changes. This message
     * is received by bins and is used to calculate the total duration of a
     * pipeline.
     * @param src The object originating the message.
     * @return The new duration-changed message.
     * <p>
     * MT safe.
     */
    public static Message newDurationChanged(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewDurationChanged(src), Ownership.FULL);
    }
    
    private static Addressable constructNewElement(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Structure structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_element.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new element-specific message. This is meant as a generic way of
     * allowing one-way communication from an element to an application, for example
     * "the firewire cable was unplugged". The format of the message should be
     * documented in the element's documentation. The structure field can be {@code null}.
     * @param src The object originating the message.
     * @param structure The structure for the
     *     message. The message will take ownership of the structure.
     * @return The new element message.
     * <p>
     * MT safe.
     */
    public static Message newElement(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Structure structure) {
        return new Message(constructNewElement(src, structure), Ownership.FULL);
    }
    
    private static Addressable constructNewEos(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_eos.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new eos message. This message is generated and posted in
     * the sink elements of a GstBin. The bin will only forward the EOS
     * message to the application if all sinks have posted an EOS message.
     * @param src The object originating the message.
     * @return The new eos message.
     * <p>
     * MT safe.
     */
    public static Message newEos(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewEos(src), Ownership.FULL);
    }
    
    private static Addressable constructNewError(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_error.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new error message. The message will copy {@code error} and
     * {@code debug}. This message is posted by element when a fatal event
     * occurred. The pipeline will probably (partially) stop. The application
     * receiving this message should stop the pipeline.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @return the new error message.
     * <p>
     * MT safe.
     */
    public static Message newError(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        return new Message(constructNewError(src, error, debug), Ownership.FULL);
    }
    
    private static Addressable constructNewErrorWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_error_with_details.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug),
                    (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        details.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new error message. The message will copy {@code error} and
     * {@code debug}. This message is posted by element when a fatal event
     * occurred. The pipeline will probably (partially) stop. The application
     * receiving this message should stop the pipeline.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @param details A GstStructure with details
     * @return the new error message.
     */
    public static Message newErrorWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        return new Message(constructNewErrorWithDetails(src, error, debug, details), Ownership.FULL);
    }
    
    private static Addressable constructNewHaveContext(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Context context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_have_context.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        context.yieldOwnership();
        return RESULT;
    }
    
    /**
     * This message is posted when an element has a new local {@link Context}.
     * @param src The object originating the message.
     * @param context the context
     * @return The new have-context message.
     * <p>
     * MT safe.
     */
    public static Message newHaveContext(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Context context) {
        return new Message(constructNewHaveContext(src, context), Ownership.FULL);
    }
    
    private static Addressable constructNewInfo(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_info.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new info message. The message will make copies of {@code error} and
     * {@code debug}.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @return the new info message.
     * <p>
     * MT safe.
     */
    public static Message newInfo(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        return new Message(constructNewInfo(src, error, debug), Ownership.FULL);
    }
    
    private static Addressable constructNewInfoWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_info_with_details.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug),
                    (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        details.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new info message. The message will make copies of {@code error} and
     * {@code debug}.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @param details A GstStructure with details
     * @return the new warning message.
     */
    public static Message newInfoWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        return new Message(constructNewInfoWithDetails(src, error, debug, details), Ownership.FULL);
    }
    
    private static Addressable constructNewInstantRateRequest(@NotNull org.gstreamer.gst.Object src, double rateMultiplier) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_instant_rate_request.invokeExact(
                    src.handle(),
                    rateMultiplier);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new instant-rate-request message. Elements handling the
     * instant-rate-change event must post this message. The message is
     * handled at the pipeline, and allows the pipeline to select the
     * running time when the rate change should happen and to send an
     * {@code GST_EVENT_INSTANT_RATE_SYNC_TIME} event to notify the elements
     * in the pipeline.
     * @param src The {@link Object} that posted the message
     * @param rateMultiplier the rate multiplier factor that should be applied
     * @return a newly allocated {@link Message}
     */
    public static Message newInstantRateRequest(@NotNull org.gstreamer.gst.Object src, double rateMultiplier) {
        return new Message(constructNewInstantRateRequest(src, rateMultiplier), Ownership.FULL);
    }
    
    private static Addressable constructNewLatency(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_latency.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message can be posted by elements when their latency requirements have
     * changed.
     * @param src The object originating the message.
     * @return The new latency message.
     * <p>
     * MT safe.
     */
    public static Message newLatency(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewLatency(src), Ownership.FULL);
    }
    
    private static Addressable constructNewNeedContext(@Nullable org.gstreamer.gst.Object src, @NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_need_context.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message is posted when an element needs a specific {@link Context}.
     * @param src The object originating the message.
     * @param contextType The context type that is needed
     * @return The new need-context message.
     * <p>
     * MT safe.
     */
    public static Message newNeedContext(@Nullable org.gstreamer.gst.Object src, @NotNull java.lang.String contextType) {
        return new Message(constructNewNeedContext(src, contextType), Ownership.FULL);
    }
    
    private static Addressable constructNewNewClock(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_new_clock.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    clock.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new clock message. This message is posted whenever the
     * pipeline selects a new clock for the pipeline.
     * @param src The object originating the message.
     * @param clock the new selected clock
     * @return The new new clock message.
     * <p>
     * MT safe.
     */
    public static Message newNewClock(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Clock clock) {
        return new Message(constructNewNewClock(src, clock), Ownership.FULL);
    }
    
    private static Addressable constructNewProgress(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ProgressType type, @NotNull java.lang.String code, @NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_progress.invokeExact(
                    src.handle(),
                    type.getValue(),
                    Interop.allocateNativeString(code),
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Progress messages are posted by elements when they use an asynchronous task
     * to perform actions triggered by a state change.
     * <p>
     * {@code code} contains a well defined string describing the action.
     * {@code text} should contain a user visible string detailing the current action.
     * @param src The object originating the message.
     * @param type a {@link ProgressType}
     * @param code a progress code
     * @param text free, user visible text describing the progress
     * @return The new qos message.
     */
    public static Message newProgress(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ProgressType type, @NotNull java.lang.String code, @NotNull java.lang.String text) {
        return new Message(constructNewProgress(src, type, code, text), Ownership.FULL);
    }
    
    private static Addressable constructNewPropertyNotify(@NotNull org.gstreamer.gst.Object src, @NotNull java.lang.String propertyName, @Nullable org.gtk.gobject.Value val) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_property_notify.invokeExact(
                    src.handle(),
                    Interop.allocateNativeString(propertyName),
                    (Addressable) (val == null ? MemoryAddress.NULL : val.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.yieldOwnership();
        return RESULT;
    }
    
    public static Message newPropertyNotify(@NotNull org.gstreamer.gst.Object src, @NotNull java.lang.String propertyName, @Nullable org.gtk.gobject.Value val) {
        return new Message(constructNewPropertyNotify(src, propertyName, val), Ownership.FULL);
    }
    
    private static Addressable constructNewQos(@NotNull org.gstreamer.gst.Object src, boolean live, long runningTime, long streamTime, long timestamp, long duration) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_qos.invokeExact(
                    src.handle(),
                    live ? 1 : 0,
                    runningTime,
                    streamTime,
                    timestamp,
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A QOS message is posted on the bus whenever an element decides to drop a
     * buffer because of QoS reasons or whenever it changes its processing strategy
     * because of QoS reasons (quality adjustments such as processing at lower
     * accuracy).
     * <p>
     * This message can be posted by an element that performs synchronisation against the
     * clock (live) or it could be dropped by an element that performs QoS because of QOS
     * events received from a downstream element (!live).
     * <p>
     * {@code running_time}, {@code stream_time}, {@code timestamp}, {@code duration} should be set to the
     * respective running-time, stream-time, timestamp and duration of the (dropped)
     * buffer that generated the QoS event. Values can be left to
     * GST_CLOCK_TIME_NONE when unknown.
     * @param src The object originating the message.
     * @param live if the message was generated by a live element
     * @param runningTime the running time of the buffer that generated the message
     * @param streamTime the stream time of the buffer that generated the message
     * @param timestamp the timestamps of the buffer that generated the message
     * @param duration the duration of the buffer that generated the message
     * @return The new qos message.
     * <p>
     * MT safe.
     */
    public static Message newQos(@NotNull org.gstreamer.gst.Object src, boolean live, long runningTime, long streamTime, long timestamp, long duration) {
        return new Message(constructNewQos(src, live, runningTime, streamTime, timestamp, duration), Ownership.FULL);
    }
    
    private static Addressable constructNewRedirect(@NotNull org.gstreamer.gst.Object src, @NotNull java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_redirect.invokeExact(
                    src.handle(),
                    Interop.allocateNativeString(location),
                    (Addressable) (tagList == null ? MemoryAddress.NULL : tagList.handle()),
                    (Addressable) (entryStruct == null ? MemoryAddress.NULL : entryStruct.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tagList.yieldOwnership();
        entryStruct.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new redirect message and adds a new entry to it. Redirect messages
     * are posted when an element detects that the actual data has to be retrieved
     * from a different location. This is useful if such a redirection cannot be
     * handled inside a source element, for example when HTTP 302/303 redirects
     * return a non-HTTP URL.
     * <p>
     * The redirect message can hold multiple entries. The first one is added
     * when the redirect message is created, with the given location, tag_list,
     * entry_struct arguments. Use gst_message_add_redirect_entry() to add more
     * entries.
     * <p>
     * Each entry has a location, a tag list, and a structure. All of these are
     * optional. The tag list and structure are useful for additional metadata,
     * such as bitrate statistics for the given location.
     * <p>
     * By default, message recipients should treat entries in the order they are
     * stored. The recipient should therefore try entry \\{@code 0} first, and if this
     * entry is not acceptable or working, try entry \\{@code 1} etc. Senders must make
     * sure that they add entries in this order. However, recipients are free to
     * ignore the order and pick an entry that is "best" for them. One example
     * would be a recipient that scans the entries for the one with the highest
     * bitrate tag.
     * <p>
     * The specified location string is copied. However, ownership over the tag
     * list and structure are transferred to the message.
     * @param src The {@link Object} whose property changed (may or may not be a {@link Element})
     * @param location location string for the new entry
     * @param tagList tag list for the new entry
     * @param entryStruct structure for the new entry
     * @return a newly allocated {@link Message}
     */
    public static Message newRedirect(@NotNull org.gstreamer.gst.Object src, @NotNull java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        return new Message(constructNewRedirect(src, location, tagList, entryStruct), Ownership.FULL);
    }
    
    private static Addressable constructNewRequestState(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.State state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_request_state.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message can be posted by elements when they want to have their state
     * changed. A typical use case would be an audio server that wants to pause the
     * pipeline because a higher priority stream is being played.
     * @param src The object originating the message.
     * @param state The new requested state
     * @return the new request state message.
     * <p>
     * MT safe.
     */
    public static Message newRequestState(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.State state) {
        return new Message(constructNewRequestState(src, state), Ownership.FULL);
    }
    
    private static Addressable constructNewResetTime(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ClockTime runningTime) {
        java.util.Objects.requireNonNull(runningTime, "Parameter 'runningTime' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_reset_time.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    runningTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message is posted when the pipeline running-time should be reset to
     * {@code running_time}, like after a flushing seek.
     * @param src The object originating the message.
     * @param runningTime the requested running-time
     * @return The new reset_time message.
     * <p>
     * MT safe.
     */
    public static Message newResetTime(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.ClockTime runningTime) {
        return new Message(constructNewResetTime(src, runningTime), Ownership.FULL);
    }
    
    private static Addressable constructNewSegmentDone(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long position) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_segment_done.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    format.getValue(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new segment done message. This message is posted by elements that
     * finish playback of a segment as a result of a segment seek. This message
     * is received by the application after all elements that posted a segment_start
     * have posted the segment_done.
     * @param src The object originating the message.
     * @param format The format of the position being done
     * @param position The position of the segment being done
     * @return the new segment done message.
     * <p>
     * MT safe.
     */
    public static Message newSegmentDone(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long position) {
        return new Message(constructNewSegmentDone(src, format, position), Ownership.FULL);
    }
    
    private static Addressable constructNewSegmentStart(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long position) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_segment_start.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    format.getValue(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new segment message. This message is posted by elements that
     * start playback of a segment as a result of a segment seek. This message
     * is not received by the application but is used for maintenance reasons in
     * container elements.
     * @param src The object originating the message.
     * @param format The format of the position being played
     * @param position The position of the segment being played
     * @return the new segment start message.
     * <p>
     * MT safe.
     */
    public static Message newSegmentStart(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long position) {
        return new Message(constructNewSegmentStart(src, format, position), Ownership.FULL);
    }
    
    private static Addressable constructNewStateChanged(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.State oldstate, @NotNull org.gstreamer.gst.State newstate, @NotNull org.gstreamer.gst.State pending) {
        java.util.Objects.requireNonNull(oldstate, "Parameter 'oldstate' must not be null");
        java.util.Objects.requireNonNull(newstate, "Parameter 'newstate' must not be null");
        java.util.Objects.requireNonNull(pending, "Parameter 'pending' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_state_changed.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    oldstate.getValue(),
                    newstate.getValue(),
                    pending.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a state change message. This message is posted whenever an element
     * changed its state.
     * @param src The object originating the message.
     * @param oldstate the previous state
     * @param newstate the new (current) state
     * @param pending the pending (target) state
     * @return the new state change message.
     * <p>
     * MT safe.
     */
    public static Message newStateChanged(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.State oldstate, @NotNull org.gstreamer.gst.State newstate, @NotNull org.gstreamer.gst.State pending) {
        return new Message(constructNewStateChanged(src, oldstate, newstate, pending), Ownership.FULL);
    }
    
    private static Addressable constructNewStateDirty(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_state_dirty.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a state dirty message. This message is posted whenever an element
     * changed its state asynchronously and is used internally to update the
     * states of container objects.
     * @param src The object originating the message
     * @return the new state dirty message.
     * <p>
     * MT safe.
     */
    public static Message newStateDirty(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewStateDirty(src), Ownership.FULL);
    }
    
    private static Addressable constructNewStepDone(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_step_done.invokeExact(
                    src.handle(),
                    format.getValue(),
                    amount,
                    rate,
                    flush ? 1 : 0,
                    intermediate ? 1 : 0,
                    duration,
                    eos ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message is posted by elements when they complete a part, when {@code intermediate} set
     * to {@code true}, or a complete step operation.
     * <p>
     * {@code duration} will contain the amount of time (in GST_FORMAT_TIME) of the stepped
     * {@code amount} of media in format {@code format}.
     * @param src The object originating the message.
     * @param format the format of {@code amount}
     * @param amount the amount of stepped data
     * @param rate the rate of the stepped amount
     * @param flush is this an flushing step
     * @param intermediate is this an intermediate step
     * @param duration the duration of the data
     * @param eos the step caused EOS
     * @return the new step_done message.
     * <p>
     * MT safe.
     */
    public static Message newStepDone(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos) {
        return new Message(constructNewStepDone(src, format, amount, rate, flush, intermediate, duration, eos), Ownership.FULL);
    }
    
    private static Addressable constructNewStepStart(@NotNull org.gstreamer.gst.Object src, boolean active, @NotNull org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_step_start.invokeExact(
                    src.handle(),
                    active ? 1 : 0,
                    format.getValue(),
                    amount,
                    rate,
                    flush ? 1 : 0,
                    intermediate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This message is posted by elements when they accept or activate a new step
     * event for {@code amount} in {@code format}.
     * <p>
     * {@code active} is set to {@code false} when the element accepted the new step event and has
     * queued it for execution in the streaming threads.
     * <p>
     * {@code active} is set to {@code true} when the element has activated the step operation and
     * is now ready to start executing the step in the streaming thread. After this
     * message is emitted, the application can queue a new step operation in the
     * element.
     * @param src The object originating the message.
     * @param active if the step is active or queued
     * @param format the format of {@code amount}
     * @param amount the amount of stepped data
     * @param rate the rate of the stepped amount
     * @param flush is this an flushing step
     * @param intermediate is this an intermediate step
     * @return The new step_start message.
     * <p>
     * MT safe.
     */
    public static Message newStepStart(@NotNull org.gstreamer.gst.Object src, boolean active, @NotNull org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        return new Message(constructNewStepStart(src, active, format, amount, rate, flush, intermediate), Ownership.FULL);
    }
    
    private static Addressable constructNewStreamCollection(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamCollection collection) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(collection, "Parameter 'collection' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_stream_collection.invokeExact(
                    src.handle(),
                    collection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new stream-collection message. The message is used to announce new
     * {@link StreamCollection}
     * @param src The {@link Object} that created the message
     * @param collection The {@link StreamCollection}
     * @return a newly allocated {@link Message}
     */
    public static Message newStreamCollection(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamCollection collection) {
        return new Message(constructNewStreamCollection(src, collection), Ownership.FULL);
    }
    
    private static Addressable constructNewStreamStart(@Nullable org.gstreamer.gst.Object src) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_stream_start.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new stream_start message. This message is generated and posted in
     * the sink elements of a GstBin. The bin will only forward the STREAM_START
     * message to the application if all sinks have posted an STREAM_START message.
     * @param src The object originating the message.
     * @return The new stream_start message.
     * <p>
     * MT safe.
     */
    public static Message newStreamStart(@Nullable org.gstreamer.gst.Object src) {
        return new Message(constructNewStreamStart(src), Ownership.FULL);
    }
    
    private static Addressable constructNewStreamStatus(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamStatusType type, @NotNull org.gstreamer.gst.Element owner) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(owner, "Parameter 'owner' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_stream_status.invokeExact(
                    src.handle(),
                    type.getValue(),
                    owner.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new stream status message. This message is posted when a streaming
     * thread is created/destroyed or when the state changed.
     * @param src The object originating the message.
     * @param type The stream status type.
     * @param owner the owner element of {@code src}.
     * @return the new stream status message.
     * <p>
     * MT safe.
     */
    public static Message newStreamStatus(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamStatusType type, @NotNull org.gstreamer.gst.Element owner) {
        return new Message(constructNewStreamStatus(src, type, owner), Ownership.FULL);
    }
    
    private static Addressable constructNewStreamsSelected(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamCollection collection) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(collection, "Parameter 'collection' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_streams_selected.invokeExact(
                    src.handle(),
                    collection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new steams-selected message. The message is used to announce
     * that an array of streams has been selected. This is generally in response
     * to a {@code GST_EVENT_SELECT_STREAMS} event, or when an element (such as decodebin3)
     * makes an initial selection of streams.
     * <p>
     * The message also contains the {@link StreamCollection} to which the various streams
     * belong to.
     * <p>
     * Users of gst_message_new_streams_selected() can add the selected streams with
     * gst_message_streams_selected_add().
     * @param src The {@link Object} that created the message
     * @param collection The {@link StreamCollection}
     * @return a newly allocated {@link Message}
     */
    public static Message newStreamsSelected(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StreamCollection collection) {
        return new Message(constructNewStreamsSelected(src, collection), Ownership.FULL);
    }
    
    private static Addressable constructNewStructureChange(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StructureChangeType type, @NotNull org.gstreamer.gst.Element owner, boolean busy) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(owner, "Parameter 'owner' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_structure_change.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    type.getValue(),
                    owner.handle(),
                    busy ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new structure change message. This message is posted when the
     * structure of a pipeline is in the process of being changed, for example
     * when pads are linked or unlinked.
     * <p>
     * {@code src} should be the sinkpad that unlinked or linked.
     * @param src The object originating the message.
     * @param type The change type.
     * @param owner The owner element of {@code src}.
     * @param busy Whether the structure change is busy.
     * @return the new structure change message.
     * <p>
     * MT safe.
     */
    public static Message newStructureChange(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.StructureChangeType type, @NotNull org.gstreamer.gst.Element owner, boolean busy) {
        return new Message(constructNewStructureChange(src, type, owner, busy), Ownership.FULL);
    }
    
    private static Addressable constructNewTag(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.TagList tagList) {
        java.util.Objects.requireNonNull(tagList, "Parameter 'tagList' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_tag.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    tagList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tagList.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new tag message. The message will take ownership of the tag list.
     * The message is posted by elements that discovered a new taglist.
     * @param src The object originating the message.
     * @param tagList the tag list for the message.
     * @return the new tag message.
     * <p>
     * MT safe.
     */
    public static Message newTag(@Nullable org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.TagList tagList) {
        return new Message(constructNewTag(src, tagList), Ownership.FULL);
    }
    
    private static Addressable constructNewToc(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Toc toc, boolean updated) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(toc, "Parameter 'toc' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_toc.invokeExact(
                    src.handle(),
                    toc.handle(),
                    updated ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new TOC message. The message is posted by elements
     * that discovered or updated a TOC.
     * @param src the object originating the message.
     * @param toc {@link Toc} structure for the message.
     * @param updated whether TOC was updated or not.
     * @return a new TOC message.
     * <p>
     * MT safe.
     */
    public static Message newToc(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Toc toc, boolean updated) {
        return new Message(constructNewToc(src, toc, updated), Ownership.FULL);
    }
    
    private static Addressable constructNewWarning(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_warning.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new warning message. The message will make copies of {@code error} and
     * {@code debug}.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @return the new warning message.
     * <p>
     * MT safe.
     */
    public static Message newWarning(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug) {
        return new Message(constructNewWarning(src, error, debug), Ownership.FULL);
    }
    
    private static Addressable constructNewWarningWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_warning_with_details.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    error.handle(),
                    Interop.allocateNativeString(debug),
                    (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        details.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new warning message. The message will make copies of {@code error} and
     * {@code debug}.
     * @param src The object originating the message.
     * @param error The GError for this message.
     * @param debug A debugging string.
     * @param details A GstStructure with details
     * @return the new warning message.
     */
    public static Message newWarningWithDetails(@Nullable org.gstreamer.gst.Object src, @NotNull org.gtk.glib.Error error, @NotNull java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        return new Message(constructNewWarningWithDetails(src, error, debug, details), Ownership.FULL);
    }
    
    /**
     * Creates and appends a new entry.
     * <p>
     * The specified location string is copied. However, ownership over the tag
     * list and structure are transferred to the message.
     * @param location location string for the new entry
     * @param tagList tag list for the new entry
     * @param entryStruct structure for the new entry
     */
    public void addRedirectEntry(@NotNull java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        try {
            DowncallHandles.gst_message_add_redirect_entry.invokeExact(
                    handle(),
                    Interop.allocateNativeString(location),
                    (Addressable) (tagList == null ? MemoryAddress.NULL : tagList.handle()),
                    (Addressable) (entryStruct == null ? MemoryAddress.NULL : entryStruct.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tagList.yieldOwnership();
        entryStruct.yieldOwnership();
    }
    
    /**
     * Creates a copy of the message. Returns a copy of the message.
     * @return a new copy of {@code msg}.
     * <p>
     * MT safe
     */
    public @NotNull org.gstreamer.gst.Message copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    public long getNumRedirectEntries() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_message_get_num_redirect_entries.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the sequence number of a message.
     * <p>
     * Messages have ever-incrementing sequence numbers, which may also be set
     * explicitly via gst_message_set_seqnum(). Sequence numbers are typically used
     * to indicate that a message corresponds to some other set of messages or
     * events, for example a SEGMENT_DONE message corresponding to a SEEK event. It
     * is considered good practice to make this correspondence when possible, though
     * it is not required.
     * <p>
     * Note that events and messages share the same sequence number incrementor;
     * two events or messages will never have the same sequence number unless
     * that correspondence was made explicitly.
     * @return The message's sequence number.
     * <p>
     * MT safe.
     */
    public int getSeqnum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_get_seqnum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the object managing the streaming thread from {@code message}.
     * @return a GValue containing the object that manages the
     * streaming thread. This object is usually of type GstTask but other types can
     * be added in the future. The object remains valid as long as {@code message} is
     * valid.
     */
    public @Nullable org.gtk.gobject.Value getStreamStatusObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_get_stream_status_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Access the structure of the message.
     * @return The structure of the message. The
     * structure is still owned by the message, which means that you should not
     * free it and that the pointer becomes invalid when you free the message.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Structure getStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_get_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if {@code message} has the given {@code name}. This function is usually used to
     * check the name of a custom message.
     * @param name name to check
     * @return {@code true} if {@code name} matches the name of the message structure.
     */
    public boolean hasName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_has_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extract the running_time from the async_done message.
     * <p>
     * MT safe.
     * @param runningTime Result location for the running_time or {@code null}
     */
    public void parseAsyncDone(@NotNull Out<org.gstreamer.gst.ClockTime> runningTime) {
        java.util.Objects.requireNonNull(runningTime, "Parameter 'runningTime' must not be null");
        MemorySegment runningTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_async_done.invokeExact(
                    handle(),
                    (Addressable) runningTimePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        runningTime.set(new org.gstreamer.gst.ClockTime(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Extracts the buffering percent from the GstMessage. see also
     * gst_message_new_buffering().
     * <p>
     * MT safe.
     * @param percent Return location for the percent.
     */
    public void parseBuffering(Out<Integer> percent) {
        java.util.Objects.requireNonNull(percent, "Parameter 'percent' must not be null");
        MemorySegment percentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_buffering.invokeExact(
                    handle(),
                    (Addressable) percentPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        percent.set(percentPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Extracts the buffering stats values from {@code message}.
     * @param mode a buffering mode, or {@code null}
     * @param avgIn the average input rate, or {@code null}
     * @param avgOut the average output rate, or {@code null}
     * @param bufferingLeft amount of buffering time left in
     *     milliseconds, or {@code null}
     */
    public void parseBufferingStats(@NotNull Out<org.gstreamer.gst.BufferingMode> mode, Out<Integer> avgIn, Out<Integer> avgOut, Out<Long> bufferingLeft) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        MemorySegment modePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(avgIn, "Parameter 'avgIn' must not be null");
        MemorySegment avgInPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(avgOut, "Parameter 'avgOut' must not be null");
        MemorySegment avgOutPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(bufferingLeft, "Parameter 'bufferingLeft' must not be null");
        MemorySegment bufferingLeftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_buffering_stats.invokeExact(
                    handle(),
                    (Addressable) modePOINTER.address(),
                    (Addressable) avgInPOINTER.address(),
                    (Addressable) avgOutPOINTER.address(),
                    (Addressable) bufferingLeftPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mode.set(org.gstreamer.gst.BufferingMode.of(modePOINTER.get(Interop.valueLayout.C_INT, 0)));
        avgIn.set(avgInPOINTER.get(Interop.valueLayout.C_INT, 0));
        avgOut.set(avgOutPOINTER.get(Interop.valueLayout.C_INT, 0));
        bufferingLeft.set(bufferingLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Extracts the lost clock from the GstMessage.
     * The clock object returned remains valid until the message is freed.
     * <p>
     * MT safe.
     * @param clock a pointer to hold the lost clock
     */
    public void parseClockLost(@NotNull Out<org.gstreamer.gst.Clock> clock) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        MemorySegment clockPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_clock_lost.invokeExact(
                    handle(),
                    (Addressable) clockPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        clock.set(new org.gstreamer.gst.Clock(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Extracts the clock and ready flag from the GstMessage.
     * The clock object returned remains valid until the message is freed.
     * <p>
     * MT safe.
     * @param clock a pointer to  hold a clock
     *     object, or {@code null}
     * @param ready a pointer to hold the ready flag, or {@code null}
     */
    public void parseClockProvide(@NotNull Out<org.gstreamer.gst.Clock> clock, Out<Boolean> ready) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        MemorySegment clockPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(ready, "Parameter 'ready' must not be null");
        MemorySegment readyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_clock_provide.invokeExact(
                    handle(),
                    (Addressable) clockPOINTER.address(),
                    (Addressable) readyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        clock.set(new org.gstreamer.gst.Clock(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        ready.set(readyPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parse a context type from an existing GST_MESSAGE_NEED_CONTEXT message.
     * @param contextType the context type, or {@code null}
     * @return a {@code gboolean} indicating if the parsing succeeded.
     */
    public boolean parseContextType(@NotNull Out<java.lang.String> contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        MemorySegment contextTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_parse_context_type.invokeExact(
                    handle(),
                    (Addressable) contextTypePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        contextType.set(Interop.getStringFrom(contextTypePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses a device-added message. The device-added message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. It announces the appearance
     * of monitored devices.
     * @param device A location where to store a
     *  pointer to the new {@link Device}, or {@code null}
     */
    public void parseDeviceAdded(@NotNull Out<org.gstreamer.gst.Device> device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemorySegment devicePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_device_added.invokeExact(
                    handle(),
                    (Addressable) devicePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        device.set(new org.gstreamer.gst.Device(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parses a device-changed message. The device-changed message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. It announces the
     * disappearance of monitored devices. * It announce that a device properties has
     * changed and {@code device} represents the new modified version of {@code changed_device}.
     * @param device A location where to store a
     *  pointer to the updated version of the {@link Device}, or {@code null}
     * @param changedDevice A location where to store a
     *  pointer to the old version of the {@link Device}, or {@code null}
     */
    public void parseDeviceChanged(@NotNull Out<org.gstreamer.gst.Device> device, @NotNull Out<org.gstreamer.gst.Device> changedDevice) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemorySegment devicePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(changedDevice, "Parameter 'changedDevice' must not be null");
        MemorySegment changedDevicePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_device_changed.invokeExact(
                    handle(),
                    (Addressable) devicePOINTER.address(),
                    (Addressable) changedDevicePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        device.set(new org.gstreamer.gst.Device(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        changedDevice.set(new org.gstreamer.gst.Device(changedDevicePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parses a device-removed message. The device-removed message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. It announces the
     * disappearance of monitored devices.
     * @param device A location where to store a
     *  pointer to the removed {@link Device}, or {@code null}
     */
    public void parseDeviceRemoved(@NotNull Out<org.gstreamer.gst.Device> device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemorySegment devicePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_device_removed.invokeExact(
                    handle(),
                    (Addressable) devicePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        device.set(new org.gstreamer.gst.Device(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Extracts the GError and debug string from the GstMessage. The values returned
     * in the output arguments are copies; the caller must free them when done.
     * <p>
     * Typical usage of this function might be:
     * <pre>{@code <!-- language="C" -->
     *   ...
     *   switch (GST_MESSAGE_TYPE (msg)) {
     *     case GST_MESSAGE_ERROR: {
     *       GError *err = NULL;
     *       gchar *dbg_info = NULL;
     * 
     *       gst_message_parse_error (msg, &err, &dbg_info);
     *       g_printerr ("ERROR from element %s: %s\\n",
     *           GST_OBJECT_NAME (msg->src), err->message);
     *       g_printerr ("Debugging info: %s\\n", (dbg_info) ? dbg_info : "none");
     *       g_error_free (err);
     *       g_free (dbg_info);
     *       break;
     *     }
     *     ...
     *   }
     *   ...
     * }</pre>
     * <p>
     * MT safe.
     * @param gerror location for the GError
     * @param debug location for the debug message,
     *     or {@code null}
     */
    public void parseError(@NotNull Out<org.gtk.glib.Error> gerror, @NotNull Out<java.lang.String> debug) {
        MemorySegment gerrorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        MemorySegment debugPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_error.invokeExact(
                    handle(),
                    (Addressable) gerrorPOINTER.address(),
                    (Addressable) debugPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        gerror.set(new org.gtk.glib.Error(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        debug.set(Interop.getStringFrom(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
    }
    
    /**
     * Returns the optional details structure, may be NULL if none.
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details
     */
    public void parseErrorDetails(@NotNull Out<org.gstreamer.gst.Structure> structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        MemorySegment structurePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_error_details.invokeExact(
                    handle(),
                    (Addressable) structurePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.set(new org.gstreamer.gst.Structure(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Extract the group from the STREAM_START message.
     * @param groupId Result location for the group id or
     *      {@code null}
     * @return {@code true} if the message had a group id set, {@code false} otherwise
     * <p>
     * MT safe.
     */
    public boolean parseGroupId(Out<Integer> groupId) {
        java.util.Objects.requireNonNull(groupId, "Parameter 'groupId' must not be null");
        MemorySegment groupIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_parse_group_id.invokeExact(
                    handle(),
                    (Addressable) groupIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        groupId.set(groupIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Extract the context from the HAVE_CONTEXT message.
     * <p>
     * MT safe.
     * @param context Result location for the
     *      context or {@code null}
     */
    public void parseHaveContext(@NotNull Out<org.gstreamer.gst.Context> context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        MemorySegment contextPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_have_context.invokeExact(
                    handle(),
                    (Addressable) contextPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        context.set(new org.gstreamer.gst.Context(contextPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Extracts the GError and debug string from the GstMessage. The values returned
     * in the output arguments are copies; the caller must free them when done.
     * <p>
     * MT safe.
     * @param gerror location for the GError
     * @param debug location for the debug message,
     *     or {@code null}
     */
    public void parseInfo(@NotNull Out<org.gtk.glib.Error> gerror, @NotNull Out<java.lang.String> debug) {
        MemorySegment gerrorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        MemorySegment debugPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_info.invokeExact(
                    handle(),
                    (Addressable) gerrorPOINTER.address(),
                    (Addressable) debugPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        gerror.set(new org.gtk.glib.Error(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        debug.set(Interop.getStringFrom(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
    }
    
    /**
     * Returns the optional details structure, may be NULL if none
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details structure
     */
    public void parseInfoDetails(@NotNull Out<org.gstreamer.gst.Structure> structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        MemorySegment structurePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_info_details.invokeExact(
                    handle(),
                    (Addressable) structurePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.set(new org.gstreamer.gst.Structure(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Parses the rate_multiplier from the instant-rate-request message.
     * @param rateMultiplier return location for the rate, or {@code null}
     */
    public void parseInstantRateRequest(Out<Double> rateMultiplier) {
        java.util.Objects.requireNonNull(rateMultiplier, "Parameter 'rateMultiplier' must not be null");
        MemorySegment rateMultiplierPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gst_message_parse_instant_rate_request.invokeExact(
                    handle(),
                    (Addressable) rateMultiplierPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rateMultiplier.set(rateMultiplierPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Extracts the new clock from the GstMessage.
     * The clock object returned remains valid until the message is freed.
     * <p>
     * MT safe.
     * @param clock a pointer to hold the selected
     *     new clock
     */
    public void parseNewClock(@NotNull Out<org.gstreamer.gst.Clock> clock) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        MemorySegment clockPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_new_clock.invokeExact(
                    handle(),
                    (Addressable) clockPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        clock.set(new org.gstreamer.gst.Clock(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Parses the progress {@code type}, {@code code} and {@code text}.
     * @param type location for the type
     * @param code location for the code
     * @param text location for the text
     */
    public void parseProgress(@NotNull Out<org.gstreamer.gst.ProgressType> type, @NotNull Out<java.lang.String> code, @NotNull Out<java.lang.String> text) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        MemorySegment codePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_progress.invokeExact(
                    handle(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) codePOINTER.address(),
                    (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(org.gstreamer.gst.ProgressType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
        code.set(Interop.getStringFrom(codePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        text.set(Interop.getStringFrom(textPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
    }
    
    /**
     * Parses a property-notify message. These will be posted on the bus only
     * when set up with gst_element_add_property_notify_watch() or
     * gst_element_add_property_deep_notify_watch().
     * @param object location where to store a
     *     pointer to the object whose property got changed, or {@code null}
     * @param propertyName return location for
     *     the name of the property that got changed, or {@code null}
     * @param propertyValue return location for
     *     the new value of the property that got changed, or {@code null}. This will
     *     only be set if the property notify watch was told to include the value
     *     when it was set up
     */
    public void parsePropertyNotify(@NotNull Out<org.gstreamer.gst.Object> object, @NotNull Out<java.lang.String> propertyName, @NotNull Out<org.gtk.gobject.Value> propertyValue) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        MemorySegment objectPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        MemorySegment propertyNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(propertyValue, "Parameter 'propertyValue' must not be null");
        MemorySegment propertyValuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_property_notify.invokeExact(
                    handle(),
                    (Addressable) objectPOINTER.address(),
                    (Addressable) propertyNamePOINTER.address(),
                    (Addressable) propertyValuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        object.set(new org.gstreamer.gst.Object(objectPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        propertyName.set(Interop.getStringFrom(propertyNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        propertyValue.set(new org.gtk.gobject.Value(propertyValuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Extract the timestamps and live status from the QoS message.
     * <p>
     * The returned values give the running_time, stream_time, timestamp and
     * duration of the dropped buffer. Values of GST_CLOCK_TIME_NONE mean unknown
     * values.
     * <p>
     * MT safe.
     * @param live if the message was generated by a live element
     * @param runningTime the running time of the buffer that
     *     generated the message
     * @param streamTime the stream time of the buffer that
     *     generated the message
     * @param timestamp the timestamps of the buffer that
     *     generated the message
     * @param duration the duration of the buffer that
     *     generated the message
     */
    public void parseQos(Out<Boolean> live, Out<Long> runningTime, Out<Long> streamTime, Out<Long> timestamp, Out<Long> duration) {
        java.util.Objects.requireNonNull(live, "Parameter 'live' must not be null");
        MemorySegment livePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(runningTime, "Parameter 'runningTime' must not be null");
        MemorySegment runningTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(streamTime, "Parameter 'streamTime' must not be null");
        MemorySegment streamTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        MemorySegment timestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_qos.invokeExact(
                    handle(),
                    (Addressable) livePOINTER.address(),
                    (Addressable) runningTimePOINTER.address(),
                    (Addressable) streamTimePOINTER.address(),
                    (Addressable) timestampPOINTER.address(),
                    (Addressable) durationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        live.set(livePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        runningTime.set(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        streamTime.set(streamTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        timestamp.set(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
        duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Extract the QoS stats representing the history of the current continuous
     * pipeline playback period.
     * <p>
     * When {@code format} is {@code GST_FORMAT_UNDEFINED} both {@code dropped} and {@code processed} are
     * invalid. Values of -1 for either {@code processed} or {@code dropped} mean unknown values.
     * <p>
     * MT safe.
     * @param format Units of the 'processed' and 'dropped' fields.
     *     Video sinks and video filters will use GST_FORMAT_BUFFERS (frames).
     *     Audio sinks and audio filters will likely use GST_FORMAT_DEFAULT
     *     (samples).
     * @param processed Total number of units correctly processed
     *     since the last state change to READY or a flushing operation.
     * @param dropped Total number of units dropped since the last
     *     state change to READY or a flushing operation.
     */
    public void parseQosStats(@NotNull Out<org.gstreamer.gst.Format> format, Out<Long> processed, Out<Long> dropped) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(processed, "Parameter 'processed' must not be null");
        MemorySegment processedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(dropped, "Parameter 'dropped' must not be null");
        MemorySegment droppedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_qos_stats.invokeExact(
                    handle(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) processedPOINTER.address(),
                    (Addressable) droppedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        processed.set(processedPOINTER.get(Interop.valueLayout.C_LONG, 0));
        dropped.set(droppedPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Extract the QoS values that have been calculated/analysed from the QoS data
     * <p>
     * MT safe.
     * @param jitter The difference of the running-time against
     *     the deadline.
     * @param proportion Long term prediction of the ideal rate
     *     relative to normal rate to get optimal quality.
     * @param quality An element dependent integer value that
     *     specifies the current quality level of the element. The default
     *     maximum quality is 1000000.
     */
    public void parseQosValues(Out<Long> jitter, Out<Double> proportion, Out<Integer> quality) {
        java.util.Objects.requireNonNull(jitter, "Parameter 'jitter' must not be null");
        MemorySegment jitterPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(proportion, "Parameter 'proportion' must not be null");
        MemorySegment proportionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(quality, "Parameter 'quality' must not be null");
        MemorySegment qualityPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_qos_values.invokeExact(
                    handle(),
                    (Addressable) jitterPOINTER.address(),
                    (Addressable) proportionPOINTER.address(),
                    (Addressable) qualityPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        jitter.set(jitterPOINTER.get(Interop.valueLayout.C_LONG, 0));
        proportion.set(proportionPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        quality.set(qualityPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parses the location and/or structure from the entry with the given index.
     * The index must be between 0 and gst_message_get_num_redirect_entries() - 1.
     * Returned pointers are valid for as long as this message exists.
     * @param entryIndex index of the entry to parse
     * @param location return location for
     *     the pointer to the entry's location string, or {@code null}
     * @param tagList return location for
     *     the pointer to the entry's tag list, or {@code null}
     * @param entryStruct return location
     *     for the pointer to the entry's structure, or {@code null}
     */
    public void parseRedirectEntry(long entryIndex, @NotNull Out<java.lang.String> location, @NotNull Out<org.gstreamer.gst.TagList> tagList, @NotNull Out<org.gstreamer.gst.Structure> entryStruct) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        MemorySegment locationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(tagList, "Parameter 'tagList' must not be null");
        MemorySegment tagListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(entryStruct, "Parameter 'entryStruct' must not be null");
        MemorySegment entryStructPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_redirect_entry.invokeExact(
                    handle(),
                    entryIndex,
                    (Addressable) locationPOINTER.address(),
                    (Addressable) tagListPOINTER.address(),
                    (Addressable) entryStructPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        location.set(Interop.getStringFrom(locationPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        tagList.set(new org.gstreamer.gst.TagList(tagListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        entryStruct.set(new org.gstreamer.gst.Structure(entryStructPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Extract the requested state from the request_state message.
     * <p>
     * MT safe.
     * @param state Result location for the requested state or {@code null}
     */
    public void parseRequestState(@NotNull Out<org.gstreamer.gst.State> state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemorySegment statePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_request_state.invokeExact(
                    handle(),
                    (Addressable) statePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        state.set(org.gstreamer.gst.State.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Extract the running-time from the RESET_TIME message.
     * <p>
     * MT safe.
     * @param runningTime Result location for the running_time or
     *      {@code null}
     */
    public void parseResetTime(@NotNull Out<org.gstreamer.gst.ClockTime> runningTime) {
        java.util.Objects.requireNonNull(runningTime, "Parameter 'runningTime' must not be null");
        MemorySegment runningTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_reset_time.invokeExact(
                    handle(),
                    (Addressable) runningTimePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        runningTime.set(new org.gstreamer.gst.ClockTime(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Extracts the position and format from the segment done message.
     * <p>
     * MT safe.
     * @param format Result location for the format, or {@code null}
     * @param position Result location for the position, or {@code null}
     */
    public void parseSegmentDone(@NotNull Out<org.gstreamer.gst.Format> format, Out<Long> position) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_segment_done.invokeExact(
                    handle(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Extracts the position and format from the segment start message.
     * <p>
     * MT safe.
     * @param format Result location for the format, or {@code null}
     * @param position Result location for the position, or {@code null}
     */
    public void parseSegmentStart(@NotNull Out<org.gstreamer.gst.Format> format, Out<Long> position) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_message_parse_segment_start.invokeExact(
                    handle(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Extracts the old and new states from the GstMessage.
     * <p>
     * Typical usage of this function might be:
     * <pre>{@code <!-- language="C" -->
     *   ...
     *   switch (GST_MESSAGE_TYPE (msg)) {
     *     case GST_MESSAGE_STATE_CHANGED: {
     *       GstState old_state, new_state;
     * 
     *       gst_message_parse_state_changed (msg, &old_state, &new_state, NULL);
     *       g_print ("Element %s changed state from %s to %s.\\n",
     *           GST_OBJECT_NAME (msg->src),
     *           gst_element_state_get_name (old_state),
     *           gst_element_state_get_name (new_state));
     *       break;
     *     }
     *     ...
     *   }
     *   ...
     * }</pre>
     * <p>
     * MT safe.
     * @param oldstate the previous state, or {@code null}
     * @param newstate the new (current) state, or {@code null}
     * @param pending the pending (target) state, or {@code null}
     */
    public void parseStateChanged(@NotNull Out<org.gstreamer.gst.State> oldstate, @NotNull Out<org.gstreamer.gst.State> newstate, @NotNull Out<org.gstreamer.gst.State> pending) {
        java.util.Objects.requireNonNull(oldstate, "Parameter 'oldstate' must not be null");
        MemorySegment oldstatePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(newstate, "Parameter 'newstate' must not be null");
        MemorySegment newstatePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(pending, "Parameter 'pending' must not be null");
        MemorySegment pendingPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_state_changed.invokeExact(
                    handle(),
                    (Addressable) oldstatePOINTER.address(),
                    (Addressable) newstatePOINTER.address(),
                    (Addressable) pendingPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        oldstate.set(org.gstreamer.gst.State.of(oldstatePOINTER.get(Interop.valueLayout.C_INT, 0)));
        newstate.set(org.gstreamer.gst.State.of(newstatePOINTER.get(Interop.valueLayout.C_INT, 0)));
        pending.set(org.gstreamer.gst.State.of(pendingPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Extract the values the step_done message.
     * <p>
     * MT safe.
     * @param format result location for the format
     * @param amount result location for the amount
     * @param rate result location for the rate
     * @param flush result location for the flush flag
     * @param intermediate result location for the intermediate flag
     * @param duration result location for the duration
     * @param eos result location for the EOS flag
     */
    public void parseStepDone(@NotNull Out<org.gstreamer.gst.Format> format, Out<Long> amount, Out<Double> rate, Out<Boolean> flush, Out<Boolean> intermediate, Out<Long> duration, Out<Boolean> eos) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(amount, "Parameter 'amount' must not be null");
        MemorySegment amountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(rate, "Parameter 'rate' must not be null");
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(flush, "Parameter 'flush' must not be null");
        MemorySegment flushPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(intermediate, "Parameter 'intermediate' must not be null");
        MemorySegment intermediatePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(eos, "Parameter 'eos' must not be null");
        MemorySegment eosPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_step_done.invokeExact(
                    handle(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) amountPOINTER.address(),
                    (Addressable) ratePOINTER.address(),
                    (Addressable) flushPOINTER.address(),
                    (Addressable) intermediatePOINTER.address(),
                    (Addressable) durationPOINTER.address(),
                    (Addressable) eosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        amount.set(amountPOINTER.get(Interop.valueLayout.C_LONG, 0));
        rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        flush.set(flushPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        intermediate.set(intermediatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        eos.set(eosPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Extract the values from step_start message.
     * <p>
     * MT safe.
     * @param active result location for the active flag
     * @param format result location for the format
     * @param amount result location for the amount
     * @param rate result location for the rate
     * @param flush result location for the flush flag
     * @param intermediate result location for the intermediate flag
     */
    public void parseStepStart(Out<Boolean> active, @NotNull Out<org.gstreamer.gst.Format> format, Out<Long> amount, Out<Double> rate, Out<Boolean> flush, Out<Boolean> intermediate) {
        java.util.Objects.requireNonNull(active, "Parameter 'active' must not be null");
        MemorySegment activePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(amount, "Parameter 'amount' must not be null");
        MemorySegment amountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(rate, "Parameter 'rate' must not be null");
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(flush, "Parameter 'flush' must not be null");
        MemorySegment flushPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(intermediate, "Parameter 'intermediate' must not be null");
        MemorySegment intermediatePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_step_start.invokeExact(
                    handle(),
                    (Addressable) activePOINTER.address(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) amountPOINTER.address(),
                    (Addressable) ratePOINTER.address(),
                    (Addressable) flushPOINTER.address(),
                    (Addressable) intermediatePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        active.set(activePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        amount.set(amountPOINTER.get(Interop.valueLayout.C_LONG, 0));
        rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        flush.set(flushPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        intermediate.set(intermediatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parses a stream-collection message.
     * @param collection A location where to store a
     *  pointer to the {@link StreamCollection}, or {@code null}
     */
    public void parseStreamCollection(@NotNull Out<org.gstreamer.gst.StreamCollection> collection) {
        java.util.Objects.requireNonNull(collection, "Parameter 'collection' must not be null");
        MemorySegment collectionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_stream_collection.invokeExact(
                    handle(),
                    (Addressable) collectionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        collection.set(new org.gstreamer.gst.StreamCollection(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Extracts the stream status type and owner the GstMessage. The returned
     * owner remains valid for as long as the reference to {@code message} is valid and
     * should thus not be unreffed.
     * <p>
     * MT safe.
     * @param type A pointer to hold the status type
     * @param owner The owner element of the message source
     */
    public void parseStreamStatus(@NotNull Out<org.gstreamer.gst.StreamStatusType> type, @NotNull Out<org.gstreamer.gst.Element> owner) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(owner, "Parameter 'owner' must not be null");
        MemorySegment ownerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_stream_status.invokeExact(
                    handle(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) ownerPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(org.gstreamer.gst.StreamStatusType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
        owner.set(new org.gstreamer.gst.Element(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Parses a streams-selected message.
     * @param collection A location where to store a
     *  pointer to the {@link StreamCollection}, or {@code null}
     */
    public void parseStreamsSelected(@NotNull Out<org.gstreamer.gst.StreamCollection> collection) {
        java.util.Objects.requireNonNull(collection, "Parameter 'collection' must not be null");
        MemorySegment collectionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_streams_selected.invokeExact(
                    handle(),
                    (Addressable) collectionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        collection.set(new org.gstreamer.gst.StreamCollection(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Extracts the change type and completion status from the GstMessage.
     * <p>
     * MT safe.
     * @param type A pointer to hold the change type
     * @param owner The owner element of the
     *     message source
     * @param busy a pointer to hold whether the change is in
     *     progress or has been completed
     */
    public void parseStructureChange(@NotNull Out<org.gstreamer.gst.StructureChangeType> type, @NotNull Out<org.gstreamer.gst.Element> owner, Out<Boolean> busy) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(owner, "Parameter 'owner' must not be null");
        MemorySegment ownerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(busy, "Parameter 'busy' must not be null");
        MemorySegment busyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_structure_change.invokeExact(
                    handle(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) ownerPOINTER.address(),
                    (Addressable) busyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(org.gstreamer.gst.StructureChangeType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
        owner.set(new org.gstreamer.gst.Element(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        busy.set(busyPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Extracts the tag list from the GstMessage. The tag list returned in the
     * output argument is a copy; the caller must free it when done.
     * <p>
     * Typical usage of this function might be:
     * <pre>{@code <!-- language="C" -->
     *   ...
     *   switch (GST_MESSAGE_TYPE (msg)) {
     *     case GST_MESSAGE_TAG: {
     *       GstTagList *tags = NULL;
     * 
     *       gst_message_parse_tag (msg, &tags);
     *       g_print ("Got tags from element %s\\n", GST_OBJECT_NAME (msg->src));
     *       handle_tags (tags);
     *       gst_tag_list_unref (tags);
     *       break;
     *     }
     *     ...
     *   }
     *   ...
     * }</pre>
     * <p>
     * MT safe.
     * @param tagList return location for the tag-list.
     */
    public void parseTag(@NotNull Out<org.gstreamer.gst.TagList> tagList) {
        java.util.Objects.requireNonNull(tagList, "Parameter 'tagList' must not be null");
        MemorySegment tagListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_tag.invokeExact(
                    handle(),
                    (Addressable) tagListPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tagList.set(new org.gstreamer.gst.TagList(tagListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Extract the TOC from the {@link Message}. The TOC returned in the
     * output argument is a copy; the caller must free it with
     * gst_toc_unref() when done.
     * <p>
     * MT safe.
     * @param toc return location for the TOC.
     * @param updated return location for the updated flag.
     */
    public void parseToc(@NotNull Out<org.gstreamer.gst.Toc> toc, Out<Boolean> updated) {
        java.util.Objects.requireNonNull(toc, "Parameter 'toc' must not be null");
        MemorySegment tocPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(updated, "Parameter 'updated' must not be null");
        MemorySegment updatedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_message_parse_toc.invokeExact(
                    handle(),
                    (Addressable) tocPOINTER.address(),
                    (Addressable) updatedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        toc.set(new org.gstreamer.gst.Toc(tocPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        updated.set(updatedPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Extracts the GError and debug string from the GstMessage. The values returned
     * in the output arguments are copies; the caller must free them when done.
     * <p>
     * MT safe.
     * @param gerror location for the GError
     * @param debug location for the debug message,
     *     or {@code null}
     */
    public void parseWarning(@NotNull Out<org.gtk.glib.Error> gerror, @NotNull Out<java.lang.String> debug) {
        MemorySegment gerrorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(debug, "Parameter 'debug' must not be null");
        MemorySegment debugPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_warning.invokeExact(
                    handle(),
                    (Addressable) gerrorPOINTER.address(),
                    (Addressable) debugPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        gerror.set(new org.gtk.glib.Error(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        debug.set(Interop.getStringFrom(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
    }
    
    /**
     * Returns the optional details structure, may be NULL if none
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details structure
     */
    public void parseWarningDetails(@NotNull Out<org.gstreamer.gst.Structure> structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        MemorySegment structurePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_message_parse_warning_details.invokeExact(
                    handle(),
                    (Addressable) structurePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.set(new org.gstreamer.gst.Structure(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Configures the buffering stats values in {@code message}.
     * @param mode a buffering mode
     * @param avgIn the average input rate
     * @param avgOut the average output rate
     * @param bufferingLeft amount of buffering time left in milliseconds
     */
    public void setBufferingStats(@NotNull org.gstreamer.gst.BufferingMode mode, int avgIn, int avgOut, long bufferingLeft) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_message_set_buffering_stats.invokeExact(
                    handle(),
                    mode.getValue(),
                    avgIn,
                    avgOut,
                    bufferingLeft);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the group id on the stream-start message.
     * <p>
     * All streams that have the same group id are supposed to be played
     * together, i.e. all streams inside a container file should have the
     * same group id but different stream ids. The group id should change
     * each time the stream is started, resulting in different group ids
     * each time a file is played for example.
     * <p>
     * MT safe.
     * @param groupId the group id
     */
    public void setGroupId(int groupId) {
        try {
            DowncallHandles.gst_message_set_group_id.invokeExact(
                    handle(),
                    groupId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the QoS stats representing the history of the current continuous pipeline
     * playback period.
     * <p>
     * When {@code format} is {@code GST_FORMAT_UNDEFINED} both {@code dropped} and {@code processed} are
     * invalid. Values of -1 for either {@code processed} or {@code dropped} mean unknown values.
     * <p>
     * MT safe.
     * @param format Units of the 'processed' and 'dropped' fields. Video sinks and video
     * filters will use GST_FORMAT_BUFFERS (frames). Audio sinks and audio filters
     * will likely use GST_FORMAT_DEFAULT (samples).
     * @param processed Total number of units correctly processed since the last state
     * change to READY or a flushing operation.
     * @param dropped Total number of units dropped since the last state change to READY
     * or a flushing operation.
     */
    public void setQosStats(@NotNull org.gstreamer.gst.Format format, long processed, long dropped) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_message_set_qos_stats.invokeExact(
                    handle(),
                    format.getValue(),
                    processed,
                    dropped);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the QoS values that have been calculated/analysed from the QoS data
     * <p>
     * MT safe.
     * @param jitter The difference of the running-time against the deadline.
     * @param proportion Long term prediction of the ideal rate relative to normal rate
     * to get optimal quality.
     * @param quality An element dependent integer value that specifies the current
     * quality level of the element. The default maximum quality is 1000000.
     */
    public void setQosValues(long jitter, double proportion, int quality) {
        try {
            DowncallHandles.gst_message_set_qos_values.invokeExact(
                    handle(),
                    jitter,
                    proportion,
                    quality);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the sequence number of a message.
     * <p>
     * This function might be called by the creator of a message to indicate that
     * the message relates to other messages or events. See gst_message_get_seqnum()
     * for more information.
     * <p>
     * MT safe.
     * @param seqnum A sequence number.
     */
    public void setSeqnum(int seqnum) {
        try {
            DowncallHandles.gst_message_set_seqnum.invokeExact(
                    handle(),
                    seqnum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures the object handling the streaming thread. This is usually a
     * GstTask object but other objects might be added in the future.
     * @param object the object controlling the streaming
     */
    public void setStreamStatusObject(@NotNull org.gtk.gobject.Value object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        try {
            DowncallHandles.gst_message_set_stream_status_object.invokeExact(
                    handle(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds the {@code stream} to the {@code message}.
     * @param stream a {@link Stream} to add to {@code message}
     */
    public void streamsSelectedAdd(@NotNull org.gstreamer.gst.Stream stream) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        try {
            DowncallHandles.gst_message_streams_selected_add.invokeExact(
                    handle(),
                    stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the number of streams contained in the {@code message}.
     * @return The number of streams contained within.
     */
    public int streamsSelectedGetSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_streams_selected_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the {@link Stream} with index {@code index} from the {@code message}.
     * @param idx Index of the stream to retrieve
     * @return A {@link Stream}
     */
    public @Nullable org.gstreamer.gst.Stream streamsSelectedGetStream(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_streams_selected_get_stream.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Stream(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a writable version of the structure.
     * @return The structure of the message. The structure
     * is still owned by the message, which means that you should not free
     * it and that the pointer becomes invalid when you free the message.
     * This function checks if {@code message} is writable and will never return
     * {@code null}.
     * <p>
     * MT safe.
     */
    public @NotNull org.gstreamer.gst.Structure writableStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_writable_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    /**
     * Modifies a pointer to a {@link Message} to point to a different {@link Message}. The
     * modification is done atomically (so this is useful for ensuring thread safety
     * in some cases), and the reference counts are updated appropriately (the old
     * message is unreffed, the new one is reffed).
     * <p>
     * Either {@code new_message} or the {@link Message} pointed to by {@code old_message} may be {@code null}.
     * @param oldMessage pointer to a
     *     pointer to a {@link Message} to be replaced.
     * @param newMessage pointer to a {@link Message} that will
     *     replace the message pointed to by {@code old_message}.
     * @return {@code true} if {@code new_message} was different from {@code old_message}
     */
    public static boolean replace(@Nullable Out<org.gstreamer.gst.Message> oldMessage, @Nullable org.gstreamer.gst.Message newMessage) {
        MemorySegment oldMessagePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_replace.invokeExact(
                    (Addressable) (oldMessage == null ? MemoryAddress.NULL : (Addressable) oldMessagePOINTER.address()),
                    (Addressable) (newMessage == null ? MemoryAddress.NULL : newMessage.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (oldMessage != null) oldMessage.set(new org.gstreamer.gst.Message(oldMessagePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_message_new_application = Interop.downcallHandle(
            "gst_message_new_application",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_async_done = Interop.downcallHandle(
            "gst_message_new_async_done",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_new_async_start = Interop.downcallHandle(
            "gst_message_new_async_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_buffering = Interop.downcallHandle(
            "gst_message_new_buffering",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_clock_lost = Interop.downcallHandle(
            "gst_message_new_clock_lost",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_clock_provide = Interop.downcallHandle(
            "gst_message_new_clock_provide",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_custom = Interop.downcallHandle(
            "gst_message_new_custom",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_device_added = Interop.downcallHandle(
            "gst_message_new_device_added",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_device_changed = Interop.downcallHandle(
            "gst_message_new_device_changed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_device_removed = Interop.downcallHandle(
            "gst_message_new_device_removed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_duration_changed = Interop.downcallHandle(
            "gst_message_new_duration_changed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_element = Interop.downcallHandle(
            "gst_message_new_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_eos = Interop.downcallHandle(
            "gst_message_new_eos",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_error = Interop.downcallHandle(
            "gst_message_new_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_error_with_details = Interop.downcallHandle(
            "gst_message_new_error_with_details",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_have_context = Interop.downcallHandle(
            "gst_message_new_have_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_info = Interop.downcallHandle(
            "gst_message_new_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_info_with_details = Interop.downcallHandle(
            "gst_message_new_info_with_details",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_instant_rate_request = Interop.downcallHandle(
            "gst_message_new_instant_rate_request",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_message_new_latency = Interop.downcallHandle(
            "gst_message_new_latency",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_need_context = Interop.downcallHandle(
            "gst_message_new_need_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_new_clock = Interop.downcallHandle(
            "gst_message_new_new_clock",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_progress = Interop.downcallHandle(
            "gst_message_new_progress",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_property_notify = Interop.downcallHandle(
            "gst_message_new_property_notify",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_qos = Interop.downcallHandle(
            "gst_message_new_qos",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_new_redirect = Interop.downcallHandle(
            "gst_message_new_redirect",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_request_state = Interop.downcallHandle(
            "gst_message_new_request_state",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_reset_time = Interop.downcallHandle(
            "gst_message_new_reset_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_new_segment_done = Interop.downcallHandle(
            "gst_message_new_segment_done",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_new_segment_start = Interop.downcallHandle(
            "gst_message_new_segment_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_new_state_changed = Interop.downcallHandle(
            "gst_message_new_state_changed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_state_dirty = Interop.downcallHandle(
            "gst_message_new_state_dirty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_step_done = Interop.downcallHandle(
            "gst_message_new_step_done",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_step_start = Interop.downcallHandle(
            "gst_message_new_step_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_stream_collection = Interop.downcallHandle(
            "gst_message_new_stream_collection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_stream_start = Interop.downcallHandle(
            "gst_message_new_stream_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_stream_status = Interop.downcallHandle(
            "gst_message_new_stream_status",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_streams_selected = Interop.downcallHandle(
            "gst_message_new_streams_selected",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_structure_change = Interop.downcallHandle(
            "gst_message_new_structure_change",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_tag = Interop.downcallHandle(
            "gst_message_new_tag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_toc = Interop.downcallHandle(
            "gst_message_new_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_new_warning = Interop.downcallHandle(
            "gst_message_new_warning",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_new_warning_with_details = Interop.downcallHandle(
            "gst_message_new_warning_with_details",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_add_redirect_entry = Interop.downcallHandle(
            "gst_message_add_redirect_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_copy = Interop.downcallHandle(
            "gst_message_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_get_num_redirect_entries = Interop.downcallHandle(
            "gst_message_get_num_redirect_entries",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_get_seqnum = Interop.downcallHandle(
            "gst_message_get_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_get_stream_status_object = Interop.downcallHandle(
            "gst_message_get_stream_status_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_get_structure = Interop.downcallHandle(
            "gst_message_get_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_has_name = Interop.downcallHandle(
            "gst_message_has_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_async_done = Interop.downcallHandle(
            "gst_message_parse_async_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_buffering = Interop.downcallHandle(
            "gst_message_parse_buffering",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_buffering_stats = Interop.downcallHandle(
            "gst_message_parse_buffering_stats",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_clock_lost = Interop.downcallHandle(
            "gst_message_parse_clock_lost",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_clock_provide = Interop.downcallHandle(
            "gst_message_parse_clock_provide",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_context_type = Interop.downcallHandle(
            "gst_message_parse_context_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_device_added = Interop.downcallHandle(
            "gst_message_parse_device_added",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_device_changed = Interop.downcallHandle(
            "gst_message_parse_device_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_device_removed = Interop.downcallHandle(
            "gst_message_parse_device_removed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_error = Interop.downcallHandle(
            "gst_message_parse_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_error_details = Interop.downcallHandle(
            "gst_message_parse_error_details",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_group_id = Interop.downcallHandle(
            "gst_message_parse_group_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_have_context = Interop.downcallHandle(
            "gst_message_parse_have_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_info = Interop.downcallHandle(
            "gst_message_parse_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_info_details = Interop.downcallHandle(
            "gst_message_parse_info_details",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_instant_rate_request = Interop.downcallHandle(
            "gst_message_parse_instant_rate_request",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_new_clock = Interop.downcallHandle(
            "gst_message_parse_new_clock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_progress = Interop.downcallHandle(
            "gst_message_parse_progress",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_property_notify = Interop.downcallHandle(
            "gst_message_parse_property_notify",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_qos = Interop.downcallHandle(
            "gst_message_parse_qos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_qos_stats = Interop.downcallHandle(
            "gst_message_parse_qos_stats",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_qos_values = Interop.downcallHandle(
            "gst_message_parse_qos_values",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_redirect_entry = Interop.downcallHandle(
            "gst_message_parse_redirect_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_request_state = Interop.downcallHandle(
            "gst_message_parse_request_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_reset_time = Interop.downcallHandle(
            "gst_message_parse_reset_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_segment_done = Interop.downcallHandle(
            "gst_message_parse_segment_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_segment_start = Interop.downcallHandle(
            "gst_message_parse_segment_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_state_changed = Interop.downcallHandle(
            "gst_message_parse_state_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_step_done = Interop.downcallHandle(
            "gst_message_parse_step_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_step_start = Interop.downcallHandle(
            "gst_message_parse_step_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_stream_collection = Interop.downcallHandle(
            "gst_message_parse_stream_collection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_stream_status = Interop.downcallHandle(
            "gst_message_parse_stream_status",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_streams_selected = Interop.downcallHandle(
            "gst_message_parse_streams_selected",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_structure_change = Interop.downcallHandle(
            "gst_message_parse_structure_change",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_tag = Interop.downcallHandle(
            "gst_message_parse_tag",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_toc = Interop.downcallHandle(
            "gst_message_parse_toc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_parse_warning = Interop.downcallHandle(
            "gst_message_parse_warning",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_parse_warning_details = Interop.downcallHandle(
            "gst_message_parse_warning_details",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_set_buffering_stats = Interop.downcallHandle(
            "gst_message_set_buffering_stats",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_set_group_id = Interop.downcallHandle(
            "gst_message_set_group_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_set_qos_stats = Interop.downcallHandle(
            "gst_message_set_qos_stats",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_message_set_qos_values = Interop.downcallHandle(
            "gst_message_set_qos_values",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_set_seqnum = Interop.downcallHandle(
            "gst_message_set_seqnum",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_set_stream_status_object = Interop.downcallHandle(
            "gst_message_set_stream_status_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_streams_selected_add = Interop.downcallHandle(
            "gst_message_streams_selected_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_streams_selected_get_size = Interop.downcallHandle(
            "gst_message_streams_selected_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_streams_selected_get_stream = Interop.downcallHandle(
            "gst_message_streams_selected_get_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_writable_structure = Interop.downcallHandle(
            "gst_message_writable_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_message_replace = Interop.downcallHandle(
            "gst_message_replace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Message struct;
        
         /**
         * A {@link Message.Build} object constructs a {@link Message} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Message.allocate();
        }
        
         /**
         * Finish building the {@link Message} struct.
         * @return A new instance of {@code Message} with the fields 
         *         that were set in the Build object.
         */
        public Message construct() {
            return struct;
        }
        
        /**
         * the parent structure
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
        
        /**
         * the {@link MessageType} of the message
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.gst.MessageType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the timestamp of the message
         * @param timestamp The value for the {@code timestamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTimestamp(long timestamp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), timestamp);
            return this;
        }
        
        /**
         * the src of the message
         * @param src The value for the {@code src} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSrc(org.gstreamer.gst.Object src) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
            return this;
        }
        
        /**
         * the sequence number of the message
         * @param seqnum The value for the {@code seqnum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeqnum(int seqnum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seqnum);
            return this;
        }
        
        public Build setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        public Build setCond(org.gtk.glib.Cond cond) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cond"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cond == null ? MemoryAddress.NULL : cond.handle()));
            return this;
        }
    }
}
