package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
 * integer if {@code a} sorts before {@code b}, {@code a} sorts with {@code b}, or {@code a} sorts after {@code b}
 * respectively.
 * <p>
 * If two iters compare as equal, their order in the sorted model
 * is undefined. In order to ensure that the {@code GtkTreeSortable} behaves as
 * expected, the GtkTreeIterCompareFunc must define a partial order on
 * the model, i.e. it must be reflexive, antisymmetric and transitive.
 * <p>
 * For example, if {@code model} is a product catalogue, then a compare function
 * for the “price” column could be one which returns
 * {@code price_of(@a) - price_of(@b)}.
 */
/**
 * Functional interface declaration of the {@code TreeIterCompareFunc} callback.
 */
@FunctionalInterface
public interface TreeIterCompareFunc {

    /**
     * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
     * integer if {@code a} sorts before {@code b}, {@code a} sorts with {@code b}, or {@code a} sorts after {@code b}
     * respectively.
     * <p>
     * If two iters compare as equal, their order in the sorted model
     * is undefined. In order to ensure that the {@code GtkTreeSortable} behaves as
     * expected, the GtkTreeIterCompareFunc must define a partial order on
     * the model, i.e. it must be reflexive, antisymmetric and transitive.
     * <p>
     * For example, if {@code model} is a product catalogue, then a compare function
     * for the “price” column could be one which returns
     * {@code price_of(@a) - price_of(@b)}.
     */
    int run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter a, org.gtk.gtk.TreeIter b);
    
    @ApiStatus.Internal default int upcall(MemoryAddress model, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreeIter.fromAddress.marshal(a, null), org.gtk.gtk.TreeIter.fromAddress.marshal(b, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeIterCompareFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
