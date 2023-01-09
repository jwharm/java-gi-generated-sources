package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Bin} is an element that can contain other {@link Element}, allowing them to be
 * managed as a group.
 * Pads from the child elements can be ghosted to the bin, see {@link GhostPad}.
 * This makes the bin look like any other elements and enables creation of
 * higher-level abstraction elements.
 * <p>
 * A new {@link Bin} is created with gst_bin_new(). Use a {@link Pipeline} instead if you
 * want to create a toplevel bin because a normal bin doesn't have a bus or
 * handle clock distribution of its own.
 * <p>
 * After the bin has been created you will typically add elements to it with
 * gst_bin_add(). You can remove elements with gst_bin_remove().
 * <p>
 * An element can be retrieved from a bin with gst_bin_get_by_name(), using the
 * elements name. gst_bin_get_by_name_recurse_up() is mainly used for internal
 * purposes and will query the parent bins when the element is not found in the
 * current bin.
 * <p>
 * An iterator of elements in a bin can be retrieved with
 * gst_bin_iterate_elements(). Various other iterators exist to retrieve the
 * elements in a bin.
 * <p>
 * gst_object_unref() is used to drop your reference to the bin.
 * <p>
 * The {@link Bin}::element-added signal is fired whenever a new element is added to
 * the bin. Likewise the {@link Bin}::element-removed signal is fired whenever an
 * element is removed from the bin.
 * <p>
 * A {@link Bin} internally intercepts every {@link Message} posted by its children and
 * implements the following default behaviour for each of them:
 * <p>
 * * {@link MessageType#EOS}: This message is only posted by sinks in the PLAYING
 * state. If all sinks posted the EOS message, this bin will post and EOS
 * message upwards.
 * <p>
 * * {@link MessageType#SEGMENT_START}: Just collected and never forwarded upwards.
 *   The messages are used to decide when all elements have completed playback
 *   of their segment.
 * <p>
 * * {@link MessageType#SEGMENT_DONE}: Is posted by {@link Bin} when all elements that posted
 *   a SEGMENT_START have posted a SEGMENT_DONE.
 * <p>
 * * {@link MessageType#DURATION_CHANGED}: Is posted by an element that detected a change
 *   in the stream duration. The duration change is posted to the
 *   application so that it can refetch the new duration with a duration
 *   query.
 * <p>
 *   Note that these messages can be posted before the bin is prerolled, in which
 *   case the duration query might fail.
 * <p>
 *   Note also that there might be a discrepancy (due to internal buffering/queueing)
 *   between the stream being currently displayed and the returned duration query.
 * <p>
 *   Applications might want to also query for duration (and changes) by
 *   listening to the {@link MessageType#STREAM_START} message, signaling the active start
 *   of a (new) stream.
 * <p>
 * * {@link MessageType#CLOCK_LOST}: This message is posted by an element when it
 *   can no longer provide a clock.
 * <p>
 *   The default bin behaviour is to check if the lost clock was the one provided
 *   by the bin. If so and the bin is currently in the PLAYING state, the message
 *   is forwarded to the bin parent.
 * <p>
 *   This message is also generated when a clock provider is removed from
 *   the bin. If this message is received by the application, it should
 *   PAUSE the pipeline and set it back to PLAYING to force a new clock
 *   distribution.
 * <p>
 * * {@link MessageType#CLOCK_PROVIDE}: This message is generated when an element
 *   can provide a clock. This mostly happens when a new clock
 *   provider is added to the bin.
 * <p>
 *   The default behaviour of the bin is to mark the currently selected clock as
 *   dirty, which will perform a clock recalculation the next time the bin is
 *   asked to provide a clock.
 * <p>
 *   This message is never sent to the application but is forwarded to
 *   the parent of the bin.
 * <p>
 * * OTHERS: posted upwards.
 * <p>
 * A {@link Bin} implements the following default behaviour for answering to a
 * {@link Query}:
 * <p>
 * * {@link QueryType#DURATION}: The bin will forward the query to all sink
 *   elements contained within and will return the maximum value.
 *   If no sinks are available in the bin, the query fails.
 * <p>
 * * {@link QueryType#POSITION}: The query is sent to all sink elements in the bin and the
 *   MAXIMUM of all values is returned. If no sinks are available in the bin,
 *   the query fails.
 * <p>
 * * OTHERS: the query is forwarded to all sink elements, the result
 *   of the first sink that answers the query successfully is returned. If no
 *   sink is in the bin, the query fails.
 * <p>
 * A {@link Bin} will by default forward any event sent to it to all sink
 * ( {@link EventTypeFlags#DOWNSTREAM} ) or source ( {@link EventTypeFlags#UPSTREAM} ) elements
 * depending on the event type.
 * <p>
 * If all the elements return {@code true}, the bin will also return {@code true}, else {@code false}
 * is returned. If no elements of the required type are in the bin, the event
 * handler will return {@code true}.
 */
public class Bin extends org.gstreamer.gst.Element implements org.gstreamer.gst.ChildProxy {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBin";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.C_INT.withName("numchildren"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("children"),
            Interop.valueLayout.C_INT.withName("children_cookie"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("child_bus"),
            Interop.valueLayout.ADDRESS.withName("messages"),
            Interop.valueLayout.C_INT.withName("polling"),
            Interop.valueLayout.C_INT.withName("state_dirty"),
            Interop.valueLayout.C_INT.withName("clock_dirty"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("provided_clock"),
            Interop.valueLayout.ADDRESS.withName("clock_provider"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Bin proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Bin(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Bin> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Bin(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_bin_new.invokeExact((Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new bin with the given name.
     * @param name the name of the new bin
     */
    public Bin(@Nullable java.lang.String name) {
        super(constructNew(name));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds the given element to the bin.  Sets the element's parent, and thus
     * takes ownership of the element. An element can only be added to one bin.
     * <p>
     * If the element's pads are linked to other pads, the pads will be unlinked
     * before the element is added to the bin.
     * <p>
     * <blockquote>
     *  When you add an element to an already-running pipeline, you will have to
     *  take care to set the state of the newly-added element to the desired
     *  state (usually PLAYING or PAUSED, same you set the pipeline to originally)
     *  with gst_element_set_state(), or use gst_element_sync_state_with_parent().
     *  The bin or pipeline will not take care of this for you.
     * </blockquote>
     * @param element the {@link Element} to add
     * @return {@code true} if the element could be added, {@code false} if
     * the bin does not want to accept the element.
     */
    public boolean add(org.gstreamer.gst.Element element) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bin_add.invokeExact(
                    handle(),
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds a {@code null}-terminated list of elements to a bin.  This function is
     * equivalent to calling gst_bin_add() for each member of the list. The return
     * value of each gst_bin_add() is ignored.
     * @param element1 the {@link Element} element to add to the bin
     * @param varargs additional elements to add to the bin
     */
    public void addMany(org.gstreamer.gst.Element element1, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_bin_add_many.invokeExact(
                    handle(),
                    element1.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Recursively looks for elements with an unlinked pad of the given
     * direction within the specified bin and returns an unlinked pad
     * if one is found, or {@code null} otherwise. If a pad is found, the caller
     * owns a reference to it and should use gst_object_unref() on the
     * pad when it is not needed any longer.
     * @param direction whether to look for an unlinked source or sink pad
     * @return unlinked pad of the given
     * direction.
     */
    public @Nullable org.gstreamer.gst.Pad findUnlinkedPad(org.gstreamer.gst.PadDirection direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_find_unlinked_pad.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Pad) Interop.register(RESULT, org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Looks for an element inside the bin that implements the given
     * interface. If such an element is found, it returns the element.
     * You can cast this element to the given interface afterwards.  If you want
     * all elements that implement the interface, use
     * gst_bin_iterate_all_by_interface(). This function recurses into child bins.
     * @param iface the {@link org.gtk.glib.Type} of an interface
     * @return A {@link Element} inside the bin
     * implementing the interface
     */
    public @Nullable org.gstreamer.gst.Element getByInterface(org.gtk.glib.Type iface) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_get_by_interface.invokeExact(
                    handle(),
                    iface.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the element with the given name from a bin. This
     * function recurses into child bins.
     * @param name the element name to search for
     * @return the {@link Element} with the given
     * name
     */
    public @Nullable org.gstreamer.gst.Element getByName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_bin_get_by_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the element with the given name from this bin. If the
     * element is not found, a recursion is performed on the parent bin.
     * @param name the element name to search for
     * @return the {@link Element} with the given
     * name
     */
    public @Nullable org.gstreamer.gst.Element getByNameRecurseUp(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_bin_get_by_name_recurse_up.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Element) Interop.register(RESULT, org.gstreamer.gst.Element.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public org.gstreamer.gst.ElementFlags getSuppressedFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bin_get_suppressed_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ElementFlags(RESULT);
    }
    
    /**
     * Looks for all elements inside the bin with the given element factory name.
     * The function recurses inside child bins. The iterator will yield a series of
     * {@link Element}.
     * @param factoryName the name of the {@link ElementFactory}
     * @return a {@link Iterator} of {@link Element}
     *     for all elements in the bin with the given element factory name
     */
    public @Nullable org.gstreamer.gst.Iterator iterateAllByElementFactoryName(java.lang.String factoryName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_all_by_element_factory_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(factoryName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Looks for all elements inside the bin that implements the given
     * interface. You can safely cast all returned elements to the given interface.
     * The function recurses inside child bins. The iterator will yield a series
     * of {@link Element}.
     * @param iface the {@link org.gtk.glib.Type} of an interface
     * @return a {@link Iterator} of {@link Element}
     *     for all elements in the bin implementing the given interface
     */
    public @Nullable org.gstreamer.gst.Iterator iterateAllByInterface(org.gtk.glib.Type iface) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_all_by_interface.invokeExact(
                    handle(),
                    iface.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets an iterator for the elements in this bin.
     * @return a {@link Iterator} of {@link Element}
     */
    public @Nullable org.gstreamer.gst.Iterator iterateElements() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_elements.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets an iterator for the elements in this bin.
     * This iterator recurses into GstBin children.
     * @return a {@link Iterator} of {@link Element}
     */
    public @Nullable org.gstreamer.gst.Iterator iterateRecurse() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_recurse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets an iterator for all elements in the bin that have the
     * {@code GST_ELEMENT_FLAG_SINK} flag set.
     * @return a {@link Iterator} of {@link Element}
     */
    public @Nullable org.gstreamer.gst.Iterator iterateSinks() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_sinks.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets an iterator for the elements in this bin in topologically
     * sorted order. This means that the elements are returned from
     * the most downstream elements (sinks) to the sources.
     * <p>
     * This function is used internally to perform the state changes
     * of the bin elements and for clock selection.
     * @return a {@link Iterator} of {@link Element}
     */
    public @Nullable org.gstreamer.gst.Iterator iterateSorted() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_sorted.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets an iterator for all elements in the bin that have the
     * {@code GST_ELEMENT_FLAG_SOURCE} flag set.
     * @return a {@link Iterator} of {@link Element}
     */
    public @Nullable org.gstreamer.gst.Iterator iterateSources() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bin_iterate_sources.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Queries {@code bin} for the current latency and reconfigures this latency on all the
     * elements using a LATENCY event.
     * <p>
     * This method is typically called on the pipeline when a {@code GST_MESSAGE_LATENCY}
     * is posted on the bus.
     * <p>
     * This function simply emits the {@link Bin}::do-latency signal so any custom latency
     * calculations will be performed.
     * @return {@code true} if the latency could be queried and reconfigured.
     */
    public boolean recalculateLatency() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bin_recalculate_latency.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes the element from the bin, unparenting it as well.
     * Unparenting the element means that the element will be dereferenced,
     * so if the bin holds the only reference to the element, the element
     * will be freed in the process of removing it from the bin.  If you
     * want the element to still exist after removing, you need to call
     * gst_object_ref() before removing it from the bin.
     * <p>
     * If the element's pads are linked to other pads, the pads will be unlinked
     * before the element is removed from the bin.
     * @param element the {@link Element} to remove
     * @return {@code true} if the element could be removed, {@code false} if
     * the bin does not want to remove the element.
     */
    public boolean remove(org.gstreamer.gst.Element element) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bin_remove.invokeExact(
                    handle(),
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a list of elements from a bin. This function is equivalent
     * to calling gst_bin_remove() with each member of the list.
     * @param element1 the first {@link Element} to remove from the bin
     * @param varargs {@code null}-terminated list of elements to remove from the bin
     */
    public void removeMany(org.gstreamer.gst.Element element1, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_bin_remove_many.invokeExact(
                    handle(),
                    element1.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Suppresses the given flags on the bin. {@link ElementFlags} of a
     * child element are propagated when it is added to the bin.
     * When suppressed flags are set, those specified flags will
     * not be propagated to the bin.
     * @param flags the {@link ElementFlags} to suppress
     */
    public void setSuppressedFlags(org.gstreamer.gst.ElementFlags flags) {
        try {
            DowncallHandles.gst_bin_set_suppressed_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Synchronizes the state of every child of {@code bin} with the state
     * of {@code bin}. See also gst_element_sync_state_with_parent().
     * @return {@code true} if syncing the state was successful for all children,
     *  otherwise {@code false}.
     */
    public boolean syncChildrenStates() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bin_sync_children_states.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_bin_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code DeepElementAdded} callback.
     */
    @FunctionalInterface
    public interface DeepElementAdded {
    
        /**
         * Will be emitted after the element was added to {@code sub_bin}.
         */
        void run(org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceBin, MemoryAddress subBin, MemoryAddress element) {
            run((org.gstreamer.gst.Bin) Interop.register(subBin, org.gstreamer.gst.Bin.fromAddress).marshal(subBin, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeepElementAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted after the element was added to {@code sub_bin}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bin.DeepElementAdded> onDeepElementAdded(Bin.DeepElementAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("deep-element-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeepElementRemoved} callback.
     */
    @FunctionalInterface
    public interface DeepElementRemoved {
    
        /**
         * Will be emitted after the element was removed from {@code sub_bin}.
         */
        void run(org.gstreamer.gst.Bin subBin, org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceBin, MemoryAddress subBin, MemoryAddress element) {
            run((org.gstreamer.gst.Bin) Interop.register(subBin, org.gstreamer.gst.Bin.fromAddress).marshal(subBin, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeepElementRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted after the element was removed from {@code sub_bin}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bin.DeepElementRemoved> onDeepElementRemoved(Bin.DeepElementRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("deep-element-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoLatency} callback.
     */
    @FunctionalInterface
    public interface DoLatency {
    
        /**
         * Will be emitted when the bin needs to perform latency calculations. This
         * signal is only emitted for toplevel bins or when {@link Bin}:async-handling is
         * enabled.
         * <p>
         * Only one signal handler is invoked. If no signals are connected, the
         * default handler is invoked, which will query and distribute the lowest
         * possible latency to all sinks.
         * <p>
         * Connect to this signal if the default latency calculations are not
         * sufficient, like when you need different latencies for different sinks in
         * the same pipeline.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceBin) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoLatency.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted when the bin needs to perform latency calculations. This
     * signal is only emitted for toplevel bins or when {@link Bin}:async-handling is
     * enabled.
     * <p>
     * Only one signal handler is invoked. If no signals are connected, the
     * default handler is invoked, which will query and distribute the lowest
     * possible latency to all sinks.
     * <p>
     * Connect to this signal if the default latency calculations are not
     * sufficient, like when you need different latencies for different sinks in
     * the same pipeline.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bin.DoLatency> onDoLatency(Bin.DoLatency handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("do-latency", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ElementAdded} callback.
     */
    @FunctionalInterface
    public interface ElementAdded {
    
        /**
         * Will be emitted after the element was added to the bin.
         */
        void run(org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceBin, MemoryAddress element) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted after the element was added to the bin.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bin.ElementAdded> onElementAdded(Bin.ElementAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("element-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ElementRemoved} callback.
     */
    @FunctionalInterface
    public interface ElementRemoved {
    
        /**
         * Will be emitted after the element was removed from the bin.
         */
        void run(org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceBin, MemoryAddress element) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted after the element was removed from the bin.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Bin.ElementRemoved> onElementRemoved(Bin.ElementRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("element-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Bin.Builder} object constructs a {@link Bin} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Bin.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Bin} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Bin}.
         * @return A new instance of {@code Bin} with the properties 
         *         that were set in the Builder object.
         */
        public Bin build() {
            return (Bin) org.gtk.gobject.GObject.newWithProperties(
                Bin.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If set to {@code true}, the bin will handle asynchronous state changes.
         * This should be used only if the bin subclass is modifying the state
         * of its children on its own.
         * @param asyncHandling The value for the {@code async-handling} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAsyncHandling(boolean asyncHandling) {
            names.add("async-handling");
            values.add(org.gtk.gobject.Value.create(asyncHandling));
            return this;
        }
        
        /**
         * Forward all children messages, even those that would normally be filtered by
         * the bin. This can be interesting when one wants to be notified of the EOS
         * state of individual elements, for example.
         * <p>
         * The messages are converted to an ELEMENT message with the bin as the
         * source. The structure of the message is named {@code GstBinForwarded} and contains
         * a field named {@code message} that contains the original forwarded {@link Message}.
         * @param messageForward The value for the {@code message-forward} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessageForward(boolean messageForward) {
            names.add("message-forward");
            values.add(org.gtk.gobject.Value.create(messageForward));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_bin_new = Interop.downcallHandle(
                "gst_bin_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_add = Interop.downcallHandle(
                "gst_bin_add",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_add_many = Interop.downcallHandle(
                "gst_bin_add_many",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gst_bin_find_unlinked_pad = Interop.downcallHandle(
                "gst_bin_find_unlinked_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_bin_get_by_interface = Interop.downcallHandle(
                "gst_bin_get_by_interface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_bin_get_by_name = Interop.downcallHandle(
                "gst_bin_get_by_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_get_by_name_recurse_up = Interop.downcallHandle(
                "gst_bin_get_by_name_recurse_up",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_get_suppressed_flags = Interop.downcallHandle(
                "gst_bin_get_suppressed_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_all_by_element_factory_name = Interop.downcallHandle(
                "gst_bin_iterate_all_by_element_factory_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_all_by_interface = Interop.downcallHandle(
                "gst_bin_iterate_all_by_interface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_elements = Interop.downcallHandle(
                "gst_bin_iterate_elements",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_recurse = Interop.downcallHandle(
                "gst_bin_iterate_recurse",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_sinks = Interop.downcallHandle(
                "gst_bin_iterate_sinks",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_sorted = Interop.downcallHandle(
                "gst_bin_iterate_sorted",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_iterate_sources = Interop.downcallHandle(
                "gst_bin_iterate_sources",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_recalculate_latency = Interop.downcallHandle(
                "gst_bin_recalculate_latency",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_remove = Interop.downcallHandle(
                "gst_bin_remove",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_remove_many = Interop.downcallHandle(
                "gst_bin_remove_many",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gst_bin_set_suppressed_flags = Interop.downcallHandle(
                "gst_bin_set_suppressed_flags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_bin_sync_children_states = Interop.downcallHandle(
                "gst_bin_sync_children_states",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_bin_get_type = Interop.downcallHandle(
                "gst_bin_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_bin_get_type != null;
    }
}
