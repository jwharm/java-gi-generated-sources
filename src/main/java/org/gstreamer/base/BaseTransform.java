package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for filter elements that process data. Elements
 * that are suitable for implementation using {@link BaseTransform} are ones
 * where the size and caps of the output is known entirely from the input
 * caps and buffer sizes. These include elements that directly transform
 * one buffer into another, modify the contents of a buffer in-place, as
 * well as elements that collate multiple input buffers into one output buffer,
 * or that expand one input buffer into multiple output buffers. See below
 * for more concrete use cases.
 * <p>
 * It provides for:
 * <p>
 * * one sinkpad and one srcpad
 * * Possible formats on sink and source pad implemented
 *   with custom transform_caps function. By default uses
 *   same format on sink and source.
 * <p>
 * * Handles state changes
 * * Does flushing
 * * Push mode
 * * Pull mode if the sub-class transform can operate on arbitrary data
 * <p>
 * <strong>Use Cases</strong><br/>
 * <strong>Passthrough mode</strong><br/>
 *   * Element has no interest in modifying the buffer. It may want to inspect it,
 *     in which case the element should have a transform_ip function. If there
 *     is no transform_ip function in passthrough mode, the buffer is pushed
 *     intact.
 * <p>
 *   * The {@link BaseTransformClass}.passthrough_on_same_caps variable
 *     will automatically set/unset passthrough based on whether the
 *     element negotiates the same caps on both pads.
 * <p>
 *   * {@link BaseTransformClass}.passthrough_on_same_caps on an element that
 *     doesn't implement a transform_caps function is useful for elements that
 *     only inspect data (such as level)
 * <p>
 *   * Example elements
 * <p>
 *     * Level
 *     * Videoscale, audioconvert, videoconvert, audioresample in certain modes.
 * <p>
 * <strong>Modifications in-place - input buffer and output buffer are the same thing.</strong><br/>
 * * The element must implement a transform_ip function.
 * * Output buffer size must &lt;= input buffer size
 * * If the always_in_place flag is set, non-writable buffers will be copied
 *   and passed to the transform_ip function, otherwise a new buffer will be
 *   created and the transform function called.
 * <p>
 * * Incoming writable buffers will be passed to the transform_ip function
 *   immediately.
 * * only implementing transform_ip and not transform implies always_in_place = {@code true}
 * <p>
 *   * Example elements:
 *     * Volume
 *     * Audioconvert in certain modes (signed/unsigned conversion)
 *     * videoconvert in certain modes (endianness swapping)
 * <p>
 * <strong>Modifications only to the caps/metadata of a buffer</strong><br/>
 * * The element does not require writable data, but non-writable buffers
 *   should be subbuffered so that the meta-information can be replaced.
 * <p>
 * * Elements wishing to operate in this mode should replace the
 *   prepare_output_buffer method to create subbuffers of the input buffer
 *   and set always_in_place to {@code true}
 * <p>
 * * Example elements
 *   * Capsfilter when setting caps on outgoing buffers that have
 *     none.
 *   * identity when it is going to re-timestamp buffers by
 *     datarate.
 * <p>
 * <strong>Normal mode</strong><br/>
 *   * always_in_place flag is not set, or there is no transform_ip function
 *   * Element will receive an input buffer and output buffer to operate on.
 *   * Output buffer is allocated by calling the prepare_output_buffer function.
 *   * Example elements:
 *     * Videoscale, videoconvert, audioconvert when doing
 *     scaling/conversions
 * <p>
 * <strong>Special output buffer allocations</strong><br/>
 *   * Elements which need to do special allocation of their output buffers
 *     beyond allocating output buffers via the negotiated allocator or
 *     buffer pool should implement the prepare_output_buffer method.
 * <p>
 *   * Example elements:
 *     * efence
 * <p>
 * <strong>Sub-class settable flags on GstBaseTransform</strong><br/>
 * * passthrough
 * <p>
 *   * Implies that in the current configuration, the sub-class is not interested in modifying the buffers.
 *   * Elements which are always in passthrough mode whenever the same caps has been negotiated on both pads can set the class variable passthrough_on_same_caps to have this behaviour automatically.
 * <p>
 * * always_in_place
 *   * Determines whether a non-writable buffer will be copied before passing
 *     to the transform_ip function.
 * <p>
 *   * Implied {@code true} if no transform function is implemented.
 *   * Implied {@code false} if ONLY transform function is implemented.
 */
public class BaseTransform extends org.gstreamer.gst.Element {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseTransform";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("sinkpad"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        Interop.valueLayout.C_INT.withName("have_segment"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        Interop.valueLayout.ADDRESS.withName("queued_buf"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(19, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a BaseTransform proxy instance for the provided memory address.
     * <p>
     * Because BaseTransform is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BaseTransform(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to BaseTransform if its GType is a (or inherits from) "GstBaseTransform".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BaseTransform} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstBaseTransform", a ClassCastException will be thrown.
     */
    public static BaseTransform castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), BaseTransform.getType())) {
            return new BaseTransform(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstBaseTransform");
        }
    }
    
    /**
     * Lets {@link BaseTransform} sub-classes know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after use.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.gst_base_transform_get_allocator.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (allocator != null) allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    public @Nullable org.gstreamer.gst.BufferPool getBufferPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_transform_get_buffer_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferPool(RESULT, Ownership.FULL);
    }
    
    /**
     * See if {@code trans} is configured as a in_place transform.
     * @return {@code true} if the transform is configured in in_place mode.
     * <p>
     * MT safe.
     */
    public boolean isInPlace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_transform_is_in_place.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * See if {@code trans} is configured as a passthrough transform.
     * @return {@code true} if the transform is configured in passthrough mode.
     * <p>
     * MT safe.
     */
    public boolean isPassthrough() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_transform_is_passthrough.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queries if the transform will handle QoS.
     * @return {@code true} if QoS is enabled.
     * <p>
     * MT safe.
     */
    public boolean isQosEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_transform_is_qos_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Negotiates src pad caps with downstream elements if the source pad is
     * marked as needing reconfiguring. Unmarks GST_PAD_FLAG_NEED_RECONFIGURE in
     * any case. But marks it again if negotiation fails.
     * <p>
     * Do not call this in the {@link BaseTransformClass}::transform or
     * {@link BaseTransformClass}::transform_ip vmethod. Call this in
     * {@link BaseTransformClass}::submit_input_buffer,
     * {@link BaseTransformClass}::prepare_output_buffer or in
     * {@link BaseTransformClass}::generate_output _before_ any output buffer is
     * allocated.
     * <p>
     * It will be default be called when handling an ALLOCATION query or at the
     * very beginning of the default {@link BaseTransformClass}::submit_input_buffer
     * implementation.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean reconfigure() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_transform_reconfigure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Instructs {@code trans} to request renegotiation upstream. This function is
     * typically called after properties on the transform were set that
     * influence the input format.
     */
    public void reconfigureSink() {
        try {
            DowncallHandles.gst_base_transform_reconfigure_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Instructs {@code trans} to renegotiate a new downstream transform on the next
     * buffer. This function is typically called after properties on the transform
     * were set that influence the output format.
     */
    public void reconfigureSrc() {
        try {
            DowncallHandles.gst_base_transform_reconfigure_src.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code gap_aware} is {@code false} (the default), output buffers will have the
     * {@link org.gstreamer.gst.BufferFlags#GAP} flag unset.
     * <p>
     * If set to {@code true}, the element must handle output buffers with this flag set
     * correctly, i.e. it can assume that the buffer contains neutral data but must
     * unset the flag if the output is no neutral data.
     * <p>
     * MT safe.
     * @param gapAware New state
     */
    public void setGapAware(boolean gapAware) {
        try {
            DowncallHandles.gst_base_transform_set_gap_aware.invokeExact(
                    handle(),
                    gapAware ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines whether a non-writable buffer will be copied before passing
     * to the transform_ip function.
     * <p>
     *   * Always {@code true} if no transform function is implemented.
     *   * Always {@code false} if ONLY transform function is implemented.
     * <p>
     * MT safe.
     * @param inPlace Boolean value indicating that we would like to operate
     * on in_place buffers.
     */
    public void setInPlace(boolean inPlace) {
        try {
            DowncallHandles.gst_base_transform_set_in_place.invokeExact(
                    handle(),
                    inPlace ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set passthrough mode for this filter by default. This is mostly
     * useful for filters that do not care about negotiation.
     * <p>
     * Always {@code true} for filters which don't implement either a transform
     * or transform_ip or generate_output method.
     * <p>
     * MT safe.
     * @param passthrough boolean indicating passthrough mode.
     */
    public void setPassthrough(boolean passthrough) {
        try {
            DowncallHandles.gst_base_transform_set_passthrough.invokeExact(
                    handle(),
                    passthrough ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code prefer_passthrough} is {@code true} (the default), {@code trans} will check and
     * prefer passthrough caps from the list of caps returned by the
     * transform_caps vmethod.
     * <p>
     * If set to {@code false}, the element must order the caps returned from the
     * transform_caps function in such a way that the preferred format is
     * first in the list. This can be interesting for transforms that can do
     * passthrough transforms but prefer to do something else, like a
     * capsfilter.
     * <p>
     * MT safe.
     * @param preferPassthrough New state
     */
    public void setPreferPassthrough(boolean preferPassthrough) {
        try {
            DowncallHandles.gst_base_transform_set_prefer_passthrough.invokeExact(
                    handle(),
                    preferPassthrough ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enable or disable QoS handling in the transform.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setQosEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_base_transform_set_qos_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the QoS parameters in the transform. This function is called internally
     * when a QOS event is received but subclasses can provide custom information
     * when needed.
     * <p>
     * MT safe.
     * @param proportion the proportion
     * @param diff the diff against the clock
     * @param timestamp the timestamp of the buffer generating the QoS expressed in
     * running_time.
     */
    public void updateQos(double proportion, @NotNull org.gstreamer.gst.ClockTimeDiff diff, @NotNull org.gstreamer.gst.ClockTime timestamp) {
        java.util.Objects.requireNonNull(diff, "Parameter 'diff' must not be null");
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        try {
            DowncallHandles.gst_base_transform_update_qos.invokeExact(
                    handle(),
                    proportion,
                    diff.getValue().longValue(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates the srcpad caps and sends the caps downstream. This function
     * can be used by subclasses when they have already negotiated their caps
     * but found a change in them (or computed new information). This way,
     * they can notify downstream about that change without losing any
     * buffer.
     * @param updatedCaps An updated version of the srcpad caps to be pushed
     * downstream
     * @return {@code true} if the caps could be sent downstream {@code false} otherwise
     */
    public boolean updateSrcCaps(@NotNull org.gstreamer.gst.Caps updatedCaps) {
        java.util.Objects.requireNonNull(updatedCaps, "Parameter 'updatedCaps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_transform_update_src_caps.invokeExact(
                    handle(),
                    updatedCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_transform_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link BaseTransform.Build} object constructs a {@link BaseTransform} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BaseTransform} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BaseTransform} using {@link BaseTransform#castFrom}.
         * @return A new instance of {@code BaseTransform} with the properties 
         *         that were set in the Build object.
         */
        public BaseTransform construct() {
            return BaseTransform.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BaseTransform.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setQos(boolean qos) {
            names.add("qos");
            values.add(org.gtk.gobject.Value.create(qos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_base_transform_get_allocator = Interop.downcallHandle(
            "gst_base_transform_get_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_get_buffer_pool = Interop.downcallHandle(
            "gst_base_transform_get_buffer_pool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_is_in_place = Interop.downcallHandle(
            "gst_base_transform_is_in_place",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_is_passthrough = Interop.downcallHandle(
            "gst_base_transform_is_passthrough",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_is_qos_enabled = Interop.downcallHandle(
            "gst_base_transform_is_qos_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_reconfigure = Interop.downcallHandle(
            "gst_base_transform_reconfigure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_reconfigure_sink = Interop.downcallHandle(
            "gst_base_transform_reconfigure_sink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_reconfigure_src = Interop.downcallHandle(
            "gst_base_transform_reconfigure_src",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_set_gap_aware = Interop.downcallHandle(
            "gst_base_transform_set_gap_aware",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_transform_set_in_place = Interop.downcallHandle(
            "gst_base_transform_set_in_place",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_transform_set_passthrough = Interop.downcallHandle(
            "gst_base_transform_set_passthrough",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_transform_set_prefer_passthrough = Interop.downcallHandle(
            "gst_base_transform_set_prefer_passthrough",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_transform_set_qos_enabled = Interop.downcallHandle(
            "gst_base_transform_set_qos_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_transform_update_qos = Interop.downcallHandle(
            "gst_base_transform_update_qos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_transform_update_src_caps = Interop.downcallHandle(
            "gst_base_transform_update_src_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_transform_get_type = Interop.downcallHandle(
            "gst_base_transform_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
