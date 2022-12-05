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
public class Element extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstElement";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Element proxy instance for the provided memory address.
     * <p>
     * Because Element is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Element(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Element if its GType is a (or inherits from) "GstElement".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Element} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstElement", a ClassCastException will be thrown.
     */
    public static Element castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Element.getType())) {
            return new Element(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstElement");
        }
    }
    
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
            DowncallHandles.gst_element_abort_state.invokeExact(
                    handle());
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
    public boolean addPad(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_add_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public long addPropertyDeepNotifyWatch(@Nullable java.lang.String propertyName, boolean includeValue) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_add_property_deep_notify_watch.invokeExact(
                    handle(),
                    (Addressable) (propertyName == null ? MemoryAddress.NULL : Interop.allocateNativeString(propertyName)),
                    includeValue ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public long addPropertyNotifyWatch(@Nullable java.lang.String propertyName, boolean includeValue) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_add_property_notify_watch.invokeExact(
                    handle(),
                    (Addressable) (propertyName == null ? MemoryAddress.NULL : Interop.allocateNativeString(propertyName)),
                    includeValue ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     */
    public void callAsync(@NotNull org.gstreamer.gst.ElementCallAsyncFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gst_element_call_async.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbElementCallAsyncFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
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
    public @NotNull org.gstreamer.gst.StateChangeReturn changeState(@NotNull org.gstreamer.gst.StateChange transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
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
    public @NotNull org.gstreamer.gst.StateChangeReturn continueState(@NotNull org.gstreamer.gst.StateChangeReturn ret) {
        java.util.Objects.requireNonNull(ret, "Parameter 'ret' must not be null");
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
            DowncallHandles.gst_element_create_all_pads.invokeExact(
                    handle());
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
    public boolean foreachPad(@NotNull org.gstreamer.gst.ElementForeachPadFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_pad.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbElementForeachPadFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean foreachSinkPad(@NotNull org.gstreamer.gst.ElementForeachPadFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_sink_pad.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbElementForeachPadFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean foreachSrcPad(@NotNull org.gstreamer.gst.ElementForeachPadFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_foreach_src_pad.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbElementForeachPadFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull org.gstreamer.gst.ClockTime getBaseTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_base_time.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_bus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Bus(RESULT, Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_clock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Clock(RESULT, Ownership.FULL);
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
    public @Nullable org.gstreamer.gst.Pad getCompatiblePad(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_compatible_pad.invokeExact(
                    handle(),
                    pad.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves a pad template from {@code element} that is compatible with {@code compattempl}.
     * Pads from compatible templates can be linked together.
     * @param compattempl the {@link PadTemplate} to find a compatible
     *     template for
     * @return a compatible {@link PadTemplate},
     *   or {@code null} if none was found. No unreferencing is necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getCompatiblePadTemplate(@NotNull org.gstreamer.gst.PadTemplate compattempl) {
        java.util.Objects.requireNonNull(compattempl, "Parameter 'compattempl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_compatible_pad_template.invokeExact(
                    handle(),
                    compattempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.PadTemplate(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the context with {@code context_type} set on the element or NULL.
     * <p>
     * MT safe.
     * @param contextType a name of a context to retrieve
     * @return A {@link Context} or NULL
     */
    public @Nullable org.gstreamer.gst.Context getContext(@NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_context.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Context(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the context with {@code context_type} set on the element or NULL.
     * @param contextType a name of a context to retrieve
     * @return A {@link Context} or NULL
     */
    public @Nullable org.gstreamer.gst.Context getContextUnlocked(@NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_context_unlocked.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Context(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the contexts set on the element.
     * <p>
     * MT safe.
     * @return List of {@link Context}
     */
    public @NotNull org.gtk.glib.List getContexts() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_contexts.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the current clock time of the element, as in, the time of the
     * element's clock, or GST_CLOCK_TIME_NONE if there is no clock.
     * @return the clock time of the element, or GST_CLOCK_TIME_NONE if there is
     * no clock.
     */
    public @NotNull org.gstreamer.gst.ClockTime getCurrentClockTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_current_clock_time.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.gst.ClockTime getCurrentRunningTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_current_running_time.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ElementFactory(RESULT, Ownership.NONE);
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public @NotNull java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves a padtemplate from {@code element} with the given name.
     * @param name the name of the {@link PadTemplate} to get.
     * @return the {@link PadTemplate} with the
     *     given name, or {@code null} if none was found. No unreferencing is
     *     necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getPadTemplate(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_pad_template.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.PadTemplate(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a list of the pad templates associated with {@code element}. The
     * list must not be modified by the calling code.
     * @return the {@link org.gtk.glib.List} of
     *     pad templates.
     */
    public @NotNull org.gtk.glib.List getPadTemplateList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_pad_template_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
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
    public @Nullable org.gstreamer.gst.Pad getRequestPad(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_request_pad.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
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
    public @NotNull org.gstreamer.gst.ClockTime getStartTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_get_start_time.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.gst.StateChangeReturn getState(@NotNull Out<org.gstreamer.gst.State> state, @NotNull Out<org.gstreamer.gst.State> pending, @NotNull org.gstreamer.gst.ClockTime timeout) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemorySegment statePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(pending, "Parameter 'pending' must not be null");
        MemorySegment pendingPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(timeout, "Parameter 'timeout' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_get_state.invokeExact(
                    handle(),
                    (Addressable) statePOINTER.address(),
                    (Addressable) pendingPOINTER.address(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        state.set(org.gstreamer.gst.State.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
        pending.set(org.gstreamer.gst.State.of(pendingPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return org.gstreamer.gst.StateChangeReturn.of(RESULT);
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
    public @Nullable org.gstreamer.gst.Pad getStaticPad(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_get_static_pad.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.gst_element_is_locked_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull org.gstreamer.gst.Iterator iteratePads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_pads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Iterator(RESULT, Ownership.FULL);
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
    public @NotNull org.gstreamer.gst.Iterator iterateSinkPads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_sink_pads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Iterator(RESULT, Ownership.FULL);
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
    public @NotNull org.gstreamer.gst.Iterator iterateSrcPads() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_iterate_src_pads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Iterator(RESULT, Ownership.FULL);
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
    public boolean link(@NotNull org.gstreamer.gst.Element dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link.invokeExact(
                    handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean linkFiltered(@NotNull org.gstreamer.gst.Element dest, @Nullable org.gstreamer.gst.Caps filter) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_filtered.invokeExact(
                    handle(),
                    dest.handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Chain together a series of elements. Uses gst_element_link().
     * Make sure you have added your elements to a bin or pipeline with
     * gst_bin_add() before trying to link them.
     * @param element2 the second {@link Element} in the link chain.
     * @param varargs the {@code null}-terminated list of elements to link in order.
     * @return {@code true} on success, {@code false} otherwise.
     */
    public boolean linkMany(@NotNull org.gstreamer.gst.Element element2, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(element2, "Parameter 'element2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_many.invokeExact(
                    handle(),
                    element2.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean linkPads(@Nullable java.lang.String srcpadname, @NotNull org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_pads.invokeExact(
                    handle(),
                    (Addressable) (srcpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(srcpadname)),
                    dest.handle(),
                    (Addressable) (destpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(destpadname)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean linkPadsFiltered(@Nullable java.lang.String srcpadname, @NotNull org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname, @Nullable org.gstreamer.gst.Caps filter) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_pads_filtered.invokeExact(
                    handle(),
                    (Addressable) (srcpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(srcpadname)),
                    dest.handle(),
                    (Addressable) (destpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(destpadname)),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean linkPadsFull(@Nullable java.lang.String srcpadname, @NotNull org.gstreamer.gst.Element dest, @Nullable java.lang.String destpadname, @NotNull org.gstreamer.gst.PadLinkCheck flags) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_link_pads_full.invokeExact(
                    handle(),
                    (Addressable) (srcpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(srcpadname)),
                    dest.handle(),
                    (Addressable) (destpadname == null ? MemoryAddress.NULL : Interop.allocateNativeString(destpadname)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            DowncallHandles.gst_element_lost_state.invokeExact(
                    handle());
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
    public void messageFull(@NotNull org.gstreamer.gst.MessageType type, @NotNull org.gtk.glib.Quark domain, int code, @Nullable java.lang.String text, @Nullable java.lang.String debug, @NotNull java.lang.String file, @NotNull java.lang.String function, int line) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(function, "Parameter 'function' must not be null");
        try {
            DowncallHandles.gst_element_message_full.invokeExact(
                    handle(),
                    type.getValue(),
                    domain.getValue().intValue(),
                    code,
                    (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)),
                    (Addressable) (debug == null ? MemoryAddress.NULL : Interop.allocateNativeString(debug)),
                    Interop.allocateNativeString(file),
                    Interop.allocateNativeString(function),
                    line);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void messageFullWithDetails(@NotNull org.gstreamer.gst.MessageType type, @NotNull org.gtk.glib.Quark domain, int code, @Nullable java.lang.String text, @Nullable java.lang.String debug, @NotNull java.lang.String file, @NotNull java.lang.String function, int line, @NotNull org.gstreamer.gst.Structure structure) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(function, "Parameter 'function' must not be null");
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        try {
            DowncallHandles.gst_element_message_full_with_details.invokeExact(
                    handle(),
                    type.getValue(),
                    domain.getValue().intValue(),
                    code,
                    (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)),
                    (Addressable) (debug == null ? MemoryAddress.NULL : Interop.allocateNativeString(debug)),
                    Interop.allocateNativeString(file),
                    Interop.allocateNativeString(function),
                    line,
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
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
            DowncallHandles.gst_element_no_more_pads.invokeExact(
                    handle());
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
    public boolean postMessage(@NotNull org.gstreamer.gst.Message message) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_post_message.invokeExact(
                    handle(),
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        message.yieldOwnership();
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gst_element_provide_clock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Clock(RESULT, Ownership.FULL);
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
    public boolean query(@NotNull org.gstreamer.gst.Query query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_query.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queries an element to convert {@code src_val} in {@code src_format} to {@code dest_format}.
     * @param srcFormat a {@link Format} to convert from.
     * @param srcVal a value to convert.
     * @param destFormat the {@link Format} to convert to.
     * @param destVal a pointer to the result.
     * @return {@code true} if the query could be performed.
     */
    public boolean queryConvert(@NotNull org.gstreamer.gst.Format srcFormat, long srcVal, @NotNull org.gstreamer.gst.Format destFormat, Out<Long> destVal) {
        java.util.Objects.requireNonNull(srcFormat, "Parameter 'srcFormat' must not be null");
        java.util.Objects.requireNonNull(destFormat, "Parameter 'destFormat' must not be null");
        java.util.Objects.requireNonNull(destVal, "Parameter 'destVal' must not be null");
        MemorySegment destValPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
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
        return RESULT != 0;
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
    public boolean queryDuration(@NotNull org.gstreamer.gst.Format format, Out<Long> duration) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_query_duration.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) durationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
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
    public boolean queryPosition(@NotNull org.gstreamer.gst.Format format, Out<Long> cur) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(cur, "Parameter 'cur' must not be null");
        MemorySegment curPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_query_position.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) curPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        cur.set(curPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
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
    public void releaseRequestPad(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
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
    public boolean removePad(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_remove_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @Nullable org.gstreamer.gst.Pad requestPad(@NotNull org.gstreamer.gst.PadTemplate templ, @Nullable java.lang.String name, @Nullable org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(templ, "Parameter 'templ' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_request_pad.invokeExact(
                    handle(),
                    templ.handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
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
    public @Nullable org.gstreamer.gst.Pad requestPadSimple(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_request_pad_simple.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
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
    public boolean seek(double rate, @NotNull org.gstreamer.gst.Format format, @NotNull org.gstreamer.gst.SeekFlags flags, @NotNull org.gstreamer.gst.SeekType startType, long start, @NotNull org.gstreamer.gst.SeekType stopType, long stop) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(startType, "Parameter 'startType' must not be null");
        java.util.Objects.requireNonNull(stopType, "Parameter 'stopType' must not be null");
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
        return RESULT != 0;
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
    public boolean seekSimple(@NotNull org.gstreamer.gst.Format format, @NotNull org.gstreamer.gst.SeekFlags seekFlags, long seekPos) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(seekFlags, "Parameter 'seekFlags' must not be null");
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
        return RESULT != 0;
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
    public boolean sendEvent(@NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_send_event.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Set the base time of an element. See gst_element_get_base_time().
     * <p>
     * MT safe.
     * @param time the base time to set.
     */
    public void setBaseTime(@NotNull org.gstreamer.gst.ClockTime time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Sets the context of the element. Increases the refcount of the context.
     * <p>
     * MT safe.
     * @param context the {@link Context} to set.
     */
    public void setContext(@NotNull org.gstreamer.gst.Context context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
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
                    lockedState ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void setStartTime(@NotNull org.gstreamer.gst.ClockTime time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
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
    public @NotNull org.gstreamer.gst.StateChangeReturn setState(@NotNull org.gstreamer.gst.State state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
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
            RESULT = (int) DowncallHandles.gst_element_sync_state_with_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Unlinks all source pads of the source element with all sink pads
     * of the sink element to which they are linked.
     * <p>
     * If the link has been made using gst_element_link(), it could have created an
     * requestpad, which has to be released using gst_element_release_request_pad().
     * @param dest the sink {@link Element} to unlink.
     */
    public void unlink(@NotNull org.gstreamer.gst.Element dest) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
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
    public void unlinkMany(@NotNull org.gstreamer.gst.Element element2, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(element2, "Parameter 'element2' must not be null");
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
    public void unlinkPads(@NotNull java.lang.String srcpadname, @NotNull org.gstreamer.gst.Element dest, @NotNull java.lang.String destpadname) {
        java.util.Objects.requireNonNull(srcpadname, "Parameter 'srcpadname' must not be null");
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(destpadname, "Parameter 'destpadname' must not be null");
        try {
            DowncallHandles.gst_element_unlink_pads.invokeExact(
                    handle(),
                    Interop.allocateNativeString(srcpadname),
                    dest.handle(),
                    Interop.allocateNativeString(destpadname));
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
    public static @NotNull org.gstreamer.gst.Element makeFromUri(@NotNull org.gstreamer.gst.URIType type, @NotNull java.lang.String uri, @Nullable java.lang.String elementname) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_make_from_uri.invokeExact(
                    type.getValue(),
                    Interop.allocateNativeString(uri),
                    (Addressable) (elementname == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementname)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
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
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, @NotNull java.lang.String name, int rank, @NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_register.invokeExact(
                    (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                    Interop.allocateNativeString(name),
                    rank,
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a string representing the given state change result.
     * @param stateRet a {@link StateChangeReturn} to get the name of.
     * @return a string with the name of the state
     *    result.
     */
    public static @NotNull java.lang.String stateChangeReturnGetName(@NotNull org.gstreamer.gst.StateChangeReturn stateRet) {
        java.util.Objects.requireNonNull(stateRet, "Parameter 'stateRet' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_state_change_return_get_name.invokeExact(
                    stateRet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link State} to get the name of.
     * @return a string with the name of the state.
     */
    public static @NotNull java.lang.String stateGetName(@NotNull org.gstreamer.gst.State state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_state_get_name.invokeExact(
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
     * @param type a {@link org.gtk.gobject.Type} of element
     */
    public static void typeSetSkipDocumentation(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gst_element_type_set_skip_documentation.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NoMorePads {
        void signalReceived(Element sourceElement);
    }
    
    /**
     * This signals that the element will not generate more dynamic pads.
     * Note that this signal will usually be emitted from the context of
     * the streaming thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Element.NoMorePads> onNoMorePads(Element.NoMorePads handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("no-more-pads"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Element.Callbacks.class, "signalElementNoMorePads",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Element.NoMorePads>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PadAdded {
        void signalReceived(Element sourceElement, @NotNull org.gstreamer.gst.Pad newPad);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pad-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Element.Callbacks.class, "signalElementPadAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Element.PadAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PadRemoved {
        void signalReceived(Element sourceElement, @NotNull org.gstreamer.gst.Pad oldPad);
    }
    
    /**
     * a {@link Pad} has been removed from the element
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Element.PadRemoved> onPadRemoved(Element.PadRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pad-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Element.Callbacks.class, "signalElementPadRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Element.PadRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link Element.Build} object constructs a {@link Element} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Element} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Element} using {@link Element#castFrom}.
         * @return A new instance of {@code Element} with the properties 
         *         that were set in the Build object.
         */
        public Element construct() {
            return Element.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Element.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalElementNoMorePads(MemoryAddress sourceElement, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Element.NoMorePads) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Element(sourceElement, Ownership.NONE));
        }
        
        public static void signalElementPadAdded(MemoryAddress sourceElement, MemoryAddress newPad, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Element.PadAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Element(sourceElement, Ownership.NONE), new org.gstreamer.gst.Pad(newPad, Ownership.NONE));
        }
        
        public static void signalElementPadRemoved(MemoryAddress sourceElement, MemoryAddress oldPad, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Element.PadRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Element(sourceElement, Ownership.NONE), new org.gstreamer.gst.Pad(oldPad, Ownership.NONE));
        }
    }
}
