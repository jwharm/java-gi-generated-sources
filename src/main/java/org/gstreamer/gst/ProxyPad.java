package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ProxyPad extends org.gstreamer.gst.Pad {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstProxyPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Pad.getMemoryLayout().withName("pad"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ProxyPad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ProxyPad(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyPad> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyPad(input);
    
    /**
     * Get the internal pad of {@code pad}. Unref target pad after usage.
     * <p>
     * The internal pad of a {@link GhostPad} is the internally used
     * pad of opposite direction, which is used to link to the target.
     * @return the target {@link ProxyPad}, can
     * be {@code null}.  Unref target pad after usage.
     */
    public @Nullable org.gstreamer.gst.ProxyPad getInternal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_proxy_pad_get_internal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.ProxyPad) Interop.register(RESULT, org.gstreamer.gst.ProxyPad.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_proxy_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Invoke the default chain function of the proxy pad.
     * @param pad a sink {@link Pad}, returns GST_FLOW_ERROR if not.
     * @param parent the parent of {@code pad} or {@code null}
     * @param buffer the {@link Buffer} to send, return GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the pad.
     */
    public static org.gstreamer.gst.FlowReturn chainDefault(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_proxy_pad_chain_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Invoke the default chain list function of the proxy pad.
     * @param pad a sink {@link Pad}, returns GST_FLOW_ERROR if not.
     * @param parent the parent of {@code pad} or {@code null}
     * @param list the {@link BufferList} to send, return GST_FLOW_ERROR
     *     if not.
     * @return a {@link FlowReturn} from the pad.
     */
    public static org.gstreamer.gst.FlowReturn chainListDefault(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.BufferList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_proxy_pad_chain_list_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Invoke the default getrange function of the proxy pad.
     * @param pad a src {@link Pad}, returns {@code GST_FLOW_ERROR} if not.
     * @param parent the parent of {@code pad}
     * @param offset The start offset of the buffer
     * @param size The length of the buffer
     * @param buffer a pointer to hold the {@link Buffer},
     *     returns {@code GST_FLOW_ERROR} if {@code null}.
     * @return a {@link FlowReturn} from the pad.
     */
    public static org.gstreamer.gst.FlowReturn getrangeDefault(org.gstreamer.gst.Pad pad, org.gstreamer.gst.GstObject parent, long offset, int size, Out<org.gstreamer.gst.Buffer> buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufferPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_proxy_pad_getrange_default.invokeExact(
                        pad.handle(),
                        parent.handle(),
                        offset,
                        size,
                        (Addressable) bufferPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    buffer.set(org.gstreamer.gst.Buffer.fromAddress.marshal(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.gst.FlowReturn.of(RESULT);
        }
    }
    
    /**
     * Invoke the default iterate internal links function of the proxy pad.
     * @param pad the {@link Pad} to get the internal links of.
     * @param parent the parent of {@code pad} or {@code null}
     * @return a {@link Iterator} of {@link Pad}, or {@code null} if {@code pad}
     * has no parent. Unref each returned pad with gst_object_unref().
     */
    public static @Nullable org.gstreamer.gst.Iterator iterateInternalLinksDefault(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_proxy_pad_iterate_internal_links_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Iterator.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link ProxyPad.Builder} object constructs a {@link ProxyPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ProxyPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Pad.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ProxyPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyPad}.
         * @return A new instance of {@code ProxyPad} with the properties 
         *         that were set in the Builder object.
         */
        public ProxyPad build() {
            return (ProxyPad) org.gtk.gobject.GObject.newWithProperties(
                ProxyPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_proxy_pad_get_internal = Interop.downcallHandle(
                "gst_proxy_pad_get_internal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_proxy_pad_get_type = Interop.downcallHandle(
                "gst_proxy_pad_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_proxy_pad_chain_default = Interop.downcallHandle(
                "gst_proxy_pad_chain_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_proxy_pad_chain_list_default = Interop.downcallHandle(
                "gst_proxy_pad_chain_list_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_proxy_pad_getrange_default = Interop.downcallHandle(
                "gst_proxy_pad_getrange_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_proxy_pad_iterate_internal_links_default = Interop.downcallHandle(
                "gst_proxy_pad_iterate_internal_links_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_proxy_pad_get_type != null;
    }
}
