// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1409 {

    static final FunctionDescriptor gdk_gl_context_set_allowed_apis$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_allowed_apis$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_allowed_apis",
        constants$1409.gdk_gl_context_set_allowed_apis$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_allowed_apis$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_allowed_apis$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_allowed_apis",
        constants$1409.gdk_gl_context_get_allowed_apis$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_api$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_api$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_api",
        constants$1409.gdk_gl_context_get_api$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_set_use_es$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_use_es",
        constants$1409.gdk_gl_context_set_use_es$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_use_es$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_use_es",
        constants$1409.gdk_gl_context_get_use_es$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_realize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_realize$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_realize",
        constants$1409.gdk_gl_context_realize$FUNC
    );
}


