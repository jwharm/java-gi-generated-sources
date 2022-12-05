package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This class is mostly useful for elements that cannot do
 * random access, or at least very slowly. The source usually
 * prefers to push out a fixed size buffer.
 * <p>
 * Subclasses usually operate in a format that is different from the
 * default GST_FORMAT_BYTES format of {@link BaseSrc}.
 * <p>
 * Classes extending this base class will usually be scheduled
 * in a push based mode. If the peer accepts to operate without
 * offsets and within the limits of the allowed block size, this
 * class can operate in getrange based mode automatically. To make
 * this possible, the subclass should implement and override the
 * SCHEDULING query.
 * <p>
 * The subclass should extend the methods from the baseclass in
 * addition to the ::create method.
 * <p>
 * Seeking, flushing, scheduling and sync is all handled by this
 * base class.
 */
public class PushSrc extends org.gstreamer.base.BaseSrc {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPushSrc";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseSrc.getMemoryLayout().withName("parent"),
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
     * Create a PushSrc proxy instance for the provided memory address.
     * <p>
     * Because PushSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PushSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to PushSrc if its GType is a (or inherits from) "GstPushSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PushSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPushSrc", a ClassCastException will be thrown.
     */
    public static PushSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PushSrc.getType())) {
            return new PushSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPushSrc");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_push_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.BaseSrc.Build {
        
         /**
         * A {@link PushSrc.Build} object constructs a {@link PushSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PushSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PushSrc} using {@link PushSrc#castFrom}.
         * @return A new instance of {@code PushSrc} with the properties 
         *         that were set in the Build object.
         */
        public PushSrc construct() {
            return PushSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PushSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_push_src_get_type = Interop.downcallHandle(
            "gst_push_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
