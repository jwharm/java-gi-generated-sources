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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Message}
     * @return A new, uninitialized @{link Message}
     */
    public static Message allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Message newInstance = new Message(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject getMiniObject() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mini_object}
     * @param miniObject The new value of the field {@code mini_object}
     */
    public void setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.gst.MessageType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.MessageType(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.gst.MessageType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code timestamp}
     * @return The value of the field {@code timestamp}
     */
    public long getTimestamp() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code timestamp}
     * @param timestamp The new value of the field {@code timestamp}
     */
    public void setTimestamp(long timestamp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), timestamp);
        }
    }
    
    /**
     * Get the value of the field {@code src}
     * @return The value of the field {@code src}
     */
    public org.gstreamer.gst.GstObject getSrc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gst.GstObject) Interop.register(RESULT, org.gstreamer.gst.GstObject.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code src}
     * @param src The new value of the field {@code src}
     */
    public void setSrc(org.gstreamer.gst.GstObject src) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code seqnum}
     * @return The value of the field {@code seqnum}
     */
    public int getSeqnum_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code seqnum}
     * @param seqnum The new value of the field {@code seqnum}
     */
    public void setSeqnum_(int seqnum) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), seqnum);
        }
    }
    
    /**
     * Create a Message proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Message(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Message> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Message(input);
    
    private static MemoryAddress constructNewApplication(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
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
    public static Message newApplication(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewApplication(src, structure);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewAsyncDone(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.ClockTime runningTime) {
        MemoryAddress RESULT;
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
    public static Message newAsyncDone(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.ClockTime runningTime) {
        var RESULT = constructNewAsyncDone(src, runningTime);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewAsyncStart(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_async_start.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newAsyncStart(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewAsyncStart(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewBuffering(@Nullable org.gstreamer.gst.GstObject src, int percent) {
        MemoryAddress RESULT;
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
    public static Message newBuffering(@Nullable org.gstreamer.gst.GstObject src, int percent) {
        var RESULT = constructNewBuffering(src, percent);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewClockLost(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock) {
        MemoryAddress RESULT;
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
    public static Message newClockLost(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock) {
        var RESULT = constructNewClockLost(src, clock);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewClockProvide(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock, boolean ready) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_clock_provide.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    clock.handle(),
                    Marshal.booleanToInteger.marshal(ready, null).intValue());
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
    public static Message newClockProvide(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock, boolean ready) {
        var RESULT = constructNewClockProvide(src, clock, ready);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewCustom(org.gstreamer.gst.MessageType type, @Nullable org.gstreamer.gst.GstObject src, @Nullable org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
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
    public static Message newCustom(org.gstreamer.gst.MessageType type, @Nullable org.gstreamer.gst.GstObject src, @Nullable org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewCustom(type, src, structure);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDeviceAdded(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that created the message
     * @param device The new {@link Device}
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceAdded(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device) {
        var RESULT = constructNewDeviceAdded(src, device);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDeviceChanged(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device, org.gstreamer.gst.Device changedDevice) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that created the message
     * @param device The newly created device representing {@code replaced_device}
     *         with its new configuration.
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceChanged(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device, org.gstreamer.gst.Device changedDevice) {
        var RESULT = constructNewDeviceChanged(src, device, changedDevice);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDeviceRemoved(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that created the message
     * @param device The removed {@link Device}
     * @return a newly allocated {@link Message}
     */
    public static Message newDeviceRemoved(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Device device) {
        var RESULT = constructNewDeviceRemoved(src, device);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDurationChanged(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_duration_changed.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newDurationChanged(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewDurationChanged(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewElement(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
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
    public static Message newElement(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewElement(src, structure);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewEos(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_eos.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newEos(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewEos(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewError(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_error.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Message newError(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        var RESULT = constructNewError(src, error, debug);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewErrorWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_error_with_details.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE),
                        (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            details.yieldOwnership();
            return RESULT;
        }
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
    public static Message newErrorWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        var RESULT = constructNewErrorWithDetails(src, error, debug, details);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewHaveContext(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Context context) {
        MemoryAddress RESULT;
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
    public static Message newHaveContext(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Context context) {
        var RESULT = constructNewHaveContext(src, context);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewInfo(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_info.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Message newInfo(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        var RESULT = constructNewInfo(src, error, debug);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewInfoWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_info_with_details.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE),
                        (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            details.yieldOwnership();
            return RESULT;
        }
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
    public static Message newInfoWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        var RESULT = constructNewInfoWithDetails(src, error, debug, details);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewInstantRateRequest(org.gstreamer.gst.GstObject src, double rateMultiplier) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that posted the message
     * @param rateMultiplier the rate multiplier factor that should be applied
     * @return a newly allocated {@link Message}
     */
    public static Message newInstantRateRequest(org.gstreamer.gst.GstObject src, double rateMultiplier) {
        var RESULT = constructNewInstantRateRequest(src, rateMultiplier);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewLatency(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_latency.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newLatency(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewLatency(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewNeedContext(@Nullable org.gstreamer.gst.GstObject src, java.lang.String contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_need_context.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        Marshal.stringToAddress.marshal(contextType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * This message is posted when an element needs a specific {@link Context}.
     * @param src The object originating the message.
     * @param contextType The context type that is needed
     * @return The new need-context message.
     * <p>
     * MT safe.
     */
    public static Message newNeedContext(@Nullable org.gstreamer.gst.GstObject src, java.lang.String contextType) {
        var RESULT = constructNewNeedContext(src, contextType);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewNewClock(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock) {
        MemoryAddress RESULT;
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
    public static Message newNewClock(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Clock clock) {
        var RESULT = constructNewNewClock(src, clock);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewProgress(org.gstreamer.gst.GstObject src, org.gstreamer.gst.ProgressType type, java.lang.String code, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_progress.invokeExact(
                        src.handle(),
                        type.getValue(),
                        Marshal.stringToAddress.marshal(code, SCOPE),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Message newProgress(org.gstreamer.gst.GstObject src, org.gstreamer.gst.ProgressType type, java.lang.String code, java.lang.String text) {
        var RESULT = constructNewProgress(src, type, code, text);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewPropertyNotify(org.gstreamer.gst.GstObject src, java.lang.String propertyName, @Nullable org.gtk.gobject.Value val) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_property_notify.invokeExact(
                        src.handle(),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE),
                        (Addressable) (val == null ? MemoryAddress.NULL : val.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            val.yieldOwnership();
            return RESULT;
        }
    }
        
    public static Message newPropertyNotify(org.gstreamer.gst.GstObject src, java.lang.String propertyName, @Nullable org.gtk.gobject.Value val) {
        var RESULT = constructNewPropertyNotify(src, propertyName, val);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewQos(org.gstreamer.gst.GstObject src, boolean live, long runningTime, long streamTime, long timestamp, long duration) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_qos.invokeExact(
                    src.handle(),
                    Marshal.booleanToInteger.marshal(live, null).intValue(),
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
    public static Message newQos(org.gstreamer.gst.GstObject src, boolean live, long runningTime, long streamTime, long timestamp, long duration) {
        var RESULT = constructNewQos(src, live, runningTime, streamTime, timestamp, duration);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewRedirect(org.gstreamer.gst.GstObject src, java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_redirect.invokeExact(
                        src.handle(),
                        Marshal.stringToAddress.marshal(location, SCOPE),
                        (Addressable) (tagList == null ? MemoryAddress.NULL : tagList.handle()),
                        (Addressable) (entryStruct == null ? MemoryAddress.NULL : entryStruct.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            tagList.yieldOwnership();
            entryStruct.yieldOwnership();
            return RESULT;
        }
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
     * @param src The {@link GstObject} whose property changed (may or may not be a {@link Element})
     * @param location location string for the new entry
     * @param tagList tag list for the new entry
     * @param entryStruct structure for the new entry
     * @return a newly allocated {@link Message}
     */
    public static Message newRedirect(org.gstreamer.gst.GstObject src, java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        var RESULT = constructNewRedirect(src, location, tagList, entryStruct);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewRequestState(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.State state) {
        MemoryAddress RESULT;
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
    public static Message newRequestState(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.State state) {
        var RESULT = constructNewRequestState(src, state);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewResetTime(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.ClockTime runningTime) {
        MemoryAddress RESULT;
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
    public static Message newResetTime(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.ClockTime runningTime) {
        var RESULT = constructNewResetTime(src, runningTime);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewSegmentDone(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long position) {
        MemoryAddress RESULT;
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
    public static Message newSegmentDone(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long position) {
        var RESULT = constructNewSegmentDone(src, format, position);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewSegmentStart(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long position) {
        MemoryAddress RESULT;
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
    public static Message newSegmentStart(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long position) {
        var RESULT = constructNewSegmentStart(src, format, position);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStateChanged(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.State oldstate, org.gstreamer.gst.State newstate, org.gstreamer.gst.State pending) {
        MemoryAddress RESULT;
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
    public static Message newStateChanged(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.State oldstate, org.gstreamer.gst.State newstate, org.gstreamer.gst.State pending) {
        var RESULT = constructNewStateChanged(src, oldstate, newstate, pending);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStateDirty(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_state_dirty.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newStateDirty(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewStateDirty(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStepDone(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_step_done.invokeExact(
                    src.handle(),
                    format.getValue(),
                    amount,
                    rate,
                    Marshal.booleanToInteger.marshal(flush, null).intValue(),
                    Marshal.booleanToInteger.marshal(intermediate, null).intValue(),
                    duration,
                    Marshal.booleanToInteger.marshal(eos, null).intValue());
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
    public static Message newStepDone(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos) {
        var RESULT = constructNewStepDone(src, format, amount, rate, flush, intermediate, duration, eos);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStepStart(org.gstreamer.gst.GstObject src, boolean active, org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_step_start.invokeExact(
                    src.handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue(),
                    format.getValue(),
                    amount,
                    rate,
                    Marshal.booleanToInteger.marshal(flush, null).intValue(),
                    Marshal.booleanToInteger.marshal(intermediate, null).intValue());
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
    public static Message newStepStart(org.gstreamer.gst.GstObject src, boolean active, org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        var RESULT = constructNewStepStart(src, active, format, amount, rate, flush, intermediate);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStreamCollection(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamCollection collection) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that created the message
     * @param collection The {@link StreamCollection}
     * @return a newly allocated {@link Message}
     */
    public static Message newStreamCollection(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamCollection collection) {
        var RESULT = constructNewStreamCollection(src, collection);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStreamStart(@Nullable org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_stream_start.invokeExact((Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
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
    public static Message newStreamStart(@Nullable org.gstreamer.gst.GstObject src) {
        var RESULT = constructNewStreamStart(src);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStreamStatus(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamStatusType type, org.gstreamer.gst.Element owner) {
        MemoryAddress RESULT;
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
    public static Message newStreamStatus(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamStatusType type, org.gstreamer.gst.Element owner) {
        var RESULT = constructNewStreamStatus(src, type, owner);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStreamsSelected(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamCollection collection) {
        MemoryAddress RESULT;
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
     * @param src The {@link GstObject} that created the message
     * @param collection The {@link StreamCollection}
     * @return a newly allocated {@link Message}
     */
    public static Message newStreamsSelected(org.gstreamer.gst.GstObject src, org.gstreamer.gst.StreamCollection collection) {
        var RESULT = constructNewStreamsSelected(src, collection);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewStructureChange(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.StructureChangeType type, org.gstreamer.gst.Element owner, boolean busy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_structure_change.invokeExact(
                    (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                    type.getValue(),
                    owner.handle(),
                    Marshal.booleanToInteger.marshal(busy, null).intValue());
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
    public static Message newStructureChange(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.StructureChangeType type, org.gstreamer.gst.Element owner, boolean busy) {
        var RESULT = constructNewStructureChange(src, type, owner, busy);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewTag(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.TagList tagList) {
        MemoryAddress RESULT;
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
    public static Message newTag(@Nullable org.gstreamer.gst.GstObject src, org.gstreamer.gst.TagList tagList) {
        var RESULT = constructNewTag(src, tagList);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewToc(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Toc toc, boolean updated) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_new_toc.invokeExact(
                    src.handle(),
                    toc.handle(),
                    Marshal.booleanToInteger.marshal(updated, null).intValue());
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
    public static Message newToc(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Toc toc, boolean updated) {
        var RESULT = constructNewToc(src, toc, updated);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWarning(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_warning.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Message newWarning(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug) {
        var RESULT = constructNewWarning(src, error, debug);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWarningWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_message_new_warning_with_details.invokeExact(
                        (Addressable) (src == null ? MemoryAddress.NULL : src.handle()),
                        error.handle(),
                        Marshal.stringToAddress.marshal(debug, SCOPE),
                        (Addressable) (details == null ? MemoryAddress.NULL : details.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            details.yieldOwnership();
            return RESULT;
        }
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
    public static Message newWarningWithDetails(@Nullable org.gstreamer.gst.GstObject src, org.gtk.glib.Error error, java.lang.String debug, @Nullable org.gstreamer.gst.Structure details) {
        var RESULT = constructNewWarningWithDetails(src, error, debug, details);
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public void addRedirectEntry(java.lang.String location, @Nullable org.gstreamer.gst.TagList tagList, @Nullable org.gstreamer.gst.Structure entryStruct) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_message_add_redirect_entry.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(location, SCOPE),
                        (Addressable) (tagList == null ? MemoryAddress.NULL : tagList.handle()),
                        (Addressable) (entryStruct == null ? MemoryAddress.NULL : entryStruct.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            tagList.yieldOwnership();
            entryStruct.yieldOwnership();
        }
    }
    
    /**
     * Creates a copy of the message. Returns a copy of the message.
     * @return a new copy of {@code msg}.
     * <p>
     * MT safe
     */
    public org.gstreamer.gst.Message copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public long getNumRedirectEntries() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_message_get_num_redirect_entries.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gst_message_get_seqnum.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_message_get_stream_status_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_message_get_structure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Checks if {@code message} has the given {@code name}. This function is usually used to
     * check the name of a custom message.
     * @param name name to check
     * @return {@code true} if {@code name} matches the name of the message structure.
     */
    public boolean hasName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_message_has_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extract the running_time from the async_done message.
     * <p>
     * MT safe.
     * @param runningTime Result location for the running_time or {@code null}
     */
    public void parseAsyncDone(@Nullable org.gstreamer.gst.ClockTime runningTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_async_done.invokeExact(
                        handle(),
                        (Addressable) (runningTime == null ? MemoryAddress.NULL : (Addressable) runningTimePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (runningTime != null) runningTime.setValue(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Extracts the buffering percent from the GstMessage. see also
     * gst_message_new_buffering().
     * <p>
     * MT safe.
     * @param percent Return location for the percent.
     */
    public void parseBuffering(Out<Integer> percent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment percentPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_buffering.invokeExact(
                        handle(),
                        (Addressable) (percent == null ? MemoryAddress.NULL : (Addressable) percentPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (percent != null) percent.set(percentPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Extracts the buffering stats values from {@code message}.
     * @param mode a buffering mode, or {@code null}
     * @param avgIn the average input rate, or {@code null}
     * @param avgOut the average output rate, or {@code null}
     * @param bufferingLeft amount of buffering time left in
     *     milliseconds, or {@code null}
     */
    public void parseBufferingStats(@Nullable Out<org.gstreamer.gst.BufferingMode> mode, Out<Integer> avgIn, Out<Integer> avgOut, Out<Long> bufferingLeft) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment modePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment avgInPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment avgOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment bufferingLeftPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_buffering_stats.invokeExact(
                        handle(),
                        (Addressable) (mode == null ? MemoryAddress.NULL : (Addressable) modePOINTER.address()),
                        (Addressable) (avgIn == null ? MemoryAddress.NULL : (Addressable) avgInPOINTER.address()),
                        (Addressable) (avgOut == null ? MemoryAddress.NULL : (Addressable) avgOutPOINTER.address()),
                        (Addressable) (bufferingLeft == null ? MemoryAddress.NULL : (Addressable) bufferingLeftPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (mode != null) mode.set(org.gstreamer.gst.BufferingMode.of(modePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (avgIn != null) avgIn.set(avgInPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (avgOut != null) avgOut.set(avgOutPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (bufferingLeft != null) bufferingLeft.set(bufferingLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Extracts the lost clock from the GstMessage.
     * The clock object returned remains valid until the message is freed.
     * <p>
     * MT safe.
     * @param clock a pointer to hold the lost clock
     */
    public void parseClockLost(@Nullable Out<org.gstreamer.gst.Clock> clock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment clockPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_clock_lost.invokeExact(
                        handle(),
                        (Addressable) (clock == null ? MemoryAddress.NULL : (Addressable) clockPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (clock != null) clock.set((org.gstreamer.gst.Clock) Interop.register(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Clock.fromAddress).marshal(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseClockProvide(@Nullable Out<org.gstreamer.gst.Clock> clock, Out<Boolean> ready) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment clockPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment readyPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_clock_provide.invokeExact(
                        handle(),
                        (Addressable) (clock == null ? MemoryAddress.NULL : (Addressable) clockPOINTER.address()),
                        (Addressable) (ready == null ? MemoryAddress.NULL : (Addressable) readyPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (clock != null) clock.set((org.gstreamer.gst.Clock) Interop.register(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Clock.fromAddress).marshal(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (ready != null) ready.set(readyPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
    }
    
    /**
     * Parse a context type from an existing GST_MESSAGE_NEED_CONTEXT message.
     * @param contextType the context type, or {@code null}
     * @return a {@code gboolean} indicating if the parsing succeeded.
     */
    public boolean parseContextType(@Nullable Out<java.lang.String> contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment contextTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_message_parse_context_type.invokeExact(
                        handle(),
                        (Addressable) (contextType == null ? MemoryAddress.NULL : (Addressable) contextTypePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (contextType != null) contextType.set(Marshal.addressToString.marshal(contextTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses a device-added message. The device-added message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. It announces the appearance
     * of monitored devices.
     * @param device A location where to store a
     *  pointer to the new {@link Device}, or {@code null}
     */
    public void parseDeviceAdded(@Nullable Out<org.gstreamer.gst.Device> device) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment devicePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_device_added.invokeExact(
                        handle(),
                        (Addressable) (device == null ? MemoryAddress.NULL : (Addressable) devicePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (device != null) device.set((org.gstreamer.gst.Device) Interop.register(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Device.fromAddress).marshal(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseDeviceChanged(@Nullable Out<org.gstreamer.gst.Device> device, @Nullable Out<org.gstreamer.gst.Device> changedDevice) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment devicePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment changedDevicePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_device_changed.invokeExact(
                        handle(),
                        (Addressable) (device == null ? MemoryAddress.NULL : (Addressable) devicePOINTER.address()),
                        (Addressable) (changedDevice == null ? MemoryAddress.NULL : (Addressable) changedDevicePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (device != null) device.set((org.gstreamer.gst.Device) Interop.register(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Device.fromAddress).marshal(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (changedDevice != null) changedDevice.set((org.gstreamer.gst.Device) Interop.register(changedDevicePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Device.fromAddress).marshal(changedDevicePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parses a device-removed message. The device-removed message is produced by
     * {@link DeviceProvider} or a {@link DeviceMonitor}. It announces the
     * disappearance of monitored devices.
     * @param device A location where to store a
     *  pointer to the removed {@link Device}, or {@code null}
     */
    public void parseDeviceRemoved(@Nullable Out<org.gstreamer.gst.Device> device) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment devicePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_device_removed.invokeExact(
                        handle(),
                        (Addressable) (device == null ? MemoryAddress.NULL : (Addressable) devicePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (device != null) device.set((org.gstreamer.gst.Device) Interop.register(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Device.fromAddress).marshal(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseError(@Nullable Out<org.gtk.glib.Error> gerror, @Nullable Out<java.lang.String> debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment gerrorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment debugPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_error.invokeExact(
                        handle(),
                        (Addressable) gerrorPOINTER.address(),
                        (Addressable) (debug == null ? MemoryAddress.NULL : (Addressable) debugPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    gerror.set(org.gtk.glib.Error.fromAddress.marshal(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (debug != null) debug.set(Marshal.addressToString.marshal(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Returns the optional details structure, may be NULL if none.
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details
     */
    public void parseErrorDetails(Out<org.gstreamer.gst.Structure> structure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment structurePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_error_details.invokeExact(
                        handle(),
                        (Addressable) structurePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    structure.set(org.gstreamer.gst.Structure.fromAddress.marshal(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment groupIdPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_message_parse_group_id.invokeExact(
                        handle(),
                        (Addressable) (groupId == null ? MemoryAddress.NULL : (Addressable) groupIdPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (groupId != null) groupId.set(groupIdPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Extract the context from the HAVE_CONTEXT message.
     * <p>
     * MT safe.
     * @param context Result location for the
     *      context or {@code null}
     */
    public void parseHaveContext(@Nullable Out<org.gstreamer.gst.Context> context) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment contextPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_have_context.invokeExact(
                        handle(),
                        (Addressable) (context == null ? MemoryAddress.NULL : (Addressable) contextPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (context != null) context.set(org.gstreamer.gst.Context.fromAddress.marshal(contextPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseInfo(@Nullable Out<org.gtk.glib.Error> gerror, @Nullable Out<java.lang.String> debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment gerrorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment debugPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_info.invokeExact(
                        handle(),
                        (Addressable) gerrorPOINTER.address(),
                        (Addressable) (debug == null ? MemoryAddress.NULL : (Addressable) debugPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    gerror.set(org.gtk.glib.Error.fromAddress.marshal(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (debug != null) debug.set(Marshal.addressToString.marshal(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Returns the optional details structure, may be NULL if none
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details structure
     */
    public void parseInfoDetails(Out<org.gstreamer.gst.Structure> structure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment structurePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_info_details.invokeExact(
                        handle(),
                        (Addressable) structurePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    structure.set(org.gstreamer.gst.Structure.fromAddress.marshal(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parses the rate_multiplier from the instant-rate-request message.
     * @param rateMultiplier return location for the rate, or {@code null}
     */
    public void parseInstantRateRequest(Out<Double> rateMultiplier) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment rateMultiplierPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            try {
                DowncallHandles.gst_message_parse_instant_rate_request.invokeExact(
                        handle(),
                        (Addressable) (rateMultiplier == null ? MemoryAddress.NULL : (Addressable) rateMultiplierPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (rateMultiplier != null) rateMultiplier.set(rateMultiplierPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        }
    }
    
    /**
     * Extracts the new clock from the GstMessage.
     * The clock object returned remains valid until the message is freed.
     * <p>
     * MT safe.
     * @param clock a pointer to hold the selected
     *     new clock
     */
    public void parseNewClock(@Nullable Out<org.gstreamer.gst.Clock> clock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment clockPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_new_clock.invokeExact(
                        handle(),
                        (Addressable) (clock == null ? MemoryAddress.NULL : (Addressable) clockPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (clock != null) clock.set((org.gstreamer.gst.Clock) Interop.register(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Clock.fromAddress).marshal(clockPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parses the progress {@code type}, {@code code} and {@code text}.
     * @param type location for the type
     * @param code location for the code
     * @param text location for the text
     */
    public void parseProgress(@Nullable Out<org.gstreamer.gst.ProgressType> type, @Nullable Out<java.lang.String> code, @Nullable Out<java.lang.String> text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment codePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment textPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_progress.invokeExact(
                        handle(),
                        (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()),
                        (Addressable) (code == null ? MemoryAddress.NULL : (Addressable) codePOINTER.address()),
                        (Addressable) (text == null ? MemoryAddress.NULL : (Addressable) textPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (type != null) type.set(org.gstreamer.gst.ProgressType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (code != null) code.set(Marshal.addressToString.marshal(codePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (text != null) text.set(Marshal.addressToString.marshal(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parsePropertyNotify(@Nullable Out<org.gstreamer.gst.GstObject> object, @Nullable Out<java.lang.String> propertyName, @Nullable Out<org.gtk.gobject.Value> propertyValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment objectPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment propertyNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment propertyValuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_property_notify.invokeExact(
                        handle(),
                        (Addressable) (object == null ? MemoryAddress.NULL : (Addressable) objectPOINTER.address()),
                        (Addressable) (propertyName == null ? MemoryAddress.NULL : (Addressable) propertyNamePOINTER.address()),
                        (Addressable) (propertyValue == null ? MemoryAddress.NULL : (Addressable) propertyValuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (object != null) object.set((org.gstreamer.gst.GstObject) Interop.register(objectPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.GstObject.fromAddress).marshal(objectPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (propertyName != null) propertyName.set(Marshal.addressToString.marshal(propertyNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (propertyValue != null) propertyValue.set(org.gtk.gobject.Value.fromAddress.marshal(propertyValuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment livePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment streamTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment timestampPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment durationPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_qos.invokeExact(
                        handle(),
                        (Addressable) (live == null ? MemoryAddress.NULL : (Addressable) livePOINTER.address()),
                        (Addressable) (runningTime == null ? MemoryAddress.NULL : (Addressable) runningTimePOINTER.address()),
                        (Addressable) (streamTime == null ? MemoryAddress.NULL : (Addressable) streamTimePOINTER.address()),
                        (Addressable) (timestamp == null ? MemoryAddress.NULL : (Addressable) timestampPOINTER.address()),
                        (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (live != null) live.set(livePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (runningTime != null) runningTime.set(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (streamTime != null) streamTime.set(streamTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (timestamp != null) timestamp.set(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
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
    public void parseQosStats(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> processed, Out<Long> dropped) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment processedPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment droppedPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_qos_stats.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (processed == null ? MemoryAddress.NULL : (Addressable) processedPOINTER.address()),
                        (Addressable) (dropped == null ? MemoryAddress.NULL : (Addressable) droppedPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (processed != null) processed.set(processedPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (dropped != null) dropped.set(droppedPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment jitterPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment proportionPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment qualityPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_qos_values.invokeExact(
                        handle(),
                        (Addressable) (jitter == null ? MemoryAddress.NULL : (Addressable) jitterPOINTER.address()),
                        (Addressable) (proportion == null ? MemoryAddress.NULL : (Addressable) proportionPOINTER.address()),
                        (Addressable) (quality == null ? MemoryAddress.NULL : (Addressable) qualityPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (jitter != null) jitter.set(jitterPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (proportion != null) proportion.set(proportionPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (quality != null) quality.set(qualityPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
    public void parseRedirectEntry(long entryIndex, @Nullable Out<java.lang.String> location, @Nullable Out<org.gstreamer.gst.TagList> tagList, @Nullable Out<org.gstreamer.gst.Structure> entryStruct) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment locationPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment tagListPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment entryStructPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_redirect_entry.invokeExact(
                        handle(),
                        entryIndex,
                        (Addressable) (location == null ? MemoryAddress.NULL : (Addressable) locationPOINTER.address()),
                        (Addressable) (tagList == null ? MemoryAddress.NULL : (Addressable) tagListPOINTER.address()),
                        (Addressable) (entryStruct == null ? MemoryAddress.NULL : (Addressable) entryStructPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (location != null) location.set(Marshal.addressToString.marshal(locationPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (tagList != null) tagList.set(org.gstreamer.gst.TagList.fromAddress.marshal(tagListPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (entryStruct != null) entryStruct.set(org.gstreamer.gst.Structure.fromAddress.marshal(entryStructPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Extract the requested state from the request_state message.
     * <p>
     * MT safe.
     * @param state Result location for the requested state or {@code null}
     */
    public void parseRequestState(@Nullable Out<org.gstreamer.gst.State> state) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_request_state.invokeExact(
                        handle(),
                        (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (state != null) state.set(org.gstreamer.gst.State.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
        }
    }
    
    /**
     * Extract the running-time from the RESET_TIME message.
     * <p>
     * MT safe.
     * @param runningTime Result location for the running_time or
     *      {@code null}
     */
    public void parseResetTime(@Nullable org.gstreamer.gst.ClockTime runningTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_reset_time.invokeExact(
                        handle(),
                        (Addressable) (runningTime == null ? MemoryAddress.NULL : (Addressable) runningTimePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (runningTime != null) runningTime.setValue(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Extracts the position and format from the segment done message.
     * <p>
     * MT safe.
     * @param format Result location for the format, or {@code null}
     * @param position Result location for the position, or {@code null}
     */
    public void parseSegmentDone(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_segment_done.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Extracts the position and format from the segment start message.
     * <p>
     * MT safe.
     * @param format Result location for the format, or {@code null}
     * @param position Result location for the position, or {@code null}
     */
    public void parseSegmentStart(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_message_parse_segment_start.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
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
    public void parseStateChanged(@Nullable Out<org.gstreamer.gst.State> oldstate, @Nullable Out<org.gstreamer.gst.State> newstate, @Nullable Out<org.gstreamer.gst.State> pending) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment oldstatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment newstatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment pendingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_state_changed.invokeExact(
                        handle(),
                        (Addressable) (oldstate == null ? MemoryAddress.NULL : (Addressable) oldstatePOINTER.address()),
                        (Addressable) (newstate == null ? MemoryAddress.NULL : (Addressable) newstatePOINTER.address()),
                        (Addressable) (pending == null ? MemoryAddress.NULL : (Addressable) pendingPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (oldstate != null) oldstate.set(org.gstreamer.gst.State.of(oldstatePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (newstate != null) newstate.set(org.gstreamer.gst.State.of(newstatePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (pending != null) pending.set(org.gstreamer.gst.State.of(pendingPOINTER.get(Interop.valueLayout.C_INT, 0)));
        }
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
    public void parseStepDone(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> amount, Out<Double> rate, Out<Boolean> flush, Out<Boolean> intermediate, Out<Long> duration, Out<Boolean> eos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment amountPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment ratePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment flushPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment intermediatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment durationPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment eosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_step_done.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (amount == null ? MemoryAddress.NULL : (Addressable) amountPOINTER.address()),
                        (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                        (Addressable) (flush == null ? MemoryAddress.NULL : (Addressable) flushPOINTER.address()),
                        (Addressable) (intermediate == null ? MemoryAddress.NULL : (Addressable) intermediatePOINTER.address()),
                        (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()),
                        (Addressable) (eos == null ? MemoryAddress.NULL : (Addressable) eosPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (amount != null) amount.set(amountPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (flush != null) flush.set(flushPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (intermediate != null) intermediate.set(intermediatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (eos != null) eos.set(eosPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
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
    public void parseStepStart(Out<Boolean> active, @Nullable Out<org.gstreamer.gst.Format> format, Out<Long> amount, Out<Double> rate, Out<Boolean> flush, Out<Boolean> intermediate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment activePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment amountPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment ratePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment flushPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment intermediatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_step_start.invokeExact(
                        handle(),
                        (Addressable) (active == null ? MemoryAddress.NULL : (Addressable) activePOINTER.address()),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (amount == null ? MemoryAddress.NULL : (Addressable) amountPOINTER.address()),
                        (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                        (Addressable) (flush == null ? MemoryAddress.NULL : (Addressable) flushPOINTER.address()),
                        (Addressable) (intermediate == null ? MemoryAddress.NULL : (Addressable) intermediatePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (active != null) active.set(activePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (amount != null) amount.set(amountPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (flush != null) flush.set(flushPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (intermediate != null) intermediate.set(intermediatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
    }
    
    /**
     * Parses a stream-collection message.
     * @param collection A location where to store a
     *  pointer to the {@link StreamCollection}, or {@code null}
     */
    public void parseStreamCollection(@Nullable Out<org.gstreamer.gst.StreamCollection> collection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment collectionPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_stream_collection.invokeExact(
                        handle(),
                        (Addressable) (collection == null ? MemoryAddress.NULL : (Addressable) collectionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (collection != null) collection.set((org.gstreamer.gst.StreamCollection) Interop.register(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.StreamCollection.fromAddress).marshal(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseStreamStatus(Out<org.gstreamer.gst.StreamStatusType> type, Out<org.gstreamer.gst.Element> owner) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment ownerPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_stream_status.invokeExact(
                        handle(),
                        (Addressable) typePOINTER.address(),
                        (Addressable) ownerPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    type.set(org.gstreamer.gst.StreamStatusType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    owner.set((org.gstreamer.gst.Element) Interop.register(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Element.fromAddress).marshal(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parses a streams-selected message.
     * @param collection A location where to store a
     *  pointer to the {@link StreamCollection}, or {@code null}
     */
    public void parseStreamsSelected(@Nullable Out<org.gstreamer.gst.StreamCollection> collection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment collectionPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_streams_selected.invokeExact(
                        handle(),
                        (Addressable) (collection == null ? MemoryAddress.NULL : (Addressable) collectionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (collection != null) collection.set((org.gstreamer.gst.StreamCollection) Interop.register(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.StreamCollection.fromAddress).marshal(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseStructureChange(Out<org.gstreamer.gst.StructureChangeType> type, @Nullable Out<org.gstreamer.gst.Element> owner, Out<Boolean> busy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment typePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment ownerPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment busyPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_structure_change.invokeExact(
                        handle(),
                        (Addressable) typePOINTER.address(),
                        (Addressable) (owner == null ? MemoryAddress.NULL : (Addressable) ownerPOINTER.address()),
                        (Addressable) (busy == null ? MemoryAddress.NULL : (Addressable) busyPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    type.set(org.gstreamer.gst.StructureChangeType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (owner != null) owner.set((org.gstreamer.gst.Element) Interop.register(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Element.fromAddress).marshal(ownerPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (busy != null) busy.set(busyPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
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
    public void parseTag(Out<org.gstreamer.gst.TagList> tagList) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment tagListPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_tag.invokeExact(
                        handle(),
                        (Addressable) tagListPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    tagList.set(org.gstreamer.gst.TagList.fromAddress.marshal(tagListPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
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
    public void parseToc(Out<org.gstreamer.gst.Toc> toc, Out<Boolean> updated) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment tocPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment updatedPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_message_parse_toc.invokeExact(
                        handle(),
                        (Addressable) tocPOINTER.address(),
                        (Addressable) updatedPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    toc.set(org.gstreamer.gst.Toc.fromAddress.marshal(tocPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    updated.set(updatedPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
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
    public void parseWarning(@Nullable Out<org.gtk.glib.Error> gerror, @Nullable Out<java.lang.String> debug) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment gerrorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment debugPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_warning.invokeExact(
                        handle(),
                        (Addressable) gerrorPOINTER.address(),
                        (Addressable) (debug == null ? MemoryAddress.NULL : (Addressable) debugPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    gerror.set(org.gtk.glib.Error.fromAddress.marshal(gerrorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (debug != null) debug.set(Marshal.addressToString.marshal(debugPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Returns the optional details structure, may be NULL if none
     * The returned structure must not be freed.
     * @param structure A pointer to the returned details structure
     */
    public void parseWarningDetails(Out<org.gstreamer.gst.Structure> structure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment structurePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_message_parse_warning_details.invokeExact(
                        handle(),
                        (Addressable) structurePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    structure.set(org.gstreamer.gst.Structure.fromAddress.marshal(structurePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Configures the buffering stats values in {@code message}.
     * @param mode a buffering mode
     * @param avgIn the average input rate
     * @param avgOut the average output rate
     * @param bufferingLeft amount of buffering time left in milliseconds
     */
    public void setBufferingStats(org.gstreamer.gst.BufferingMode mode, int avgIn, int avgOut, long bufferingLeft) {
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
    public void setQosStats(org.gstreamer.gst.Format format, long processed, long dropped) {
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
    public void setStreamStatusObject(org.gtk.gobject.Value object) {
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
    public void streamsSelectedAdd(org.gstreamer.gst.Stream stream) {
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
            RESULT = (int) DowncallHandles.gst_message_streams_selected_get_size.invokeExact(handle());
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
        var OBJECT = (org.gstreamer.gst.Stream) Interop.register(RESULT, org.gstreamer.gst.Stream.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public org.gstreamer.gst.Structure writableStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_writable_structure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment oldMessagePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_message_replace.invokeExact(
                        (Addressable) (oldMessage == null ? MemoryAddress.NULL : (Addressable) oldMessagePOINTER.address()),
                        (Addressable) (newMessage == null ? MemoryAddress.NULL : newMessage.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (oldMessage != null) oldMessage.set(org.gstreamer.gst.Message.fromAddress.marshal(oldMessagePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * A {@link Message.Builder} object constructs a {@link Message} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Message.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Message struct;
        
        private Builder() {
            struct = Message.allocate();
        }
        
        /**
         * Finish building the {@link Message} struct.
         * @return A new instance of {@code Message} with the fields 
         *         that were set in the Builder object.
         */
        public Message build() {
            return struct;
        }
        
        /**
         * the parent structure
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
                return this;
            }
        }
        
        /**
         * the {@link MessageType} of the message
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.gst.MessageType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        /**
         * the timestamp of the message
         * @param timestamp The value for the {@code timestamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimestamp(long timestamp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), timestamp);
                return this;
            }
        }
        
        /**
         * the src of the message
         * @param src The value for the {@code src} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSrc(org.gstreamer.gst.GstObject src) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("src"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (src == null ? MemoryAddress.NULL : src.handle()));
                return this;
            }
        }
        
        /**
         * the sequence number of the message
         * @param seqnum The value for the {@code seqnum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeqnum(int seqnum) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), seqnum);
                return this;
            }
        }
        
        public Builder setLock(org.gtk.glib.Mutex lock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
                return this;
            }
        }
        
        public Builder setCond(org.gtk.glib.Cond cond) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cond"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cond == null ? MemoryAddress.NULL : cond.handle()));
                return this;
            }
        }
    }
}
