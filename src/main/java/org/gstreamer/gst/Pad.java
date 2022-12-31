package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Element} is linked to other elements via "pads", which are extremely
 * light-weight generic link points.
 * <p>
 * Pads have a {@link PadDirection}, source pads produce data, sink pads consume
 * data.
 * <p>
 * Pads are typically created from a {@link PadTemplate} with
 * gst_pad_new_from_template() and are then added to a {@link Element}. This usually
 * happens when the element is created but it can also happen dynamically based
 * on the data that the element is processing or based on the pads that the
 * application requests.
 * <p>
 * Pads without pad templates can be created with gst_pad_new(),
 * which takes a direction and a name as an argument.  If the name is {@code null},
 * then a guaranteed unique name will be assigned to it.
 * <p>
 * A {@link Element} creating a pad will typically use the various
 * gst_pad_set_*_function\\() calls to register callbacks for events, queries or
 * dataflow on the pads.
 * <p>
 * gst_pad_get_parent() will retrieve the {@link Element} that owns the pad.
 * <p>
 * After two pads are retrieved from an element by gst_element_get_static_pad(),
 * the pads can be linked with gst_pad_link(). (For quick links,
 * you can also use gst_element_link(), which will make the obvious
 * link for you if it's straightforward.). Pads can be unlinked again with
 * gst_pad_unlink(). gst_pad_get_peer() can be used to check what the pad is
 * linked to.
 * <p>
 * Before dataflow is possible on the pads, they need to be activated with
 * gst_pad_set_active().
 * <p>
 * gst_pad_query() and gst_pad_peer_query() can be used to query various
 * properties of the pad and the stream.
 * <p>
 * To send a {@link Event} on a pad, use gst_pad_send_event() and
 * gst_pad_push_event(). Some events will be sticky on the pad, meaning that
 * after they pass on the pad they can be queried later with
 * gst_pad_get_sticky_event() and gst_pad_sticky_events_foreach().
 * gst_pad_get_current_caps() and gst_pad_has_current_caps() are convenience
 * functions to query the current sticky CAPS event on a pad.
 * <p>
 * GstElements will use gst_pad_push() and gst_pad_pull_range() to push out
 * or pull in a buffer.
 * <p>
 * The dataflow, events and queries that happen on a pad can be monitored with
 * probes that can be installed with gst_pad_add_probe(). gst_pad_is_blocked()
 * can be used to check if a block probe is installed on the pad.
 * gst_pad_is_blocking() checks if the blocking probe is currently blocking the
 * pad. gst_pad_remove_probe() is used to remove a previously installed probe
 * and unblock blocking probes if any.
 * <p>
 * Pad have an offset that can be retrieved with gst_pad_get_offset(). This
 * offset will be applied to the running_time of all data passing over the pad.
 * gst_pad_set_offset() can be used to change the offset.
 * <p>
 * Convenience functions exist to start, pause and stop the task on a pad with
 * gst_pad_start_task(), gst_pad_pause_task() and gst_pad_stop_task()
 * respectively.
 */
public class Pad extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("element_private"),
            Interop.valueLayout.ADDRESS.withName("padtemplate"),
            Interop.valueLayout.C_INT.withName("direction"),
            MemoryLayout.paddingLayout(32),
            org.gtk.glib.RecMutex.getMemoryLayout().withName("stream_rec_lock"),
            Interop.valueLayout.ADDRESS.withName("task"),
            org.gtk.glib.Cond.getMemoryLayout().withName("block_cond"),
            org.gtk.glib.HookList.getMemoryLayout().withName("probes"),
            Interop.valueLayout.C_INT.withName("mode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("activatefunc"),
            Interop.valueLayout.ADDRESS.withName("activatedata"),
            Interop.valueLayout.ADDRESS.withName("activatenotify"),
            Interop.valueLayout.ADDRESS.withName("activatemodefunc"),
            Interop.valueLayout.ADDRESS.withName("activatemodedata"),
            Interop.valueLayout.ADDRESS.withName("activatemodenotify"),
            Interop.valueLayout.ADDRESS.withName("peer"),
            Interop.valueLayout.ADDRESS.withName("linkfunc"),
            Interop.valueLayout.ADDRESS.withName("linkdata"),
            Interop.valueLayout.ADDRESS.withName("linknotify"),
            Interop.valueLayout.ADDRESS.withName("unlinkfunc"),
            Interop.valueLayout.ADDRESS.withName("unlinkdata"),
            Interop.valueLayout.ADDRESS.withName("unlinknotify"),
            Interop.valueLayout.ADDRESS.withName("chainfunc"),
            Interop.valueLayout.ADDRESS.withName("chaindata"),
            Interop.valueLayout.ADDRESS.withName("chainnotify"),
            Interop.valueLayout.ADDRESS.withName("chainlistfunc"),
            Interop.valueLayout.ADDRESS.withName("chainlistdata"),
            Interop.valueLayout.ADDRESS.withName("chainlistnotify"),
            Interop.valueLayout.ADDRESS.withName("getrangefunc"),
            Interop.valueLayout.ADDRESS.withName("getrangedata"),
            Interop.valueLayout.ADDRESS.withName("getrangenotify"),
            Interop.valueLayout.ADDRESS.withName("eventfunc"),
            Interop.valueLayout.ADDRESS.withName("eventdata"),
            Interop.valueLayout.ADDRESS.withName("eventnotify"),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.ADDRESS.withName("queryfunc"),
            Interop.valueLayout.ADDRESS.withName("querydata"),
            Interop.valueLayout.ADDRESS.withName("querynotify"),
            Interop.valueLayout.ADDRESS.withName("iterintlinkfunc"),
            Interop.valueLayout.ADDRESS.withName("iterintlinkdata"),
            Interop.valueLayout.ADDRESS.withName("iterintlinknotify"),
            Interop.valueLayout.C_INT.withName("num_probes"),
            Interop.valueLayout.C_INT.withName("num_blocked"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Pad proxy instance for the provided memory address.
     * <p>
     * Because Pad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Pad(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Pad> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Pad(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name, org.gstreamer.gst.PadDirection direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pad with the given name in the given direction.
     * If name is {@code null}, a guaranteed unique name (across all pads)
     * will be assigned.
     * This function makes a copy of the name so you can safely free the name.
     * @param name the name of the new pad.
     * @param direction the {@link PadDirection} of the pad.
     */
    public Pad(@Nullable java.lang.String name, org.gstreamer.gst.PadDirection direction) {
        super(constructNew(name, direction), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromStaticTemplate(org.gstreamer.gst.StaticPadTemplate templ, java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_new_from_static_template.invokeExact(
                    templ.handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pad with the given name from the given static template.
     * If name is {@code null}, a guaranteed unique name (across all pads)
     * will be assigned.
     * This function makes a copy of the name so you can safely free the name.
     * @param templ the {@link StaticPadTemplate} to use
     * @param name the name of the pad
     * @return a new {@link Pad}.
     */
    public static Pad newFromStaticTemplate(org.gstreamer.gst.StaticPadTemplate templ, java.lang.String name) {
        var RESULT = constructNewFromStaticTemplate(templ, name);
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromTemplate(org.gstreamer.gst.PadTemplate templ, @Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_new_from_template.invokeExact(
                    templ.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pad with the given name from the given template.
     * If name is {@code null}, a guaranteed unique name (across all pads)
     * will be assigned.
     * This function makes a copy of the name so you can safely free the name.
     * @param templ the pad template to use
     * @param name the name of the pad
     * @return a new {@link Pad}.
     */
    public static Pad newFromTemplate(org.gstreamer.gst.PadTemplate templ, @Nullable java.lang.String name) {
        var RESULT = constructNewFromTemplate(templ, name);
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Activates or deactivates the given pad in {@code mode} via dispatching to the
     * pad's activatemodefunc. For use from within pad activation functions only.
     * <p>
     * If you don't know what this is, you probably don't want to call it.
     * @param mode the requested activation mode
     * @param active whether or not the pad should be active.
     * @return {@code true} if the operation was successful.
     * <p>
     * MT safe.
     */
    public boolean activateMode(org.gstreamer.gst.PadMode mode, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_activate_mode.invokeExact(
                    handle(),
                    mode.getValue(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Be notified of different states of pads. The provided callback is called for
     * every state that matches {@code mask}.
     * <p>
     * Probes are called in groups: First GST_PAD_PROBE_TYPE_BLOCK probes are
     * called, then others, then finally GST_PAD_PROBE_TYPE_IDLE. The only
     * exception here are GST_PAD_PROBE_TYPE_IDLE probes that are called
     * immediately if the pad is already idle while calling gst_pad_add_probe().
     * In each of the groups, probes are called in the order in which they were
     * added.
     * @param mask the probe mask
     * @param callback {@link PadProbeCallback} that will be called with notifications of
     *           the pad state
     * @param destroyData {@link org.gtk.glib.DestroyNotify} for user_data
     * @return an id or 0 if no probe is pending. The id can be used to remove the
     * probe with gst_pad_remove_probe(). When using GST_PAD_PROBE_TYPE_IDLE it can
     * happen that the probe can be run immediately and if the probe returns
     * GST_PAD_PROBE_REMOVE this functions returns 0.
     * <p>
     * MT safe.
     */
    public long addProbe(org.gstreamer.gst.PadProbeType mask, org.gstreamer.gst.PadProbeCallback callback, org.gtk.glib.DestroyNotify destroyData) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_pad_add_probe.invokeExact(
                    handle(),
                    mask.getValue(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if the source pad and the sink pad are compatible so they can be
     * linked.
     * @param sinkpad the sink {@link Pad}.
     * @return {@code true} if the pads can be linked.
     */
    public boolean canLink(org.gstreamer.gst.Pad sinkpad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_can_link.invokeExact(
                    handle(),
                    sinkpad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Chain a buffer to {@code pad}.
     * <p>
     * The function returns {@code GST_FLOW_FLUSHING} if the pad was flushing.
     * <p>
     * If the buffer type is not acceptable for {@code pad} (as negotiated with a
     * preceding GST_EVENT_CAPS event), this function returns
     * {@code GST_FLOW_NOT_NEGOTIATED}.
     * <p>
     * The function proceeds calling the chain function installed on {@code pad} (see
     * gst_pad_set_chain_function()) and the return value of that function is
     * returned to the caller. {@code GST_FLOW_NOT_SUPPORTED} is returned if {@code pad} has no
     * chain function.
     * <p>
     * In all cases, success or failure, the caller loses its reference to {@code buffer}
     * after calling this function.
     * @param buffer the {@link Buffer} to send, return GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.FlowReturn chain(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_chain.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Chain a bufferlist to {@code pad}.
     * <p>
     * The function returns {@code GST_FLOW_FLUSHING} if the pad was flushing.
     * <p>
     * If {@code pad} was not negotiated properly with a CAPS event, this function
     * returns {@code GST_FLOW_NOT_NEGOTIATED}.
     * <p>
     * The function proceeds calling the chainlist function installed on {@code pad} (see
     * gst_pad_set_chain_list_function()) and the return value of that function is
     * returned to the caller. {@code GST_FLOW_NOT_SUPPORTED} is returned if {@code pad} has no
     * chainlist function.
     * <p>
     * In all cases, success or failure, the caller loses its reference to {@code list}
     * after calling this function.
     * <p>
     * MT safe.
     * @param list the {@link BufferList} to send, return GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the pad.
     */
    public org.gstreamer.gst.FlowReturn chainList(org.gstreamer.gst.BufferList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_chain_list.invokeExact(
                    handle(),
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Check and clear the {@code GST_PAD_FLAG_NEED_RECONFIGURE} flag on {@code pad} and return {@code true}
     * if the flag was set.
     * @return {@code true} is the GST_PAD_FLAG_NEED_RECONFIGURE flag was set on {@code pad}.
     */
    public boolean checkReconfigure() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_check_reconfigure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a stream-id for the source {@link Pad} {@code pad} by combining the
     * upstream information with the optional {@code stream_id} of the stream
     * of {@code pad}. {@code pad} must have a parent {@link Element} and which must have zero
     * or one sinkpad. {@code stream_id} can only be {@code null} if the parent element
     * of {@code pad} has only a single source pad.
     * <p>
     * This function generates an unique stream-id by getting the upstream
     * stream-start event stream ID and appending {@code stream_id} to it. If the
     * element has no sinkpad it will generate an upstream stream-id by
     * doing an URI query on the element and in the worst case just uses
     * a random number. Source elements that don't implement the URI
     * handler interface should ideally generate a unique, deterministic
     * stream-id manually instead.
     * <p>
     * Since stream IDs are sorted alphabetically, any numbers in the
     * stream ID should be printed with a fixed number of characters,
     * preceded by 0's, such as by using the format \\{@code 03u} instead of \\{@code u}.
     * @param parent Parent {@link Element} of {@code pad}
     * @param streamId The stream-id
     * @return A stream-id for {@code pad}. g_free() after usage.
     */
    public java.lang.String createStreamId(org.gstreamer.gst.Element parent, @Nullable java.lang.String streamId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_create_stream_id.invokeExact(
                    handle(),
                    parent.handle(),
                    (Addressable) (streamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(streamId, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a stream-id for the source {@link Pad} {@code pad} by combining the
     * upstream information with the optional {@code stream_id} of the stream
     * of {@code pad}. {@code pad} must have a parent {@link Element} and which must have zero
     * or one sinkpad. {@code stream_id} can only be {@code null} if the parent element
     * of {@code pad} has only a single source pad.
     * <p>
     * This function generates an unique stream-id by getting the upstream
     * stream-start event stream ID and appending {@code stream_id} to it. If the
     * element has no sinkpad it will generate an upstream stream-id by
     * doing an URI query on the element and in the worst case just uses
     * a random number. Source elements that don't implement the URI
     * handler interface should ideally generate a unique, deterministic
     * stream-id manually instead.
     * @param parent Parent {@link Element} of {@code pad}
     * @param streamId The stream-id
     * @param varargs parameters for the {@code stream_id} format string
     * @return A stream-id for {@code pad}. g_free() after usage.
     */
    public java.lang.String createStreamIdPrintf(org.gstreamer.gst.Element parent, @Nullable java.lang.String streamId, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_create_stream_id_printf.invokeExact(
                    handle(),
                    parent.handle(),
                    (Addressable) (streamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(streamId, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a stream-id for the source {@link Pad} {@code pad} by combining the
     * upstream information with the optional {@code stream_id} of the stream
     * of {@code pad}. {@code pad} must have a parent {@link Element} and which must have zero
     * or one sinkpad. {@code stream_id} can only be {@code null} if the parent element
     * of {@code pad} has only a single source pad.
     * <p>
     * This function generates an unique stream-id by getting the upstream
     * stream-start event stream ID and appending {@code stream_id} to it. If the
     * element has no sinkpad it will generate an upstream stream-id by
     * doing an URI query on the element and in the worst case just uses
     * a random number. Source elements that don't implement the URI
     * handler interface should ideally generate a unique, deterministic
     * stream-id manually instead.
     * @param parent Parent {@link Element} of {@code pad}
     * @param streamId The stream-id
     * @param varArgs parameters for the {@code stream_id} format string
     * @return A stream-id for {@code pad}. g_free() after usage.
     */
    public java.lang.String createStreamIdPrintfValist(org.gstreamer.gst.Element parent, @Nullable java.lang.String streamId, VaList varArgs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_create_stream_id_printf_valist.invokeExact(
                    handle(),
                    parent.handle(),
                    (Addressable) (streamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(streamId, null)),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Invokes the default event handler for the given pad.
     * <p>
     * The EOS event will pause the task associated with {@code pad} before it is forwarded
     * to all internally linked pads,
     * <p>
     * The event is sent to all pads internally linked to {@code pad}. This function
     * takes ownership of {@code event}.
     * @param parent the parent of {@code pad} or {@code null}
     * @param event the {@link Event} to handle.
     * @return {@code true} if the event was sent successfully.
     */
    public boolean eventDefault(@Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_event_default.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls {@code forward} for all internally linked pads of {@code pad}. This function deals with
     * dynamically changing internal pads and will make sure that the {@code forward}
     * function is only called once for each pad.
     * <p>
     * When {@code forward} returns {@code true}, no further pads will be processed.
     * @param forward a {@link PadForwardFunction}
     * @return {@code true} if one of the dispatcher functions returned {@code true}.
     */
    public boolean forward(org.gstreamer.gst.PadForwardFunction forward) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_forward.invokeExact(
                    handle(),
                    (Addressable) forward.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the capabilities of the allowed media types that can flow through
     * {@code pad} and its peer.
     * <p>
     * The allowed capabilities is calculated as the intersection of the results of
     * calling gst_pad_query_caps() on {@code pad} and its peer. The caller owns a reference
     * on the resulting caps.
     * @return the allowed {@link Caps} of the
     *     pad link. Unref the caps when you no longer need it. This
     *     function returns {@code null} when {@code pad} has no peer.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Caps getAllowedCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_allowed_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the capabilities currently configured on {@code pad} with the last
     * {@code GST_EVENT_CAPS} event.
     * @return the current caps of the pad with
     * incremented ref-count or {@code null} when pad has no caps. Unref after usage.
     */
    public @Nullable org.gstreamer.gst.Caps getCurrentCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_current_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the direction of the pad. The direction of the pad is
     * decided at construction time so this function does not take
     * the LOCK.
     * @return the {@link PadDirection} of the pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.PadDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.PadDirection.of(RESULT);
    }
    
    /**
     * Gets the private data of a pad.
     * No locking is performed in this function.
     * @return a {@code gpointer} to the private data.
     */
    public @Nullable java.lang.foreign.MemoryAddress getElementPrivate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_element_private.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link FlowReturn} return from the last data passed by this pad.
     */
    public org.gstreamer.gst.FlowReturn getLastFlowReturn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_get_last_flow_return.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Get the offset applied to the running time of {@code pad}. {@code pad} has to be a source
     * pad.
     * @return the offset.
     */
    public long getOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_pad_get_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the template for {@code pad}.
     * @return the {@link PadTemplate} from which
     *     this pad was instantiated, or {@code null} if this pad has no
     *     template. Unref after usage.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getPadTemplate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_pad_template.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.PadTemplate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the capabilities for {@code pad}'s template.
     * @return the {@link Caps} of this pad template.
     * Unref after usage.
     */
    public org.gstreamer.gst.Caps getPadTemplateCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_pad_template_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the parent of {@code pad}, cast to a {@link Element}. If a {@code pad} has no parent or
     * its parent is not an element, return {@code null}.
     * @return the parent of the pad. The
     * caller has a reference on the parent, so unref when you're finished
     * with it.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Element getParentElement() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_parent_element.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Element.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the peer of {@code pad}. This function refs the peer pad so
     * you need to unref it after use.
     * @return the peer {@link Pad}. Unref after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Pad getPeer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_peer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * When {@code pad} is flushing this function returns {@code GST_FLOW_FLUSHING}
     * immediately and {@code buffer} is {@code null}.
     * <p>
     * Calls the getrange function of {@code pad}, see {@link PadGetRangeFunction} for a
     * description of a getrange function. If {@code pad} has no getrange function
     * installed (see gst_pad_set_getrange_function()) this function returns
     * {@code GST_FLOW_NOT_SUPPORTED}.
     * <p>
     * If {@code buffer} points to a variable holding {@code null}, a valid new {@link Buffer} will be
     * placed in {@code buffer} when this function returns {@code GST_FLOW_OK}. The new buffer
     * must be freed with gst_buffer_unref() after usage.
     * <p>
     * When {@code buffer} points to a variable that points to a valid {@link Buffer}, the
     * buffer will be filled with the result data when this function returns
     * {@code GST_FLOW_OK}. If the provided buffer is larger than {@code size}, only
     * {@code size} bytes will be filled in the result buffer and its size will be updated
     * accordingly.
     * <p>
     * Note that less than {@code size} bytes can be returned in {@code buffer} when, for example,
     * an EOS condition is near or when {@code buffer} is not large enough to hold {@code size}
     * bytes. The caller should check the result buffer size to get the result size.
     * <p>
     * When this function returns any other result value than {@code GST_FLOW_OK}, {@code buffer}
     * will be unchanged.
     * <p>
     * This is a lowlevel function. Usually gst_pad_pull_range() is used.
     * @param offset The start offset of the buffer
     * @param size The length of the buffer
     * @param buffer a pointer to hold the {@link Buffer},
     *     returns {@code GST_FLOW_ERROR} if {@code null}.
     * @return a {@link FlowReturn} from the pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.FlowReturn getRange(long offset, int size, Out<org.gstreamer.gst.Buffer> buffer) {
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_get_range.invokeExact(
                    handle(),
                    offset,
                    size,
                    (Addressable) bufferPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.set(org.gstreamer.gst.Buffer.fromAddress.marshal(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * If there is a single internal link of the given pad, this function will
     * return it. Otherwise, it will return NULL.
     * @return a {@link Pad}, or {@code null} if {@code pad} has none
     * or more than one internal links. Unref returned pad with
     * gst_object_unref().
     */
    public @Nullable org.gstreamer.gst.Pad getSingleInternalLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_single_internal_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a new reference of the sticky event of type {@code event_type}
     * from the event.
     * @param eventType the {@link EventType} that should be retrieved.
     * @param idx the index of the event
     * @return a {@link Event} of type
     * {@code event_type} or {@code null} when no event of {@code event_type} was on
     * {@code pad}. Unref after usage.
     */
    public @Nullable org.gstreamer.gst.Event getStickyEvent(org.gstreamer.gst.EventType eventType, int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_sticky_event.invokeExact(
                    handle(),
                    eventType.getValue(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the current {@link Stream} for the {@code pad}, or {@code null} if none has been
     * set yet, i.e. the pad has not received a stream-start event yet.
     * <p>
     * This is a convenience wrapper around gst_pad_get_sticky_event() and
     * gst_event_parse_stream().
     * @return the current {@link Stream} for {@code pad}, or {@code null}.
     *     unref the returned stream when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Stream getStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Stream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Stream.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the current stream-id for the {@code pad}, or {@code null} if none has been
     * set yet, i.e. the pad has not received a stream-start event yet.
     * <p>
     * This is a convenience wrapper around gst_pad_get_sticky_event() and
     * gst_event_parse_stream_start().
     * <p>
     * The returned stream-id string should be treated as an opaque string, its
     * contents should not be interpreted.
     * @return a newly-allocated copy of the stream-id for
     *     {@code pad}, or {@code null}.  g_free() the returned string when no longer
     *     needed.
     */
    public @Nullable java.lang.String getStreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_get_stream_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get {@code pad} task state. If no task is currently
     * set, {@code GST_TASK_STOPPED} is returned.
     * @return The current state of {@code pad}'s task.
     */
    public org.gstreamer.gst.TaskState getTaskState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_get_task_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TaskState.of(RESULT);
    }
    
    /**
     * Check if {@code pad} has caps set on it with a {@code GST_EVENT_CAPS} event.
     * @return {@code true} when {@code pad} has caps associated with it.
     */
    public boolean hasCurrentCaps() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_has_current_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Query if a pad is active
     * @return {@code true} if the pad is active.
     * <p>
     * MT safe.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the pad is blocked or not. This function returns the
     * last requested state of the pad. It is not certain that the pad
     * is actually blocking at this point (see gst_pad_is_blocking()).
     * @return {@code true} if the pad is blocked.
     * <p>
     * MT safe.
     */
    public boolean isBlocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_is_blocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the pad is blocking or not. This is a guaranteed state
     * of whether the pad is actually blocking on a {@link Buffer} or a {@link Event}.
     * @return {@code true} if the pad is blocking.
     * <p>
     * MT safe.
     */
    public boolean isBlocking() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_is_blocking.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a {@code pad} is linked to another pad or not.
     * @return {@code true} if the pad is linked, {@code false} otherwise.
     * <p>
     * MT safe.
     */
    public boolean isLinked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_is_linked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets an iterator for the pads to which the given pad is linked to inside
     * of the parent element.
     * <p>
     * Each {@link Pad} element yielded by the iterator will have its refcount increased,
     * so unref after use.
     * <p>
     * Free-function: gst_iterator_free
     * @return a new {@link Iterator} of {@link Pad}
     *     or {@code null} when the pad does not have an iterator function
     *     configured. Use gst_iterator_free() after usage.
     */
    public @Nullable org.gstreamer.gst.Iterator iterateInternalLinks() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_iterate_internal_links.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Iterate the list of pads to which the given pad is linked to inside of
     * the parent element.
     * This is the default handler, and thus returns an iterator of all of the
     * pads inside the parent element with opposite direction.
     * <p>
     * The caller must free this iterator after use with gst_iterator_free().
     * @param parent the parent of {@code pad} or {@code null}
     * @return a {@link Iterator} of {@link Pad}, or {@code null} if {@code pad}
     * has no parent. Unref each returned pad with gst_object_unref().
     */
    public @Nullable org.gstreamer.gst.Iterator iterateInternalLinksDefault(@Nullable org.gstreamer.gst.GstObject parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_iterate_internal_links_default.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Links the source pad and the sink pad.
     * @param sinkpad the sink {@link Pad} to link.
     * @return A result code indicating if the connection worked or
     *          what went wrong.
     * <p>
     * MT Safe.
     */
    public org.gstreamer.gst.PadLinkReturn link(org.gstreamer.gst.Pad sinkpad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_link.invokeExact(
                    handle(),
                    sinkpad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.PadLinkReturn.of(RESULT);
    }
    
    /**
     * Links the source pad and the sink pad.
     * <p>
     * This variant of {@code gst_pad_link} provides a more granular control on the
     * checks being done when linking. While providing some considerable speedups
     * the caller of this method must be aware that wrong usage of those flags
     * can cause severe issues. Refer to the documentation of {@link PadLinkCheck}
     * for more information.
     * <p>
     * MT Safe.
     * @param sinkpad the sink {@link Pad} to link.
     * @param flags the checks to validate when linking
     * @return A result code indicating if the connection worked or
     *          what went wrong.
     */
    public org.gstreamer.gst.PadLinkReturn linkFull(org.gstreamer.gst.Pad sinkpad, org.gstreamer.gst.PadLinkCheck flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_link_full.invokeExact(
                    handle(),
                    sinkpad.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.PadLinkReturn.of(RESULT);
    }
    
    /**
     * Links {@code src} to {@code sink}, creating any {@link GhostPad}'s in between as necessary.
     * <p>
     * This is a convenience function to save having to create and add intermediate
     * {@link GhostPad}'s as required for linking across {@link Bin} boundaries.
     * <p>
     * If {@code src} or {@code sink} pads don't have parent elements or do not share a common
     * ancestor, the link will fail.
     * @param sink a {@link Pad}
     * @return whether the link succeeded.
     */
    public boolean linkMaybeGhosting(org.gstreamer.gst.Pad sink) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_link_maybe_ghosting.invokeExact(
                    handle(),
                    sink.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Links {@code src} to {@code sink}, creating any {@link GhostPad}'s in between as necessary.
     * <p>
     * This is a convenience function to save having to create and add intermediate
     * {@link GhostPad}'s as required for linking across {@link Bin} boundaries.
     * <p>
     * If {@code src} or {@code sink} pads don't have parent elements or do not share a common
     * ancestor, the link will fail.
     * <p>
     * Calling gst_pad_link_maybe_ghosting_full() with
     * {@code flags} == {@link PadLinkCheck#DEFAULT} is the recommended way of linking
     * pads with safety checks applied.
     * @param sink a {@link Pad}
     * @param flags some {@link PadLinkCheck} flags
     * @return whether the link succeeded.
     */
    public boolean linkMaybeGhostingFull(org.gstreamer.gst.Pad sink, org.gstreamer.gst.PadLinkCheck flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_link_maybe_ghosting_full.invokeExact(
                    handle(),
                    sink.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Mark a pad for needing reconfiguration. The next call to
     * gst_pad_check_reconfigure() will return {@code true} after this call.
     */
    public void markReconfigure() {
        try {
            DowncallHandles.gst_pad_mark_reconfigure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check the {@code GST_PAD_FLAG_NEED_RECONFIGURE} flag on {@code pad} and return {@code true}
     * if the flag was set.
     * @return {@code true} is the GST_PAD_FLAG_NEED_RECONFIGURE flag is set on {@code pad}.
     */
    public boolean needsReconfigure() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_needs_reconfigure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pause the task of {@code pad}. This function will also wait until the
     * function executed by the task is finished if this function is not
     * called from the task function.
     * @return a {@code true} if the task could be paused or {@code false} when the pad
     * has no task.
     */
    public boolean pauseTask() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_pause_task.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Performs gst_pad_query() on the peer of {@code pad}.
     * <p>
     * The caller is responsible for both the allocation and deallocation of
     * the query structure.
     * @param query the {@link Query} to perform.
     * @return {@code true} if the query could be performed. This function returns {@code false}
     * if {@code pad} has no peer.
     */
    public boolean peerQuery(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_peer_query.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if the peer of {@code pad} accepts {@code caps}. If {@code pad} has no peer, this function
     * returns {@code true}.
     * @param caps a {@link Caps} to check on the pad
     * @return {@code true} if the peer of {@code pad} can accept the caps or {@code pad} has no peer.
     */
    public boolean peerQueryAcceptCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_peer_query_accept_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the capabilities of the peer connected to this pad. Similar to
     * gst_pad_query_caps().
     * <p>
     * When called on srcpads {@code filter} contains the caps that
     * upstream could produce in the order preferred by upstream. When
     * called on sinkpads {@code filter} contains the caps accepted by
     * downstream in the preferred order. {@code filter} might be {@code null} but
     * if it is not {@code null} the returned caps will be a subset of {@code filter}.
     * @param filter a {@link Caps} filter, or {@code null}.
     * @return the caps of the peer pad with incremented
     * ref-count. When there is no peer pad, this function returns {@code filter} or,
     * when {@code filter} is {@code null}, ANY caps.
     */
    public org.gstreamer.gst.Caps peerQueryCaps(@Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_peer_query_caps.invokeExact(
                    handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Queries the peer pad of a given sink pad to convert {@code src_val} in {@code src_format}
     * to {@code dest_format}.
     * @param srcFormat a {@link Format} to convert from.
     * @param srcVal a value to convert.
     * @param destFormat the {@link Format} to convert to.
     * @param destVal a pointer to the result.
     * @return {@code true} if the query could be performed.
     */
    public boolean peerQueryConvert(org.gstreamer.gst.Format srcFormat, long srcVal, org.gstreamer.gst.Format destFormat, Out<Long> destVal) {
        MemorySegment destValPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_peer_query_convert.invokeExact(
                    handle(),
                    srcFormat.getValue(),
                    srcVal,
                    destFormat.getValue(),
                    (Addressable) destValPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        destVal.set(destValPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries the peer pad of a given sink pad for the total stream duration.
     * @param format the {@link Format} requested
     * @param duration a location in which to store the total
     *     duration, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean peerQueryDuration(org.gstreamer.gst.Format format, Out<Long> duration) {
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_peer_query_duration.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries the peer of a given sink pad for the stream position.
     * @param format the {@link Format} requested
     * @param cur a location in which to store the current
     *     position, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean peerQueryPosition(org.gstreamer.gst.Format format, Out<Long> cur) {
        MemorySegment curPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_peer_query_position.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (cur == null ? MemoryAddress.NULL : (Addressable) curPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (cur != null) cur.set(curPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if all internally linked pads of {@code pad} accepts the caps in {@code query} and
     * returns the intersection of the results.
     * <p>
     * This function is useful as a default accept caps query function for an element
     * that can handle any stream format, but requires caps that are acceptable for
     * all opposite pads.
     * @param query an ACCEPT_CAPS {@link Query}.
     * @return {@code true} if {@code query} could be executed
     */
    public boolean proxyQueryAcceptCaps(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_proxy_query_accept_caps.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls gst_pad_query_caps() for all internally linked pads of {@code pad} and returns
     * the intersection of the results.
     * <p>
     * This function is useful as a default caps query function for an element
     * that can handle any stream format, but requires all its pads to have
     * the same caps.  Two such elements are tee and adder.
     * @param query a CAPS {@link Query}.
     * @return {@code true} if {@code query} could be executed
     */
    public boolean proxyQueryCaps(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_proxy_query_caps.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pulls a {@code buffer} from the peer pad or fills up a provided buffer.
     * <p>
     * This function will first trigger the pad block signal if it was
     * installed.
     * <p>
     * When {@code pad} is not linked {@code GST_FLOW_NOT_LINKED} is returned else this
     * function returns the result of gst_pad_get_range() on the peer pad.
     * See gst_pad_get_range() for a list of return values and for the
     * semantics of the arguments of this function.
     * <p>
     * If {@code buffer} points to a variable holding {@code null}, a valid new {@link Buffer} will be
     * placed in {@code buffer} when this function returns {@code GST_FLOW_OK}. The new buffer
     * must be freed with gst_buffer_unref() after usage. When this function
     * returns any other result value, {@code buffer} will still point to {@code null}.
     * <p>
     * When {@code buffer} points to a variable that points to a valid {@link Buffer}, the
     * buffer will be filled with the result data when this function returns
     * {@code GST_FLOW_OK}. When this function returns any other result value,
     * {@code buffer} will be unchanged. If the provided buffer is larger than {@code size}, only
     * {@code size} bytes will be filled in the result buffer and its size will be updated
     * accordingly.
     * <p>
     * Note that less than {@code size} bytes can be returned in {@code buffer} when, for example,
     * an EOS condition is near or when {@code buffer} is not large enough to hold {@code size}
     * bytes. The caller should check the result buffer size to get the result size.
     * @param offset The start offset of the buffer
     * @param size The length of the buffer
     * @param buffer a pointer to hold the {@link Buffer}, returns
     *     GST_FLOW_ERROR if {@code null}.
     * @return a {@link FlowReturn} from the peer pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.FlowReturn pullRange(long offset, int size, Out<org.gstreamer.gst.Buffer> buffer) {
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_pull_range.invokeExact(
                    handle(),
                    offset,
                    size,
                    (Addressable) bufferPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.set(org.gstreamer.gst.Buffer.fromAddress.marshal(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Pushes a buffer to the peer of {@code pad}.
     * <p>
     * This function will call installed block probes before triggering any
     * installed data probes.
     * <p>
     * The function proceeds calling gst_pad_chain() on the peer pad and returns
     * the value from that function. If {@code pad} has no peer, {@code GST_FLOW_NOT_LINKED} will
     * be returned.
     * <p>
     * In all cases, success or failure, the caller loses its reference to {@code buffer}
     * after calling this function.
     * @param buffer the {@link Buffer} to push returns GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the peer pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.FlowReturn push(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_push.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Sends the event to the peer of the given pad. This function is
     * mainly used by elements to send events to their peer
     * elements.
     * <p>
     * This function takes ownership of the provided event so you should
     * gst_event_ref() it if you want to reuse the event after this call.
     * @param event the {@link Event} to send to the pad.
     * @return {@code true} if the event was handled.
     * <p>
     * MT safe.
     */
    public boolean pushEvent(org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_push_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pushes a buffer list to the peer of {@code pad}.
     * <p>
     * This function will call installed block probes before triggering any
     * installed data probes.
     * <p>
     * The function proceeds calling the chain function on the peer pad and returns
     * the value from that function. If {@code pad} has no peer, {@code GST_FLOW_NOT_LINKED} will
     * be returned. If the peer pad does not have any installed chainlist function
     * every group buffer of the list will be merged into a normal {@link Buffer} and
     * chained via gst_pad_chain().
     * <p>
     * In all cases, success or failure, the caller loses its reference to {@code list}
     * after calling this function.
     * @param list the {@link BufferList} to push returns GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the peer pad.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.FlowReturn pushList(org.gstreamer.gst.BufferList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_push_list.invokeExact(
                    handle(),
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Dispatches a query to a pad. The query should have been allocated by the
     * caller via one of the type-specific allocation functions. The element that
     * the pad belongs to is responsible for filling the query with an appropriate
     * response, which should then be parsed with a type-specific query parsing
     * function.
     * <p>
     * Again, the caller is responsible for both the allocation and deallocation of
     * the query structure.
     * <p>
     * Please also note that some queries might need a running pipeline to work.
     * @param query the {@link Query} to perform.
     * @return {@code true} if the query could be performed.
     */
    public boolean query(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if the given pad accepts the caps.
     * @param caps a {@link Caps} to check on the pad
     * @return {@code true} if the pad can accept the caps.
     */
    public boolean queryAcceptCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query_accept_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the capabilities this pad can produce or consume.
     * Note that this method doesn't necessarily return the caps set by sending a
     * gst_event_new_caps() - use gst_pad_get_current_caps() for that instead.
     * gst_pad_query_caps returns all possible caps a pad can operate with, using
     * the pad's CAPS query function, If the query fails, this function will return
     * {@code filter}, if not {@code null}, otherwise ANY.
     * <p>
     * When called on sinkpads {@code filter} contains the caps that
     * upstream could produce in the order preferred by upstream. When
     * called on srcpads {@code filter} contains the caps accepted by
     * downstream in the preferred order. {@code filter} might be {@code null} but
     * if it is not {@code null} the returned caps will be a subset of {@code filter}.
     * <p>
     * Note that this function does not return writable {@link Caps}, use
     * gst_caps_make_writable() before modifying the caps.
     * @param filter suggested {@link Caps}, or {@code null}
     * @return the caps of the pad with incremented ref-count.
     */
    public org.gstreamer.gst.Caps queryCaps(@Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_query_caps.invokeExact(
                    handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Queries a pad to convert {@code src_val} in {@code src_format} to {@code dest_format}.
     * @param srcFormat a {@link Format} to convert from.
     * @param srcVal a value to convert.
     * @param destFormat the {@link Format} to convert to.
     * @param destVal a pointer to the result.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryConvert(org.gstreamer.gst.Format srcFormat, long srcVal, org.gstreamer.gst.Format destFormat, Out<Long> destVal) {
        MemorySegment destValPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query_convert.invokeExact(
                    handle(),
                    srcFormat.getValue(),
                    srcVal,
                    destFormat.getValue(),
                    (Addressable) destValPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        destVal.set(destValPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Invokes the default query handler for the given pad.
     * The query is sent to all pads internally linked to {@code pad}. Note that
     * if there are many possible sink pads that are internally linked to
     * {@code pad}, only one will be sent the query.
     * Multi-sinkpad elements should implement custom query handlers.
     * @param parent the parent of {@code pad} or {@code null}
     * @param query the {@link Query} to handle.
     * @return {@code true} if the query was performed successfully.
     */
    public boolean queryDefault(@Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query_default.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries a pad for the total stream duration.
     * @param format the {@link Format} requested
     * @param duration a location in which to store the total
     *     duration, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryDuration(org.gstreamer.gst.Format format, Out<Long> duration) {
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query_duration.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries a pad for the stream position.
     * @param format the {@link Format} requested
     * @param cur A location in which to store the current position, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryPosition(org.gstreamer.gst.Format format, Out<Long> cur) {
        MemorySegment curPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_query_position.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (cur == null ? MemoryAddress.NULL : (Addressable) curPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (cur != null) cur.set(curPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Remove the probe with {@code id} from {@code pad}.
     * <p>
     * MT safe.
     * @param id the probe id to remove
     */
    public void removeProbe(long id) {
        try {
            DowncallHandles.gst_pad_remove_probe.invokeExact(
                    handle(),
                    id);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sends the event to the pad. This function can be used
     * by applications to send events in the pipeline.
     * <p>
     * If {@code pad} is a source pad, {@code event} should be an upstream event. If {@code pad} is a
     * sink pad, {@code event} should be a downstream event. For example, you would not
     * send a {@code GST_EVENT_EOS} on a src pad; EOS events only propagate downstream.
     * Furthermore, some downstream events have to be serialized with data flow,
     * like EOS, while some can travel out-of-band, like {@code GST_EVENT_FLUSH_START}. If
     * the event needs to be serialized with data flow, this function will take the
     * pad's stream lock while calling its event function.
     * <p>
     * To find out whether an event type is upstream, downstream, or downstream and
     * serialized, see {@link EventTypeFlags}, gst_event_type_get_flags(),
     * {@code GST_EVENT_IS_UPSTREAM}, {@code GST_EVENT_IS_DOWNSTREAM}, and
     * {@code GST_EVENT_IS_SERIALIZED}. Note that in practice that an application or
     * plugin doesn't need to bother itself with this information; the core handles
     * all necessary locks and checks.
     * <p>
     * This function takes ownership of the provided event so you should
     * gst_event_ref() it if you want to reuse the event after this call.
     * @param event the {@link Event} to send to the pad.
     * @return {@code true} if the event was handled.
     */
    public boolean sendEvent(org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_send_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the given activate function for {@code pad}. The activate function will
     * dispatch to gst_pad_activate_mode() to perform the actual activation.
     * Only makes sense to set on sink pads.
     * <p>
     * Call this function if your sink pad can start a pull-based task.
     * @param activate the {@link PadActivateFunction} to set.
     * @param notify notify called when {@code activate} will not be used anymore.
     */
    public void setActivateFunctionFull(org.gstreamer.gst.PadActivateFunction activate, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_activate_function_full.invokeExact(
                    handle(),
                    (Addressable) activate.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given activate_mode function for the pad. An activate_mode function
     * prepares the element for data passing.
     * @param activatemode the {@link PadActivateModeFunction} to set.
     * @param notify notify called when {@code activatemode} will not be used anymore.
     */
    public void setActivatemodeFunctionFull(org.gstreamer.gst.PadActivateModeFunction activatemode, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_activatemode_function_full.invokeExact(
                    handle(),
                    (Addressable) activatemode.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Activates or deactivates the given pad.
     * Normally called from within core state change functions.
     * <p>
     * If {@code active}, makes sure the pad is active. If it is already active, either in
     * push or pull mode, just return. Otherwise dispatches to the pad's activate
     * function to perform the actual activation.
     * <p>
     * If not {@code active}, calls gst_pad_activate_mode() with the pad's current mode
     * and a {@code false} argument.
     * @param active whether or not the pad should be active.
     * @return {@code true} if the operation was successful.
     * <p>
     * MT safe.
     */
    public boolean setActive(boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_set_active.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the given chain function for the pad. The chain function is called to
     * process a {@link Buffer} input buffer. see {@link PadChainFunction} for more details.
     * @param chain the {@link PadChainFunction} to set.
     * @param notify notify called when {@code chain} will not be used anymore.
     */
    public void setChainFunctionFull(org.gstreamer.gst.PadChainFunction chain, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_chain_function_full.invokeExact(
                    handle(),
                    (Addressable) chain.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given chain list function for the pad. The chainlist function is
     * called to process a {@link BufferList} input buffer list. See
     * {@link PadChainListFunction} for more details.
     * @param chainlist the {@link PadChainListFunction} to set.
     * @param notify notify called when {@code chainlist} will not be used anymore.
     */
    public void setChainListFunctionFull(org.gstreamer.gst.PadChainListFunction chainlist, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_chain_list_function_full.invokeExact(
                    handle(),
                    (Addressable) chainlist.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the given private data gpointer on the pad.
     * This function can only be used by the element that owns the pad.
     * No locking is performed in this function.
     * @param priv The private data to attach to the pad.
     */
    public void setElementPrivate(@Nullable java.lang.foreign.MemoryAddress priv) {
        try {
            DowncallHandles.gst_pad_set_element_private.invokeExact(
                    handle(),
                    (Addressable) (priv == null ? MemoryAddress.NULL : (Addressable) priv));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given event handler for the pad.
     * @param event the {@link PadEventFullFunction} to set.
     * @param notify notify called when {@code event} will not be used anymore.
     */
    public void setEventFullFunctionFull(org.gstreamer.gst.PadEventFullFunction event, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_event_full_function_full.invokeExact(
                    handle(),
                    (Addressable) event.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given event handler for the pad.
     * @param event the {@link PadEventFunction} to set.
     * @param notify notify called when {@code event} will not be used anymore.
     */
    public void setEventFunctionFull(org.gstreamer.gst.PadEventFunction event, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_event_function_full.invokeExact(
                    handle(),
                    (Addressable) event.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given getrange function for the pad. The getrange function is
     * called to produce a new {@link Buffer} to start the processing pipeline. see
     * {@link PadGetRangeFunction} for a description of the getrange function.
     * @param get the {@link PadGetRangeFunction} to set.
     * @param notify notify called when {@code get} will not be used anymore.
     */
    public void setGetrangeFunctionFull(org.gstreamer.gst.PadGetRangeFunction get, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_getrange_function_full.invokeExact(
                    handle(),
                    (Addressable) get.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given internal link iterator function for the pad.
     * @param iterintlink the {@link PadIterIntLinkFunction} to set.
     * @param notify notify called when {@code iterintlink} will not be used anymore.
     */
    public void setIterateInternalLinksFunctionFull(org.gstreamer.gst.PadIterIntLinkFunction iterintlink, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_iterate_internal_links_function_full.invokeExact(
                    handle(),
                    (Addressable) iterintlink.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given link function for the pad. It will be called when
     * the pad is linked with another pad.
     * <p>
     * The return value {@code GST_PAD_LINK_OK} should be used when the connection can be
     * made.
     * <p>
     * The return value {@code GST_PAD_LINK_REFUSED} should be used when the connection
     * cannot be made for some reason.
     * <p>
     * If {@code link} is installed on a source pad, it should call the {@link PadLinkFunction}
     * of the peer sink pad, if present.
     * @param link the {@link PadLinkFunction} to set.
     * @param notify notify called when {@code link} will not be used anymore.
     */
    public void setLinkFunctionFull(org.gstreamer.gst.PadLinkFunction link, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_link_function_full.invokeExact(
                    handle(),
                    (Addressable) link.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the offset that will be applied to the running time of {@code pad}.
     * @param offset the offset
     */
    public void setOffset(long offset) {
        try {
            DowncallHandles.gst_pad_set_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the given query function for the pad.
     * @param query the {@link PadQueryFunction} to set.
     * @param notify notify called when {@code query} will not be used anymore.
     */
    public void setQueryFunctionFull(org.gstreamer.gst.PadQueryFunction query, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_query_function_full.invokeExact(
                    handle(),
                    (Addressable) query.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given unlink function for the pad. It will be called
     * when the pad is unlinked.
     * <p>
     * Note that the pad's lock is already held when the unlink
     * function is called, so most pad functions cannot be called
     * from within the callback.
     * @param unlink the {@link PadUnlinkFunction} to set.
     * @param notify notify called when {@code unlink} will not be used anymore.
     */
    public void setUnlinkFunctionFull(org.gstreamer.gst.PadUnlinkFunction unlink, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_pad_set_unlink_function_full.invokeExact(
                    handle(),
                    (Addressable) unlink.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts a task that repeatedly calls {@code func} with {@code user_data}. This function
     * is mostly used in pad activation functions to start the dataflow.
     * The {@code GST_PAD_STREAM_LOCK} of {@code pad} will automatically be acquired
     * before {@code func} is called.
     * @param func the task function to call
     * @param notify called when {@code user_data} is no longer referenced
     * @return a {@code true} if the task could be started.
     */
    public boolean startTask(org.gstreamer.gst.TaskFunction func, org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_start_task.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Iterates all sticky events on {@code pad} and calls {@code foreach_func} for every
     * event. If {@code foreach_func} returns {@code false} the iteration is immediately stopped.
     * @param foreachFunc the {@link PadStickyEventsForeachFunction} that
     *                should be called for every event.
     */
    public void stickyEventsForeach(org.gstreamer.gst.PadStickyEventsForeachFunction foreachFunc) {
        try {
            DowncallHandles.gst_pad_sticky_events_foreach.invokeExact(
                    handle(),
                    (Addressable) foreachFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stop the task of {@code pad}. This function will also make sure that the
     * function executed by the task will effectively stop if not called
     * from the GstTaskFunction.
     * <p>
     * This function will deadlock if called from the GstTaskFunction of
     * the task. Use gst_task_pause() instead.
     * <p>
     * Regardless of whether the pad has a task, the stream lock is acquired and
     * released so as to ensure that streaming through this pad has finished.
     * @return a {@code true} if the task could be stopped or {@code false} on error.
     */
    public boolean stopTask() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_stop_task.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Store the sticky {@code event} on {@code pad}
     * @param event a {@link Event}
     * @return {@code GST_FLOW_OK} on success, {@code GST_FLOW_FLUSHING} when the pad
     * was flushing or {@code GST_FLOW_EOS} when the pad was EOS.
     */
    public org.gstreamer.gst.FlowReturn storeStickyEvent(org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_store_sticky_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Unlinks the source pad from the sink pad. Will emit the {@link Pad}::unlinked
     * signal on both pads.
     * @param sinkpad the sink {@link Pad} to unlink.
     * @return {@code true} if the pads were unlinked. This function returns {@code false} if
     * the pads were not linked together.
     * <p>
     * MT safe.
     */
    public boolean unlink(org.gstreamer.gst.Pad sinkpad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pad_unlink.invokeExact(
                    handle(),
                    sinkpad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A helper function you can use that sets the FIXED_CAPS flag
     * This way the default CAPS query will always return the negotiated caps
     * or in case the pad is not negotiated, the padtemplate caps.
     * <p>
     * The negotiated caps are the caps of the last CAPS event that passed on the
     * pad. Use this function on a pad that, once it negotiated to a CAPS, cannot
     * be renegotiated to something else.
     */
    public void useFixedCaps() {
        try {
            DowncallHandles.gst_pad_use_fixed_caps.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gst_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a string representing the given pad-link return.
     * @param ret a {@link PadLinkReturn} to get the name of.
     * @return a static string with the name of the pad-link return.
     */
    public static java.lang.String linkGetName(org.gstreamer.gst.PadLinkReturn ret) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_link_get_name.invokeExact(
                    ret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    @FunctionalInterface
    public interface Linked {
        void run(org.gstreamer.gst.Pad peer);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePad, MemoryAddress peer) {
            run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peer)), org.gstreamer.gst.Pad.fromAddress).marshal(peer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Linked.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that a pad has been linked to the peer pad.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Pad.Linked> onLinked(Pad.Linked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("linked"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unlinked {
        void run(org.gstreamer.gst.Pad peer);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePad, MemoryAddress peer) {
            run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peer)), org.gstreamer.gst.Pad.fromAddress).marshal(peer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Unlinked.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that a pad has been unlinked from the peer pad.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Pad.Unlinked> onUnlinked(Pad.Unlinked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unlinked"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Pad.Builder} object constructs a {@link Pad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Pad.Builder#build()}. 
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
         * Finish building the {@link Pad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Pad}.
         * @return A new instance of {@code Pad} with the properties 
         *         that were set in the Builder object.
         */
        public Pad build() {
            return (Pad) org.gtk.gobject.GObject.newWithProperties(
                Pad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Builder setDirection(org.gstreamer.gst.PadDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The offset that will be applied to the running time of the pad.
         * @param offset The value for the {@code offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long offset) {
            names.add("offset");
            values.add(org.gtk.gobject.Value.create(offset));
            return this;
        }
        
        public Builder setTemplate(org.gstreamer.gst.PadTemplate template) {
            names.add("template");
            values.add(org.gtk.gobject.Value.create(template));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_pad_new = Interop.downcallHandle(
            "gst_pad_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_new_from_static_template = Interop.downcallHandle(
            "gst_pad_new_from_static_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_new_from_template = Interop.downcallHandle(
            "gst_pad_new_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_activate_mode = Interop.downcallHandle(
            "gst_pad_activate_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_add_probe = Interop.downcallHandle(
            "gst_pad_add_probe",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_can_link = Interop.downcallHandle(
            "gst_pad_can_link",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_chain = Interop.downcallHandle(
            "gst_pad_chain",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_chain_list = Interop.downcallHandle(
            "gst_pad_chain_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_check_reconfigure = Interop.downcallHandle(
            "gst_pad_check_reconfigure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_create_stream_id = Interop.downcallHandle(
            "gst_pad_create_stream_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_create_stream_id_printf = Interop.downcallHandle(
            "gst_pad_create_stream_id_printf",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_pad_create_stream_id_printf_valist = Interop.downcallHandle(
            "gst_pad_create_stream_id_printf_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_event_default = Interop.downcallHandle(
            "gst_pad_event_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_forward = Interop.downcallHandle(
            "gst_pad_forward",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_allowed_caps = Interop.downcallHandle(
            "gst_pad_get_allowed_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_current_caps = Interop.downcallHandle(
            "gst_pad_get_current_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_direction = Interop.downcallHandle(
            "gst_pad_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_element_private = Interop.downcallHandle(
            "gst_pad_get_element_private",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_last_flow_return = Interop.downcallHandle(
            "gst_pad_get_last_flow_return",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_offset = Interop.downcallHandle(
            "gst_pad_get_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_pad_template = Interop.downcallHandle(
            "gst_pad_get_pad_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_pad_template_caps = Interop.downcallHandle(
            "gst_pad_get_pad_template_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_parent_element = Interop.downcallHandle(
            "gst_pad_get_parent_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_peer = Interop.downcallHandle(
            "gst_pad_get_peer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_range = Interop.downcallHandle(
            "gst_pad_get_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_single_internal_link = Interop.downcallHandle(
            "gst_pad_get_single_internal_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_sticky_event = Interop.downcallHandle(
            "gst_pad_get_sticky_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_get_stream = Interop.downcallHandle(
            "gst_pad_get_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_stream_id = Interop.downcallHandle(
            "gst_pad_get_stream_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_task_state = Interop.downcallHandle(
            "gst_pad_get_task_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_has_current_caps = Interop.downcallHandle(
            "gst_pad_has_current_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_is_active = Interop.downcallHandle(
            "gst_pad_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_is_blocked = Interop.downcallHandle(
            "gst_pad_is_blocked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_is_blocking = Interop.downcallHandle(
            "gst_pad_is_blocking",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_is_linked = Interop.downcallHandle(
            "gst_pad_is_linked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_iterate_internal_links = Interop.downcallHandle(
            "gst_pad_iterate_internal_links",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_iterate_internal_links_default = Interop.downcallHandle(
            "gst_pad_iterate_internal_links_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_link = Interop.downcallHandle(
            "gst_pad_link",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_link_full = Interop.downcallHandle(
            "gst_pad_link_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_link_maybe_ghosting = Interop.downcallHandle(
            "gst_pad_link_maybe_ghosting",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_link_maybe_ghosting_full = Interop.downcallHandle(
            "gst_pad_link_maybe_ghosting_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_mark_reconfigure = Interop.downcallHandle(
            "gst_pad_mark_reconfigure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_needs_reconfigure = Interop.downcallHandle(
            "gst_pad_needs_reconfigure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_pause_task = Interop.downcallHandle(
            "gst_pad_pause_task",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query = Interop.downcallHandle(
            "gst_pad_peer_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query_accept_caps = Interop.downcallHandle(
            "gst_pad_peer_query_accept_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query_caps = Interop.downcallHandle(
            "gst_pad_peer_query_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query_convert = Interop.downcallHandle(
            "gst_pad_peer_query_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query_duration = Interop.downcallHandle(
            "gst_pad_peer_query_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_peer_query_position = Interop.downcallHandle(
            "gst_pad_peer_query_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_proxy_query_accept_caps = Interop.downcallHandle(
            "gst_pad_proxy_query_accept_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_proxy_query_caps = Interop.downcallHandle(
            "gst_pad_proxy_query_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_pull_range = Interop.downcallHandle(
            "gst_pad_pull_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_push = Interop.downcallHandle(
            "gst_pad_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_push_event = Interop.downcallHandle(
            "gst_pad_push_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_push_list = Interop.downcallHandle(
            "gst_pad_push_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query = Interop.downcallHandle(
            "gst_pad_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_accept_caps = Interop.downcallHandle(
            "gst_pad_query_accept_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_caps = Interop.downcallHandle(
            "gst_pad_query_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_convert = Interop.downcallHandle(
            "gst_pad_query_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_default = Interop.downcallHandle(
            "gst_pad_query_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_duration = Interop.downcallHandle(
            "gst_pad_query_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_query_position = Interop.downcallHandle(
            "gst_pad_query_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_remove_probe = Interop.downcallHandle(
            "gst_pad_remove_probe",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_pad_send_event = Interop.downcallHandle(
            "gst_pad_send_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_activate_function_full = Interop.downcallHandle(
            "gst_pad_set_activate_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_activatemode_function_full = Interop.downcallHandle(
            "gst_pad_set_activatemode_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_active = Interop.downcallHandle(
            "gst_pad_set_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_pad_set_chain_function_full = Interop.downcallHandle(
            "gst_pad_set_chain_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_chain_list_function_full = Interop.downcallHandle(
            "gst_pad_set_chain_list_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_element_private = Interop.downcallHandle(
            "gst_pad_set_element_private",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_event_full_function_full = Interop.downcallHandle(
            "gst_pad_set_event_full_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_event_function_full = Interop.downcallHandle(
            "gst_pad_set_event_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_getrange_function_full = Interop.downcallHandle(
            "gst_pad_set_getrange_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_iterate_internal_links_function_full = Interop.downcallHandle(
            "gst_pad_set_iterate_internal_links_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_link_function_full = Interop.downcallHandle(
            "gst_pad_set_link_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_offset = Interop.downcallHandle(
            "gst_pad_set_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_pad_set_query_function_full = Interop.downcallHandle(
            "gst_pad_set_query_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_set_unlink_function_full = Interop.downcallHandle(
            "gst_pad_set_unlink_function_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_start_task = Interop.downcallHandle(
            "gst_pad_start_task",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_sticky_events_foreach = Interop.downcallHandle(
            "gst_pad_sticky_events_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_stop_task = Interop.downcallHandle(
            "gst_pad_stop_task",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_store_sticky_event = Interop.downcallHandle(
            "gst_pad_store_sticky_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_unlink = Interop.downcallHandle(
            "gst_pad_unlink",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_use_fixed_caps = Interop.downcallHandle(
            "gst_pad_use_fixed_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_get_type = Interop.downcallHandle(
            "gst_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_pad_link_get_name = Interop.downcallHandle(
            "gst_pad_link_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
