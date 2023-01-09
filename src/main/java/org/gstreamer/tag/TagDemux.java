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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TagDemux proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TagDemux(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagDemux> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TagDemux(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_demux_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TagDemux.Builder} object constructs a {@link TagDemux} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TagDemux.Builder#build()}. 
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
         * Finish building the {@link TagDemux} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TagDemux}.
         * @return A new instance of {@code TagDemux} with the properties 
         *         that were set in the Builder object.
         */
        public TagDemux build() {
            return (TagDemux) org.gtk.gobject.GObject.newWithProperties(
                TagDemux.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_tag_demux_get_type != null;
    }
}
