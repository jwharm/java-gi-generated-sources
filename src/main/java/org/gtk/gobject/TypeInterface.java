package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used as the base of all interface types.
 */
public class TypeInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("g_type"),
        ValueLayout.JAVA_LONG.withName("g_instance_type")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TypeInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeInterface newInstance = new TypeInterface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TypeInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the corresponding {@link TypeInterface} structure of the parent type
     * of the instance type to which {@code g_iface} belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     * @return the
     *     corresponding {@link TypeInterface} structure of the parent type of the
     *     instance type to which {@code g_iface} belongs, or {@code null} if the parent
     *     type doesn't conform to the interface
     */
    public @NotNull org.gtk.gobject.TypeInterface peekParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_peek_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     * @param interfaceType {@link Type} value of an interface type
     * @param prerequisiteType {@link Type} value of an interface or instantiatable type
     */
    public static void addPrerequisite(@NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.glib.Type prerequisiteType) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(prerequisiteType, "Parameter 'prerequisiteType' must not be null");
        try {
            DowncallHandles.g_type_interface_add_prerequisite.invokeExact(
                    interfaceType.getValue().longValue(),
                    prerequisiteType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     * @param instanceType {@link Type} of an instantiatable type
     * @param interfaceType {@link Type} of an interface type
     * @return the {@link TypePlugin} for the dynamic
     *     interface {@code interface_type} of {@code instance_type}
     */
    public static @NotNull org.gtk.gobject.TypePlugin getPlugin(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_get_plugin.invokeExact(
                    instanceType.getValue().longValue(),
                    interfaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     * @param interfaceType an interface type
     * @return the instantiatable prerequisite type or {@code G_TYPE_INVALID} if none
     */
    public static @NotNull org.gtk.glib.Type instantiatablePrerequisite(@NotNull org.gtk.glib.Type interfaceType) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_interface_instantiatable_prerequisite.invokeExact(
                    interfaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     * @param instanceClass a {@link TypeClass} structure
     * @param ifaceType an interface ID which this class conforms to
     * @return the {@link TypeInterface}
     *     structure of {@code iface_type} if implemented by {@code instance_class}, {@code null}
     *     otherwise
     */
    public static @NotNull org.gtk.gobject.TypeInterface peek(@NotNull org.gtk.gobject.TypeClass instanceClass, @NotNull org.gtk.glib.Type ifaceType) {
        java.util.Objects.requireNonNull(instanceClass, "Parameter 'instanceClass' must not be null");
        java.util.Objects.requireNonNull(ifaceType, "Parameter 'ifaceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_peek.invokeExact(
                    instanceClass.handle(),
                    ifaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the prerequisites of an interfaces type.
     * @param interfaceType an interface type
     * @param nPrerequisites location to return the number
     *     of prerequisites, or {@code null}
     * @return a
     *     newly-allocated zero-terminated array of {@link Type} containing
     *     the prerequisites of {@code interface_type}
     */
    public static @NotNull org.gtk.glib.Type[] prerequisites(@NotNull org.gtk.glib.Type interfaceType, Out<Integer> nPrerequisites) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(nPrerequisites, "Parameter 'nPrerequisites' must not be null");
        MemorySegment nPrerequisitesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_prerequisites.invokeExact(
                    interfaceType.getValue().longValue(),
                    (Addressable) nPrerequisitesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPrerequisites.set(nPrerequisitesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nPrerequisites.get().intValue()];
        for (int I = 0; I < nPrerequisites.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_interface_peek_parent = Interop.downcallHandle(
            "g_type_interface_peek_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_interface_add_prerequisite = Interop.downcallHandle(
            "g_type_interface_add_prerequisite",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_type_interface_get_plugin = Interop.downcallHandle(
            "g_type_interface_get_plugin",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_type_interface_instantiatable_prerequisite = Interop.downcallHandle(
            "g_type_interface_instantiatable_prerequisite",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_type_interface_peek = Interop.downcallHandle(
            "g_type_interface_peek",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_type_interface_prerequisites = Interop.downcallHandle(
            "g_type_interface_prerequisites",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
    }
}
