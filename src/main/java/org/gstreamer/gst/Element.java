package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstElement is the abstract base class needed to construct an element that
 * can be used in a GStreamer pipeline. Please refer to the plugin writers
 * guide for more information on creating {@link Element} subclasses.
 * <p>
 * The name of a {@link Element} can be get with gst_element_get_name() and set with
 * gst_element_set_name().  For speed, GST_ELEMENT_NAME() can be used in the
 * core when using the appropriate locking. Do not use this in plug-ins or
 * applications in order to retain ABI compatibility.
 * <p>
 * Elements can have pads (of the type {@link Pad}).  These pads link to pads on
 * other elements.  {@link Buffer} flow between these linked pads.
 * A {@link Element} has a {@link org.gtk.glib.List} of {@link Pad} structures for all their input (or sink)
 * and output (or source) pads.
 * Core and plug-in writers can add and remove pads with gst_element_add_pad()
 * and gst_element_remove_pad().
 * <p>
 * An existing pad of an element can be retrieved by name with
 * gst_element_get_static_pad(). A new dynamic pad can be created using
 * gst_element_request_pad() with a {@link PadTemplate}.
 * An iterator of all pads can be retrieved with gst_element_iterate_pads().
 * <p>
 * Elements can be linked through their pads.
 * If the link is straightforward, use the gst_element_link()
 * convenience function to link two elements, or gst_element_link_many()
 * for more elements in a row.
 * Use gst_element_link_filtered() to link two elements constrained by
 * a specified set of {@link Caps}.
 * For finer control, use gst_element_link_pads() and
 * gst_element_link_pads_filtered() to specify the pads to link on
 * each element by name.
 * <p>
 * Each element has a state (see {@link State}).  You can get and set the state
 * of an element with gst_element_get_state() and gst_element_set_state().
 * Setting a state triggers a {@link StateChange}. To get a string representation
 * of a {@link State}, use gst_element_state_get_name().
 * <p>
 * You can get and set a {@link Clock} on an element using gst_element_get_clock()
 * and gst_element_set_clock().
 * Some elements can provide a clock for the pipeline if
 * the {@code GST_ELEMENT_FLAG_PROVIDE_CLOCK} flag is set. With the
 * gst_element_provide_clock() method one can retrieve the clock provided by
 * such an element.
 * Not all elements require a clock to operate correctly. If the
 * {@code GST_ELEMENT_FLAG_REQUIRE_CLOCK}() flag is set, a clock should be set on the
 * element with gst_element_set_clock().
 * <p>
 * Note that clock selection and distribution is normally handled by the
 * toplevel {@link Pipeline} so the clock functions are only to be used in very
 * specific situations.
 */
public class Element extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstElement";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            org.gtk.glib.RecMutex.getMemoryLayout().withName("state_lock"),
            org.gtk.glib.Cond.getMemoryLayout().withName("state_cond"),
            Interop.valueLayout.C_INT.withName("state_cookie"),
            Interop.valueLayout.C_INT.withName("target_state"),
            Interop.valueLayout.C_INT.withName("current_state"),
            Interop.valueLayout.C_INT.withName("next_state"),
            Interop.valueLayout.C_INT.withName("pending_state"),
            Interop.valueLayout.C_INT.withName("last_return"),
            Interop.valueLayout.ADDRESS.withName("bus"),
            Interop.valueLayout.ADDRESS.withName("clock"),
            Interop.valueLayout.C_LONG.withName("base_time"),
            Interop.valueLayout.C_LONG.withName("start_time"),
            Interop.valueLayout.C_SHORT.withName("numpads"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("pads"),
            Interop.valueLayout.C_SHORT.withName("numsrcpads"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("srcpads"),
            Interop.valueLayout.C_SHORT.withName("numsinkpads"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("sinkpads"),
            Interop.valueLayout.C_INT.withName("pads_cookie"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("contexts"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Element proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Element(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Element> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Element(input);
    
    /**
     * Abort the state change of the element. This function is used
     * by elements that do asynchronous state changes and find out
     * something is wrong.
     * <p>
     * This function should be called with the STATE_LOCK held.
     * <p>
     * MT safe.
     */
    public void abortState() {
        try {
            DowncallHandles.gst_element_abort_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a pad (link point) to {@code element}. {@code pad}'s parent will be set to {@code element};
     * see gst_object_set_parent() for refcounting information.
     * <p>
     * Pads are automatically activated when added in the PAUSED or PLAYING
     * state.
     * <p>
     * The pad and the element should be unlocked when calling this function.
     * <p>
     * This function will emit the {@link Element}::pad-added signal on the element.
     * @param pad the {@link Pad} to add to the element.
     * @return {@code true} if the pad could be added. This function can fail when
     * a pad with the same name already existed or the pad already had another
     * parent.
     * <p>
     * MT safe.
     */
    public boolean addPad(org.gstreamer.gst.Pad pad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_add_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public long addPropertyDeepNotifyWatch(@Nullable java.lang.String propertyName, boolean includeValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_element_add_property_deep_notify_watch.invokeExact(
                        handle(),
                        (Addressable) (propertyName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(propertyName, SCOPE)),
                        Marshal.booleanToInteger.marshal(includeValue, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    public long addPropertyNotifyWatch(@Nullable java.lang.String propertyName, boolean includeValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_element_add_property_notify_watch.invokeExact(
                        handle(),
                        (Addressable) (propertyName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(propertyName, SCOPE)),
                        Marshal.booleanToInteger.marshal(includeValue, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Calls {@code func} from another thread and passes {@code user_data} to it. This is to be
     * used for cases when a state change has to be performed from a streaming
     * thread, directly via gst_element_set_state() or indirectly e.g. via SEEK
     * events.
     * <p>
     * Calling those functions directly from the streaming thread will cause
     * deadlocks in many situations, as they might involve waiting for the
     * streaming thread to shut down from this very streaming thread.
     * <p>
     * MT safe.
     * @param func Function to call asynchronously from another thread
     * @param destroyNotify GDestroyNotify for {@code user_data}
     */
    public void callAsync(org.gstreamer.gst.ElementCallAsyncFunc func, org.gtk.glib.DestroyNotify destroyNotify) {
        try {
            DowncallHandles.gst_element_call_async.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyNotify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code transition} on {@code element}.
     * <p>
     * This function must be called with STATE_LOCK held and is mainly used
     * internally.
     * @param transition the requested transition
     * @return the {@link StateChangeReturn} of the state transition.
     */
    public org.gstreamer.gst.StateChangeReturn changeState(org.gstreamer.gst.StateChange transition) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_change_state.invokeExact(
                    handle(),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.StateChangeReturn.of(RESULT);
    }
    
    /**
     * Commit the state change of the element and proceed to the next
     * pending state if any. This function is used
     * by elements that do asynchronous state changes.
     * The core will normally call this method automatically when an
     * element returned {@link StateChangeReturn#SUCCESS} from the state change function.
     * <p>
     * If after calling this method the element still has not reached
     * the pending state, the next state change is performed.
     * <p>
     * This method is used internally and should normally not be called by plugins
     * or applications.
     * <p>
     * This function must be called with STATE_LOCK held.
     * @param ret The previous state return value
     * @return The result of the commit state change.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.StateChangeReturn continueState(org.gstreamer.gst.StateChangeReturn ret) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_continue_state.invokeExact(
                    handle(),
                    ret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.StateChangeReturn.of(RESULT);
    }
    
    /**
     * Creates a pad for each pad template that is always available.
     * This function is only useful during object initialization of
     * subclasses of {@link Element}.
     */
    public void createAllPads() {
        try {
            DowncallHandles.gst_element_create_all_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Call {@code func} with {@code user_data} for each of {@code element}'s pads. {@code func} will be called
     * exactly once for each pad that exists at the time of this call, unless
     * one of the calls to {@code func} returns {@code false} in which case we will stop
     * iterating pads and return early. If new pads are added or pads are removed
     * while pads are being iterated, this will not be taken into account until
     * next time this function is used.
     * @param func function to call for each pad
     * @return {@code false} if {@code element} had no pads or if one of the calls to {@code func}
     *   returned {@code false}.
     */
    public boolean foreachPad(org.gstreamer.gst.ElementForeachPadFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_pad.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Call {@code func} with {@code user_data} for each of {@code element}'s sink pads. {@code func} will be
     * called exactly once for each sink pad that exists at the time of this call,
     * unless one of the calls to {@code func} returns {@code false} in which case we will stop
     * iterating pads and return early. If new sink pads are added or sink pads
     * are removed while the sink pads are being iterated, this will not be taken
     * into account until next time this function is used.
     * @param func function to call for each sink pad
     * @return {@code false} if {@code element} had no sink pads or if one of the calls to {@code func}
     *   returned {@code false}.
     */
    public boolean foreachSinkPad(org.gstreamer.gst.ElementForeachPadFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_sink_pad.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Call {@code func} with {@code user_data} for each of {@code element}'s source pads. {@code func} will be
     * called exactly once for each source pad that exists at the time of this call,
     * unless one of the calls to {@code func} returns {@code false} in which case we will stop
     * iterating pads and return early. If new source pads are added or source pads
     * are removed while the source pads are being iterated, this will not be taken
     * into account until next time this function is used.
     * @param func function to call for each source pad
     * @return {@code false} if {@code element} had no source pads or if one of the calls
     *   to {@code func} returned {@code false}.
     */
    public boolean foreachSrcPad(org.gstreamer.gst.ElementForeachPadFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_src_pad.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the base time of the element. The base time is the
     * absolute time of the clock when this element was last put to
     * PLAYING. Subtracting the base time from the clock time gives
     * the running time of the element.
     * @return the base time of the element.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.ClockTime getBaseTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_base_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Returns the bus of the element. Note that only a {@link Pipeline} will provide a
     * bus for the application.
     * @return the element's {@link Bus}. unref after
     * usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Bus getBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_bus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Bus) Interop.register(RESULT, org.gstreamer.gst.Bus.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the currently configured clock of the element. This is the clock as was
     * last set with gst_element_set_clock().
     * <p>
     * Elements in a pipeline will only have their clock set when the
     * pipeline is in the PLAYING state.
     * @return the {@link Clock} of the element. unref after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Clock getClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Clock) Interop.register(RESULT, org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Looks for an unlinked pad to which the given pad can link. It is not
     * guaranteed that linking the pads will work, though it should work in most
     * cases.
     * <p>
     * This function will first attempt to find a compatible unlinked ALWAYS pad,
     * and if none can be found, it will request a compatible REQUEST pad by looking
     * at the templates of {@code element}.
     * @param pad the {@link Pad} to find a compatible one for.
     * @param caps the {@link Caps} to use as a filter.
     * @return the {@link Pad} to which a link
     *   can be made, or {@code null} if one cannot be found. gst_object_unref()
     *   after usage.
     */
    public @Nullable org.gstreamer.gst.Pad getCompatiblePad(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_compatible_pad.invokeExact(
                    handle(),
                    pad.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves a pad template from {@code element} that is compatible with {@code compattempl}.
     * Pads from compatible templates can be linked together.
     * @param compattempl the {@link PadTemplate} to find a compatible
     *     template for
     * @return a compatible {@link PadTemplate},
     *   or {@code null} if none was found. No unreferencing is necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getCompatiblePadTemplate(org.gstreamer.gst.PadTemplate compattempl) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_compatible_pad_template.invokeExact(
                    handle(),
                    compattempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.PadTemplate) Interop.register(RESULT, org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the context with {@code context_type} set on the element or NULL.
     * <p>
     * MT safe.
     * @param contextType a name of a context to retrieve
     * @return A {@link Context} or NULL
     */
    public @Nullable org.gstreamer.gst.Context getContext(java.lang.String contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_context.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(contextType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.gst.Context.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the context with {@code context_type} set on the element or NULL.
     * @param contextType a name of a context to retrieve
     * @return A {@link Context} or NULL
     */
    public @Nullable org.gstreamer.gst.Context getContextUnlocked(java.lang.String contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_context_unlocked.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(contextType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.gst.Context.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the contexts set on the element.
     * <p>
     * MT safe.
     * @return List of {@link Context}
     */
    public org.gtk.glib.List getContexts() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_contexts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the current clock time of the element, as in, the time of the
     * element's clock, or GST_CLOCK_TIME_NONE if there is no clock.
     * @return the clock time of the element, or GST_CLOCK_TIME_NONE if there is
     * no clock.
     */
    public org.gstreamer.gst.ClockTime getCurrentClockTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_current_clock_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Returns the running time of the element. The running time is the
     * element's clock time minus its base time. Will return GST_CLOCK_TIME_NONE
     * if the element has no clock, or if its base time has not been set.
     * @return the running time of the element, or GST_CLOCK_TIME_NONE if the
     * element has no clock or its base time has not been set.
     */
    public org.gstreamer.gst.ClockTime getCurrentRunningTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_current_running_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Retrieves the factory that was used to create this element.
     * @return the {@link ElementFactory} used for creating this
     *     element or {@code null} if element has not been registered (static element). no refcounting is needed.
     */
    public @Nullable org.gstreamer.gst.ElementFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.ElementFactory) Interop.register(RESULT, org.gstreamer.gst.ElementFactory.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public java.lang.String getMetadata(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves a padtemplate from {@code element} with the given name.
     * @param name the name of the {@link PadTemplate} to get.
     * @return the {@link PadTemplate} with the
     *     given name, or {@code null} if none was found. No unreferencing is
     *     necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getPadTemplate(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_pad_template.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gstreamer.gst.PadTemplate) Interop.register(RESULT, org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves a list of the pad templates associated with {@code element}. The
     * list must not be modified by the calling code.
     * @return the {@link org.gtk.glib.List} of
     *     pad templates.
     */
    public org.gtk.glib.List getPadTemplateList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_pad_template_list.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * The name of this function is confusing to people learning GStreamer.
     * gst_element_request_pad_simple() aims at making it more explicit it is
     * a simplified gst_element_request_pad().
     * @param name the name of the request {@link Pad} to retrieve.
     * @return requested {@link Pad} if found,
     *     otherwise {@code null}.  Release after usage.
     * @deprecated Prefer using gst_element_request_pad_simple() which
     * provides the exact same functionality.
     */
    @Deprecated
    public @Nullable org.gstreamer.gst.Pad getRequestPad(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_request_pad.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Returns the start time of the element. The start time is the
     * running time of the clock when this element was last put to PAUSED.
     * <p>
     * Usually the start_time is managed by a toplevel element such as
     * {@link Pipeline}.
     * <p>
     * MT safe.
     * @return the start time of the element.
     */
    public org.gstreamer.gst.ClockTime getStartTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_start_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the state of the element.
     * <p>
     * For elements that performed an ASYNC state change, as reported by
     * gst_element_set_state(), this function will block up to the
     * specified timeout value for the state change to complete.
     * If the element completes the state change or goes into
     * an error, this function returns immediately with a return value of
     * {@link StateChangeReturn#SUCCESS} or {@link StateChangeReturn#FAILURE} respectively.
     * <p>
     * For elements that did not return {@link StateChangeReturn#ASYNC}, this function
     * returns the current and pending state immediately.
     * <p>
     * This function returns {@link StateChangeReturn#NO_PREROLL} if the element
     * successfully changed its state but is not able to provide data yet.
     * This mostly happens for live sources that only produce data in
     * {@link State#PLAYING}. While the state change return is equivalent to
     * {@link StateChangeReturn#SUCCESS}, it is returned to the application to signal that
     * some sink elements might not be able to complete their state change because
     * an element is not producing data to complete the preroll. When setting the
     * element to playing, the preroll will complete and playback will start.
     * @param state a pointer to {@link State} to hold the state.
     *     Can be {@code null}.
     * @param pending a pointer to {@link State} to hold the pending
     *     state. Can be {@code null}.
     * @param timeout a {@link ClockTime} to specify the timeout for an async
     *           state change or {@code GST_CLOCK_TIME_NONE} for infinite timeout.
     * @return {@link StateChangeReturn#SUCCESS} if the element has no more pending state
     *          and the last state change succeeded, {@link StateChangeReturn#ASYNC} if the
     *          element is still performing a state change or
     *          {@link StateChangeReturn#FAILURE} if the last state change failed.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.StateChangeReturn getState(@Nullable Out<org.gstreamer.gst.State> state, @Nullable Out<org.gstreamer.gst.State> pending, org.gstreamer.gst.ClockTime timeout) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment pendingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_get_state.invokeExact(
                        handle(),
                        (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()),
                        (Addressable) (pending == null ? MemoryAddress.NULL : (Addressable) pendingPOINTER.address()),
                        timeout.getValue().longValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (state != null) state.set(org.gstreamer.gst.State.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (pending != null) pending.set(org.gstreamer.gst.State.of(pendingPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return org.gstreamer.gst.StateChangeReturn.of(RESULT);
        }
    }
    
    /**
     * Retrieves a pad from {@code element} by name. This version only retrieves
     * already-existing (i.e. 'static') pads.
     * @param name the name of the static {@link Pad} to retrieve.
     * @return the requested {@link Pad} if
     *     found, otherwise {@code null}.  unref after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Pad getStaticPad(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_get_static_pad.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Checks if the state of an element is locked.
     * If the state of an element is locked, state changes of the parent don't
     * affect the element.
     * This way you can leave currently unused elements inside bins. Just lock their
     * state before changing the state from {@code GST_STATE_NULL}.
     * <p>
     * MT safe.
     * @return {@code true}, if the element's state is locked.
     */
    public boolean isLockedState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_is_locked_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves an iterator of {@code element}'s pads. The iterator should
     * be freed after usage. Also more specialized iterators exists such as
     * gst_element_iterate_src_pads() or gst_element_iterate_sink_pads().
     * <p>
     * The order of pads returned by the iterator will be the order in which
     * the pads were added to the element.
     * @return the {@link Iterator} of {@link Pad}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Iterator iteratePads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves an iterator of {@code element}'s sink pads.
     * <p>
     * The order of pads returned by the iterator will be the order in which
     * the pads were added to the element.
     * @return the {@link Iterator} of {@link Pad}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Iterator iterateSinkPads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_sink_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves an iterator of {@code element}'s source pads.
     * <p>
     * The order of pads returned by the iterator will be the order in which
     * the pads were added to the element.
     * @return the {@link Iterator} of {@link Pad}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Iterator iterateSrcPads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_src_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Links {@code src} to {@code dest}. The link must be from source to
     * destination; the other direction will not be tried. The function looks for
     * existing pads that aren't linked yet. It will request new pads if necessary.
     * Such pads need to be released manually when unlinking.
     * If multiple links are possible, only one is established.
     * <p>
     * Make sure you have added your elements to a bin or pipeline with
     * gst_bin_add() before trying to link them.
     * @param dest the {@link Element} containing the destination pad.
     * @return {@code true} if the elements could be linked, {@code false} otherwise.
     */
    public boolean link(org.gstreamer.gst.Element dest) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link.invokeExact(
                    handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Links {@code src} to {@code dest} using the given caps as filtercaps.
     * The link must be from source to
     * destination; the other direction will not be tried. The function looks for
     * existing pads that aren't linked yet. It will request new pads if necessary.
     * If multiple links are possible, only one is established.
     * <p>
     * Make sure you have added your elements to a bin or pipeline with
     * gst_bin_add() before trying to link them.
     * @param dest the {@link Element} containing the destination pad.
     * @param filter the {@link Caps} to filter the link,
     *     or {@code null} for no filter.
     * @return {@code true} if the pads could be linked, {@code false} otherwise.
     */
    public boolean linkFiltered(org.gstreamer.gst.Element dest, @Nullable org.gstreamer.gst.Caps filter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_filtered.invokeExact(
                    handle(),
                    dest.handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Chain together a series of elements. Uses gst_element_link().
     * Make sure you have added your elements to a bin or pipeline with
     * gst_bin_add() before trying to link them.
     * @param element2 the second {@link Element} in the link chain.
     * @param varargs the {@code null}-terminated list of elements to link in order.
     * @return {@code true} on success, {@code false} otherwise.
     */
    public boolean linkMany(org.gstreamer.gst.Element element2, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_many.invokeExact(
                    handle(),
                    element2.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Links the two named pads of the source and destination elements.
     * Side effect is that if one of the pads has no parent, it becomes a
     * child of the parent of the other element.  If they have different
     * parents, the link fails.
     * @param srcpadname the name of the {@link Pad} in source element
     *     or {@code null} for any pad.
     * @param dest the {@link Element} containing the destination pad.
     * @param destpadname the name of the {@link Pad} in destination element,
     * or {@code null} for any pad.
     * @return {@code true} if the pads could be linked, {@code false} otherwise.
     */
    public boolean linkPads(@Nullable java.lang.String srcpadname, org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_link_pads.invokeExact(
                        handle(),
                        (Addressable) (srcpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(srcpadname, SCOPE)),
                        dest.handle(),
                        (Addressable) (destpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destpadname, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Links the two named pads of the source and destination elements. Side effect
     * is that if one of the pads has no parent, it becomes a child of the parent of
     * the other element. If they have different parents, the link fails. If {@code caps}
     * is not {@code null}, makes sure that the caps of the link is a subset of {@code caps}.
     * @param srcpadname the name of the {@link Pad} in source element
     *     or {@code null} for any pad.
     * @param dest the {@link Element} containing the destination pad.
     * @param destpadname the name of the {@link Pad} in destination element
     *     or {@code null} for any pad.
     * @param filter the {@link Caps} to filter the link,
     *     or {@code null} for no filter.
     * @return {@code true} if the pads could be linked, {@code false} otherwise.
     */
    public boolean linkPadsFiltered(@Nullable java.lang.String srcpadname, org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname, @Nullable org.gstreamer.gst.Caps filter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_link_pads_filtered.invokeExact(
                        handle(),
                        (Addressable) (srcpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(srcpadname, SCOPE)),
                        dest.handle(),
                        (Addressable) (destpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destpadname, SCOPE)),
                        (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Links the two named pads of the source and destination elements.
     * Side effect is that if one of the pads has no parent, it becomes a
     * child of the parent of the other element.  If they have different
     * parents, the link fails.
     * <p>
     * Calling gst_element_link_pads_full() with {@code flags} == {@link PadLinkCheck#DEFAULT}
     * is the same as calling gst_element_link_pads() and the recommended way of
     * linking pads with safety checks applied.
     * <p>
     * This is a convenience function for gst_pad_link_full().
     * @param srcpadname the name of the {@link Pad} in source element
     *     or {@code null} for any pad.
     * @param dest the {@link Element} containing the destination pad.
     * @param destpadname the name of the {@link Pad} in destination element,
     * or {@code null} for any pad.
     * @param flags the {@link PadLinkCheck} to be performed when linking pads.
     * @return {@code true} if the pads could be linked, {@code false} otherwise.
     */
    public boolean linkPadsFull(@Nullable java.lang.String srcpadname, org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname, org.gstreamer.gst.PadLinkCheck flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_link_pads_full.invokeExact(
                        handle(),
                        (Addressable) (srcpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(srcpadname, SCOPE)),
                        dest.handle(),
                        (Addressable) (destpadname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destpadname, SCOPE)),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Brings the element to the lost state. The current state of the
     * element is copied to the pending state so that any call to
     * gst_element_get_state() will return {@link StateChangeReturn#ASYNC}.
     * <p>
     * An ASYNC_START message is posted. If the element was PLAYING, it will
     * go to PAUSED. The element will be restored to its PLAYING state by
     * the parent pipeline when it prerolls again.
     * <p>
     * This is mostly used for elements that lost their preroll buffer
     * in the {@link State#PAUSED} or {@link State#PLAYING} state after a flush,
     * they will go to their pending state again when a new preroll buffer is
     * queued. This function can only be called when the element is currently
     * not in error or an async state change.
     * <p>
     * This function is used internally and should normally not be called from
     * plugins or applications.
     */
    public void lostState() {
        try {
            DowncallHandles.gst_element_lost_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Post an error, warning or info message on the bus from inside an element.
     * <p>
     * {@code type} must be of {@code GST_MESSAGE_ERROR}, {@code GST_MESSAGE_WARNING} or
     * {@code GST_MESSAGE_INFO}.
     * <p>
     * MT safe.
     * @param type the {@link MessageType}
     * @param domain the GStreamer GError domain this message belongs to
     * @param code the GError code belonging to the domain
     * @param text an allocated text string to be used
     *            as a replacement for the default message connected to code,
     *            or {@code null}
     * @param debug an allocated debug message to be
     *            used as a replacement for the default debugging information,
     *            or {@code null}
     * @param file the source code file where the error was generated
     * @param function the source code function where the error was generated
     * @param line the source code line where the error was generated
     */
    public void messageFull(org.gstreamer.gst.MessageType type, org.gtk.glib.Quark domain, int code, @Nullable java.lang.String text, @Nullable java.lang.String debug, java.lang.String file, java.lang.String function, int line) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_message_full.invokeExact(
                        handle(),
                        type.getValue(),
                        domain.getValue().intValue(),
                        code,
                        (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)),
                        (Addressable) (debug == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(debug, SCOPE)),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        Marshal.stringToAddress.marshal(function, SCOPE),
                        line);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Post an error, warning or info message on the bus from inside an element.
     * <p>
     * {@code type} must be of {@code GST_MESSAGE_ERROR}, {@code GST_MESSAGE_WARNING} or
     * {@code GST_MESSAGE_INFO}.
     * @param type the {@link MessageType}
     * @param domain the GStreamer GError domain this message belongs to
     * @param code the GError code belonging to the domain
     * @param text an allocated text string to be used
     *            as a replacement for the default message connected to code,
     *            or {@code null}
     * @param debug an allocated debug message to be
     *            used as a replacement for the default debugging information,
     *            or {@code null}
     * @param file the source code file where the error was generated
     * @param function the source code function where the error was generated
     * @param line the source code line where the error was generated
     * @param structure optional details structure
     */
    public void messageFullWithDetails(org.gstreamer.gst.MessageType type, org.gtk.glib.Quark domain, int code, @Nullable java.lang.String text, @Nullable java.lang.String debug, java.lang.String file, java.lang.String function, int line, org.gstreamer.gst.Structure structure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_message_full_with_details.invokeExact(
                        handle(),
                        type.getValue(),
                        domain.getValue().intValue(),
                        code,
                        (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)),
                        (Addressable) (debug == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(debug, SCOPE)),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        Marshal.stringToAddress.marshal(function, SCOPE),
                        line,
                        structure.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            structure.yieldOwnership();
        }
    }
    
    /**
     * Use this function to signal that the element does not expect any more pads
     * to show up in the current pipeline. This function should be called whenever
     * pads have been added by the element itself. Elements with {@code GST_PAD_SOMETIMES}
     * pad templates use this in combination with autopluggers to figure out that
     * the element is done initializing its pads.
     * <p>
     * This function emits the {@link Element}::no-more-pads signal.
     * <p>
     * MT safe.
     */
    public void noMorePads() {
        try {
            DowncallHandles.gst_element_no_more_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Post a message on the element's {@link Bus}. This function takes ownership of the
     * message; if you want to access the message after this call, you should add an
     * additional reference before calling.
     * @param message a {@link Message} to post
     * @return {@code true} if the message was successfully posted. The function returns
     * {@code false} if the element did not have a bus.
     * <p>
     * MT safe.
     */
    public boolean postMessage(org.gstreamer.gst.Message message) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_post_message.invokeExact(
                    handle(),
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        message.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the clock provided by the given element.
     * <blockquote>
     *  An element is only required to provide a clock in the PAUSED
     *  state. Some elements can provide a clock in other states.
     * </blockquote>
     * @return the GstClock provided by the
     * element or {@code null} if no clock could be provided.  Unref after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Clock provideClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_provide_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Clock) Interop.register(RESULT, org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Performs a query on the given element.
     * <p>
     * For elements that don't implement a query handler, this function
     * forwards the query to a random srcpad or to the peer of a
     * random linked sinkpad of this element.
     * <p>
     * Please note that some queries might need a running pipeline to work.
     * @param query the {@link Query}.
     * @return {@code true} if the query could be performed.
     * <p>
     * MT safe.
     */
    public boolean query(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_query.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries an element to convert {@code src_val} in {@code src_format} to {@code dest_format}.
     * @param srcFormat a {@link Format} to convert from.
     * @param srcVal a value to convert.
     * @param destFormat the {@link Format} to convert to.
     * @param destVal a pointer to the result.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryConvert(org.gstreamer.gst.Format srcFormat, long srcVal, org.gstreamer.gst.Format destFormat, Out<Long> destVal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment destValPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_query_convert.invokeExact(
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
    }
    
    /**
     * Queries an element (usually top-level pipeline or playbin element) for the
     * total stream duration in nanoseconds. This query will only work once the
     * pipeline is prerolled (i.e. reached PAUSED or PLAYING state). The application
     * will receive an ASYNC_DONE message on the pipeline bus when that is the case.
     * <p>
     * If the duration changes for some reason, you will get a DURATION_CHANGED
     * message on the pipeline bus, in which case you should re-query the duration
     * using this function.
     * @param format the {@link Format} requested
     * @param duration A location in which to store the total duration, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryDuration(org.gstreamer.gst.Format format, Out<Long> duration) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment durationPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_query_duration.invokeExact(
                        handle(),
                        format.getValue(),
                        (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Queries an element (usually top-level pipeline or playbin element) for the
     * stream position in nanoseconds. This will be a value between 0 and the
     * stream duration (if the stream duration is known). This query will usually
     * only work once the pipeline is prerolled (i.e. reached PAUSED or PLAYING
     * state). The application will receive an ASYNC_DONE message on the pipeline
     * bus when that is the case.
     * <p>
     * If one repeatedly calls this function one can also create a query and reuse
     * it in gst_element_query().
     * @param format the {@link Format} requested
     * @param cur a location in which to store the current
     *     position, or {@code null}.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryPosition(org.gstreamer.gst.Format format, Out<Long> cur) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment curPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_query_position.invokeExact(
                        handle(),
                        format.getValue(),
                        (Addressable) (cur == null ? MemoryAddress.NULL : (Addressable) curPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (cur != null) cur.set(curPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Makes the element free the previously requested pad as obtained
     * with gst_element_request_pad().
     * <p>
     * This does not unref the pad. If the pad was created by using
     * gst_element_request_pad(), gst_element_release_request_pad() needs to be
     * followed by gst_object_unref() to free the {@code pad}.
     * <p>
     * MT safe.
     * @param pad the {@link Pad} to release.
     */
    public void releaseRequestPad(org.gstreamer.gst.Pad pad) {
        try {
            DowncallHandles.gst_element_release_request_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code pad} from {@code element}. {@code pad} will be destroyed if it has not been
     * referenced elsewhere using gst_object_unparent().
     * <p>
     * This function is used by plugin developers and should not be used
     * by applications. Pads that were dynamically requested from elements
     * with gst_element_request_pad() should be released with the
     * gst_element_release_request_pad() function instead.
     * <p>
     * Pads are not automatically deactivated so elements should perform the needed
     * steps to deactivate the pad in case this pad is removed in the PAUSED or
     * PLAYING state. See gst_pad_set_active() for more information about
     * deactivating pads.
     * <p>
     * The pad and the element should be unlocked when calling this function.
     * <p>
     * This function will emit the {@link Element}::pad-removed signal on the element.
     * @param pad the {@link Pad} to remove from the element.
     * @return {@code true} if the pad could be removed. Can return {@code false} if the
     * pad does not belong to the provided element.
     * <p>
     * MT safe.
     */
    public boolean removePad(org.gstreamer.gst.Pad pad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_remove_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public void removePropertyNotifyWatch(long watchId) {
        try {
            DowncallHandles.gst_element_remove_property_notify_watch.invokeExact(
                    handle(),
                    watchId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves a request pad from the element according to the provided template.
     * Pad templates can be looked up using
     * gst_element_factory_get_static_pad_templates().
     * <p>
     * The pad should be released with gst_element_release_request_pad().
     * @param templ a {@link PadTemplate} of which we want a pad of.
     * @param name the name of the request {@link Pad}
     * to retrieve. Can be {@code null}.
     * @param caps the caps of the pad we want to
     * request. Can be {@code null}.
     * @return requested {@link Pad} if found,
     *     otherwise {@code null}.  Release after usage.
     */
    public @Nullable org.gstreamer.gst.Pad requestPad(org.gstreamer.gst.PadTemplate templ, @Nullable java.lang.String name, @Nullable org.gstreamer.gst.Caps caps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_request_pad.invokeExact(
                        handle(),
                        templ.handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)),
                        (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Retrieves a pad from the element by name (e.g. "src_\\{@code d}"). This version only
     * retrieves request pads. The pad should be released with
     * gst_element_release_request_pad().
     * <p>
     * This method is slower than manually getting the pad template and calling
     * gst_element_request_pad() if the pads should have a specific name (e.g.
     * {@code name} is "src_1" instead of "src_\\{@code u}").
     * <p>
     * Note that this function was introduced in GStreamer 1.20 in order to provide
     * a better name to gst_element_get_request_pad(). Prior to 1.20, users
     * should use gst_element_get_request_pad() which provides the same
     * functionality.
     * @param name the name of the request {@link Pad} to retrieve.
     * @return requested {@link Pad} if found,
     *     otherwise {@code null}.  Release after usage.
     */
    public @Nullable org.gstreamer.gst.Pad requestPadSimple(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_request_pad_simple.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Sends a seek event to an element. See gst_event_new_seek() for the details of
     * the parameters. The seek event is sent to the element using
     * gst_element_send_event().
     * <p>
     * MT safe.
     * @param rate The new playback rate
     * @param format The format of the seek values
     * @param flags The optional seek flags.
     * @param startType The type and flags for the new start position
     * @param start The value of the new start position
     * @param stopType The type and flags for the new stop position
     * @param stop The value of the new stop position
     * @return {@code true} if the event was handled. Flushing seeks will trigger a
     * preroll, which will emit {@link MessageType#ASYNC_DONE}.
     */
    public boolean seek(double rate, org.gstreamer.gst.Format format, org.gstreamer.gst.SeekFlags flags, org.gstreamer.gst.SeekType startType, long start, org.gstreamer.gst.SeekType stopType, long stop) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_seek.invokeExact(
                    handle(),
                    rate,
                    format.getValue(),
                    flags.getValue(),
                    startType.getValue(),
                    start,
                    stopType.getValue(),
                    stop);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Simple API to perform a seek on the given element, meaning it just seeks
     * to the given position relative to the start of the stream. For more complex
     * operations like segment seeks (e.g. for looping) or changing the playback
     * rate or seeking relative to the last configured playback segment you should
     * use gst_element_seek().
     * <p>
     * In a completely prerolled PAUSED or PLAYING pipeline, seeking is always
     * guaranteed to return {@code true} on a seekable media type or {@code false} when the media
     * type is certainly not seekable (such as a live stream).
     * <p>
     * Some elements allow for seeking in the READY state, in this
     * case they will store the seek event and execute it when they are put to
     * PAUSED. If the element supports seek in READY, it will always return {@code true} when
     * it receives the event in the READY state.
     * @param format a {@link Format} to execute the seek in, such as {@code GST_FORMAT_TIME}
     * @param seekFlags seek options; playback applications will usually want to use
     *            GST_SEEK_FLAG_FLUSH | GST_SEEK_FLAG_KEY_UNIT here
     * @param seekPos position to seek to (relative to the start); if you are doing
     *            a seek in {@code GST_FORMAT_TIME} this value is in nanoseconds -
     *            multiply with {@code GST_SECOND} to convert seconds to nanoseconds or
     *            with {@code GST_MSECOND} to convert milliseconds to nanoseconds.
     * @return {@code true} if the seek operation succeeded. Flushing seeks will trigger a
     * preroll, which will emit {@link MessageType#ASYNC_DONE}.
     */
    public boolean seekSimple(org.gstreamer.gst.Format format, org.gstreamer.gst.SeekFlags seekFlags, long seekPos) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_seek_simple.invokeExact(
                    handle(),
                    format.getValue(),
                    seekFlags.getValue(),
                    seekPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sends an event to an element. If the element doesn't implement an
     * event handler, the event will be pushed on a random linked sink pad for
     * downstream events or a random linked source pad for upstream events.
     * <p>
     * This function takes ownership of the provided event so you should
     * gst_event_ref() it if you want to reuse the event after this call.
     * <p>
     * MT safe.
     * @param event the {@link Event} to send to the element.
     * @return {@code true} if the event was handled. Events that trigger a preroll (such
     * as flushing seeks and steps) will emit {@link MessageType#ASYNC_DONE}.
     */
    public boolean sendEvent(org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_send_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the base time of an element. See gst_element_get_base_time().
     * <p>
     * MT safe.
     * @param time the base time to set.
     */
    public void setBaseTime(org.gstreamer.gst.ClockTime time) {
        try {
            DowncallHandles.gst_element_set_base_time.invokeExact(
                    handle(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the bus of the element. Increases the refcount on the bus.
     * For internal use only, unless you're testing elements.
     * <p>
     * MT safe.
     * @param bus the {@link Bus} to set.
     */
    public void setBus(@Nullable org.gstreamer.gst.Bus bus) {
        try {
            DowncallHandles.gst_element_set_bus.invokeExact(
                    handle(),
                    (Addressable) (bus == null ? MemoryAddress.NULL : bus.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the clock for the element. This function increases the
     * refcount on the clock. Any previously set clock on the object
     * is unreffed.
     * @param clock the {@link Clock} to set for the element.
     * @return {@code true} if the element accepted the clock. An element can refuse a
     * clock when it, for example, is not able to slave its internal clock to the
     * {@code clock} or when it requires a specific clock to operate.
     * <p>
     * MT safe.
     */
    public boolean setClock(@Nullable org.gstreamer.gst.Clock clock) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_set_clock.invokeExact(
                    handle(),
                    (Addressable) (clock == null ? MemoryAddress.NULL : clock.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the context of the element. Increases the refcount of the context.
     * <p>
     * MT safe.
     * @param context the {@link Context} to set.
     */
    public void setContext(org.gstreamer.gst.Context context) {
        try {
            DowncallHandles.gst_element_set_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Locks the state of an element, so state changes of the parent don't affect
     * this element anymore.
     * <p>
     * Note that this is racy if the state lock of the parent bin is not taken.
     * The parent bin might've just checked the flag in another thread and as the
     * next step proceed to change the child element's state.
     * <p>
     * MT safe.
     * @param lockedState {@code true} to lock the element's state
     * @return {@code true} if the state was changed, {@code false} if bad parameters were given
     * or the elements state-locking needed no change.
     */
    public boolean setLockedState(boolean lockedState) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_set_locked_state.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(lockedState, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the start time of an element. The start time of the element is the
     * running time of the element when it last went to the PAUSED state. In READY
     * or after a flushing seek, it is set to 0.
     * <p>
     * Toplevel elements like {@link Pipeline} will manage the start_time and
     * base_time on its children. Setting the start_time to {@code GST_CLOCK_TIME_NONE}
     * on such a toplevel element will disable the distribution of the base_time to
     * the children and can be useful if the application manages the base_time
     * itself, for example if you want to synchronize capture from multiple
     * pipelines, and you can also ensure that the pipelines have the same clock.
     * <p>
     * MT safe.
     * @param time the base time to set.
     */
    public void setStartTime(org.gstreamer.gst.ClockTime time) {
        try {
            DowncallHandles.gst_element_set_start_time.invokeExact(
                    handle(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state of the element. This function will try to set the
     * requested state by going through all the intermediary states and calling
     * the class's state change function for each.
     * <p>
     * This function can return {@code GST_STATE_CHANGE_ASYNC}, in which case the
     * element will perform the remainder of the state change asynchronously in
     * another thread.
     * An application can use gst_element_get_state() to wait for the completion
     * of the state change or it can wait for a {@link MessageType#ASYNC_DONE} or
     * {@link MessageType#STATE_CHANGED} on the bus.
     * <p>
     * State changes to {@link State#READY} or {@link State#NULL} never return
     * {@code GST_STATE_CHANGE_ASYNC}.
     * @param state the element's new {@link State}.
     * @return Result of the state change using {@link StateChangeReturn}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.StateChangeReturn setState(org.gstreamer.gst.State state) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_set_state.invokeExact(
                    handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.StateChangeReturn.of(RESULT);
    }
    
    /**
     * Tries to change the state of the element to the same as its parent.
     * If this function returns {@code false}, the state of element is undefined.
     * @return {@code true}, if the element's state could be synced to the parent's state.
     * <p>
     * MT safe.
     */
    public boolean syncStateWithParent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_sync_state_with_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unlinks all source pads of the source element with all sink pads
     * of the sink element to which they are linked.
     * <p>
     * If the link has been made using gst_element_link(), it could have created an
     * requestpad, which has to be released using gst_element_release_request_pad().
     * @param dest the sink {@link Element} to unlink.
     */
    public void unlink(org.gstreamer.gst.Element dest) {
        try {
            DowncallHandles.gst_element_unlink.invokeExact(
                    handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unlinks a series of elements. Uses gst_element_unlink().
     * @param element2 the second {@link Element} in the link chain.
     * @param varargs the {@code null}-terminated list of elements to unlink in order.
     */
    public void unlinkMany(org.gstreamer.gst.Element element2, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_element_unlink_many.invokeExact(
                    handle(),
                    element2.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unlinks the two named pads of the source and destination elements.
     * <p>
     * This is a convenience function for gst_pad_unlink().
     * @param srcpadname the name of the {@link Pad} in source element.
     * @param dest a {@link Element} containing the destination pad.
     * @param destpadname the name of the {@link Pad} in destination element.
     */
    public void unlinkPads(java.lang.String srcpadname, org.gstreamer.gst.Element dest, java.lang.String destpadname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_unlink_pads.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(srcpadname, SCOPE),
                        dest.handle(),
                        Marshal.stringToAddress.marshal(destpadname, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates an element for handling the given URI.
     * @param type Whether to create a source or a sink
     * @param uri URI to create an element for
     * @param elementname Name of created element, can be {@code null}.
     * @return a new element or {@code null} if none
     * could be created
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.gst.Element makeFromUri(org.gstreamer.gst.URIType type, java.lang.String uri, @Nullable java.lang.String elementname) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_make_from_uri.invokeExact(
                        type.getValue(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (elementname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(elementname, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Create a new elementfactory capable of instantiating objects of the
     * {@code type} and add the factory to {@code plugin}.
     * @param plugin {@link Plugin} to register the element with, or {@code null} for
     *     a static element.
     * @param name name of elements of this type
     * @param rank rank of element (higher rank means more importance when autoplugging)
     * @param type GType of element to register
     * @return {@code true}, if the registering succeeded, {@code false} on error
     */
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, java.lang.String name, int rank, org.gtk.glib.Type type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_element_register.invokeExact(
                        (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        rank,
                        type.getValue().longValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets a string representing the given state change result.
     * @param stateRet a {@link StateChangeReturn} to get the name of.
     * @return a string with the name of the state
     *    result.
     */
    public static java.lang.String stateChangeReturnGetName(org.gstreamer.gst.StateChangeReturn stateRet) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_state_change_return_get_name.invokeExact(stateRet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link State} to get the name of.
     * @return a string with the name of the state.
     */
    public static java.lang.String stateGetName(org.gstreamer.gst.State state) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_state_get_name.invokeExact(state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Marks {@code type} as "documentation should be skipped".
     * Can be useful for dynamically registered element to be excluded from
     * plugin documentation system.
     * <p>
     * Example:
     * <pre>{@code c
     * GType my_type;
     * GTypeInfo my_type_info;
     * 
     * // Fill "my_type_info"
     * ...
     * 
     * my_type = g_type_register_static (GST_TYPE_MY_ELEMENT, "my-type-name",
     *    &my_type_info, 0);
     * gst_element_type_set_skip_documentation (my_type);
     * gst_element_register (plugin, "my-plugin-feature-name", rank, my_type);
     * }</pre>
     * @param type a {@link org.gtk.glib.Type} of element
     */
    public static void typeSetSkipDocumentation(org.gtk.glib.Type type) {
        try {
            DowncallHandles.gst_element_type_set_skip_documentation.invokeExact(type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NoMorePads} callback.
     */
    @FunctionalInterface
    public interface NoMorePads {
    
        /**
         * This signals that the element will not generate more dynamic pads.
         * Note that this signal will usually be emitted from the context of
         * the streaming thread.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceElement) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NoMorePads.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signals that the element will not generate more dynamic pads.
     * Note that this signal will usually be emitted from the context of
     * the streaming thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Element.NoMorePads> onNoMorePads(Element.NoMorePads handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("no-more-pads", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PadAdded} callback.
     */
    @FunctionalInterface
    public interface PadAdded {
    
        /**
         * a new {@link Pad} has been added to the element. Note that this signal will
         * usually be emitted from the context of the streaming thread. Also keep in
         * mind that if you add new elements to the pipeline in the signal handler
         * you will need to set them to the desired target state with
         * gst_element_set_state() or gst_element_sync_state_with_parent().
         */
        void run(org.gstreamer.gst.Pad newPad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceElement, MemoryAddress newPad) {
            run((org.gstreamer.gst.Pad) Interop.register(newPad, org.gstreamer.gst.Pad.fromAddress).marshal(newPad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * a new {@link Pad} has been added to the element. Note that this signal will
     * usually be emitted from the context of the streaming thread. Also keep in
     * mind that if you add new elements to the pipeline in the signal handler
     * you will need to set them to the desired target state with
     * gst_element_set_state() or gst_element_sync_state_with_parent().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Element.PadAdded> onPadAdded(Element.PadAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pad-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PadRemoved} callback.
     */
    @FunctionalInterface
    public interface PadRemoved {
    
        /**
         * a {@link Pad} has been removed from the element
         */
        void run(org.gstreamer.gst.Pad oldPad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceElement, MemoryAddress oldPad) {
            run((org.gstreamer.gst.Pad) Interop.register(oldPad, org.gstreamer.gst.Pad.fromAddress).marshal(oldPad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * a {@link Pad} has been removed from the element
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Element.PadRemoved> onPadRemoved(Element.PadRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pad-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Element.Builder} object constructs a {@link Element} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Element.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Element} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Element}.
         * @return A new instance of {@code Element} with the properties 
         *         that were set in the Builder object.
         */
        public Element build() {
            return (Element) org.gtk.gobject.GObject.newWithProperties(
                Element.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_element_abort_state = Interop.downcallHandle(
                "gst_element_abort_state",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_add_pad = Interop.downcallHandle(
                "gst_element_add_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_add_property_deep_notify_watch = Interop.downcallHandle(
                "gst_element_add_property_deep_notify_watch",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_add_property_notify_watch = Interop.downcallHandle(
                "gst_element_add_property_notify_watch",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_call_async = Interop.downcallHandle(
                "gst_element_call_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_change_state = Interop.downcallHandle(
                "gst_element_change_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_continue_state = Interop.downcallHandle(
                "gst_element_continue_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_create_all_pads = Interop.downcallHandle(
                "gst_element_create_all_pads",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_foreach_pad = Interop.downcallHandle(
                "gst_element_foreach_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_foreach_sink_pad = Interop.downcallHandle(
                "gst_element_foreach_sink_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_foreach_src_pad = Interop.downcallHandle(
                "gst_element_foreach_src_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_base_time = Interop.downcallHandle(
                "gst_element_get_base_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_bus = Interop.downcallHandle(
                "gst_element_get_bus",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_clock = Interop.downcallHandle(
                "gst_element_get_clock",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_compatible_pad = Interop.downcallHandle(
                "gst_element_get_compatible_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_compatible_pad_template = Interop.downcallHandle(
                "gst_element_get_compatible_pad_template",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_context = Interop.downcallHandle(
                "gst_element_get_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_context_unlocked = Interop.downcallHandle(
                "gst_element_get_context_unlocked",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_contexts = Interop.downcallHandle(
                "gst_element_get_contexts",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_current_clock_time = Interop.downcallHandle(
                "gst_element_get_current_clock_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_current_running_time = Interop.downcallHandle(
                "gst_element_get_current_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_factory = Interop.downcallHandle(
                "gst_element_get_factory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_metadata = Interop.downcallHandle(
                "gst_element_get_metadata",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_pad_template = Interop.downcallHandle(
                "gst_element_get_pad_template",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_pad_template_list = Interop.downcallHandle(
                "gst_element_get_pad_template_list",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_request_pad = Interop.downcallHandle(
                "gst_element_get_request_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_start_time = Interop.downcallHandle(
                "gst_element_get_start_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_state = Interop.downcallHandle(
                "gst_element_get_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_get_static_pad = Interop.downcallHandle(
                "gst_element_get_static_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_is_locked_state = Interop.downcallHandle(
                "gst_element_is_locked_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_iterate_pads = Interop.downcallHandle(
                "gst_element_iterate_pads",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_iterate_sink_pads = Interop.downcallHandle(
                "gst_element_iterate_sink_pads",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_iterate_src_pads = Interop.downcallHandle(
                "gst_element_iterate_src_pads",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_link = Interop.downcallHandle(
                "gst_element_link",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_link_filtered = Interop.downcallHandle(
                "gst_element_link_filtered",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_link_many = Interop.downcallHandle(
                "gst_element_link_many",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gst_element_link_pads = Interop.downcallHandle(
                "gst_element_link_pads",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_link_pads_filtered = Interop.downcallHandle(
                "gst_element_link_pads_filtered",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_link_pads_full = Interop.downcallHandle(
                "gst_element_link_pads_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_lost_state = Interop.downcallHandle(
                "gst_element_lost_state",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_message_full = Interop.downcallHandle(
                "gst_element_message_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_message_full_with_details = Interop.downcallHandle(
                "gst_element_message_full_with_details",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_no_more_pads = Interop.downcallHandle(
                "gst_element_no_more_pads",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_post_message = Interop.downcallHandle(
                "gst_element_post_message",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_provide_clock = Interop.downcallHandle(
                "gst_element_provide_clock",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_query = Interop.downcallHandle(
                "gst_element_query",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_query_convert = Interop.downcallHandle(
                "gst_element_query_convert",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_query_duration = Interop.downcallHandle(
                "gst_element_query_duration",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_query_position = Interop.downcallHandle(
                "gst_element_query_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_release_request_pad = Interop.downcallHandle(
                "gst_element_release_request_pad",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_remove_pad = Interop.downcallHandle(
                "gst_element_remove_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_remove_property_notify_watch = Interop.downcallHandle(
                "gst_element_remove_property_notify_watch",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_request_pad = Interop.downcallHandle(
                "gst_element_request_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_request_pad_simple = Interop.downcallHandle(
                "gst_element_request_pad_simple",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_seek = Interop.downcallHandle(
                "gst_element_seek",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_seek_simple = Interop.downcallHandle(
                "gst_element_seek_simple",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_send_event = Interop.downcallHandle(
                "gst_element_send_event",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_set_base_time = Interop.downcallHandle(
                "gst_element_set_base_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_set_bus = Interop.downcallHandle(
                "gst_element_set_bus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_set_clock = Interop.downcallHandle(
                "gst_element_set_clock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_set_context = Interop.downcallHandle(
                "gst_element_set_context",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_set_locked_state = Interop.downcallHandle(
                "gst_element_set_locked_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_set_start_time = Interop.downcallHandle(
                "gst_element_set_start_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_set_state = Interop.downcallHandle(
                "gst_element_set_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_sync_state_with_parent = Interop.downcallHandle(
                "gst_element_sync_state_with_parent",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_unlink = Interop.downcallHandle(
                "gst_element_unlink",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_unlink_many = Interop.downcallHandle(
                "gst_element_unlink_many",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gst_element_unlink_pads = Interop.downcallHandle(
                "gst_element_unlink_pads",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_get_type = Interop.downcallHandle(
                "gst_element_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_make_from_uri = Interop.downcallHandle(
                "gst_element_make_from_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_register = Interop.downcallHandle(
                "gst_element_register",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_state_change_return_get_name = Interop.downcallHandle(
                "gst_element_state_change_return_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_state_get_name = Interop.downcallHandle(
                "gst_element_state_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_element_type_set_skip_documentation = Interop.downcallHandle(
                "gst_element_type_set_skip_documentation",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_element_get_type != null;
    }
}
