package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for adding tags at the beginning or end of a
 * stream.
 * <p>
 * <strong>Deriving from GstTagMux</strong><br/>
 * Subclasses have to do the following things:
 * <p>
 *  * In their base init function, they must add pad templates for the sink
 *    pad and the source pad to the element class, describing the media type
 *    they accept and output in the caps of the pad template.
 *  * In their class init function, they must override the
 *    GST_TAG_MUX_CLASS(mux_klass)-&gt;render_start_tag and/or
 *    GST_TAG_MUX_CLASS(mux_klass)-&gt;render_end_tag vfuncs and set up a render
 *    function.
 */
public class TagMux extends org.gstreamer.gst.Element implements org.gstreamer.gst.TagSetter {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagMux";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a TagMux proxy instance for the provided memory address.
     * <p>
     * Because TagMux is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TagMux(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TagMux if its GType is a (or inherits from) "GstTagMux".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TagMux} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTagMux", a ClassCastException will be thrown.
     */
    public static TagMux castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TagMux.getType())) {
            return new TagMux(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTagMux");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_mux_get_type.invokeExact();
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
         * A {@link TagMux.Build} object constructs a {@link TagMux} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TagMux} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TagMux} using {@link TagMux#castFrom}.
         * @return A new instance of {@code TagMux} with the properties 
         *         that were set in the Build object.
         */
        public TagMux construct() {
            return TagMux.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TagMux.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tag_mux_get_type = Interop.downcallHandle(
            "gst_tag_mux_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
