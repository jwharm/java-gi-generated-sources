// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$342 {

    static final FunctionDescriptor GCacheNewFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheNewFunc$MH = RuntimeHelper.downcallHandle(
        constants$342.GCacheNewFunc$FUNC
    );
    static final FunctionDescriptor GCacheDupFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDupFunc$MH = RuntimeHelper.downcallHandle(
        constants$342.GCacheDupFunc$FUNC
    );
    static final FunctionDescriptor GCacheDestroyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDestroyFunc$MH = RuntimeHelper.downcallHandle(
        constants$342.GCacheDestroyFunc$FUNC
    );
    static final FunctionDescriptor g_cache_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_new$MH = RuntimeHelper.downcallHandle(
        "g_cache_new",
        constants$342.g_cache_new$FUNC
    );
}


