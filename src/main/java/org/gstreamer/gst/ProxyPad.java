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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Pad.getMemoryLayout().withName("pad"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a ProxyPad proxy instance for the provided memory address.
     * <p>
     * Because ProxyPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyPad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to ProxyPad if its GType is a (or inherits from) "GstProxyPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ProxyPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstProxyPad", a ClassCastException will be thrown.
     */
    public static ProxyPad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ProxyPad.getType())) {
            return new ProxyPad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstProxyPad");
        }
    }
    
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
            RESULT = (MemoryAddress) DowncallHandles.gst_proxy_pad_get_internal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ProxyPad(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gstreamer.gst.FlowReturn chainDefault(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
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
    public static @NotNull org.gstreamer.gst.FlowReturn chainListDefault(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.BufferList list) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
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
    public static @NotNull org.gstreamer.gst.FlowReturn getrangeDefault(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.Object parent, long offset, int size, @NotNull Out<org.gstreamer.gst.Buffer> buffer) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        buffer.set(new org.gstreamer.gst.Buffer(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Invoke the default iterate internal links function of the proxy pad.
     * @param pad the {@link Pad} to get the internal links of.
     * @param parent the parent of {@code pad} or {@code null}
     * @return a {@link Iterator} of {@link Pad}, or {@code null} if {@code pad}
     * has no parent. Unref each returned pad with gst_object_unref().
     */
    public static @Nullable org.gstreamer.gst.Iterator iterateInternalLinksDefault(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_proxy_pad_iterate_internal_links_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Iterator(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Pad.Build {
        
         /**
         * A {@link ProxyPad.Build} object constructs a {@link ProxyPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ProxyPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyPad} using {@link ProxyPad#castFrom}.
         * @return A new instance of {@code ProxyPad} with the properties 
         *         that were set in the Build object.
         */
        public ProxyPad construct() {
            return ProxyPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ProxyPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
