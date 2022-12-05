package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for demuxing tags at the beginning or end of a
 * stream and handles things like typefinding, querying, seeking, and
 * different modes of operation (chain-based, pull_range-based, and providing
 * downstream elements with random access if upstream supports that). The tag
 * is stripped from the output, and all offsets are adjusted for the tag
 * sizes, so that to the downstream element the stream will appear as if
 * there was no tag at all. Also, once the tag has been parsed, GstTagDemux
 * will try to determine the media type of the resulting stream and add a
 * source pad with the appropriate caps in order to facilitate auto-plugging.
 * <p>
 * <strong>Deriving from GstTagDemux</strong><br/>
 * Subclasses have to do four things:
 * <p>
 *  * In their base init function, they must add a pad template for the sink
 *    pad to the element class, describing the media type they can parse in
 *    the caps of the pad template.
 *  * In their class init function, they must override
 *    GST_TAG_DEMUX_CLASS(demux_klass)-&gt;identify_tag with their own identify
 *    function.
 *  * In their class init function, they must override
 *  GST_TAG_DEMUX_CLASS(demux_klass)-&gt;parse_tag with their own parse
 *  function.
 *  * In their class init function, they must also set
 *    GST_TAG_DEMUX_CLASS(demux_klass)-&gt;min_start_size and/or
 *  GST_TAG_DEMUX_CLASS(demux_klass)-&gt;min_end_size to the minimum size required
 *  for the identify function to decide whether the stream has a supported tag
 *  or not. A class parsing ID3v1 tags, for example, would set min_end_size to
 *  128 bytes.
 */
public class TagDemux extends org.gstreamer.gst.Element {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagDemux";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("reserved")
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
     * Create a TagDemux proxy instance for the provided memory address.
     * <p>
     * Because TagDemux is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TagDemux(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TagDemux if its GType is a (or inherits from) "GstTagDemux".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TagDemux} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTagDemux", a ClassCastException will be thrown.
     */
    public static TagDemux castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TagDemux.getType())) {
            return new TagDemux(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTagDemux");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_demux_get_type.invokeExact();
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
         * A {@link TagDemux.Build} object constructs a {@link TagDemux} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TagDemux} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TagDemux} using {@link TagDemux#castFrom}.
         * @return A new instance of {@code TagDemux} with the properties 
         *         that were set in the Build object.
         */
        public TagDemux construct() {
            return TagDemux.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TagDemux.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tag_demux_get_type = Interop.downcallHandle(
            "gst_tag_demux_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
