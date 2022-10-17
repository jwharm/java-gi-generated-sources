package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all interface types.
 */
public class TypeInterface extends io.github.jwharm.javagi.ResourceBase {

    public TypeInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_type_interface_peek_parent = Interop.downcallHandle(
        "g_type_interface_peek_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the corresponding {@link TypeInterface} structure of the parent type
     * of the instance type to which {@code g_iface} belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     */
    public @NotNull TypeInterface peekParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_peek_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_interface_add_prerequisite = Interop.downcallHandle(
        "g_type_interface_add_prerequisite",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static @NotNull void addPrerequisite(@NotNull org.gtk.gobject.Type interfaceType, @NotNull org.gtk.gobject.Type prerequisiteType) {
        try {
            g_type_interface_add_prerequisite.invokeExact(interfaceType.getValue(), prerequisiteType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_interface_get_plugin = Interop.downcallHandle(
        "g_type_interface_get_plugin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static @NotNull TypePlugin getPlugin(@NotNull org.gtk.gobject.Type instanceType, @NotNull org.gtk.gobject.Type interfaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_get_plugin.invokeExact(instanceType.getValue(), interfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_interface_instantiatable_prerequisite = Interop.downcallHandle(
        "g_type_interface_instantiatable_prerequisite",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static @NotNull org.gtk.gobject.Type instantiatablePrerequisite(@NotNull org.gtk.gobject.Type interfaceType) {
        long RESULT;
        try {
            RESULT = (long) g_type_interface_instantiatable_prerequisite.invokeExact(interfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_interface_peek = Interop.downcallHandle(
        "g_type_interface_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static @NotNull TypeInterface peek(@NotNull TypeClass instanceClass, @NotNull org.gtk.gobject.Type ifaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_peek.invokeExact(instanceClass.handle(), ifaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_interface_prerequisites = Interop.downcallHandle(
        "g_type_interface_prerequisites",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the prerequisites of an interfaces type.
     */
    public static org.gtk.gobject.Type[] prerequisites(@NotNull org.gtk.gobject.Type interfaceType, @NotNull Out<Integer> nPrerequisites) {
        MemorySegment nPrerequisitesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_prerequisites.invokeExact(interfaceType.getValue(), (Addressable) nPrerequisitesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPrerequisites.set(nPrerequisitesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.Type[] resultARRAY = new org.gtk.gobject.Type[nPrerequisites.get().intValue()];
        for (int I = 0; I < nPrerequisites.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.gobject.Type(OBJ);
        }
        return resultARRAY;
    }
    
}
