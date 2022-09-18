package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for the GObject type.
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 * // Example of implementing a singleton using a constructor.
 * static MySingleton *the_singleton = NULL;
 * 
 * static GObject*
 * my_singleton_constructor (GType                  type,
 *                           guint                  n_construct_params,
 *                           GObjectConstructParam *construct_params)
 * {
 *   GObject *object;
 *   
 *   if (!the_singleton)
 *     {
 *       object = G_OBJECT_CLASS (parent_class)-&<code>#62</code> constructor (type,
 *                                                            n_construct_params,
 *                                                            construct_params);
 *       the_singleton = MY_SINGLETON (object);
 *     }
 *   else
 *     object = g_object_ref (G_OBJECT (the_singleton));
 * 
 *   return object;
 * }
 * ]}|
 */
public class ObjectClass extends io.github.jwharm.javagi.ResourceBase {

    public ObjectClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Looks up the {@link org.gtk.gobject.ParamSpec} for a property of a class.
     */
    public ParamSpec findProperty(java.lang.String propertyName) {
        var RESULT = gtk_h.g_object_class_find_property(handle(), Interop.allocateNativeString(propertyName).handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Installs new properties from an array of <code>#GParamSpecs</code> 
     * 
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * 
     * The property id of each property is the index of each {@link org.gtk.gobject.ParamSpec} in
     * the @pspecs array.
     * 
     * The property id of 0 is treated specially by {@link org.gtk.gobject.Object} and it should not
     * be used to store a {@link org.gtk.gobject.ParamSpec} 
     * 
     * This function should be used if you plan to use a static array of
     * <code>#GParamSpecs</code> and g_object_notify_by_pspec(). For instance, this
     * class initialization:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * enum {
     *   PROP_0, PROP_FOO, PROP_BAR, N_PROPERTIES
     * };
     * 
     * static GParamSpec *obj_properties[N_PROPERTIES]} = { NULL, };
     * 
     * static void
     * my_object_class_init (MyObjectClass *klass)
     * {
     *   GObjectClass *gobject_class = G_OBJECT_CLASS (klass);
     * 
     *   obj_properties{@link [PROP_FOO]} =
     *     g_param_spec_int (&<code>#34</code> foo&<code>#34</code> , &<code>#34</code> Foo&<code>#34</code> , &<code>#34</code> Foo&<code>#34</code> ,
     *                       -1, G_MAXINT,
     *                       0,
     *                       G_PARAM_READWRITE);
     * 
     *   obj_properties{@link [PROP_BAR]} =
     *     g_param_spec_string (&<code>#34</code> bar&<code>#34</code> , &<code>#34</code> Bar&<code>#34</code> , &<code>#34</code> Bar&<code>#34</code> ,
     *                          NULL,
     *                          G_PARAM_READWRITE);
     * 
     *   gobject_class-&<code>#62</code> set_property = my_object_set_property;
     *   gobject_class-&<code>#62</code> get_property = my_object_get_property;
     *   g_object_class_install_properties (gobject_class,
     *                                      N_PROPERTIES,
     *                                      obj_properties);
     * }
     * ]|
     * 
     * allows calling g_object_notify_by_pspec() to notify of property changes:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * void
     * my_object_set_foo (MyObject *self, gint foo)
     * {
     *   if (self-&<code>#62</code> foo != foo)
     *     {
     *       self-&<code>#62</code> foo = foo;
     *       g_object_notify_by_pspec (G_OBJECT (self), obj_properties[PROP_FOO]});
     *     }
     *  }
     * ]|
     */
    public void installProperties(int nPspecs, ParamSpec[] pspecs) {
        gtk_h.g_object_class_install_properties(handle(), nPspecs, Interop.allocateNativeArray(pspecs).handle());
    }
    
    /**
     * Installs a new property.
     * 
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * 
     * Note that it is possible to redefine a property in a derived class,
     * by installing a property with the same name. This can be useful at times,
     * e.g. to change the range of allowed values or the default value.
     */
    public void installProperty(int propertyId, ParamSpec pspec) {
        gtk_h.g_object_class_install_property(handle(), propertyId, pspec.handle());
    }
    
    /**
     * Registers @property_id as referring to a property with the name
     * @name in a parent class or in an interface implemented by @oclass.
     * This allows this class to &<code>#34</code> override&<code>#34</code>  a property implementation in
     * a parent class or to provide the implementation of a property from
     * an interface.
     * 
     * Internally, overriding is implemented by creating a property of type
     * {@link org.gtk.gobject.ParamSpecOverride}  generally operations that query the properties of
     * the object class, such as g_object_class_find_property() or
     * g_object_class_list_properties() will return the overridden
     * property. However, in one case, the @construct_properties argument of
     * the @constructor virtual function, the {@link org.gtk.gobject.ParamSpecOverride} is passed
     * instead, so that the @param_id field of the {@link org.gtk.gobject.ParamSpec} will be
     * correct.  For virtually all uses, this makes no difference. If you
     * need to get the overridden property, you can call
     * g_param_spec_get_redirect_target().
     */
    public void overrideProperty(int propertyId, java.lang.String name) {
        gtk_h.g_object_class_override_property(handle(), propertyId, Interop.allocateNativeString(name).handle());
    }
    
}
