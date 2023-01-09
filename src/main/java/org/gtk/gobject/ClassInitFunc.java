package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to initialize the class
 * of a specific type.
 * <p>
 * This function should initialize all static class members.
 * <p>
 * The initialization process of a class involves:
 * <ul>
 * <li>Copying common members from the parent class over to the
 *   derived class structure.
 * <li>Zero initialization of the remaining members not copied
 *   over from the parent class.
 * <li>Invocation of the GBaseInitFunc() initializers of all parent
 *   types and the class' type.
 * <li>Invocation of the class' GClassInitFunc() initializer.
 * </ul>
 * <p>
 * Since derived classes are partially initialized through a memory copy
 * of the parent class, the general rule is that GBaseInitFunc() and
 * GBaseFinalizeFunc() should take care of necessary reinitialization
 * and release of those class members that were introduced by the type
 * that specified these GBaseInitFunc()/GBaseFinalizeFunc().
 * GClassInitFunc() should only care about initializing static
 * class members, while dynamic class members (such as allocated strings
 * or reference counted resources) are better handled by a GBaseInitFunc()
 * for this type, so proper initialization of the dynamic class members
 * is performed for class initialization of derived types as well.
 * <p>
 * An example may help to correspond the intend of the different class
 * initializers:
 * <pre>{@code <!-- language="C" -->
 * typedef struct {
 *   GObjectClass parent_class;
 *   gint         static_integer;
 *   gchar       *dynamic_string;
 * } TypeAClass;
 * static void
 * type_a_base_class_init (TypeAClass *class)
 * {
 *   class->dynamic_string = g_strdup ("some string");
 * }
 * static void
 * type_a_base_class_finalize (TypeAClass *class)
 * {
 *   g_free (class->dynamic_string);
 * }
 * static void
 * type_a_class_init (TypeAClass *class)
 * {
 *   class->static_integer = 42;
 * }
 * 
 * typedef struct {
 *   TypeAClass   parent_class;
 *   gfloat       static_float;
 *   GString     *dynamic_gstring;
 * } TypeBClass;
 * static void
 * type_b_base_class_init (TypeBClass *class)
 * {
 *   class->dynamic_gstring = g_string_new ("some other string");
 * }
 * static void
 * type_b_base_class_finalize (TypeBClass *class)
 * {
 *   g_string_free (class->dynamic_gstring);
 * }
 * static void
 * type_b_class_init (TypeBClass *class)
 * {
 *   class->static_float = 3.14159265358979323846;
 * }
 * }</pre>
 * <p>
 * Initialization of TypeBClass will first cause initialization of
 * TypeAClass (derived classes reference their parent classes, see
 * g_type_class_ref() on this).
 * <p>
 * Initialization of TypeAClass roughly involves zero-initializing its fields,
 * then calling its GBaseInitFunc() type_a_base_class_init() to allocate
 * its dynamic members (dynamic_string), and finally calling its GClassInitFunc()
 * type_a_class_init() to initialize its static members (static_integer).
 * The first step in the initialization process of TypeBClass is then
 * a plain memory copy of the contents of TypeAClass into TypeBClass and
 * zero-initialization of the remaining fields in TypeBClass.
 * The dynamic members of TypeAClass within TypeBClass now need
 * reinitialization which is performed by calling type_a_base_class_init()
 * with an argument of TypeBClass.
 * <p>
 * After that, the GBaseInitFunc() of TypeBClass, type_b_base_class_init()
 * is called to allocate the dynamic members of TypeBClass (dynamic_gstring),
 * and finally the GClassInitFunc() of TypeBClass, type_b_class_init(),
 * is called to complete the initialization process with the static members
 * (static_float).
 * <p>
 * Corresponding finalization counter parts to the GBaseInitFunc() functions
 * have to be provided to release allocated resources at class finalization
 * time.
 */
/**
 * Functional interface declaration of the {@code ClassInitFunc} callback.
 */
@FunctionalInterface
public interface ClassInitFunc {

    /**
     * A callback function used by the type system to initialize the class
     * of a specific type.
     * <p>
     * This function should initialize all static class members.
     * <p>
     * The initialization process of a class involves:
     * <ul>
     * <li>Copying common members from the parent class over to the
     *   derived class structure.
     * <li>Zero initialization of the remaining members not copied
     *   over from the parent class.
     * <li>Invocation of the GBaseInitFunc() initializers of all parent
     *   types and the class' type.
     * <li>Invocation of the class' GClassInitFunc() initializer.
     * </ul>
     * <p>
     * Since derived classes are partially initialized through a memory copy
     * of the parent class, the general rule is that GBaseInitFunc() and
     * GBaseFinalizeFunc() should take care of necessary reinitialization
     * and release of those class members that were introduced by the type
     * that specified these GBaseInitFunc()/GBaseFinalizeFunc().
     * GClassInitFunc() should only care about initializing static
     * class members, while dynamic class members (such as allocated strings
     * or reference counted resources) are better handled by a GBaseInitFunc()
     * for this type, so proper initialization of the dynamic class members
     * is performed for class initialization of derived types as well.
     * <p>
     * An example may help to correspond the intend of the different class
     * initializers:
     * <pre>{@code <!-- language="C" -->
     * typedef struct {
     *   GObjectClass parent_class;
     *   gint         static_integer;
     *   gchar       *dynamic_string;
     * } TypeAClass;
     * static void
     * type_a_base_class_init (TypeAClass *class)
     * {
     *   class->dynamic_string = g_strdup ("some string");
     * }
     * static void
     * type_a_base_class_finalize (TypeAClass *class)
     * {
     *   g_free (class->dynamic_string);
     * }
     * static void
     * type_a_class_init (TypeAClass *class)
     * {
     *   class->static_integer = 42;
     * }
     * 
     * typedef struct {
     *   TypeAClass   parent_class;
     *   gfloat       static_float;
     *   GString     *dynamic_gstring;
     * } TypeBClass;
     * static void
     * type_b_base_class_init (TypeBClass *class)
     * {
     *   class->dynamic_gstring = g_string_new ("some other string");
     * }
     * static void
     * type_b_base_class_finalize (TypeBClass *class)
     * {
     *   g_string_free (class->dynamic_gstring);
     * }
     * static void
     * type_b_class_init (TypeBClass *class)
     * {
     *   class->static_float = 3.14159265358979323846;
     * }
     * }</pre>
     * <p>
     * Initialization of TypeBClass will first cause initialization of
     * TypeAClass (derived classes reference their parent classes, see
     * g_type_class_ref() on this).
     * <p>
     * Initialization of TypeAClass roughly involves zero-initializing its fields,
     * then calling its GBaseInitFunc() type_a_base_class_init() to allocate
     * its dynamic members (dynamic_string), and finally calling its GClassInitFunc()
     * type_a_class_init() to initialize its static members (static_integer).
     * The first step in the initialization process of TypeBClass is then
     * a plain memory copy of the contents of TypeAClass into TypeBClass and
     * zero-initialization of the remaining fields in TypeBClass.
     * The dynamic members of TypeAClass within TypeBClass now need
     * reinitialization which is performed by calling type_a_base_class_init()
     * with an argument of TypeBClass.
     * <p>
     * After that, the GBaseInitFunc() of TypeBClass, type_b_base_class_init()
     * is called to allocate the dynamic members of TypeBClass (dynamic_gstring),
     * and finally the GClassInitFunc() of TypeBClass, type_b_class_init(),
     * is called to complete the initialization process with the static members
     * (static_float).
     * <p>
     * Corresponding finalization counter parts to the GBaseInitFunc() functions
     * have to be provided to release allocated resources at class finalization
     * time.
     */
    void run(org.gtk.gobject.TypeClass gClass);
    
    @ApiStatus.Internal default void upcall(MemoryAddress gClass, MemoryAddress classData) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClassInitFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
