package org.gtk.gobject;

/**
 * The type of the @get_property function of #GObjectClass.
 */
@FunctionalInterface
public interface ObjectGetPropertyFunc {
        void onObjectGetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
