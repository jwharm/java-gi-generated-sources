package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function which is called when the reference count of a class
 * drops to zero.
 * <p>
 * It may use g_type_class_ref() to prevent the class from being freed. You
 * should not call g_type_class_unref() from a {@link TypeClassCacheFunc} function
 * to prevent infinite recursion, use g_type_class_unref_uncached() instead.
 * <p>
 * The functions have to check the class id passed in to figure
 * whether they actually want to cache the class of this type, since all
 * classes are routed through the same {@link TypeClassCacheFunc} chain.
 */
@FunctionalInterface
public interface TypeClassCacheFunc {
    boolean run(org.gtk.gobject.TypeClass gClass);

    @ApiStatus.Internal default int upcall(MemoryAddress cacheData, MemoryAddress gClass) {
        var RESULT = run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TypeClassCacheFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
