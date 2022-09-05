package org.gtk.gobject;

@FunctionalInterface
public interface ObjectGetPropertyFunc {

    /**
     * The type of the @get_property function of #GObjectClass.
     */
    public void onObjectGetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
