// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$370 {

    static final FunctionDescriptor pthread_atfork$__child$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__child$MH = RuntimeHelper.downcallHandle(
        constants$370.pthread_atfork$__child$FUNC
    );
    static final FunctionDescriptor pthread_atfork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_atfork$MH = RuntimeHelper.downcallHandle(
        "pthread_atfork",
        constants$370.pthread_atfork$FUNC
    );
    static final FunctionDescriptor g_static_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_init",
        constants$370.g_static_mutex_init$FUNC
    );
    static final FunctionDescriptor g_static_mutex_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_free$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_free",
        constants$370.g_static_mutex_free$FUNC
    );
    static final FunctionDescriptor g_static_mutex_get_mutex_impl$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_mutex_get_mutex_impl$MH = RuntimeHelper.downcallHandle(
        "g_static_mutex_get_mutex_impl",
        constants$370.g_static_mutex_get_mutex_impl$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_init",
        constants$370.g_static_rec_mutex_init$FUNC
    );
}


