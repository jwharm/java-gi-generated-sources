// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$355 {

    static final FunctionDescriptor pthread_attr_getstacksize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstacksize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstacksize",
        constants$355.pthread_attr_getstacksize$FUNC
    );
    static final FunctionDescriptor pthread_attr_setstacksize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setstacksize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstacksize",
        constants$355.pthread_attr_setstacksize$FUNC
    );
    static final FunctionDescriptor pthread_attr_getstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstack$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstack",
        constants$355.pthread_attr_getstack$FUNC
    );
    static final FunctionDescriptor pthread_attr_setstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setstack$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstack",
        constants$355.pthread_attr_setstack$FUNC
    );
    static final FunctionDescriptor pthread_setschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_setschedparam",
        constants$355.pthread_setschedparam$FUNC
    );
    static final FunctionDescriptor pthread_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_getschedparam",
        constants$355.pthread_getschedparam$FUNC
    );
}


