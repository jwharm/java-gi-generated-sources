// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1300 {

    static final FunctionDescriptor gdk_pixbuf_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_ref$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_ref",
        constants$1300.gdk_pixbuf_ref$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_unref$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_unref",
        constants$1300.gdk_pixbuf_unref$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_colorspace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_colorspace$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_colorspace",
        constants$1300.gdk_pixbuf_get_colorspace$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_n_channels$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_n_channels$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_n_channels",
        constants$1300.gdk_pixbuf_get_n_channels$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_has_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_has_alpha$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_has_alpha",
        constants$1300.gdk_pixbuf_get_has_alpha$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_bits_per_sample$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_bits_per_sample$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_bits_per_sample",
        constants$1300.gdk_pixbuf_get_bits_per_sample$FUNC
    );
}


