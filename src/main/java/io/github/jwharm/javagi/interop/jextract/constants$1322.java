// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1322 {

    static final FunctionDescriptor GdkPixbufModuleFillInfoFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufModuleFillInfoFunc$MH = RuntimeHelper.downcallHandle(
        constants$1322.GdkPixbufModuleFillInfoFunc$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_loader_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_pixbuf_loader_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_loader_get_type",
        constants$1322.gdk_pixbuf_loader_get_type$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_loader_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_pixbuf_loader_new$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_loader_new",
        constants$1322.gdk_pixbuf_loader_new$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_loader_new_with_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_loader_new_with_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_loader_new_with_type",
        constants$1322.gdk_pixbuf_loader_new_with_type$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_loader_new_with_mime_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_loader_new_with_mime_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_loader_new_with_mime_type",
        constants$1322.gdk_pixbuf_loader_new_with_mime_type$FUNC
    );
}


