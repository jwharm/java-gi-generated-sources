// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1314 {

    static final FunctionDescriptor gdk_pixbuf_simple_anim_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_simple_anim_new$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_simple_anim_new",
        constants$1314.gdk_pixbuf_simple_anim_new$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_simple_anim_add_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_simple_anim_add_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_simple_anim_add_frame",
        constants$1314.gdk_pixbuf_simple_anim_add_frame$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_simple_anim_set_loop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_simple_anim_set_loop$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_simple_anim_set_loop",
        constants$1314.gdk_pixbuf_simple_anim_set_loop$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_simple_anim_get_loop$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_simple_anim_get_loop$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_simple_anim_get_loop",
        constants$1314.gdk_pixbuf_simple_anim_get_loop$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_init_modules$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_init_modules$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_init_modules",
        constants$1314.gdk_pixbuf_init_modules$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_format_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_pixbuf_format_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_get_type",
        constants$1314.gdk_pixbuf_format_get_type$FUNC
    );
}


