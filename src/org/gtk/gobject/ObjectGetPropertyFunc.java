package org.gtk.gobject;

/**
 * The type of the {@code get_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectGetPropertyFunc {
        void onObjectGetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
