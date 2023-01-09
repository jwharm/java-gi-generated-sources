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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSrc.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PushSrc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PushSrc(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PushSrc> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PushSrc(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_push_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PushSrc.Builder} object constructs a {@link PushSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PushSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseSrc.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PushSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PushSrc}.
         * @return A new instance of {@code PushSrc} with the properties 
         *         that were set in the Builder object.
         */
        public PushSrc build() {
            return (PushSrc) org.gtk.gobject.GObject.newWithProperties(
                PushSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_push_src_get_type != null;
    }
}
